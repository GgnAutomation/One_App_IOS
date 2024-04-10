import sys
import requests
import zipfile
import os
import xml.etree.ElementTree as ET
import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

def download_file(url, filename):
    response = requests.get(url)
    with open(filename, 'wb') as f:
        f.write(response.content)

def extract_zip(zip_filepath, extract_to):
    with zipfile.ZipFile(zip_filepath, 'r') as zip_ref:
        zip_ref.extractall(extract_to)

def analyze_results(xml_filepath):
    tree = ET.parse(xml_filepath)
    root = tree.getroot()

    # Extracting the attributes from the testsuite element
    total_tests = int(root.attrib.get('tests', 0))
    errors = int(root.attrib.get('errors', 0))
    skipped = int(root.attrib.get('skipped', 0))
    failures = int(root.attrib.get('failures', 0))
    passed = total_tests - (errors + skipped + failures)

    return passed, failures

def send_email(subject, body, recipient):
    msg = MIMEMultipart()
    msg['Subject'] = subject
    msg.attach(MIMEText(body, 'plain'))

    # Replace with your SMTP server details
    server = smtplib.SMTP('smtp.yourserver.com', 587)
    server.starttls()
    server.login('your-email@example.com', 'your-password')
    server.sendmail('your-email@example.com', recipient, msg.as_string())
    server.quit()

if __name__ == "__main__":
    run_id = sys.argv[1] if len(sys.argv) > 1 else 'UNKNOWN'
    
    url = f"https://2lpomtcmprodsin11.vstmrblob.vsassets.io/579f621e-ed92-4b3d-924d-a686079fcdee-222082-runid-{run_id}/GeneralAttachment/TestResults_{run_id}.zip"
    zip_filename = f"TestResults_{run_id}.zip"

    download_file(url, zip_filename)
    extract_zip(zip_filename, '.')

    # Assuming the XML file is named test_results.xml inside the zip
    xml_filename = f"TestResults_{run_id}/TEST-TestSuite.xml"
    passed, failures = analyze_results(xml_filename)

    # Sending emails based on the results
    send_email("Test Failures", f"There are {failures} failed tests.", "singh.nishant1@orangemantra.in")
    send_email("Test Successes", f"There are {passed} passed tests.", "dubey.vishal@orangemantra.in")

    # Cleanup
    os.remove(zip_filename)
    os.rmdir(f"TestResults_{run_id}")

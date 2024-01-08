package Page_Test;

import static org.testng.Assert.assertEquals;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.page_object.Login_page;
import com.page_object.Select_Vehicle_Page;
import com.utility.Base_Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

@Listeners(com.utility.listner.class)
public class Login_Page_Test extends Base_Utility {

	public Login_page ob;
	public Select_Vehicle_Page ob1;
	String device = config_getdata("Platform_name");
	String version = config_getdata("version");
	String enveronment = config_getdata("env");

	@Test(priority = 0)
	public void TC001_Verify_Login_with_Invalid_credential() {
		Message("************************Login page test**************************");
		ob = new Login_page();
		ob1 = new Select_Vehicle_Page();
		if (device.equalsIgnoreCase("pcloudy") || device.equalsIgnoreCase("realdevice")) {
			Custom_click(ob1.While_using_the_app(), "While using the app");
			Custom_click(ob.Allow(), ob.Allow().getText() + " Hero App to access your phone call logs");
			Custom_click(ob.Allow(), ob.Allow().getText() + " Hero App to access your contacts");
			Custom_click(ob.Allow(), ob.Allow().getText() + " Hero App to make and manage phone calls");
			Custom_click(ob.Allow(), ob.Allow().getText() + " Hero App to send and view SMS messages");
			Custom_click(ob.Allow(), ob.Allow().getText()
					+ " Hero App to find, connect to, and determine the relative position of nearby devices");
			Custom_click(ob.ok(), "OK");
			try {
				if (ob.Allow().isDisplayed()) {
				Custom_click(ob.Allow(), "Allow notification");
				}
			}catch(Exception e) {Message("Allow pop is over"); }
//			Custom_click(ob.close(), "Close button");
		} else if (device.equalsIgnoreCase("emulator")) {
			// Custom_click(ob.open(), "Open"); //This line for real device
			Custom_click(ob.close(), "Close button"); // for emulator and real device
		}
	}

	@Test(priority = 1)
	public void TC002_invalidmobileno() {
		custom_sendkeys(ob.mobile_No(), config_getdata("invalidmobileno"), "Login with unregisterd mobile number");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		Custom_click(ob.continue_button(), "Coninue button enter after unregistered mobile number");
		msg(ob.registerd_message(), ob.registerd_message().getText());
		Custom_click(ob.Cancel_not_registered(), ob.Cancel_not_registered().getText());
	}

	@Test(priority = 2)
	public void TC003_Verify_Login_with_short_length_of_mobile_number_credential() throws InterruptedException {
		custom_sendkeys(ob.mobile_No(), config_getdata("short_digit_mobile_number"),
				"Login with short_digit_mobile_number");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		VerifyElementPresent(ob.continue_button(), "Coninue button enter after short length of mobile number is");
	}

	@Test(priority = 3)
	public void TC004_max_digit_mobile_number() throws InterruptedException {
		custom_sendkeys(ob.mobile_No(), config_getdata("max_digit_mobile_number"),
				"Login with More than 10 digit mobile number");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		if (config_getdata("max_digit_mobile_number").equalsIgnoreCase(ob.mobile_No().getText())) {
			Message("More then 10 digit mobile numbers are acceptable");
		} else {
			Message("More then 10 digits mobiles number are not acceptable");
		}
		Thread.sleep(2000);
		driver.navigate().back();
	}

	@Test(priority = 4)
	public void TC005_Terms_of_use_button() throws InterruptedException {
		long startclicktime = System.currentTimeMillis();
		Custom_click(ob.Terms_of_Use(), "Terms of use button");
		long endclicktime = System.currentTimeMillis();
		Message("Click time in Tearms of use =" + (endclicktime - startclicktime) + " MS");
		long starreadtime = System.currentTimeMillis();
		Thread.sleep(5000);
		if (device.equalsIgnoreCase("emulator")) {
			msg(ob.Terms_of_Use_condition(),
					"Terms of use: First condition = " + ob.Terms_of_Use_condition().getText());
		} else if (device.equalsIgnoreCase("pcloudy") || device.equalsIgnoreCase("realdevice")) {
			msg(ob.Terms_of_Use_condition_for_real_device(),
					"Terms of use: First condition = " + ob.Terms_of_Use_condition_for_real_device().getText());
		}
		long endreadtime = System.currentTimeMillis();
		Message("Raad time in Tearms of use =" + (endreadtime - starreadtime) + " MS");
		Custom_click(ob.back_page(), "back terms of use page ");
	}

	@Test(priority = 5)
	public void TC006_Privacy_policy() throws InterruptedException {
		long startclicktime = System.currentTimeMillis();
		Custom_click(ob.Privacy_Policy(), "Privacy Policy");
		long endclicktime = System.currentTimeMillis();
		Message("Click time in Privacy policy =" + (endclicktime - startclicktime) + " MS");
		Thread.sleep(4000);
		long starreadtime = System.currentTimeMillis();
		if (device.equalsIgnoreCase("emulator")) {
			msg(ob.Privacy_Policy_condition(),
					"Privacy policy : First Condition = " + ob.Privacy_Policy_condition().getText());
		} else if (device.equalsIgnoreCase("pcloudy") || device.equalsIgnoreCase("realdevice")) {
			msg(ob.Terms_of_Use_condition_for_real_device(),
					"Privacy policy : First Condition = " + ob.Terms_of_Use_condition_for_real_device().getText());
		}
		long endreadtime = System.currentTimeMillis();
		Message("Raad time in Privacy policy =" + (endreadtime - starreadtime) + " MS");
		Custom_click(ob.back_page(), "back Privacy Policy page ");

	}

	@Test(priority = 6)
	public void TC007_contact_Us() throws InterruptedException {

		Custom_click(ob.contact_us(), "Contact us");
		Thread.sleep(2000);
		msg(ob.contact_us_message(), ob.contact_us_message().getText());
		Custom_click(ob.back_page(), "back Contact us page ");
	}

	@Test(priority = 7)
	public void TC008_Verify_Login_with_valid_credential() throws InterruptedException {
		if (enveronment.equalsIgnoreCase("prod")) {
			custom_sendkeys(ob.mobile_No(), config_getdata("prod_mobileno"), "Login with Registerd mobile number");
		} else {
			custom_sendkeys(ob.mobile_No(), config_getdata("Stage_mobileno"), "Login with Registerd mobile number");
		}
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		VerifyElementPresent(ob.continue_button(), "Coninue button is");
		Custom_click(ob.continue_button(), "Coninue button");
		String registered_mob = ob.registered_mobile_no().getText();
		String[] mob = registered_mob.split(" ");
		System.out.println(mob[1]);
		if (enveronment.equalsIgnoreCase("prod")) {
			assertEquals(config_getdata("prod_mobileno"), mob[1]);
		} else {
			assertEquals(config_getdata("Stage_mobileno"), mob[1]);
		}
		Thread.sleep(30000);
	}

	@Test(priority = 8)
	public void TC009_resend_butn() throws InterruptedException {
		VerifyElementPresent(ob.resend_button(), "Resend button is");
		Custom_click(ob.resend_button(), "Resend button");
		Thread.sleep(18000);
	}

	@Test(priority = 9)
	public void TC010_inavalid_OTP() {
		ob.enter_inavalid_OTP();
		Custom_click(ob.verify_button(), "Verify Button");
		VerifyElementPresent(ob.verify_button(), "Verify Button is still");
	}

	@Test(priority = 10)
	public void TC011_edit_moble() throws InterruptedException {
		Custom_click(ob.edit_moble_button(), "Edit Mobile Number");
		if (enveronment.equalsIgnoreCase("prod")) {
			custom_sendkeys(ob.mobile_No(), config_getdata("prod_mobileno"), "Login with Registerd mobile number");
		} else {
			custom_sendkeys(ob.mobile_No(), config_getdata("Stage_mobileno"), "Login with Registerd mobile number");
		}
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		Custom_click(ob.continue_button(), "Coninue button");
		Thread.sleep(15000);

		if (enveronment.equalsIgnoreCase("prod")) {
			ob.enter_Valid_OTP_prod();
		} else {
			ob.enter_Valid_OTP();
		}
		Custom_click(ob.verify_button(), "Verify Button");
	}

	public void login() throws InterruptedException {
		ob = new Login_page();
		ob1 = new Select_Vehicle_Page();
		if (device.equalsIgnoreCase("pcloudy") || device.equalsIgnoreCase("realdevice")) {
			Custom_click(ob1.While_using_the_app(), "While using the app");
			Custom_click(ob.Allow(), ob.Allow().getText() + " Hero App to access your phone call logs");
			Custom_click(ob.Allow(), ob.Allow().getText() + " Hero App to access your contacts");
			Custom_click(ob.Allow(), ob.Allow().getText() + " Hero App to make and manage phone calls");
			Custom_click(ob.Allow(), ob.Allow().getText() + " Hero App to send and view SMS messages");
			Custom_click(ob.Allow(), ob.Allow().getText()
					+ " Hero App to find, connect to, and determine the relative position of nearby devices");
			Custom_click(ob.ok(), "OK");
			try {
			if (ob.Allow().isDisplayed()) {
				Custom_click(ob.Allow(), "Allow notification");
			}
			}catch(Exception e) {Message("Allow pop is over"); }
			}
		if (enveronment.equalsIgnoreCase("prod")) {
			custom_sendkeys(ob.mobile_No(), config_getdata("prod_mobileno"), "Login with Registerd mobile number");
		} else {
			custom_sendkeys(ob.mobile_No(), config_getdata("Stage_mobileno"), "Login with Registerd mobile number");
		}
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		Custom_click(ob.continue_button(), "Coninue button");
		Thread.sleep(15000);
		if (enveronment.equalsIgnoreCase("prod")) {
			ob.enter_Valid_OTP_prod();
		} else {
			ob.enter_Valid_OTP();
		}
		Custom_click(ob.verify_button(), "Verify Button");
		Thread.sleep(5000);
		Custom_click(ob1.click_first_vehicle(), " Select first vehicle");
		Custom_click(ob1.continue_button(), "Continue Button after select vehicle");
		Thread.sleep(2000);
		if (device.equalsIgnoreCase("emulator")) {
			Custom_click(ob1.Allow(), ob.Allow().getText() + " Hero App to access your phone call logs");
			Custom_click(ob1.Allow(), ob.Allow().getText() + " Hero App to access your contacts");
			Custom_click(ob1.Allow(), ob.Allow().getText() + " Hero App to make and manage phone calls");
			Custom_click(ob1.Allow(), ob.Allow().getText() + " Hero App to send and view SMS messages");
			Thread.sleep(2000);
			Custom_click(ob1.Allow(), ob.Allow().getText()
					+ " Hero App to find, connect to, and determine the relative position of nearby devices");
		}
	}

}
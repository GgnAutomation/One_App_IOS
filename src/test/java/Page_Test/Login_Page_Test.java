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
	long startclicktime, endclicktime, starreadtime, endreadtime;

	@Test(priority = 0)
	public void TC001_Verify_Login_with_Invalid_credential() {
		Message("************************Login page test**************************");
		ob = new Login_page();
		ob1 = new Select_Vehicle_Page();
		if (device.equalsIgnoreCase("realdevice") || device.equalsIgnoreCase("pcloudy")) {
			Custom_click(ob.ok(), "OK");
			Custom_click(ob.process_require_notification(), "Process button require notification access");
			Custom_click(ob.Allow(), ob.Allow().getText() + "Allow Hero App to send you notifications");
		}
	}

	@Test(priority = 1)
	public void TC002_invalidmobileno() {
		custom_sendkeys(ob.mobile_No(), config_getdata("invalidmobileno"), "Login with unregisterd mobile number");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		Custom_click(ob.continue_button(), "Coninue button enter after unregistered mobile number");
		msg(ob.registerd_message(), "Registerd info =");
		msg(ob.registerd_message_1(), "Registerd info =");
		Custom_click(ob.cancel_button_r(), "Close not registered pop message");
	}

	@Test(priority = 2)
	public void TC003_verify_update_number() throws InterruptedException {
		Custom_click(ob.continue_button(), "Coninue button enter after unregistered mobile number");
		Thread.sleep(3000);
		Custom_click(ob.update_number(), "Update number button");
		ob.details_verify();
		Custom_click(ob.back_page(), "Back from details verify ");
		Custom_click(ob.continue_button(), "Coninue button enter after unregistered mobile number");
		Custom_click(ob.Continue_guest_btn(), "Continue as gest button");
		Custom_click(ob.login_page(), "Login button");
	}

	@Test(priority = 3)
	public void TC004_Verify_Login_with_short_length_of_mobile_number_credential() throws InterruptedException {
		custom_sendkeys(ob.mobile_No(), config_getdata("short_digit_mobile_number"),
				"Login with short_digit_mobile_number");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		VerifyElementPresent(ob.continue_button(), "Coninue button enter after short length of mobile number is");
	}

	@Test(priority = 4)
	public void TC005_max_digit_mobile_number() throws InterruptedException {
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

	@Test(priority = 5)
	public void TC006_Terms_of_use_button() throws InterruptedException {
		startclicktime = System.currentTimeMillis();
		try {
			if (ob.Terms_of_Use().isDisplayed()) {
				Custom_click(ob.Terms_of_Use(), "Terms of use button");
			}
		} catch (Exception e) {
			Scroll_down_page_Action("Tearms of use");
			Custom_click(ob.Terms_of_Use(), "Terms of use button");
		}
		endclicktime = System.currentTimeMillis();
		Message("Click time in Tearms of use =" + (endclicktime - startclicktime) + " MS");
		starreadtime = System.currentTimeMillis();
		Thread.sleep(5000);
		if (device.equalsIgnoreCase("emulator")) {
			msg(ob.Terms_of_Use_condition(), "Terms of use: First condition = ");
		} else if (device.equalsIgnoreCase("pcloudy") || device.equalsIgnoreCase("realdevice")) {
			msg(ob.Terms_of_Use_condition_for_real_device(), "Terms of use: First condition = ");
		}
		endreadtime = System.currentTimeMillis();
		Message("Raad time in Tearms of use =" + (endreadtime - starreadtime) + " MS");
		Custom_click(ob.back_page(), "back terms of use page ");
	}

	@Test(priority = 6)
	public void TC007_Privacy_policy() throws InterruptedException {
		startclicktime = System.currentTimeMillis();
		Custom_click(ob.Privacy_Policy(), "Privacy Policy");
		endclicktime = System.currentTimeMillis();
		Message("Click time in Privacy policy =" + (endclicktime - startclicktime) + " MS");
		Thread.sleep(6000);
		try {
			starreadtime = System.currentTimeMillis();
			if (device.equalsIgnoreCase("emulator")) {
				msg(ob.Privacy_Policy_condition(), "Privacy policy : First  = ");
				Custom_click(ob.back_page(), "back Privacy Policy page ");
			} else if (device.equalsIgnoreCase("pcloudy") || device.equalsIgnoreCase("realdevice")) {
				msg(ob.Privacy_of_Use_condition_for_real_device(), "Privacy policy : First Condition = ");
				endreadtime = System.currentTimeMillis();
				Message("Read time in Privacy policy =" + (endreadtime - starreadtime) + " MS");
				Custom_click(ob.back_page(), "back Privacy Policy page ");
			}
		} catch (Exception e) {
			endreadtime = System.currentTimeMillis();
			Message("Not able to read with time  =" + (endreadtime - starreadtime) + " MS");
			Custom_click(ob.back_page(), "back Privacy Policy page ");
		}
	}

	@Test(priority = 7)
	public void TC008_contact_Us() throws InterruptedException {

		Custom_click(ob.contact_us(), "Contact us");
		Thread.sleep(2000);
		msg(ob.contact_us_message(), "Contct us titile =");
		Custom_click(ob.back_page(), "back Contact us page ");
	}

	@Test(priority = 8)
	public void TC009_Continue_as_guest() throws InterruptedException {
		Custom_click(ob.Continue_as_guest(), "Continue as guest ");
		ob.guest_page_info();
		Custom_click(ob.nearby_dealer(), "Nearby Dealers ");
		Custom_click(ob.While_using_the_app(), "While using the app");
		Custom_click(ob.back_page(), "Back from Dealer Locator");
		Custom_click(ob.vehicle_exchange(), "Vehicle Exchange ");
		Thread.sleep(4000);
		Custom_click(ob.back_page(), "Back from Vehicle Exchange");
		Custom_click(ob.Contact_us(), "Contact us in guest page");
		Thread.sleep(2000);
		Custom_click(ob.back_page(), "Back from Contact us in guest page");
		Custom_click(ob.update_mobile_number(), "Update mobile number pencile");
		Thread.sleep(3000);
		Custom_click(ob.back_page(), "Back from Update mobile number page");
		Scroll_down_page_Action("Check now");
		Custom_click(ob.Check_now_btn(), "Check now button");
		Custom_click(ob.While_using_the_app(), "While using the app");
		Custom_click(ob.upload_from_photo_gallery(), "Upload from photo gallery");
		Custom_click(ob.Allow(), ob.Allow().getText() );
		Custom_click(ob.cancel_btn(), "Close photo gallery");
		Custom_click(ob.back_page(), "Back from Scan bike parts");
		Custom_click(ob.login_page(), "Login button");
	}

	@Test(priority = 9)
	public void TC010_Verify_Login_with_valid_credential() throws InterruptedException {
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

	@Test(priority = 10)
	public void TC011_resend_butn() throws InterruptedException {
		VerifyElementPresent(ob.resend_button(), "Resend button is");
		Custom_click(ob.resend_button(), "Resend button");
		Thread.sleep(18000);
	}

	@Test(priority = 11)
	public void TC012_inavalid_OTP() {
		ob.enter_inavalid_OTP();
		Custom_click(ob.verify_button(), "Verify Button");
		VerifyElementPresent(ob.verify_button(), "Verify Button is still");
	}

	@Test(priority = 12)
	public void TC013_edit_moble() throws InterruptedException {
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
		if (device.equalsIgnoreCase("realdevice") || device.equalsIgnoreCase("pcloudy")) {
			Custom_click(ob.ok(), "OK");
			Custom_click(ob.process_require_notification(), "Process button require notification access");
			Custom_click(ob.Allow(), ob.Allow().getText() + "Allow Hero App to send you notifications");
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
		try {
			if(ob1.allow_location().isDisplayed()) {
		Custom_click(ob1.allow_location(), "Allow location");
		Custom_click(ob1.While_using_the_app(), "While using the app");
		Custom_click(ob1.Processed(), "Processed ");
			}}catch(Exception e) {Message("Allow loction pop is not given");}
		try {
			Thread.sleep(5000);
			if (ob1.banner_Img_close().isDisplayed()) {
				Custom_click(ob1.banner_Img_close(), " Banner Img close");
			}
		} catch (Exception e) {
			Message("Banner img is not given");
		}

	}

}
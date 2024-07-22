package Page_Test;

import org.testng.annotations.Test;

import com.page_object.E_Shop;
import com.utility.Base_Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class E_Shop_test extends Base_Utility {
	public Login_Page_Test login;
	public E_Shop ob;
	String device = config_getdata("Platform_name");

	@Test(priority = 0)
	public void TC119_registered_customers() throws InterruptedException {
		Message("************************E Shop**************************");
		ob = new E_Shop();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(3000);
		if (device.equalsIgnoreCase("pcloudy") || device.equalsIgnoreCase("realdevice")) {
			Custom_click(ob.E_shop_pCloudy(), ob.E_shop_pCloudy().getText());
		} else {
			Custom_click(ob.E_shop(), ob.E_shop().getText());
		}
		Custom_click(ob.existing_Eshop(), ob.existing_Eshop().getText());
		Thread.sleep(10000);
		Custom_click(ob.close_location(), "Close location Icon ");
		Custom_click(ob.ok_location(), "ok location");
//		Custom_click(ob.shoping_cart(), "Shoping Cart list");
//		Thread.sleep(2000);
//		msg(ob.shoping_cart_items(), " ");
//		Custom_click(ob.wishlist(), "wishlist");
//		Thread.sleep(2000);
//		if (device.equalsIgnoreCase("emulator")) {
//			msg(ob.customer_login_heading(), "for ");
//			msg(ob.registered_custombers_message(), " ");
//		} else {
//			msg(ob.customer_login_heading_real(), "for ");
//			msg(ob.registered_custombers_message_real(), " ");
//		}
//		custom_sendkeys(ob.enter_email_or_mobile_number(), "rahul@gmail.com", "Email ID");
//		if (device.equalsIgnoreCase("pcloudy")) {
//			driver.navigate().back();
//		} else {
//			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
//
//		}
//		Custom_click(ob.Continue_button(), "Continue button");
//		Thread.sleep(2000);
//		if (device.equalsIgnoreCase("emulator")) {
//			msg(ob.verify_mobile(), " "); // For Emulator only
//			msg(ob.verify_mobile_message(), " "); // For Emulator only
//			Custom_click(ob.otp_pop_up_close(), "OTP Pop Up close"); // For Emulator only
//		} else {
//			msg(ob.verify_mobile_real(), " "); // For real device and pCloudy
//			msg(ob.verify_mobile_message_real(), " "); // For real device and pCloudy
//			Custom_click(ob.otp_pop_up_close_real(), "OTP Pop Up close"); // For real device and pCloudy
//		}
	}

//	@Test(priority = 1)
	public void TC116_new_customers() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
		Custom_click(ob.E_shop_pCloudy(), ob.E_shop_pCloudy().getText());
		Custom_click(ob.existing_Eshop(), ob.existing_Eshop().getText());
		Thread.sleep(10000);
		Custom_click(ob.user_account(), "User account");
		if (device.equalsIgnoreCase("pcloudy")) {
			driver.navigate().back();
		}
		Thread.sleep(2000);
		if (device.equalsIgnoreCase("emulator")) {
			msg(ob.newcustomer_heading(), " "); // For Emulator only
			msg(ob.newcustomer_message1(), " "); // For Emulator only
		} else {
			msg(ob.newcustomer_heading_real(), " "); // For real device and pCloudy
			msg(ob.newcustomer_message1_real(), " ");// For real device and pCloudy
		}
		msg(ob.newcustomer_message2(), " ");
		msg(ob.newcustomer_message3(), " ");
		msg(ob.newcustomer_message4(), " ");
		Custom_click(ob.create_account(), ob.create_account().getText());
		custom_sendkeys(ob.firstname(), "Sonu", " First name ");
		driver.navigate().back();
		custom_sendkeys(ob.lastname(), "Jindal", " Last name ");
		driver.navigate().back();
		Custom_click(ob.CheckBox(), ob.CheckBox().getText());
		custom_sendkeys(ob.lastname(), "9876564534", " Mobile number ");
		driver.navigate().back();
		Thread.sleep(2000);
		custom_sendkeys(ob.email_address(), "sonu@gmail.com", " Email ");
		driver.navigate().back();
		Custom_click(ob.checkbox_for_T_and_C(), " Tearms and Condition check Box ");
		Custom_click(ob.OTP(), ob.OTP().getText());
		if (device.equalsIgnoreCase("emulator")) {
			try {
				if (ob.verify_mobile().isDisplayed()) {
					msg(ob.verify_mobile(), " ");
					msg(ob.verify_mobile_message(), " ");
					Custom_click(ob.otp_pop_up_close(), "OTP Pop Up close");
				}
			} catch (Exception e) {
				Message("Mobile number is not visible");
			}
		} else {
			try {
				if (ob.verify_mobile_real().isDisplayed()) {
					msg(ob.verify_mobile_real(), "  ");
					msg(ob.verify_mobile_message_real(), " ");
					Custom_click(ob.otp_pop_up_close_real(), "OTP Pop Up close");
				}
			} catch (Exception e) {
				Message("Mobile number is not visible");
			}
		}
		Custom_click(ob.create_an_account(), ob.create_an_account().getText());
		Thread.sleep(2000);
		Custom_click(ob.back_button(), "Back from Create New Customer Account");
		Custom_click(ob.back(), " Back from E-shop ");

	}
}

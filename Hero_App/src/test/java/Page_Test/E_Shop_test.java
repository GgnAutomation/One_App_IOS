package Page_Test;

import org.testng.annotations.Test;

import com.page_object.E_Shop;
import com.utility.Base_Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class E_Shop_test extends Base_Utility{
	public Login_Page_Test login;
	public E_Shop ob;
	String device = config_getdata("Platform_name");
	@Test(priority = 0)
	public void TC107_registered_customers() throws InterruptedException
	{
		Message("************************E Shop**************************");
		ob = new E_Shop();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(5000);
		if (device.equalsIgnoreCase("pcloudy")) {
			Custom_click(ob.E_shop_pCloudy(), ob.E_shop_pCloudy().getText());     
		}
		else {
		Custom_click(ob.E_shop(), ob.E_shop().getText());     
		}
		Thread.sleep(10000);
		Custom_click(ob.shoping_cart(), "Shoping Cart list");
		Thread.sleep(2000);
		msg(ob.shoping_cart_items(),ob.shoping_cart_items().getText());
		Custom_click(ob.wishlist(), "wishlist");
		Thread.sleep(2000);
		if (device.equalsIgnoreCase("emulator")) {
		msg(ob.customer_login_heading(),"for " +ob.customer_login_heading().getText());	//For Emulator only
		msg(ob.registered_custombers_message(),ob.registered_custombers_message().getText());//For Emulator only
		}
		else {
		msg(ob.customer_login_heading_real(),"for " +ob.customer_login_heading_real().getText());//For real device and pCloudy
		msg(ob.registered_custombers_message_real(),ob.registered_custombers_message_real().getText());	//For real device and pCloudy
		}
		custom_sendkeys(ob.enter_email_or_mobile_number(), "rahul@gmail.com", "Email ID");
		if (device.equalsIgnoreCase("pcloudy")) {
		driver.navigate().back();
		}
		else {
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
			
		}
		Custom_click(ob.Continue_button(), "Continue button");
		Thread.sleep(2000);
		if (device.equalsIgnoreCase("emulator")) {
		msg(ob.verify_mobile(),ob.verify_mobile().getText());	//For Emulator only
		msg(ob.verify_mobile_message(),ob.verify_mobile_message().getText());	//For Emulator only
		Custom_click(ob.otp_pop_up_close(), "OTP Pop Up close");			//For Emulator only
		}
		else {
		msg(ob.verify_mobile_real(),ob.verify_mobile_real().getText());		//For real device and pCloudy
		msg(ob.verify_mobile_message_real(),ob.verify_mobile_message_real().getText());	//For real device and pCloudy
		Custom_click(ob.otp_pop_up_close_real(), "OTP Pop Up close");		//For real device and pCloudy
		}
	}
	@Test(priority = 1)
	public void TC108_new_customers() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
		Custom_click(ob.E_shop_pCloudy(), ob.E_shop_pCloudy().getText());
		Thread.sleep(10000);
		Custom_click(ob.user_account(), "User account");
		if (device.equalsIgnoreCase("pcloudy")) {
		driver.navigate().back();
		}
		Thread.sleep(2000);
		if (device.equalsIgnoreCase("emulator")) {
		msg(ob.newcustomer_heading(),ob.newcustomer_heading().getText());	//For Emulator only
		msg(ob.newcustomer_message1(),ob.newcustomer_message1().getText());	//For Emulator only
		}
		else {
		msg(ob.newcustomer_heading_real(),ob.newcustomer_heading_real().getText());	//For real device and pCloudy
		msg(ob.newcustomer_message1_real(),ob.newcustomer_message1_real().getText());//For real device and pCloudy
		}
		msg(ob.newcustomer_message2(),ob.newcustomer_message2().getText());
		msg(ob.newcustomer_message3(),ob.newcustomer_message3().getText());
		msg(ob.newcustomer_message4(),ob.newcustomer_message4().getText());
		Custom_click(ob.create_account(), ob.create_account().getText());
		custom_sendkeys(ob.firstname(), "Sonu", " First name ");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
		custom_sendkeys(ob.lastname(), "Jindal", " Last name ");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
		Custom_click(ob.CheckBox(), ob.CheckBox().getText());
		custom_sendkeys(ob.mobile(), "9876564534", " Mobile number ");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
		custom_sendkeys(ob.email_address(), "sonu@gmail.com", " Email ");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
		Custom_click(ob.checkbox_for_T_and_C(), " Tearms and Condition check Box ");
		Custom_click(ob.OTP(), ob.OTP().getText());
		if (device.equalsIgnoreCase("emulator")) {
		msg(ob.verify_mobile(),ob.verify_mobile().getText());		//For Emulator only
		msg(ob.verify_mobile_message(),ob.verify_mobile_message().getText());//For Emulator only
		Custom_click(ob.otp_pop_up_close(), "OTP Pop Up close");			//For Emulator only
		}
		else {
		msg(ob.verify_mobile_real(),ob.verify_mobile_real().getText());	//For real device and pCloudy
		msg(ob.verify_mobile_message_real(),ob.verify_mobile_message_real().getText());//For real device and pCloudy
		Custom_click(ob.otp_pop_up_close_real(), "OTP Pop Up close");		//For real device and pCloudy
		}
		Custom_click(ob.create_an_account(), ob.create_an_account().getText());
		Thread.sleep(2000);
		scrollByText("CREATE AN ACCOUNT");
		Custom_click(ob.back_button(), "Back from Create New Customer Account");
		Custom_click(ob.back(), " Back from E-shop ");
		
	}
}

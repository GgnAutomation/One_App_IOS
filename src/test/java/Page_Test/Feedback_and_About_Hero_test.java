package Page_Test;

import org.testng.annotations.Test;

import com.page_object.Feedback_and_About_Hero;
import com.utility.Base_Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Feedback_and_About_Hero_test extends Base_Utility {

	public Feedback_and_About_Hero ob;
	public Login_Page_Test login;

	@Test(priority = 0)
	public void TC057_verify_Feedback() throws InterruptedException {
		Message("************************Feedback and About Hero test**************************");
		ob = new Feedback_and_About_Hero();
//		login = new Login_Page_Test();
//		login.login();
		Custom_click(ob.home(), "Home");
		Thread.sleep(2000);
		Custom_click(ob.side_menu_button(), "Side menu button");
		Custom_click(ob.feedback(), ob.feedback().getText());
		Thread.sleep(2000);
		Custom_click(ob.Category(), "Category");
		Thread.sleep(2000);
		Custom_click(ob.Category(), "Return Category");
		Thread.sleep(2000);
		Custom_click(ob.Sub_Category(), "Sub_Category");
		Thread.sleep(2000);
		Custom_click(ob.Sub_Category(), "Return Sub_Category");
		Thread.sleep(2000);
		Custom_click(ob.Sub_Sub_Category(), "Sub_Sub_Category");
		Thread.sleep(2000);
		Custom_click(ob.Sub_Sub_Category(), "Return Sub_Sub_Category ");
		Thread.sleep(2000);
		custom_sendkeys(ob.feedback_message(), "Nice facility", " your Feedback");
		Custom_click(ob.back_btn(), "Back from Feedback page");

	}

	@Test(priority = 1)
	public void TC058_verify_About_Hero() throws InterruptedException {
			Custom_click(ob.about_hero(), ob.about_hero().getText());
			Thread.sleep(10000);
//			msg(ob.about_hero_message_1(),ob.about_hero_message_1().getText());      // For emulator
//			msg(ob.about_hero_message_2(),ob.about_hero_message_2().getText());		// For emulator
			msg(ob.about_hero_message_1_real(),ob.about_hero_message_1_real().getText());// For Real device & pCloudy
			msg(ob.about_hero_message_2_real(),ob.about_hero_message_2_real().getText());// For Real device & pCloudy
			Custom_click(ob.back_btn(), "Back from About Hero page");
 }

	@Test(priority = 2)
	public void TC059_verify_Side_menu_page_function() throws InterruptedException {
			Custom_click(ob.goodlife(), "Goodlife");
			Thread.sleep(6000);
			msg(ob.goodlife_page_test(),"goodlife page test =" + ob.goodlife_page_test().getText());
			Custom_click(ob.back_btn(), "Back from GoodLife page");
	}

	@Test(priority = 3)
	public void TC060_Vehicle_Details_in_Wheels_of_trust() throws InterruptedException {
		Custom_click(ob.wheels_of_trust(), "Wheels of trust");
		Thread.sleep(5000);
		try {
			if(ob.Language_select().isDisplayed()) {
			Custom_click(ob.Language_select(), "English language");
			Thread.sleep(2000);
			msg(ob.cookieNotice(),ob.cookieNotice().getText());
			Custom_click(ob.Accept_cookie(), ob.Accept_cookie().getText()); }
		} catch (Exception e) {
			Message("Language poup is not populate");
		}
		Custom_click(ob.Vehicle_Details(), ob.Vehicle_Details().getText());
		Custom_click(ob.State(), ob.State().getText());
		ob.Select_State("Delhi");
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void TC061_Chose_city_in_Vehicle_Details_in_Wheels_of_trust() throws InterruptedException {
		Custom_click(ob.City(), ob.City().getText());
		ob.Select_city("New Delhi");
		Thread.sleep(2000);
		custom_sendkeys(ob.Pincode(), "110037", "Pincode");
		msg(ob.Two_Wheeler(),"Please " + ob.Two_Wheeler().getText());
		Custom_click(ob.motorcycle(), ob.motorcycle().getText());
	}

	@Test(priority = 5)
	public void TC062_Select_company_in_Vehicle_Details_in_Wheels_of_trust() throws InterruptedException {
		Custom_click(ob.Company(), ob.Company().getText());
		ob.Select_Company("Hero");
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void TC063_Select_Model_in_Vehicle_Details_in_Wheels_of_trust() throws InterruptedException {
		Custom_click(ob.Model(), ob.Model().getText());
		ob.Select_Model("GLAMOUR");
		Thread.sleep(2000);
		custom_sendkeys(ob.enter_registraction_months_and_Years(), "2012-09", "Registraction Months and Year");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
		Thread.sleep(2000);
		if(ob.next_button().isDisplayed()==true)
		{
		Custom_click(ob.next_button(), ob.next_button().getText());
		}
		else
		{
			Custom_click(ob.Accept_cookie(), ob.Accept_cookie().getText());
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
			Custom_click(ob.next_button(), ob.next_button().getText());
		}
	}
	@Test(priority = 7)
	public void TC064_Verify_Vehicle_Condition_in_Wheels_of_trust()
	{
		msg(ob.silencer(),ob.silencer().getText());
		Custom_click(ob.silencer_smoke(), ob.silencer_smoke().getText());
		msg(ob.Starting_Vehicle(),ob.Starting_Vehicle().getText());
		Custom_click(ob.Start_normally(), ob.Start_normally().getText());
		msg(ob.Light_Indicators(),ob.Light_Indicators().getText());
		Custom_click(ob.Light_Indicators_condition(), ob.Light_Indicators_condition().getText());
		Scroll_down_page_Action("Next");  // for pCloudy version 11.0.0 only
		msg(ob.Front_Tyre(),ob.Front_Tyre().getText());
		Custom_click(ob.Front_Tyre_condition(), ob.Front_Tyre_condition().getText());
//		Scroll_down_page_Action("Next");    // all other device except version 11.0.0
		msg(ob.Rear_Tyre(),ob.Rear_Tyre().getText());
		Custom_click(ob.Rear_Tyre_condition(), ob.Rear_Tyre_condition().getText());
		Scroll_down_page_Action("Next");       // for pCloudy version 11.0.0 only
		msg(ob.Body_Parts(),ob.Body_Parts().getText());
		Custom_click(ob.Body_Parts_condition(), ob.Body_Parts_condition().getText());
//		Custom_click(ob.How_to_check_all_issue(), "How to check all issue instraction ");     //For emulator
//		msg(ob.issue_message(),ob.issue_message().getText());							//For emulator
//		Custom_click(ob.close_issue_instraction(), "close issue instraction message");   	   //For emulator
		Custom_click(ob.How_to_check_all_issue_real(), "How to check all issue instraction ");//For real device
		msg(ob.issue_message_real(),ob.issue_message_real().getText());				 //For real device
		Custom_click(ob.close_issue_instraction_real(), "close issue instraction message");  //For real device
		Custom_click(ob.next_button(), ob.next_button().getText());
	}
	@Test(priority = 8)
	public void TC065_Verify_Your_Details_Through_WhatsApp_in_Wheels_of_trust() throws InterruptedException
	{
		//first four line for emulator only
//		msg(ob.sign_in(),ob.sign_in().getText());
//		Custom_click(ob.whatsapp_button(), ob.whatsapp_button().getText());
//		Thread.sleep(5000);
//		ob.whatsapp_info();
//		Custom_click(ob.whatsapp_close(), "Whatsapp close");
		//below four line for real device and pCloudy.
		msg(ob.sign_in_real(),ob.sign_in_real().getText());
		Custom_click(ob.whatsapp_button(), ob.whatsapp_button().getText());
		Thread.sleep(5000);
		ob.whatsapp_info_real();
		Custom_click(ob.whatsapp_close_real(), "Whatsapp close");
	}
	@Test(priority = 9)
	public void TC066_Verify_Your_Details_Through_OTP_in_Wheels_of_trust() throws InterruptedException
	{
//		msg(ob.Login(),ob.Login().getText());          //For Emulator
		msg(ob.Login_real(),ob.Login_real().getText());     //For Real Device
		custom_sendkeys(ob.name(), "Kundan Singh", "Name");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
		custom_sendkeys(ob.number(), "8767980978", "Contact number");
		Custom_click(ob.otp(), "OTP");
		Custom_click(ob.send_otp(), "Send OTP");
		Thread.sleep(2000);
		custom_sendkeys(ob.otp(), "1234", "OTP");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
		Custom_click(ob.submit(), "Submit Button");
//		msg(ob.otp_message(),ob.otp_message().getText());         //For Emulator
		msg(ob.otp_message_real(),ob.otp_message_real().getText());     //For Real Device
		Custom_click(ob.back_btn(), "Back from wheels of trust page");
	}
	
	@Test(priority = 10)
	public void TC067_Verify_joyride() {
			Custom_click(ob.Joyride(), "Joyride");
			ob.Joyride_info();
			Custom_click(ob.nearest_dealer(), ob.nearest_dealer().getText());
			Custom_click(ob.back_btn(), "Back from Dealer Locator");
			Custom_click(ob.back_btn(), "Back from Joyride page");
			driver.navigate().back();
		
	}
}

package Page_Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.page_object.Refer_a_friend_and_Contact_us;
import com.utility.Base_Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Refer_a_friend_and_Contact_us_test extends Base_Utility {
	public Refer_a_friend_and_Contact_us ob;
	public Login_Page_Test login;
	String device = config_getdata("Platform_name");
	String enveronment = config_getdata("env"),mobileno;
	@Test(priority = 0)
	public void TC052_Refer_a_friend() throws InterruptedException
	{
		Message("************************Refer a Friend**************************");
		ob = new Refer_a_friend_and_Contact_us();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(3000);
		Custom_click(ob.home(), "Home");
		Thread.sleep(2000);
		Custom_click(ob.side_menu_button(), "Side menu button");
		Custom_click(ob.refer_friend(), ob.refer_friend().getText());
		custom_sendkeys(ob.friend_name(), config_getdata("Friend_name"), "Friend name");
		custom_sendkeys(ob.friend_mob_no(), config_getdata("Friend_mob_no"), "Friend mob no");
		
	}
	@Test(priority = 1)
	public void TC053_Verify_Select_State()
	{
		Custom_click(ob.Select_state(), ob.Select_state().getText());
		ob.Select_State("DELHI");
		
	}
	@Test(priority = 2)
	public void TC054_Verify_Select_City()
	{
		Custom_click(ob.Select_City(), ob.Select_City().getText());
		ob.Select_City("NEW DELHI");
		driver.navigate().back();
		}
	@Test(priority = 3)
	public void TC055_Verify_Select_Model()
	{
		Custom_click(ob.Select_Model(), ob.Select_Model().getText());
		ob.Select_Model("Passion Pro");
		try {
		Custom_click(ob.Submit_button(), ob.Submit_button().getText());	
		}catch(Exception e)
		{ Message("Submit button is not clickable");
			}
	}
	@Test(priority = 4)
	public void TC056_Verify_Refer_yourself() throws InterruptedException
	{
		Thread.sleep(10000);
		Custom_click(ob.side_menu_button(), "Side menu button");
		Custom_click(ob.refer_friend(), ob.refer_friend().getText()); 
		Custom_click(ob.Refer_yourself(), ob.Refer_yourself().getText());
		Custom_click(ob.Select_state(), ob.Select_state().getText());
		ob.Select_State_in_refer_yourself();
		Custom_click(ob.Select_City(), ob.Select_City().getText());
		ob.Select_City_in_refer_yourself();
		if(enveronment.equalsIgnoreCase("prod"))
		{  mobileno = config_getdata("prod_mobileno"); }
		else {  mobileno = config_getdata("Stage_mobileno"); }
		assertEquals(mobileno , ob.friend_mob_no().getText());
		if(mobileno.equalsIgnoreCase(ob.friend_mob_no().getText()))
		{
			Message("Information matched as per registered account by mobile number");
			Custom_click(ob.Select_Model(), ob.Select_Model().getText());
			ob.Select_Model("Passion Pro");
			Custom_click(ob.Submit_button(), ob.Submit_button().getText());
	
		}
		else
		{
			Message("Mobile number not matched with registered mobile number");
			Custom_click(ob.Select_Model(), ob.Select_Model().getText());
			ob.Select_Model("Passion Pro");
			Custom_click(ob.Submit_button(), ob.Submit_button().getText());
		}
	}
	@Test(priority = 5)
	public void TC057_Verify_Facebook_in_Contact_us_page() throws InterruptedException
	{
		Thread.sleep(10000);
		Custom_click(ob.side_menu_button(), "Side menu button");
		Thread.sleep(2000);
		try {
		Custom_click(ob.Contact_us(), ob.Contact_us().getText());
		}catch(Exception e) {
			Custom_click(ob.side_menu_button(), "Side menu button"); 
			Custom_click(ob.Contact_us(), ob.Contact_us().getText());
		}
		try {
		ob.facebook();
		}catch(Exception e) {
			test.addScreenCaptureFromPath(lis.getcapcture("facebook"));
			driver.navigate().back();
			
		}
		}
	@Test(priority = 6)
	public void TC058_Verify_instagram_in_Contact_us_page() throws InterruptedException
	{try {
		ob.instagram();
	}catch(Exception e) {
		test.addScreenCaptureFromPath(lis.getcapcture("Instagram"));
		Custom_click(ob.back(), " Back from " + "Instagram");
		}
	}
	@Test(priority = 7)
	public void TC059_Verify_Whatsapp_in_Contact_us_page()
	{
		try {
		ob.Whatsapp();
		}catch(Exception e) {
			try {
			Custom_click(ob.back(), " Back from " + "Whatsapp");
			} catch (Exception k) {driver.navigate().back();}
			test.addScreenCaptureFromPath(lis.getcapcture("Whatsapp"));
		}
	}
	@Test(priority = 8)
	public void TC060_Verify_youTube_in_Contact_us_page() throws InterruptedException
	{
		try {
		ob.youTube();
		}catch(Exception e) {
			test.addScreenCaptureFromPath(lis.getcapcture("youtube"));
			Custom_click(ob.back(), " Back from " + "youtube");
			
		}
	}
	@Test(priority = 9)
	public void TC061_Verify_Linkedin_in_Contact_us_page() throws InterruptedException
	{
		try {
		ob.Linkedin();
		}catch(Exception e) {
			test.addScreenCaptureFromPath(lis.getcapcture("Linkedin"));
			Custom_click(ob.back(), " Back from " + "Linkedin");
			
		}
	}
	@Test(priority = 10)
	public void TC062_Verify_twitter_in_Contact_us_page() throws InterruptedException
	{
		try {
		ob.twitter();
		}catch(Exception e) {
			test.addScreenCaptureFromPath(lis.getcapcture("twitter"));
			Custom_click(ob.back(), " Back from " + "twitter");
			
		}
	}
	@Test(priority = 11)
	public void TC063_Verify_Contact_via_Email() throws InterruptedException
	{
		Custom_click(ob.Contact_via_email(), ob.Contact_via_email().getText());
		if (device.equalsIgnoreCase("emulator")) {
		try {
		if(ob.Contact_via_email().isDisplayed()==true)
		{
			Custom_click(ob.Contact_via_email(), ob.Contact_via_email().getText());
		}
		}catch(Exception e) { Message("Contact via email has already open");}
		Thread.sleep(2000);
		msg(ob.Welcome_message()," ");
		msg(ob.Welcome_message2()," ");
		Custom_click(ob.welcome_tour_next(), "welcome tour next");
		msg(ob.welcome_tour_promotion()," ");
		Custom_click(ob.welcome_tour_done(), ob.welcome_tour_done().getText());
		msg(ob.addresses_title()," ");
		Custom_click(ob.add_email_address(), ob.add_email_address().getText());
		Custom_click(ob.google(), "Setup email with google");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		}
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Custom_click(ob.back(), " Back from Contact Us page");
	}
}

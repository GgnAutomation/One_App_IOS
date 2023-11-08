package Page_Test;

import org.testng.annotations.Test;

import com.page_object.Home_Page;
import com.page_object.Services_Page;
import com.page_object.Vehicle_Details;
import com.utility.Base_Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Vehicle_Details_test extends Base_Utility {
	public Vehicle_Details ob;
	public Login_Page_Test login;

	@Test(priority = 0)
	public void TC035_Verify_My_Vehicle() throws InterruptedException {
		Message("*********************My Vehicle page**************************");
		ob = new Vehicle_Details();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(2000);
		Custom_click(ob.home(), "Home");
		Custom_click(ob.side_menu_button(), "Side menu button");
		msg(ob.user_name(),ob.user_name().getText());
		msg(ob.vehicle_name_1(),"You are using =" +ob.vehicle_name_1().getText());
		msg(ob.vehicle_number_1(),ob.vehicle_number_1().getText());
		Custom_click(ob.Vehicle_details(), "Vehicle Details");
		Custom_click(ob.Selected_vehicle(), ob.Selected_vehicle().getText());
		Custom_click(ob.choose_vehicle(), ob.choose_vehicle().getText());
		if (ob.Vehicle_img().isDisplayed()) {
			Message("Vehicle image is present");
		} else {
			Message("Vehicle image is missing");
		}
		try {
			if(ob.vehicle_status().isDisplayed()) {
		msg(ob.vehicle_status(),"Vehicle status =" + ob.vehicle_status().getText()); }
		}catch(Exception e) { Message("Vehicle Status is not given");}
		try {
			if(ob.Vehicle_number().isDisplayed()) {
		msg(ob.Vehicle_number(),"Vehicle number =" + ob.Vehicle_number().getText()); }
		}catch(Exception e) { Message("Vehicle number is not given");}
		Custom_click(ob.verify_GoodLife(), " Verify Good Life");
		Thread.sleep(5000);
		msg(ob.verify_goodlife_page(),"verify goodlife page =" +ob.verify_goodlife_page().getText());
		Custom_click(ob.back_button(), " Back from GoodLife page");
		Custom_click(ob.verify_joyRide(), " Verify JoyRide ");
		msg(ob.verify_joyRide_page(),"Verify joyRide page =" +ob.verify_joyRide_page().getText());
		Custom_click(ob.back_button(), " Back from joyRide page");
		
	}

	@Test(priority = 1)
	public void TC036_Verify_My_Vehicle_more_details() {
		Custom_click(ob.more_details(), ob.more_details().getText());
		ob.vehicle_info();
		Custom_click(ob.nick_name_edit(), "Nick name");
		custom_sendkeys(ob.nick_name_input_field(), config_getdata("nickname"), "Nick name edit");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		Custom_click(ob.save_button(), "Save button");
		Custom_click(ob.more_details(), ob.more_details().getText());
	}

	@Test(priority = 2)
	public void TC037_Verify_My_Vehicle_Documents() throws InterruptedException {
		Custom_click(ob.my_vehicle_documents(), ob.my_vehicle_documents().getText());
		Thread.sleep(2000);
		ob.Documents_list();
		Custom_click(ob.back_button(), " Back from my vehicle documents page");
	}

	@Test(priority = 3)
	public void TC038_Verify_Owners_Manual() {
		Custom_click(ob.owners_manual(), "Owners manual");
		try {
			if(ob.owners_title().isDisplayed()) {
		msg(ob.owners_title(),"My Vehicle Owners manual =" +ob.owners_title().getText());
		Custom_click(ob.back_button(), " Back from Owners manual page"); }
		}catch(Exception e)
		{
			Message("Owner details already given");
			Custom_click(ob.back_button(), " Back from Owners manual page");
		}
	}
	@Test(priority = 4)
	public void TC039_Verify_my_Vehicle_service_History() {
		Custom_click(ob.My_vehicle_Service_history(), "My Vehicle Service history");
		try {
			ob.Service_history();
			Custom_click(ob.back_button(), " Back from Service History page");
			Custom_click(ob.back_button(), " Back from My Vehicle page");
		}catch(Exception e)
		{
			msg(ob.owners_title(),"My Vehicle Service history" +ob.owners_title().getText());
			Custom_click(ob.back_button(), " Back from Service History page");
			Custom_click(ob.back_button(), " Back from My Vehicle page");
			
		}
		
	}
	@Test(priority = 5)
	public void TC040_Verify_Tips_and_DIY_videos_inside_sideMenu() throws InterruptedException
	{
		Custom_click(ob.side_menu_button(), "Side menu button");
		Custom_click(ob.Tips_and_DIY_videos(), ob.Tips_and_DIY_videos().getText());
		Custom_click(ob.Tips_info(), ob.Tips_info().getText());
		Custom_click(ob.DIY_Videos(), ob.DIY_Videos().getText());
		Custom_click(ob.back_button(), " Back from My Tips page");
//		driver.navigate().back();
	}
}

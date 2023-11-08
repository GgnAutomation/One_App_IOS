package Page_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.page_object.Home_Page;
import com.utility.Base_Utility;

@Listeners(com.utility.listner.class)
public class Home_Page_Test extends Base_Utility {

	public Login_Page_Test login;
	public Home_Page ob;
	String device = config_getdata("Platform_name");

	@Test(priority = 0)
	public void TC017_Home_page_verify() throws InterruptedException {
		Message("************************Home_Page_Test**************************");
		ob = new Home_Page();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(25000);
		msg(ob.temperature(), "Current Temperature is =" + ob.temperature().getText());
		VerifyElementPresent(ob.vehicle_img(), "Vehicle Img is");
		Thread.sleep(2000);
		ob.all_vehicle_inside_drop_down();
//		Custom_click(ob.Collapse_btn(), "Collapse button");
//		Thread.sleep(2000);
//		Custom_click(ob.Collapse_btn(), " Return collapse button");
		Thread.sleep(2000);
		Custom_click(ob.notification(), "Notification");
		Message("Total Notification are=" + ob.notification_count());
		Custom_click(ob.notification_back(), "Notification back");
	}

	@Test(priority = 1)
	public void TC018__verify_Navigate() {
		Custom_click(ob.Navigate_menu(), "Navigate menu");
		if (device.equalsIgnoreCase("emulator")) {
			try {
				Custom_click(ob.While_using_the_app(), "While using the app");
			} catch (Exception e) {
				Message("While Using the app pop up did not come");
				test.addScreenCaptureFromPath(lis.getcapcture("While using the app"));
			}
		}
		Custom_click(ob.Search_destination(), "Search destination");
		msg(ob.Search_here(), ob.Search_here().getText());
		custom_sendkeys(ob.Search_here(), "railway station", "Place name");
		Custom_click(ob.chose_place_name(), ob.chose_place_name().getText());
		msg(ob.Searched_name(), ob.Searched_name().getText());
		msg(ob.Searched_address(), ob.Searched_address().getText());
		Custom_click(ob.Navigate_button(), ob.Navigate_button().getText());
		Custom_click(ob.Start(), "Start button");
		Custom_click(ob.Start_button(), ob.Start_button().getText());
		Custom_click(ob.stop_navigation(), " Stop navigation");
		Custom_click(ob.Back_button(), "Back from Search here");
		Custom_click(ob.Back_button(), "Back from Navigation");
	}

	@Test(priority = 2)
	public void TC019_Verify_Documents() throws InterruptedException {

		Custom_click(ob.Documents_Menu(), "Document menu");
		Thread.sleep(2000);
		ob.Documents_list();
		Custom_click(ob.Back(), "Back from Documents");
	}

	@Test(priority = 3)
	public void TC020_Verify_Relationship_Manager() throws InterruptedException {
		Thread.sleep(2000);
		Custom_click(ob.Relationship_Manager(), "Relationship Manager");
		Thread.sleep(4000);
		try {
			if (ob.Relationship_Manager_name().getSize() != null) {
				msg(ob.Relationship_Manager_name(),
						"Relationship Manager name is =" + ob.Relationship_Manager_name().getText());
				msg(ob.Relationship_Manager_Address(),
						"Relationship Manager address is =" + ob.Relationship_Manager_Address().getText());
				msg(ob.Relationship_Manager_Contact_number(), "Relationship Manager Contact number is ="
						+ ob.Relationship_Manager_Contact_number().getText());
				Custom_click(ob.Relationship_Manager_Contact_number(), "Relationship manager contact");
				driver.navigate().back();
				driver.navigate().back();
				driver.navigate().back();
			}
		} catch (Exception e) {
			Message("Relationship Manager name is not given");
		}
		Thread.sleep(2000);
		ob.Others_Contacts();
		Custom_click(ob.Back(), "Back from Relationship Manager");

	}
	@Test(priority = 4)
	public void TC021_Verify_RSA() throws InterruptedException
	{
		Custom_click(ob.RSA(), "RSA");
		Thread.sleep(4000);
		ob.RSA_info();
	}
	@Test(priority = 5)
	public void TC022_Renew_RSA() throws InterruptedException
	{
		Custom_click(ob.renew_rsa(), ob.renew_rsa().getText());
		Thread.sleep(2000);
		ob.RSA_info();
		msg(ob.registration_number(), "Registraction number =" +ob.registration_number().getText());
		Custom_click(ob.renew_rsa(), ob.renew_rsa().getText());
		Thread.sleep(6000);
		Custom_click(ob.Back(), "Back from Payment");
		Thread.sleep(1000);
		Custom_click(ob.Back(), "Back from Get RSA");
	}
	@Test(priority = 6)
	public void TC023_frequently_asked_questions() throws InterruptedException
	{
		ob.asked_questions();
		Custom_click(ob.Back(), "Back from Roadside Assistance");
	}
//	@Test(priority = 4)
//	public void TC021_Verify_RSA() throws InterruptedException {
//		Custom_click(ob.RSA(), "RSA");
//		Thread.sleep(4000);
//		if (device.equalsIgnoreCase("realdevice")) {
//			Custom_click(ob.locate_nearest_dealer_real_device(), "locate nearest dealer"); // for real device
//		} else {
//			try {
//				Custom_click(ob.locate_nearest_dealer(), "locate nearest dealer");
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				Message("Not able to click On Locate nearest deler link. Try again");
//				driver.navigate().refresh();
//				Thread.sleep(4000);
//				try {
//					Custom_click(ob.locate_nearest_dealer(), "locate nearest dealer");
//				} catch (Exception k) {
//					Message("Not able to click On Locate nearest deler link.");
//					Custom_click(ob.Back(), "Back from RSA");
//					Thread.sleep(2000);
//				}
//			}
//		}
//		if (device.equalsIgnoreCase("emulator")) {
//			msg(ob.locate_the_nearest_dealer(), ob.locate_the_nearest_dealer().getText()); // only for emulator
//		} else {
//			msg(ob.locate_the_nearest_dealer_real(), ob.locate_the_nearest_dealer_real().getText()); // only for real
//																										// device &
//																										// pCloudy
//		}
//		Thread.sleep(2000);
//		Custom_click(ob.accept_cookie(), ob.accept_cookie().getText() + " Coockie");
//	}
//
//	@Test(priority = 5)
//	public void TC022_Select_State_For_Nearest_Dealer() throws InterruptedException {
//		Custom_click(ob.State(), ob.State().getText());
//		Thread.sleep(2000);
//		try {
//			if (ob.State().isDisplayed()) {
//				Custom_click(ob.State(), ob.State().getText());
//			}
//		} catch (Exception e) {
//			Message("State is already open");
//		}
//
//		ob.select_state("Bihar");
//	}
//
//	@Test(dependsOnMethods = "TC022_Select_State_For_Nearest_Dealer()", priority = 6)
//	public void TC023_Select_City_For_Nearest_Dealer() throws InterruptedException {
//		Thread.sleep(3000);
//		Custom_click(ob.City(), ob.City().getText());
//		ob.select_city("Muzaffarpur");
//	}
//
//	@Test(dependsOnMethods = "TC022_Select_State_For_Nearest_Dealer()", priority = 7)
//	public void TC024_Select_Locality_For_Nearest_Dealer() throws InterruptedException {
//		Thread.sleep(3000);
//		Custom_click(ob.Locality(), ob.Locality().getText());
//		ob.select_Locality("Sujawalpur");
//		Thread.sleep(3000);
//		Custom_click(ob.Search_button(), ob.Search_button().getText());
//	}
//
//	@Test(dependsOnMethods = "TC022_Select_State_For_Nearest_Dealer()", priority = 8)
//	public void TC025_Verify_Nearest_Dealer_info() throws InterruptedException {
//		Thread.sleep(3000);
//		if (device.equalsIgnoreCase("emulator")) {
//			msg(ob.Local_dealer_fullname(), ob.Local_dealer_fullname().getText()); // for emulator
//		} else {
//			msg(ob.Local_dealer_fullname_real(), ob.Local_dealer_fullname_real().getText()); // for pCloudy and real
//																								// device
//		}
////		Scroll_down_page_Action("View More");
//		Thread.sleep(1000);
//		msg(ob.Local_dealer_name(), ob.Local_dealer_name().getText());
//		if (device.equalsIgnoreCase("emulator")) {
//			msg(ob.Local_dealer_address(), ob.Local_dealer_address().getText()); // for emulator
//		} else {
//			msg(ob.Local_dealer_address_real(), ob.Local_dealer_address_real().getText()); // for pCloudy and real
//																							// device
//		}
//		Custom_click(ob.Back(), "Back from RSA");
//	}

	
	@Test(priority = 7)
	public void TC024_Verify_Technical_Support_Manager() throws InterruptedException {
		Custom_click(ob.Technical_Support(), "Technical Support");
		Thread.sleep(2000);
		msg(ob.Technical_Support_Manager_Name(),
				"Technical Support Manager Name is =" + ob.Technical_Support_Manager_Name().getText());
		msg(ob.Technical_Support_Manager_Address(),
				"Technical Support Manager address is =" + ob.Technical_Support_Manager_Address().getText());
		msg(ob.Technical_Support_Manager_Contact_Number(), "Technical Support Manager contact number is ="
				+ ob.Technical_Support_Manager_Contact_Number().getText());
		Custom_click(ob.Back(), "Back from Technical Support Manager");
	}

	@Test(priority = 8)
	public void TC025_Verify_Dealer_Locator() throws InterruptedException {

		Custom_click(ob.Dealer_Locator(), "Dealer Locator");
		Thread.sleep(2000);
		Custom_click(ob.Select_State(), "Select state");
		ob.Select_State("BIHAR");
	}

	@Test(priority = 9)
	public void TC026_Select_city() {
		Custom_click(ob.Select_City(), "Select city");
		ob.Select_City("BAGAHA");
	}

	@Test(priority = 10)
	public void TC027_View_dealer_name_and_address() {
		Custom_click(ob.map_view(), "Map View dealer name and address");
		ob.Dealer_info();
		Custom_click(ob.Back(), "Back from Dealer Locator");
	}
//	@Test(priority = 13)
//	public void verify_Service_at_home_page()
//	{
//		scrollByText("Latest");
//		msg("Service status =" +ob.Service_status().getText());
//		Custom_click(ob.View_details_button(), ob.View_details_button().getText());
//		msg(ob.Vehicle_service().getText()+" for " +ob.Vehicle_name().getText());
//		driver.navigate().back();
//	}
//	@Test(priority = 14)
//	public void verify_Latest_at_home_page() throws InterruptedException
//	{
//		Custom_click(ob.Latest_Vehicle(), "Latest Vehicle");
//		Thread.sleep(6000);
//		msg(ob.latest_vehicle_message().getText());
//		msg(ob.mute().getText());
//		Custom_click(ob.Back(), ob.latest_vehicle_message().getText() );
////		Custom_click(ob.mute(), ob.mute().getText());
////		Thread.sleep(2000);
////		Custom_click(ob.mute(), ob.mute().getText());
////		Custom_click(ob.scroll_img(), " Scroll img");
////		Thread.sleep(3000);
//	}
////	@Test(priority = 11)
////	public void verify_Notify_me_in_Latest_at_home_page() throws InterruptedException
////	{
////		Custom_click(ob.Notify_me(), ob.Notify_me().getText());
////		Thread.sleep(2000);
////		custom_sendkeys(ob.user_name(), "Renu", "User name ");
////		custom_sendkeys(ob.user_email(), "Resnu@gmail.com", " User email ");
////		custom_sendkeys(ob.pincode(), "657809", "Pin code ");
////		custom_sendkeys(ob.user_mobile(), "9809786765", "Mobile number");
////		ob.pincode().click();
////		Custom_click(ob.Send_OTP_button(), " Send OTP Button ");
////		Thread.sleep(10000);
////		ob.otp();
////		if(ob.submit_button().isEnabled()!=true)
////		{
////			msg("Submitting buton is not clickable");
////			msg(ob.otp_error_message().getText());
////		}
////		else
////		{
////			Custom_click(ob.submit_button(), "Submit button");
////		}
////		Custom_click(ob.Back(), " Back from Get ready to #LiveTheLegend");
////	}
//	@Test(priority = 15)
//	public void verify_EShop() throws InterruptedException
//	{
//		Scroll_down_page_Action("Benefits");
//		Custom_click(ob.E_shop(), "E-Shop ");
//		msg(ob.E_shop_location().getText());
//		Custom_click(ob.Categories(), ob.Categories().getText());
//		Thread.sleep(2000);
//		Custom_click(ob.BACK_TO_HERO_MOTOCORP(), " Back from hero Motocorp ");
//		Custom_click(ob.Back(), " Back from Merchandise ");
//		}
//	@Test(priority = 16)
//	public void verify_Benifits_Vehicle_Exchange() throws InterruptedException
//	{
//		Custom_click(ob.Benifits(), "Benifits ");
//		Thread.sleep(6000);
//		msg("Welcome to " +ob.goodlife().getText() +" page");
//		msg(ob.goodlife_message().getText());
//		Custom_click(ob.Back(), " Back from Hero GoodLife ");
//		Custom_click(ob.Vehicle_Exchange(), "Vehicle Exchange ");
//		Thread.sleep(2000);
//		Custom_click(ob.language(), " English ");
//		msg("For exchange please fill below mandatory filled");
//		ob.Vehicle_Exchange_info();
//		Custom_click(ob.Back(), " Back from Wheels of Trust ");
//	}
//	@Test(priority = 17)
//	public void verify_Community_and_Tips() throws InterruptedException
//	{
//		Scroll_down_page_Action("What's New");
//		Custom_click(ob.Community(), "Community ");
//		Thread.sleep(5000);
//		msg(ob.Community_message_1().getText());
//		msg(ob.Community_message().getText());
//		Custom_click(ob.Back(), " Back from Xclan ");
//		scrollByText("Key Actions");
//		
//	}
}
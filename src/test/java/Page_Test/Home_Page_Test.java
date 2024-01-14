package Page_Test;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.page_object.Home_Page;
import com.utility.Base_Utility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

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
		Thread.sleep(10000);
		try {
		if(ob.temperature().isDisplayed()) {
		msg(ob.temperature(), "Current Temperature is = " ); }
		}catch(Exception e) {Custom_click(ob.enable_now(), "Enable now");}
		VerifyElementPresent(ob.vehicle_img(), "Vehicle Img is");
		Thread.sleep(2000);
		ob.all_vehicle_inside_drop_down();
		try {
		Custom_click(ob.Collapse_btn(), ob.Collapse_btn().getText());
		Thread.sleep(2000);
		Custom_click(ob.Collapse_btn(), ob.Collapse_btn().getText());
		Thread.sleep(2000);
		}catch(Exception e) {Message("Collapse button not visible");}
		Custom_click(ob.notification(), "Notification");
		ob.notification_count();
		Custom_click(ob.notification_back(), "Notification back");
	}
	@Test(priority = 1)
	public void TC018_verify_SOS() throws InterruptedException
	{
		try {
		Custom_click(ob.SOS_icon(), "SOS icon");
		ob.SOS_message();
		Custom_click(ob.sent_alert_btn(), ob.sent_alert_btn().getText());
		Thread.sleep(2000);
		Custom_click(ob.SOS_icon(), "SOS icon");
		ob.dont_send();
		Thread.sleep(2000);
		Custom_click(ob.SOS_icon(), "SOS icon");
		Custom_click(ob.SOS_close_btn(), "SOS close button");
		}catch(Exception e) {Custom_click(ob.enable_now(), "Enable now");}
	}
	@Test(priority = 2)
	public void TC019_verify_Navigate() {
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
		msg(ob.Search_here(), " = ");
		custom_sendkeys(ob.Search_here(), "railway", "Place name");
		Custom_click(ob.chose_place_name(), ob.chose_place_name().getText());
		msg(ob.Searched_name(), "Searched place name = ");
		msg(ob.Searched_address(), "Place address = ");
		Custom_click(ob.Navigate_button(), ob.Navigate_button().getText());
		Custom_click(ob.Start(), "Start button");
		Custom_click(ob.Start_button(), ob.Start_button().getText());
		try {
		Custom_click(ob.stop_navigation(), " Stop navigation"); 
		}catch(Exception e) { Message("Sorry Route not found");}
		driver.navigate().back();
//		Custom_click(ob.Back_button(), "Back from Search here");
//		Custom_click(ob.Back_button(), "Back from Navigation");
	}
	@Test(priority = 3)
	public void TC020_verify_Exchange() throws InterruptedException
	{
		Custom_click(ob.Exchange_Menu(), "Exchange menu");
		Thread.sleep(2000);
		ob.exchange_info();
		Custom_click(ob.Exchange_vehicle_name(), ob.Exchange_vehicle_name().getText());
		Thread.sleep(2000);
		msg(ob.real_value_msg(),"Exchange info =");
	}
	@Test(dependsOnMethods = "TC020_verify_Exchange()" ,priority = 4)
	public void TC021_verify_Vehicle_details() {
		msg(ob.vehicle_msg(), "Vehicle info = ");
		msg(ob.choose_city(), "City = ");
		custom_sendkeys(ob.city_sell(), config_getdata("City_to_sell_vehicle"), "City name where sell vehicle");
		Custom_click(ob.choose_city_sell(), ob.choose_city_sell().getText());
		custom_sendkeys(ob.city_pin_code(), "110037", "PIN code");
		Custom_click(ob.next_btn(), ob.next_btn().getText());
	}
	@Test(dependsOnMethods = "TC020_verify_Exchange()" ,priority = 5)
	public void TC022_verify_Vehicle_condition()
	{
		msg(ob.vehicle_condition(), "");
		msg(ob.condition_msg(), "");
		ob.all_question();
		Custom_click(ob.next_btn(), ob.next_btn().getText());
	}
	@Test(dependsOnMethods = "TC020_verify_Exchange()" ,priority = 6)
	public void TC023_verify_Vehicle_valution() throws InterruptedException
	{
		ob.exchange_info();
		Thread.sleep(2000);
		Custom_click(ob.Back(), "Back from estimated resell value page");
		Thread.sleep(2000);
		Custom_click(ob.Back(), "Back from Exchange page");
	}
	@Test(priority = 7)
	public void TC024_Verify_Documents() throws InterruptedException {

		Custom_click(ob.Documents_Menu(), "Document menu");
		Thread.sleep(2000);
		ob.Documents_list();
		Custom_click(ob.Back(), "Back from Documents");
	}

	@Test(priority = 8)
	public void TC025_Verify_Relationship_Manager() throws InterruptedException {
		Thread.sleep(2000);
		Custom_click(ob.Relationship_Manager(), "Relationship Manager");
		Thread.sleep(4000);
		try {
			if (ob.Relationship_Manager_name().getSize() != null) {
				msg(ob.Relationship_Manager_name(),
						"Relationship Manager name is = ");
				msg(ob.Relationship_Manager_Address(),
						"Relationship Manager address is = ");
				msg(ob.Relationship_Manager_Contact_number(), "Relationship Manager Contact number is = ");
				Custom_click(ob.Relationship_Manager_Contact_number(), "Relationship manager contact");
				driver.navigate().back();
				driver.navigate().back();
				if(device.equalsIgnoreCase("realdevice")){
				driver.navigate().back();}
			}
		} catch (Exception e) {
			Message("Relationship Manager name is not given");
		}
		Thread.sleep(2000);
		ob.Others_Contacts();
		Custom_click(ob.Back(), "Back from Relationship Manager");

	}
	@Test(priority = 9)
	public void TC026_Verify_RSA() throws InterruptedException
	{
		Custom_click(ob.RSA(), "RSA");
		Thread.sleep(4000);
		ob.RSA_info();
	}
	@Test(priority = 10)
	public void TC027_Renew_RSA() throws InterruptedException
	{
		Custom_click(ob.renew_rsa(), ob.renew_rsa().getText());
		Thread.sleep(2000);
		ob.RSA_info();
		try {
		msg(ob.registration_number(), "Registraction number = ");
		}catch(Exception e) { Message("Registraction number  is not given");}
		Thread.sleep(1000);
		Custom_click(ob.Back(), "Back from Payment");
		Thread.sleep(1000);
	}
	@Test(priority = 11)
	public void TC028_frequently_asked_questions() throws InterruptedException
	{
		Scroll_down_page_Action("Step 3");
		Scroll_down_page_Action("Asked questions");
		ob.asked_questions();
		Custom_click(ob.Back(), "Back from Roadside Assistance");
	}
//	@Test(priority = 9)
//	public void TC026_Verify_RSA() throws InterruptedException {
//		Custom_click(ob.RSA(), "RSA");
//		Thread.sleep(4000);
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
//		}
//		if (device.equalsIgnoreCase("emulator")) {
//			msg(ob.locate_the_nearest_dealer(), "Dealer =")); // only for emulator
//		} else {
//			msg(ob.locate_the_nearest_dealer_real(), "Dealer ="); // only for real
//																										// device &
//																										// pCloudy
//		}
//		Thread.sleep(2000);
//		Custom_click(ob.accept_cookie(), ob.accept_cookie().getText() + " Coockie");
//	}
//
//	@Test(priority = 10)
//	public void TC027_Select_State_For_Nearest_Dealer() throws InterruptedException {
//		Custom_click(ob.State(), ob.State().getText());
//		Thread.sleep(2000);
//		ob.select_state("Bihar");
//	}
//
//	@Test(dependsOnMethods = "TC027_Select_State_For_Nearest_Dealer()", priority = 11)
//	public void TC028_Select_City_For_Nearest_Dealer() throws InterruptedException {
//		Thread.sleep(3000);
//		Custom_click(ob.City(), ob.City().getText());
//		ob.select_city("Muzaffarpur");
//	}
//
//	@Test(dependsOnMethods = "TC027_Select_State_For_Nearest_Dealer()", priority = 12)
//	public void TC029_Select_Locality_For_Nearest_Dealer() throws InterruptedException {
//		Thread.sleep(3000);
//		Custom_click(ob.Locality(), ob.Locality().getText());
//		ob.select_Locality("Sujawalpur");
//		Thread.sleep(3000);
//		Custom_click(ob.Search_button(), ob.Search_button().getText());
//	}
//
//	@Test(dependsOnMethods = "TC027_Select_State_For_Nearest_Dealer()", priority = 13)
//	public void TC030_Verify_Nearest_Dealer_info() throws InterruptedException {
//		Thread.sleep(3000);
//		if (device.equalsIgnoreCase("emulator")) {
//			msg(ob.Local_dealer_fullname(), "Dealer full name = ")); // for emulator
//		} else {
//			msg(ob.Local_dealer_fullname_real(), ""Dealer full name = "); // for pCloudy and real
//																								// device
//		}
//		Thread.sleep(1000);
//		msg(ob.Local_dealer_name(), ob.Local_dealer_name().getText());
//		if (device.equalsIgnoreCase("emulator")) {
//			msg(ob.Local_dealer_address(), "Dealer address = "); // for emulator
//		} else {
//			msg(ob.Local_dealer_address_real(), "Dealer address = "); // for pCloudy and real
//																							// device
//		}
//		Custom_click(ob.Back(), "Back from RSA");
//	}
//
	
	@Test(priority = 14)
	public void TC031_Verify_Technical_Support_Manager() throws InterruptedException {
		Custom_click(ob.Technical_Support(), "Technical Support");
		Thread.sleep(2000);
		try {
		msg(ob.Technical_Support_Manager_Name(),
				"Technical Support Manager Name is = ");
		msg(ob.Technical_Support_Manager_Address(),
				"Technical Support Manager address is = " );
		msg(ob.Technical_Support_Manager_Contact_Number(), "Technical Support Manager contact number is = ");
		Custom_click(ob.Back(), "Back from Technical Support Manager");
		}catch(Exception e)
		{
			Message("No data found");
			Custom_click(ob.Back(), "Back from Technical Support Manager");
		}
	}

	@Test(priority = 15)
	public void TC032_Verify_Dealer_Locator() throws InterruptedException {

		Custom_click(ob.Dealer_Locator(), "Dealer Locator");
		Thread.sleep(2000);
		Custom_click(ob.Select_State(), "Select state");
		ob.Select_State("BIHAR");
	}

	@Test(priority = 16)
	public void TC033_Select_city() {
		Custom_click(ob.Select_City(), "Select city");
		ob.Select_City("BAGAHA");
	}

	@Test(priority = 17)
	public void TC034_View_dealer_name_and_address() {
		Custom_click(ob.map_view(), "Map View dealer name and address");
		ob.Dealer_info();
		Custom_click(ob.Back(), "Back from Dealer Locator");
	}
	@SuppressWarnings("deprecation")
	@Test(priority = 18)
	public void TC035_verify_Service_at_home_page() throws InterruptedException
	{
    	@SuppressWarnings("deprecation")
		TouchAction action = new TouchAction(driver);
    	for(int i=0;i<=1;i++) {
    	action.press(PointOption.point(520 ,2013)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(520 ,225))
    		.release().perform();
    	Message("Successfully Scroll up "+i);
    	}
    	scrollByText("Last Serviced");
    	ob.service_info();
		Custom_click(ob.View_details_button(), ob.View_details_button().getText());
		msg(ob.Vehicle_service(), " for " +ob.Vehicle_name().getText());
		driver.navigate().back();
		Thread.sleep(2000);
		Custom_click(ob.Service_history(), ob.Service_history().getText());
		Thread.sleep(2000);
		Custom_click(ob.Back(), "Back from Service history page");
		Thread.sleep(1000);
		Custom_click(ob.View_Schedule(), ob.View_Schedule().getText());
		Thread.sleep(2000);
		Custom_click(ob.Back(), "Back from Service Schedule page");
	}
	@Test(priority = 19)
	public void TC036_verify_Latest_at_home_page() throws InterruptedException
	{
		Custom_click(ob.Latest_Vehicle(), "Latest Vehicle");
		Thread.sleep(2000);
		msg(ob.latest_vehicle_message(), "Latest vehicle = ");
		Custom_click(ob.Back(), "Back from Latest Vehicle page ");
	}
	@Test(priority = 20)
	public void TC037_verify_EShop() throws InterruptedException
	{
		Scroll_down_page_Action("E_shop");
		Custom_click(ob.E_shop(), "E-Shop ");
		msg(ob.E_shop_message(), "E_shop info = ");
		Thread.sleep(2000);
		Custom_click(ob.Back(), " Back from Eshop page ");
		}
	@SuppressWarnings("deprecation")
	@Test(priority = 21)
	public void TC038_verify_Benifits_Vehicle_Exchange() throws InterruptedException
	{
		Custom_click(ob.Benifits(), "Benifits ");
		Thread.sleep(5000);
		msg(ob.goodlife() ,"Welcome to ");
		Custom_click(ob.Back(), " Back from Hero GoodLife page");
		TouchAction action = new TouchAction(driver);
    	for(int i=0;i<=1;i++) {
    	action.press(PointOption.point(502 ,182)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(502 ,2013))
    		.release().perform();
    	}
	}

}
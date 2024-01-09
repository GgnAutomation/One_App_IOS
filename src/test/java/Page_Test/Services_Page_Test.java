package Page_Test;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.Services_Page;
import com.utility.Base_Utility;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

@Listeners(com.utility.listner.class)
public class Services_Page_Test extends Base_Utility {
	public Login_Page_Test login;
	public Services_Page ob;
	String device = config_getdata("Platform_name");
	String version = config_getdata("version");

	@Test(priority = 0)
	public void TC071_Vehicle_details_on_service_page() throws InterruptedException {
		Message("************************Service Page**************************");
		ob = new Services_Page();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(2000);
		Custom_click(ob.Services(), " Services button");
		msg(ob.Vehicle_brand_Name(), "Vehicle brand name = " + ob.Vehicle_brand_Name().getText());
		try {
			msg(ob.Vehicle_Nick_Name(), "Vehicle nick name = " + ob.Vehicle_Nick_Name().getText());
		} catch (Exception e) {
			Message("Vehicle nick name is not given");
		}
		try {
			msg(ob.Vehicle_Number(), "Vehicle number =" + ob.Vehicle_Number().getText());
		} catch (Exception e) {
			Message("Vehicle number is not given");
		}

	}

	@Test(priority = 1)
	public void TC072_verify_service_type() {
		try {
			msg(ob.Vehicle_Service_type(), "Vehicle Service type =" + ob.Vehicle_Service_type().getText());
		} catch (Exception e) {
			Message("Vehicle Service type is not given");
		}
		try {
			msg(ob.Vehicle_service_booking_no(),
					"Vehicle Service booking number = " + ob.Vehicle_service_booking_no().getText());
		} catch (Exception e) {
			Message("Vehicle Service booking number is not given");
		}
		String service_status = ob.next_service_info().getText();
		Message("Service status =" + service_status);
		try {
			msg(ob.service_date_time(), "Service date and time =" + ob.service_date_time().getText());
		} catch (Exception e) {
			Message("Service date and time is not given");
		}
	}

	@Test(priority = 2)
	public void TC073_verify_Dealer_information() {
		ob.dealer_info();
	}
	@Test(priority = 3)
	public void TC074_verify_Reschedule_Service()
	{	try {
		if(ob.Reschedule_service_btn().isDisplayed())
		{
			Custom_click(ob.Reschedule_service_btn(), ob.Reschedule_service_btn().getText());
			ob.booked_info();
			Message("Select date one by one for verify clickable or not");
			ob.select_date();
			String time1 = ob.Selected_time().getText();
			Message("Before picking time  =" +time1);
			swipe_page_direction(57, 870, 392, 870, "Select a Time");
			String time2 = ob.Selected_time().getText();
			Message("After picked time  =" +time2);
			if(time1.equalsIgnoreCase(time2))
			{
				Message("Select time slider is not working");
			}
			else
			{
				Message("Select time slider is working fine");
			}
			if(ob.confirm_btn().isEnabled())
			{
				Message("Confirm button is Enabled ");
			}
			else
			{
				Message("Confirm button is not Enabled ");
			}
			Custom_click(ob.cancel_btn(), ob.cancel_btn().getText());
		}
	}catch(Exception e) {Message("Service did not booked yet firstly booked service");}
	}
	@Test(priority = 4)
	public void TC075_verify_Cancel_Service()
	{
		try {
		if(ob.cancel_service_btn().isDisplayed())
		{
			Custom_click(ob.cancel_service_btn(), ob.cancel_service_btn().getText() +" Service button");
			msg(ob.cancel_title(), ob.cancel_title().getText());
			msg(ob.cancel_message(), ob.cancel_message().getText());
			if(ob.yes_button().isEnabled()&& ob.yes_button().isDisplayed()==true)
			{

				Message("Yes button is Enabled & Displayed");
			}
			else
			{
				Message("Yes button is neither Enabled & neither Displayed");
			}
			Custom_click(ob.No_button(), ob.No_button().getText());
		}
		}catch(Exception e) {Message("Service did not booked yet firstly booked service");}
	}
	@Test(priority = 5)
	public void TC076_Verify_dealer_manager_info() throws InterruptedException {
		try {
			msg(ob.manager_type(), "Manager type =" + ob.manager_type().getText());
			msg(ob.manager_name(), "Manager name =" + ob.manager_name().getText());
			Custom_click(ob.call_manager(), " Call amanger");
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			msg(ob.manage_phone_number(), "Manager contact number =" + ob.manage_phone_number().getText());
			Scroll_down_page_Action("Service Schedule");
			if (ob.Service_Schedule().isDisplayed()) {
				Message("Service Schedule is visible");
			}
		} catch (Exception e) {
			Message("Manager information is not given");
		}

	}

	@Test(priority = 6)
	public void TC077_View_Service_schedule_750() {
		Custom_click(ob.Service_Schedule(), "View Service Schedule");
		Custom_click(ob.Kilometer(), ob.Kilometer().getText());
		Custom_click(ob.Kilometer_750(), "750 Kilometer");
		ob.Service_schedule();
	}

	@Test(priority = 7)
	public void TC078_View_Service_schedule_3500() {
		horizontal_scroll_image(ob.value_3500(), ob.value_750(), "3500");
		ob.Service_schedule();
	}

	@Test(priority = 8)
	public void TC079_View_Service_schedule_6500() {
		horizontal_scroll_image(ob.value_6500(), ob.value_3500(), "6500");
		ob.Service_schedule();
	}

	@Test(priority = 9)
	public void TC080_View_Service_schedule_9500() {
		horizontal_scroll_image(ob.value_9500(), ob.value_6500(), "9500");
		ob.Service_schedule();
	}

	@Test(priority = 10)
	public void TC081_View_Service_schedule_12500() {
		horizontal_scroll_image(ob.value_12500(), ob.value_9500(), "12500");
		ob.Service_schedule();
	}

	@Test(priority = 11)
	public void TC082_View_Service_schedule_15500() throws InterruptedException {
		Thread.sleep(2000);
		@SuppressWarnings({ "deprecation", "rawtypes" })
		TouchAction action = new TouchAction(driver);
		Point l1 = ob.value_12500k().getLocation();
		Point l2 = ob.value_12500().getLocation();
		int end_x = l1.x+60;
		int end_y = l1.y-105;
		int start_x = l2.x;
		int start_y = l2.y-110;
		action.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
		Message("Morethan 12.5K");
		String text = ob.KM_15500().getText();
		Custom_click(ob.KM_15500(), text);
		Message("Paid Service for = " + text);
		ob.Service_schedule_More_Than_15500();

	}

	@Test(dependsOnMethods = "TC082_View_Service_schedule_15500()", priority = 12)
	public void TC083_View_Service_schedule_18500() {

		String text = ob.KM_18500().getText();
		Custom_click(ob.KM_18500(), text);
		Message("Paid Service for = " + text);
		ob.Service_schedule_More_Than_15500();

	}

	@Test(dependsOnMethods = "TC082_View_Service_schedule_15500()", priority = 13)
	public void TC084_View_Service_schedule_21500() {

		String text = ob.KM_21500().getText();
		Custom_click(ob.KM_21500(), text);
		Message("Paid Service for = " + text);
		ob.Service_schedule_More_Than_15500();

	}

	@Test(dependsOnMethods = "TC082_View_Service_schedule_15500()", priority = 14)
	public void TC085_View_Service_schedule_24500() {

		String text = ob.KM_24500().getText();
		Custom_click(ob.KM_24500(), text);
		Message("Paid Service for = " + text);
		ob.Service_schedule_More_Than_15500();

	}

	@Test(dependsOnMethods = "TC082_View_Service_schedule_15500()", priority = 15)
	public void TC086_View_Service_schedule_27500() {

		String text = ob.KM_27500().getText();
		Custom_click(ob.KM_27500(), text);
		Message("Paid Service for = " + text);
		ob.Service_schedule_More_Than_15500();

	}

	@Test(priority = 16)
	public void TC087_View_Service_schedule_60_days() {

		Custom_click(ob.Days(), ob.Days().getText());
		horizontal_scroll_image(ob.days_60(), ob.days_460_above(), "60 days");
		ob.Service_schedule();

	}

	@Test(priority = 17)
	public void TC088_View_Service_schedule_160_days() {
		horizontal_scroll_image(ob.days_160(), ob.days_60(), "160 days");
		ob.Service_schedule();

	}

	@Test(priority = 18)
	public void TC089_View_Service_schedule_260_days() {
		horizontal_scroll_image(ob.days_260(), ob.days_160(), "260 days");
		ob.Service_schedule();

	}

	@Test(priority = 19)
	public void TC090_View_Service_schedule_360_days() {
		horizontal_scroll_image(ob.days_360(), ob.days_260(), "360 days");
		ob.Service_schedule();

	}

	@Test(priority = 20)
	public void TC091_View_Service_schedule_460_days() {
		horizontal_scroll_image(ob.days_460(), ob.days_360(), "460 days");
		ob.Service_schedule();

	}

	@Test(priority = 21)
	public void TC092_View_Service_schedule_560_days() {
		horizontal_scroll_image(ob.days_460_above(), ob.days_460(), "Morethan 460 days");
		String text = ob.days_560().getText();
		Custom_click(ob.days_560(), text);
		Message("Paid Service for = " + text);
		ob.Service_schedule_More_Than_15500();

	}

	@Test(dependsOnMethods = "TC092_View_Service_schedule_560_days()", priority = 22)
	public void TC093_View_Service_schedule_660_days() {

		String text = ob.days_660().getText();
		Custom_click(ob.days_660(), text);
		Message("Paid Service for = " + text);
		ob.Service_schedule_More_Than_15500();

	}

	@Test(dependsOnMethods = "TC092_View_Service_schedule_560_days()", priority = 23)
	public void TC094_View_Service_schedule_760_days() {

		String text = ob.days_760().getText();
		Custom_click(ob.days_760(), text);
		Message("Paid Service for = " + text);
		ob.Service_schedule_More_Than_15500();

	}

	@Test(dependsOnMethods = "TC092_View_Service_schedule_560_days()", priority = 24)
	public void TC095_View_Service_schedule_860_days() {

		String text = ob.days_860().getText();
		Custom_click(ob.days_860(), text);
		Message("Paid Service for = " + text);
		ob.Service_schedule_More_Than_15500();
		try {
			Custom_click(ob.back_button(), " Back from Servie Schedule");
			if (ob.Last_serviced_history().isDisplayed()) {
				Message("Last service history is visible");
			}
		} catch (Exception e) {
			Custom_click(ob.back_button(), " Back from Servie Schedule");
		}
	}

//	@Test(dependsOnMethods = "TC092_View_Service_schedule_560_days()", priority = 25)
	public void TC096_View_Service_schedule_960_days() {

		String text = ob.days_960().getText();
		Custom_click(ob.days_960(), text);
		Message("Paid Service for = " + text);
		ob.Service_schedule_More_Than_15500();
		try {
			Custom_click(ob.back_button(), " Back from Servie Schedule");
			if (ob.Last_serviced_history().isDisplayed()) {
				Message("Last service history is visible");
			}
		} catch (Exception e) {
			Custom_click(ob.back_button(), " Back from Servie Schedule");
		}

	}

	@Test(priority = 26)
	public void TC097_Verify_Last_Serviced() throws InterruptedException {

		Custom_click(ob.Last_serviced_history(), "Last serviced history");
		Thread.sleep(2000);
		ob.Service_history();
		Custom_click(ob.back_button(), " Back from servie history");

	}

	@Test(priority = 27)
	public void TC098_Verify_all_tips_list() throws InterruptedException {
		Scroll_down_page_Action("Tips and DIY");
		Custom_click(ob.Tips_and_DIY(), "Tips and DIY");
		ob.tips_list();
	}

	@Test(priority = 28)
	public void TC099_Verify_all_DIY_Videos_list() throws InterruptedException {
		Custom_click(ob.DIY_Videos_button(), "DIY video button");
		ob.DIY_Videos_list();
		Custom_click(ob.back_button(), " Back from Tips and DIY page");
	}
}

package Page_Test;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.page_object.Home_Page;
import com.page_object.Services_Page;
import com.page_object.Vehicle_Details;
import com.utility.Base_Utility;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Vehicle_Details_test extends Base_Utility {
	public Vehicle_Details ob;
	public Login_Page_Test login;

	@Test(priority = 0)
	public void TC046_Verify_My_Vehicle() throws InterruptedException {
		Message("*********************My Vehicle page**************************");
		ob = new Vehicle_Details();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(5000);
		Custom_click(ob.home(), "Home");
		Custom_click(ob.side_menu_button(), "Side menu button");
		msg(ob.user_name(), "User name = ");
		msg(ob.vehicle_name_1(), "You are using = ");
		msg(ob.vehicle_number_1(), " ");
		Custom_click(ob.Vehicle_details(), "Vehicle Details");
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void TC047_Verify_My_Vehicle_Documents() throws InterruptedException {
		msg(ob.Vehicle_insurance(), "");
		Custom_click(ob.Insurance_image(), "Insurance image");
		Thread.sleep(2000);
		Custom_click(ob.back_button(), " Back from my vehicle Insurance page");
		msg(ob.Vehicle_R_C(), "");
		Custom_click(ob.R_C_image(), "R.C image");
		Thread.sleep(2000);
		Custom_click(ob.back_button(), " Back from my vehicle R.C page");
		
		try {
			TouchAction action = new TouchAction(driver);
			if (ob.Insurance_image().isDisplayed() || ob.Insurance_image().isEnabled() && ob.R_C_image().isDisplayed()
					|| ob.R_C_image().isEnabled() == true) {
				Point location1 = ob.R_C_image().getLocation();
				Point location2 = ob.Insurance_image().getLocation();
				System.out.println("location1 =" + location1 + "location2 =" + location2);
				int end_x = location1.x;
				int end_y = location1.y;
				int start_x = location2.x;
				int start_y = location2.y;
				System.out.println(
						"end_x =" + end_x + "end_y =" + end_y + "start_x = " + start_x + "start_y =" + start_y);
				action.press(PointOption.point(end_x, end_y))    
						.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
						.moveTo(PointOption.point( start_x, start_y)).release().perform();
				log.info("Successfully  Swipe page direction Action TO PUC");
				test.log(Status.PASS, "Successfully  Swipe page direction Action to PUC");
			}
		} catch (Exception e) {
			log.error("Unable To Swipe page direction Action to PUC ");
			test.log(Status.FAIL, "Unable To Swipe page direction Action  to PUC" + e);
			test.addScreenCaptureFromPath(lis.getcapcture("PUC"));
		}
		msg(ob.Vehicle_R_C(), "");
		Custom_click(ob.R_C_image(), "P.U.C image");
		Thread.sleep(2000);
		Custom_click(ob.back_button(), " Back from my vehicle P.U.C page");
	}

	@Test(priority = 2)
	public void TC048_Verify_My_Vehicle_Subscriptions_details() {
		Custom_click(ob.verify_GoodLife(), " Verify Good Life");
		msg(ob.verify_goodlife_page(), "verify goodlife page = ");
		Custom_click(ob.back_button(), " Back from GoodLife page");
		Custom_click(ob.verify_RSA(), " Verify RSA ");
		Custom_click(ob.back_button(), " Back from RSA page");
		Scroll_down_page_Action("JoyRide");
		Custom_click(ob.verify_joyRide(), " Verify JoyRide ");
		Custom_click(ob.back_button(), " Back from joyRide page");

	}

	@Test(priority = 3)
	public void TC049_Verify_Owners_Manual() {
		Scroll_down_page_Action("Owners manual");
		Custom_click(ob.owners_manual(), "Owners manual");
		try {
			if (ob.owners_title().isDisplayed()) {
				msg(ob.owners_title(), "My Vehicle Owners manual = ");
				Custom_click(ob.back_button(), " Back from Owners manual page");
				Custom_click(ob.back_button(), " Back from My Vehicle page");
			}
		} catch (Exception e) {
			Message("Owner details already given");
			Custom_click(ob.back_button(), " Back from Owners manual page");
			Custom_click(ob.back_button(), " Back from My Vehicle page");
		}
	}

//	@Test(priority = 4)
	public void TC050_Verify_my_Vehicle_service_History() {
		Custom_click(ob.My_vehicle_Service_history(), "My Vehicle Service history");
		try {
			ob.Service_history();
			Custom_click(ob.back_button(), " Back from Service History page");
			Custom_click(ob.back_button(), " Back from My Vehicle page");
		} catch (Exception e) {
			msg(ob.owners_title(), "My Vehicle Service history ");
			Custom_click(ob.back_button(), " Back from Service History page");
			Custom_click(ob.back_button(), " Back from My Vehicle page");

		}

	}

	@Test(priority = 5)
	public void TC051_Verify_Tips_and_DIY_videos_inside_sideMenu() throws InterruptedException {
		Custom_click(ob.side_menu_button(), "Side menu button");
		Custom_click(ob.Tips_and_DIY_videos(), ob.Tips_and_DIY_videos().getText());
		Custom_click(ob.Tips_info(), ob.Tips_info().getText());
		Custom_click(ob.DIY_Videos(), ob.DIY_Videos().getText());
		Custom_click(ob.back_button(), " Back from My Tips page");
//		driver.navigate().back();
	}
}

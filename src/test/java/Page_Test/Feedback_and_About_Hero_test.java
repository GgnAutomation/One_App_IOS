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
	String version = config_getdata("version");
	String device = config_getdata("Platform_name");

	@Test(priority = 0)
	public void TC068_Verify_App_Related_Feedback() throws InterruptedException {
		Message("************************Feedback and About Hero test**************************");
		ob = new Feedback_and_About_Hero();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(3000);
		Custom_click(ob.home(), "Home");
		Custom_click(ob.side_menu_button(), "Side menu button");
		Custom_click(ob.feedback(), ob.feedback().getText());
		Thread.sleep(2000);
		Custom_click(ob.App_Related(), "App Related category ");
		Custom_click(ob.Continue_btn(), "Continue button");
		Thread.sleep(2000);
		Custom_click(ob.Sub_Category(), "Sub Category");
		Thread.sleep(2000);
		Custom_click(ob.back_btn(), "Back from App Related Feedback page");
	}

	@Test(priority = 1)
	public void TC069_Verify_Sales_Feedback() throws InterruptedException {
		Custom_click(ob.Sales(), "Sales category");
		Custom_click(ob.Continue_btn(), "Continue button");
		Thread.sleep(2000);
		Custom_click(ob.Sub_Category(), "Sub Category");
		Thread.sleep(2000);
		Custom_click(ob.back_btn(), "Back from Sales Feedback page");
	}

	@Test(priority = 2)
	public void TC070_Verify_Service_Feedback() throws InterruptedException {
		Custom_click(ob.Service(), "Service category");
		Custom_click(ob.Continue_btn(), "Continue button");
		Thread.sleep(2000);
		Custom_click(ob.Sub_Category(), "Sub Category");
		Thread.sleep(2000);
		Custom_click(ob.back_btn(), "Back from Service Feedback page");
	}

	@Test(priority = 3)
	public void TC071_Verify_Parts_Feedback() throws InterruptedException {
		Custom_click(ob.Parts(), "Parts category");
		Custom_click(ob.Continue_btn(), "Continue button");
		Thread.sleep(2000);
		Custom_click(ob.Sub_Category(), "Sub Category");
		Thread.sleep(2000);
		Custom_click(ob.back_btn(), "Back from Parts Feedback page");

	}

	@Test(priority = 4)
	public void TC072_Verify_Goodlife_Feedback() throws InterruptedException {
		Custom_click(ob.Goodlife(), "Goodlife category");
		Custom_click(ob.Continue_btn(), "Continue button");
		Thread.sleep(2000);
		Custom_click(ob.Sub_Category(), "Sub Category");
		Thread.sleep(2000);
		Custom_click(ob.back_btn(), "Back from Goodlife Feedback page");
	}

	@Test(priority = 5)
	public void TC073_Verify_Suggestions_Feedback() throws InterruptedException {
		Custom_click(ob.Suggestions(), "Suggestions category");
		Custom_click(ob.Continue_btn(), "Continue button");
		Thread.sleep(2000);
		Custom_click(ob.Sub_Category(), "Sub Category");
		Thread.sleep(2000);
		Custom_click(ob.back_btn(), "Back from Suggestions Feedback page");
		Thread.sleep(2000);
		Custom_click(ob.back_btn(), "Back from Feedback page");
	}

	@Test(priority = 6)
	public void TC074_verify_About_Hero() throws InterruptedException {
		Custom_click(ob.side_menu_button(), "Side menu button");
		Custom_click(ob.about_hero(), ob.about_hero().getText());
		Thread.sleep(10000);
		try {
			if (ob.about_hero_message_1_real().isDisplayed()) {
				msg(ob.about_hero_message_1_real(), " ");
			}
		} catch (Exception e) {
			Message("No message readable");

		}

		Custom_click(ob.back_btn(), "Back from About Hero page");
	}

	@Test(priority = 7)
	public void TC075_verify_Side_menu_page_function() throws InterruptedException {
		Custom_click(ob.side_menu_button(), "Side menu button");
		Custom_click(ob.goodlife(), "Goodlife");
		Thread.sleep(6000);
		msg(ob.goodlife_page_test(), "goodlife page test = ");
		Custom_click(ob.back_btn(), "Back from GoodLife page");
	}

	@Test(priority = 8)
	public void TC076_Wheels_of_Trust() throws InterruptedException {
		Custom_click(ob.side_menu_button(), "Side menu button");
		Custom_click(ob.wheels_of_trust(), "Wheels of trust");
		Thread.sleep(5000);
		ob.exchange_info();
		Custom_click(ob.back_btn(), "Back from Exchange page");
	}

	@Test(priority = 9)
	public void TC077_Verify_joyride() throws InterruptedException {
		Custom_click(ob.side_menu_button(), "Side menu button");
		Custom_click(ob.Joyride(), "Joyride");
		ob.Joyride_info();
		Custom_click(ob.nearest_dealer(), ob.nearest_dealer().getText());
		Thread.sleep(2000);
		Custom_click(ob.back_btn(), "Back from Dealer Locator");
		Custom_click(ob.back_btn(), "Back from Joyride page");
//			driver.navigate().back();

	}
}

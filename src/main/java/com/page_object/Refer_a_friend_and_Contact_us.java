package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base_Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Refer_a_friend_and_Contact_us extends Base_Utility {
	
	String version = config_getdata("version");
	String header;
	public Refer_a_friend_and_Contact_us() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id ='com.customerapp.hero:id/hmcDashboardFrg']")
	private WebElement home;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/side_menu_btn']")
	private WebElement side_menu_button;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/rv_item_lbl'])[3]")
	private WebElement refer_friend;
	@FindBy(xpath = "(//android.widget.EditText[@resource-id ='com.customerapp.hero:id/text_input_editext'])[1]")
	private WebElement friend_name;
	@FindBy(xpath = "(//android.widget.EditText[@resource-id ='com.customerapp.hero:id/text_input_editext'])[2]")
	private WebElement friend_mob_no;

	public WebElement home() {
		return home;
	}

	public WebElement side_menu_button() {
		return side_menu_button;
	}

	public WebElement refer_friend() {
		return refer_friend;
	}

	public WebElement friend_name() {
		return friend_name;
	}

	public WebElement friend_mob_no() {
		return friend_mob_no;
	}

//************************************	Select_state **********************************
	@FindBy(xpath = "//android.widget.Spinner[@resource-id ='com.customerapp.hero:id/state_sp']")
	private WebElement Select_state;
	@FindBy(xpath = "//android.widget.TextView[@text]")
	private List<WebElement> Select_State_list;

	public WebElement Select_state() {
		return Select_state;
	}

	public void Select_State(String value) {
		for (int i = 0; i < Select_State_list.size(); i++) {
			String state_name = Select_State_list.get(i).getText();
			if (state_name.equalsIgnoreCase(value)) {
				Custom_click(Select_State_list.get(i), value);
				break;
			} else {
				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if (i == (Select_State_list.size() - 1)) {
					Select_State_list.get(i).click();
					Select_state.click();
					i = 0;
				}
			}
		}
	}

//************************************	Select_City **********************************
	@FindBy(xpath = "//android.widget.Spinner[@resource-id ='com.customerapp.hero:id/city_sp']")
	private WebElement Select_City;

	public WebElement Select_City() {
		return Select_City;
	}

	public void Select_City(String value) {
		for (int i = 0; i < Select_State_list.size(); i++) {
			if (Select_State_list.get(i).getText().equalsIgnoreCase(value)) {
				Custom_click(Select_State_list.get(i), value);
				break;
			} else {
				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if (i == (Select_State_list.size() - 1)) {
					Select_State_list.get(i).click();
					Select_City.click();
					i = 0;
				}
			}
		}
	}

//************************************	Select_Model **********************************
	@FindBy(xpath = "//android.widget.Spinner[@resource-id ='com.customerapp.hero:id/spinner_vehicle']")
	private WebElement Select_Model;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement Submit_button;
	@FindBy(xpath = "//android.widget.TextView[@resource-id = 'android:id/message']")
	private WebElement message;
	@FindBy(xpath = "//android.widget.Button[@resource-id ='android:id/button1']")
	private WebElement ok_button;

	public WebElement Select_Model() {
		return Select_Model;
	}

	public void Select_Model(String value) {
		for (int i = 0; i < Select_State_list.size(); i++) {
			if (Select_State_list.get(i).getText().equalsIgnoreCase(value)) {
				Custom_click(Select_State_list.get(i), value);
				break;
			} else {
				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if (i == (Select_State_list.size() - 1)) {
					Select_State_list.get(i).click();
					Select_Model.click();
					i = 0;
				}
			}
		}
	}

	public WebElement Submit_button() {
		return Submit_button;
	}

	public WebElement message() {
		return message;
	}

	public WebElement ok_button() {
		return ok_button;
	}

//************************************ Refer_yourself **********************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/detail_btn']")
	private WebElement Refer_yourself;

	public WebElement Refer_yourself() {
		return Refer_yourself;
	}

	// ************************************ Contact Us **********************************
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/rv_item_lbl'])[6]")
	private WebElement Contact_us;
	@FindBy(xpath = "//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/lbl3']")
	private List<WebElement> visit_Page;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/fb_header']")
	private List<WebElement> social_media_header;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/whatsapp_visit_page']")
	private WebElement whatsapp_visit_page;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.whatsapp:id/whatsapp_toolbar_home']")
	private WebElement whatsapp_back;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/fb_text']")
	private List<WebElement> Visit_page_text;
	@FindBy(xpath ="//android.widget.EditText[@resource-id ='m_login_email']")
	private WebElement emailid;
	@FindBy(xpath = "//android.widget.Button[contains(@text, 'Log')]")
	private WebElement facebook_login;
	@FindBy(xpath = "//android.view.View[@content-desc='Log in']/android.widget.TextView")
	private WebElement instagram_login;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement contact_via_email;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement back;
	@FindBy(xpath = "//android.widget.TextView[contains(@text, 'subscribers')]")
	private WebElement subscribers_count;
	@FindBy(xpath = "//android.widget.Button[@resource-id ='join-form-submit']")
	private WebElement Linkedin_agree_and_join;
	@FindBy(xpath = "(//android.view.View[@content-desc ='Join now']/android.widget.TextView)[1]")
	private WebElement Linkedin_Join_now;
	@FindBy(xpath = "//android.widget.Button[@text ='Dismiss']")
	private WebElement Close_linkedin_pop_message;
	@FindBy(xpath = "//android.widget.Button[contains(@text,'Follow')]")
	private WebElement Twiter_Follow;
	@FindBy(xpath="//android.view.View[contains(@content-desc, 'Followers')]/android.widget.TextView[1]")
	private WebElement Twiter_Followers;

	public WebElement Contact_us() {
		return Contact_us;
	}
	public WebElement back()
	{
		return back;
	}
	public void facebook() throws InterruptedException {
		
			header = social_media_header.get(0).getText();
			Message(Visit_page_text.get(0).getText());
			Custom_click(visit_Page.get(0), header);
			Thread.sleep(4000);
			try {
			custom_sendkeys(emailid, "Renu@gmail.com", "Email id");
			Custom_click(facebook_login, header + " Login");
			Custom_click(back, " Back from " + header); 
		} catch (Exception e) {
			Message("Facebook is not visible" + e);
			test.addScreenCaptureFromPath(lis.getcapcture("facebook"));
			Custom_click(back, " Back from " + header);
		}
	}

	public void instagram() throws InterruptedException {
			header = social_media_header.get(1).getText();
			Message(Visit_page_text.get(1).getText());
			Custom_click(visit_Page.get(1), header);
			Thread.sleep(4000);
			try {
			Custom_click(instagram_login, header + " Login");
			Custom_click(back, " Back from " + header); 
		} catch (Exception e) {
			Message("instagram is not visible" + e);
			test.addScreenCaptureFromPath(lis.getcapcture("instagram"));
			Custom_click(back, " Back from instagram" );
		}
	}

	public void Whatsapp() {
		try {
			 header = social_media_header.get(2).getText();
			Message(Visit_page_text.get(2).getText());
			Message(" Whatsapp number =" + whatsapp_visit_page.getText());
			Custom_click(whatsapp_visit_page, header);
			try {
				if (whatsapp_visit_page.isDisplayed() == true) {
					Message("We can’t find WhatsApp on your device. Please install for better experience");
				} else {
					Custom_click(back, " Back from " + header);
					driver.navigate().back();
				} 
			} catch (Exception e) {
				Message("WhatsApp on your device is available");
				Custom_click(whatsapp_back, " whatsapp back button");
				driver.navigate().back();
			} 
		} catch (Exception e) {
			Message("Whatsapp is not visible" + e);
			test.addScreenCaptureFromPath(lis.getcapcture("Whatsapp"));
			Custom_click(back, " Back from Whatsapp" );
		}
	}

	public void youTube() throws InterruptedException {
	        header = social_media_header.get(3).getText();
			Message(Visit_page_text.get(3).getText());
			Custom_click(visit_Page.get(2), header);
			Thread.sleep(4000);
			try {
			Message("Total subscribers count =" + subscribers_count.getText());
			Custom_click(back, " Back from " + header);
		} catch (Exception e) {
			Message("youTube is not visible" + e);
			test.addScreenCaptureFromPath(lis.getcapcture("youTube"));
			Custom_click(back, " Back from youTube" );
		}
	}

	public void Linkedin() throws InterruptedException {
		try {
			if(version.equalsIgnoreCase("11")) {
			Scroll_down_page_Action("Twitter"); // for version 11.0.0
			 header = social_media_header.get(2).getText(); // for version 11.0.0
			Message(Visit_page_text.get(3).getText());   // for version 11.0.0
			Custom_click(visit_Page.get(2), header);   // for version 11.0.0
			}
			else {
			 header = social_media_header.get(4).getText(); // for all other device.
			Message(Visit_page_text.get(4).getText());            // for all other device.
			Custom_click(visit_Page.get(3), header);      // for all other device.
			}
			Thread.sleep(4000);
			Custom_click(Close_linkedin_pop_message, "Close linkedin pop message");
			try {
				Custom_click(Linkedin_Join_now, header + " " + Linkedin_Join_now.getText());
			} catch (Exception e) {
				Custom_click(Linkedin_agree_and_join, header);
				Custom_click(Linkedin_agree_and_join, Linkedin_agree_and_join.getText());
			}
			Custom_click(back, " Back from " + header);
		} catch (Exception e) {
			Message("Linkedin is not visible" + e);
			test.addScreenCaptureFromPath(lis.getcapcture("Linkedin"));
			Custom_click(back, " Back from Linkedin" );
		}
	}

	public void twitter() throws InterruptedException {
		try {
			if(version.equalsIgnoreCase("allother")) {
			Scroll_down_page_Action("Twitter");               // for all other device.
			 header = social_media_header.get(4).getText();  // for all other device.
			}
			if(version.equalsIgnoreCase("11")) {
			 header = social_media_header.get(3).getText();  // for version 11.0.0
			}
			Message(Visit_page_text.get(4).getText());
			if(version.equalsIgnoreCase("11")) {
			Custom_click(visit_Page.get(3), header);			// for version 11.0.0
			}
			else {
			Custom_click(visit_Page.get(4), header);     // for all other device.
			}
			Thread.sleep(7000);
			Message(" Total Followers = " +Twiter_Followers.getText());
			Custom_click(Twiter_Follow, Twiter_Follow.getText());
			Custom_click(back, " Back from " + header);
		} catch (Exception e) {
			Message("twitter is not visible" + e);
			test.addScreenCaptureFromPath(lis.getcapcture("twitter"));
			Custom_click(back, " Back from Twitter");
		}
	}

	// ************************************ Contact Via Email  **********************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement Contact_via_email;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.google.android.gm:id/welcome_tour_title']")
	private WebElement Welcome_message;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.google.android.gm:id/welcome_tour_text']")
	private WebElement Welcome_message2;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.google.android.gm:id/welcome_tour_next']")
	private WebElement welcome_tour_next;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.google.android.gm:id/welcome_tour_promotion']")
	private WebElement welcome_tour_promotion;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.google.android.gm:id/welcome_tour_done']")
	private WebElement welcome_tour_done;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.google.android.gm:id/setup_addresses_title']")
	private WebElement addresses_title;
	@FindBy(xpath = "//android.widget.TextView[@resource-id = 'com.google.android.gm:id/setup_addresses_add_another']")
	private WebElement add_email_address;
	@FindBy(xpath = "(//android.widget.LinearLayout[@resource-id ='com.google.android.gm:id/account_setup_item'])[1]")
	private WebElement google;
	@FindBy(xpath ="//android.widget.ImageButton[@content-desc='Navigate up']")
	private WebElement email_back;

	public WebElement Contact_via_email() {
		return Contact_via_email;
	}

	public WebElement Welcome_message() {
		return Welcome_message;
	}

	public WebElement Welcome_message2() {
		return Welcome_message2;
	}

	public WebElement welcome_tour_next() {
		return welcome_tour_next;
	}

	public WebElement welcome_tour_promotion() {
		return welcome_tour_promotion;
	}

	public WebElement welcome_tour_done() {
		return welcome_tour_done;
	}

	public WebElement addresses_title() {
		return addresses_title;
	}

	public WebElement add_email_address() {
		return add_email_address;
	}

	public WebElement google() {
		return google;
	}
	public WebElement email_back()
	{
		return email_back;
	}
}

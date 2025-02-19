package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;
import com.utility.Base_Utility;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Home_Page extends Base_Utility {
	public Services_Page ob1;
	String device = config_getdata("Platform_name");

	public Home_Page() {
		PageFactory.initElements(driver, this);
	}

	// *************************Temperature**********************
	@FindBy(xpath = "//XCUIElementTypeNavigationBar[@name='OneApp.HomeView']/XCUIElementTypeOther")
	private WebElement vehicle_drop_down;
	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Primary')]")
	private List<WebElement> all_vehicle_inside_drop_down;
	@FindBy(xpath = "//XCUIElementTypeButton[contains(@name,'crossGreyIcon')]")
	private WebElement select_vehicle_close_btn;
	@FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeImage[2]")
	private WebElement vehicle_img;
	@FindBy(xpath = "//XCUIElementTypeButton[@name='notification']")
	private WebElement notification;
	@FindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	private List<WebElement> notification_count;
	@FindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
	private WebElement notification_back;
	@FindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Actions')]")
	private WebElement Collapse_btn;
	@FindBy(xpath = "//XCUIElementTypeButton[@name='crossGreyIcon']")
	private WebElement close_drop_down;
	@FindBy(xpath = "//android.widget.Button[@resource-id ='android:id/button1']")
	private WebElement enable_now;

	public WebElement enable_now() {
		return enable_now;
	}

	public void all_vehicle_inside_drop_down() throws InterruptedException {

		Custom_click(vehicle_drop_down, " Drop down");
		Custom_click(all_vehicle_inside_drop_down.get(0), "Select Vehicle");
		Custom_click(vehicle_drop_down, " Drop down");
		Thread.sleep(2000);
		Custom_click(select_vehicle_close_btn, "select vehicle close button");
	}

	public WebElement vehicle_img() {
		return vehicle_img;
	}

	public WebElement notification() {
		return notification;
	}

	public void notification_count() {
		for (int i = 0; i < notification_count.size(); i++) {
			msg(notification_count.get(i+1), "");
			i++;
		}

	}

	public WebElement notification_back() {
		return notification_back;
	}

	public WebElement Collapse_btn() {
		return Collapse_btn;
	}

	// **************************************SOS********************************
	@FindBy(xpath = "//XCUIElementTypeButton[@name='sos']")
	private WebElement SOS_icon;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/text')]")
	private List<WebElement> SOS_message;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/btn_lbl']")
	private WebElement sent_alert_btn;
	@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.customerapp.hero:id/safe']/android.widget.TextView")
	private List<WebElement> dont_send;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.customerapp.hero:id/custom_radius_close']")
	private WebElement SOS_close_btn;

	public WebElement SOS_icon() {
		return SOS_icon;
	}

	public void SOS_message() {
		try {
			for (int i = 0; i < SOS_message.size(); i++) {
				msg(SOS_message.get(i), "");
			}
		} catch (Exception e) {
			Custom_click(enable_now, "Enable noe");
		}
	}

	public WebElement sent_alert_btn() {
		return sent_alert_btn;
	}

	public void dont_send() {
		Custom_click(dont_send.get(0), dont_send.get(0).getText() + " " + dont_send.get(1).getText());
	}

	public WebElement SOS_close_btn() {
		return SOS_close_btn;
	}

	// **************************************Service********************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/book_now_btn']")
	private WebElement Service_booked_now_button;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl1']")
	private List<WebElement> Service_info;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/service_date_lbl']")
	private WebElement service_due_date;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/centerName']")
	private WebElement center_Name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/centerAddress']")
	private WebElement center_Address;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/keyArrow']")
	private WebElement Select_service_center_key_arrow_button;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/calendarDate']")
	private WebElement date;
	@FindBy(xpath = "//android.view.View[@content-desc=\"21 June 2023\"]")
	private WebElement date_pick;
	@FindBy(xpath = "//android.widget.Button[@resource-id = 'android:id/button1']")
	private WebElement ok_button;
	@FindBy(xpath = "//android.widget.Button[@resource-id = 'android:id/button2']")
	private WebElement cancel_button;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/timeText']")
	private WebElement time;
	@FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"3\"]")
	private WebElement time_hour_pick;
	@FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"20\"]")
	private WebElement time_minute_pick;
	@FindBy(xpath = "//android.widget.ImageButton[@resource-id ='android:id/toggle_mode']")
	private WebElement send_time;;
	@FindBy(xpath = "//android.widget.EditText[@resource-id='android:id/input_hour']")
	private WebElement Enter_Hour;
	@FindBy(xpath = "//android.widget.EditText[@resource-id='android:id/input_minute']")
	private WebElement Enter_Minute;;
	@FindBy(xpath = "//android.widget.Spinner[@resource-id ='android:id/am_pm_spinner']")
	private WebElement AM_PM_Selector;
	@FindBy(xpath = "(//android.widget.CheckedTextView[@resource-id ='android:id/text1'])[2]")
	private WebElement chose_PM;
	@FindBy(xpath = "//android.widget.RadioButton[@resource-id ='com.customerapp.hero:id/radio2']")
	private WebElement paid_service;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_name']")
	private WebElement last_service_details;
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/btn_lay']")
	private WebElement Continue_button;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/iv_select']")
	private List<WebElement> select_key_issue;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement book_service;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tvHome']")
	private WebElement back_button_from_booked_service;

	public WebElement Service_booked_now_button() {
		return Service_booked_now_button;
	}

//*************************Navigate Page**********************
	@FindBy(xpath = "//android.widget.TextView[starts-with(@text,'Navigate')]/parent::android.view.ViewGroup")
	private WebElement Navigate_menu;
	@FindBy(xpath = "//android.widget.TextView[@text ='Search Destination']")
	private WebElement Search_destination;
	@FindBy(xpath = "//android.widget.EditText[@resource-id ='com.customerapp.hero:id/edittext_search']")
	private WebElement Search_here;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_place_name'])[1]")
	private WebElement chose_place_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/service_center_lbl']")
	private WebElement Searched_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/service_center_address_lbl']")
	private WebElement Searched_address;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement Navigate_button;
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id ='com.customerapp.hero:id/navigate']")
	private WebElement Start;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/btn_start']")
	private WebElement Start_button;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/stop_navigation']")
	private WebElement stop_navigation;
	@FindBy(xpath = "//android.widget.TextView[@resource-id= 'com.customerapp.hero:id/lbl']")
	private WebElement change_search;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement Back_button;

	public WebElement Navigate_menu() {
		return Navigate_menu;
	}

	public WebElement Search_destination() {
		return Search_destination;
	}

	public WebElement Search_here() {
		return Search_here;
	}

	public WebElement chose_place_name() {
		return chose_place_name;
	}

	public WebElement Searched_name() {
		return Searched_name;
	}

	public WebElement Searched_address() {
		return Searched_address;
	}

	public WebElement Navigate_button() {
		return Navigate_button;
	}

	public WebElement Start() {
		return Start;

	}

	public WebElement Start_button() {
		return Start_button;
	}

	public WebElement stop_navigation() {
		return stop_navigation;
	}

	public WebElement change_search() {
		return change_search;
	}

	public WebElement Back_button() {
		return Back_button;
	}

	// ****************************Exchange Page*******************************
	@FindBy(xpath = "//android.widget.TextView[starts-with(@text,'Exchange')]/parent::android.view.ViewGroup")
	private WebElement Exchange_Menu;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/')]")
	private List<WebElement> exchange_info;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl1']")
	private WebElement Exchange_vehicle_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl']")
	private WebElement real_value_msg;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tV1']")
	private WebElement vehicle_msg;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/registrationDateTv']")
	private WebElement choose_city;
	@FindBy(xpath = "//android.widget.EditText[@resource-id='com.customerapp.hero:id/text_input_editext']")
	private WebElement city_sell;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/vehicle_nameTV']")
	private WebElement choose_city_sell;
	@FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.customerapp.hero:id') and starts-with(@text,'PIN Code')]")
	private WebElement city_pin_code;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/btn_lbl']")
	private WebElement next_btn;

	public WebElement Exchange_Menu() {
		return Exchange_Menu;
	}

	public void exchange_info() {
		try {
			for (int i = 0; i < exchange_info.size(); i++) {
				Thread.sleep(2000);
				msg(exchange_info.get(i), "");
			}
		} catch (Exception e) {
			Message("All real value message not visible");
		}
	}

	public WebElement Exchange_vehicle_name() {
		return Exchange_vehicle_name;
	}

	public WebElement real_value_msg() {
		return real_value_msg;
	}

	public WebElement vehicle_msg() {
		return vehicle_msg;
	}

	public WebElement choose_city() {
		return choose_city;
	}

	public WebElement city_sell() {
		return city_sell;
	}

	public WebElement choose_city_sell() {
		return choose_city_sell;
	}

	public WebElement city_pin_code() {
		return city_pin_code;
	}

	public WebElement next_btn() {
		return next_btn;
	}

//****************************Vehicle Condition************************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tV2']")
	private WebElement vehicle_condition;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/identify_tv1']")
	private WebElement condition_msg;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/titleTV' and @text='Smoke']")
	private WebElement Smoke;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/question_tv' and starts-with(@text,'Is there any Smoke')]")
	private WebElement Smoke_msg;
	@FindBy(xpath = "//android.widget.RadioButton[@resource-id='com.customerapp.hero:id/option1RadioButton' and @text='No Smoke']")
	private WebElement no_smok_radio_btn;
	@FindBy(xpath = "//android.widget.RadioButton[@resource-id='com.customerapp.hero:id/option2RadioButton' and @text='Smoke']")
	private WebElement smok_radio_btn;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/titleTV' and @text='Starting']")
	private WebElement Starting;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/question_tv' and starts-with(@text,'Is there any problem in Starting')]")
	private WebElement Starting_msg;
	@FindBy(xpath = "//android.widget.RadioButton[@resource-id='com.customerapp.hero:id/option1RadioButton' and @text='Starts Normally']")
	private WebElement Starts_normal_radio_btn;
	@FindBy(xpath = "//android.widget.RadioButton[@resource-id='com.customerapp.hero:id/option2RadioButton' and @text='Not Starting']")
	private WebElement not_starts_btn;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/titleTV' and @text='Light Indicator']")
	private WebElement Light_indicator;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/question_tv' and starts-with(@text,'Is there any problem in the working of Li')]")
	private WebElement Light_indicator_msg;
	@FindBy(xpath = "//android.widget.RadioButton[@resource-id='com.customerapp.hero:id/option1RadioButton' and @text='Working']")
	private WebElement Working_radio_btn;
	@FindBy(xpath = "//android.widget.RadioButton[@resource-id='com.customerapp.hero:id/option2RadioButton' and @text='Not Working']")
	private WebElement not_working_radio_btn;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/titleTV' and @text='Front Tyre']")
	private WebElement front_tyre;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/question_tv' and starts-with(@text,'What is the condition of the Front')]")
	private WebElement front_tyre_msg;
	@FindBy(xpath = "//android.widget.RadioButton[@resource-id='com.customerapp.hero:id/option1RadioButton' and @text='OK']")
	private WebElement ok_radio_btn;
	@FindBy(xpath = "//android.widget.RadioButton[contains(@resource-id,'com.customerapp.hero:id/option') and starts-with(@text,'Worn out')]")
	private WebElement worn_out_radio_btn;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/titleTV' and @text='Rear Tyre']")
	private WebElement rear_tyre;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/question_tv' and starts-with(@text,'What is the condition of the Rear')]")
	private WebElement rear_tyre_msg;
	@FindBy(xpath = "(//android.widget.RadioButton[@resource-id='com.customerapp.hero:id/option1RadioButton'])[2]")
	private WebElement ok_rear_radion_btn;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/titleTV' and @text='Body Part']")
	private WebElement body_part;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/question_tv' and @text='What is the condition of the Body Parts?']")
	private WebElement body_part_msg;
	@FindBy(xpath = "//android.widget.RadioButton[contains(@resource-id,'com.customerapp.hero:id/option') and starts-with(@text,'No Scratch')]")
	private WebElement no_scrtch_radio_btn;
	@FindBy(xpath = "//android.widget.RadioButton[contains(@resource-id,'com.customerapp.hero:id/option') and starts-with(@text,'Scratch')]")
	private WebElement scrtch_radio_btn;

	public WebElement vehicle_condition() {
		return vehicle_condition;
	}

	public WebElement condition_msg() {
		return condition_msg;
	}

	public void all_question() {
		msg(Smoke, "");
		msg(Smoke_msg, "");
		Custom_click(no_smok_radio_btn, no_smok_radio_btn.getText() + " radio button");
		Custom_click(smok_radio_btn, smok_radio_btn.getText() + " radio button");
		msg(Starting, "");
		msg(Starting_msg, "");
		Custom_click(Starts_normal_radio_btn, Starts_normal_radio_btn.getText() + " radio button");
		Custom_click(not_starts_btn, not_starts_btn.getText() + " radio button");
		msg(Light_indicator, "");
		msg(Light_indicator_msg, "");
		Custom_click(Working_radio_btn, Working_radio_btn.getText() + " radio button");
		Custom_click(not_working_radio_btn, not_working_radio_btn.getText() + " radio button");
		msg(front_tyre, "");
		msg(front_tyre_msg, "");
		Custom_click(ok_radio_btn, ok_radio_btn.getText() + " radio button");
		Custom_click(worn_out_radio_btn, worn_out_radio_btn.getText() + " radio button");
		msg(rear_tyre, "");
		msg(rear_tyre_msg, "");
		Custom_click(ok_rear_radion_btn, ok_rear_radion_btn.getText() + " radio button");
		Custom_click(worn_out_radio_btn, worn_out_radio_btn.getText() + " radio button");
		msg(body_part, "");
		msg(body_part_msg, "");
		Custom_click(no_scrtch_radio_btn, no_scrtch_radio_btn.getText() + " radio button");
		Custom_click(scrtch_radio_btn, scrtch_radio_btn.getText() + " radio button");
	}

//****************************Documents Page************************************
	@FindBy(xpath = "//android.widget.TextView[starts-with(@text,'Documents')]/parent::android.view.ViewGroup")
	private WebElement Documents_Menu;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/doc_name']")
	private List<WebElement> document_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private List<WebElement> document_Status;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/icon2']")
	private WebElement Document_sideicon;
	@FindBy(xpath = "//android.widget.TextView[@text ]")
	private List<WebElement> Documents_list;
	@FindBy(xpath = "//android.widget.TextView[@text ='Add now']")
	private WebElement Add_Now;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/title']")
	private WebElement Document_Check;
	@FindBy(xpath = "//android.widget.Button[@resource-id = 'com.android.permissioncontroller:id/permission_allow_foreground_only_button']")
	private WebElement While_using_the_app;
	@FindBy(xpath = "//android.widget.Button[@resource-id ='com.android.permissioncontroller:id/permission_allow_button']")
	private WebElement Allow;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl'])[1]")
	private WebElement Choose_Document_from_library;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl'])[2]")
	private WebElement Take_a_Photo;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl'])[3]")
	private WebElement Choose_from_Digilocker;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/cross_btn']")
	private WebElement document_upload_close_button;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement Back;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl'])[1]")
	private WebElement cancel_payment;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/iv_share']")
	private WebElement share_document;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/iv_download']")
	private WebElement download_document;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_update']")
	private WebElement update_doc;

	public WebElement Documents_Menu() {
		return Documents_Menu;
	}
	public List<WebElement> document_name()
	{
		return document_name;
	}
	public List<WebElement> document_Status()
	{
		return document_Status;
	}
	public WebElement Back() {
		return Back;

	}

	public WebElement cancel_payment() {
		return cancel_payment;
	}

	public WebElement While_using_the_app() {
		return While_using_the_app;
	}
	public WebElement Choose_Document_from_library()
	{
		return Choose_Document_from_library;
	}
	public WebElement Take_a_Photo()
	{
		return Take_a_Photo;
	}
	public WebElement Choose_from_Digilocker()	
	{
		return Choose_from_Digilocker;
	}
	public WebElement Allow()
	{
		return Allow;
	}
	public WebElement document_upload_close_button()
	{
		return document_upload_close_button;
	}
	public WebElement share_document()
	{
		return share_document;
	}
	public WebElement download_document()
	{
		return download_document;
	}
	public WebElement update_doc()
	{
		return update_doc;
	}
	public void Documents_list() throws InterruptedException {

		for (int i = 1; i < Documents_list.size(); i++) {
			String name = Documents_list.get(i).getText();
			Message(name);
			i++;
			String doc = Documents_list.get(i).getText();
			if (doc.equalsIgnoreCase("Upload")) {
				Custom_click(Documents_list.get(i), name + " " + Documents_list.get(i).getText());
				Thread.sleep(2000);
				try {
					if (While_using_the_app.isDisplayed()) {
						Custom_click(While_using_the_app, "While using the app");
						Custom_click(Allow, "Allow");
						Thread.sleep(2000);
						Custom_click(Documents_list.get(i), name + " " + Documents_list.get(i).getText());
					}
				} catch (Exception e) {
				}
				Custom_click(Choose_Document_from_library, name + " Choose from library");
				Thread.sleep(2000);
				driver.navigate().back();
				Custom_click(Documents_list.get(i), name + " " + Documents_list.get(i).getText());
				Custom_click(Take_a_Photo, "Take a Photo");
				Thread.sleep(2000);
				driver.navigate().back();
				Custom_click(Documents_list.get(i), name + " " + Documents_list.get(i).getText());
				try {
					if (Choose_from_Digilocker.isDisplayed()) {
						Custom_click(Choose_from_Digilocker, "Choose from Digilocker");
						Thread.sleep(3000);
						Custom_click(Back, " Back from Digilocker Login");
					}
				} catch (Exception e) {
					Custom_click(document_upload_close_button, "Close upload document page");
				}
				Custom_click(Documents_list.get(i), name + " " + Documents_list.get(i).getText());
				Custom_click(document_upload_close_button, "Close upload document page");
			} else {
				Message(name + " is already available");
				Custom_click(Documents_list.get(i), name + " " + Documents_list.get(i).getText());
				Thread.sleep(2000);
				Custom_click(share_document, "Share document button");
				try {
					if (download_document.isDisplayed()) {
						Custom_click(download_document, "Download document button");
						Thread.sleep(3000);
					}
				} catch (Exception e) {
					driver.navigate().back();
				}
				try {
				Custom_click(update_doc, "Update document button");
				} catch (Exception e) {
					driver.navigate().back();
				}
				Custom_click(Choose_Document_from_library, name + " Choose from library");
				try {
					if (Allow.isDisplayed()) {
						Custom_click(Allow, "Allow");
					}
				} catch (Exception e) {
				}
				driver.navigate().back();
				Custom_click(update_doc, "Update document button");
				Custom_click(Take_a_Photo, "Take a Photo");
				try {
					if (Allow.isDisplayed()) {
						Custom_click(While_using_the_app, "While using the app");
					}
				} catch (Exception e) {
				}
				Thread.sleep(2000);
				driver.navigate().back();
				Custom_click(update_doc, "Update document button");
				try {
					if (Choose_from_Digilocker.isDisplayed()) {
						Custom_click(Choose_from_Digilocker, "Choose from Digilocker");
						Thread.sleep(3000);
						Custom_click(Back, " Back from Digilocker Login");
					}
				} catch (Exception e) {
					Custom_click(document_upload_close_button, "Close upload document page");
				}
				Custom_click(update_doc, "Update document button");
				Custom_click(document_upload_close_button, "Close upload document page");
				Custom_click(Back, "Back from " + name + " page");
			}
		}
	}

//****************************Relationship Manager************************************
	@FindBy(xpath = "//android.widget.TextView[starts-with(@text,'Relationship')]/parent::android.view.ViewGroup")
	private WebElement Relationship_Manager;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl1']")
	private WebElement Relationship_Manager_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl2']")
	private WebElement Relationship_Manager_Address;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl3']")
	private WebElement Relationship_Manager_Contact_number;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'com.customerapp.hero:id/tsmAsmName')]")
	private List<WebElement> Others_Contacts;

	public WebElement Relationship_Manager() {
		return Relationship_Manager;
	}

	public WebElement Relationship_Manager_name() {
		return Relationship_Manager_name;
	}

	public WebElement Relationship_Manager_Address() {
		return Relationship_Manager_Address;
	}

	public WebElement Relationship_Manager_Contact_number() {
		return Relationship_Manager_Contact_number;
	}

	public void Others_Contacts() {
		try {
			if (Others_Contacts.size() != 0) {
				for (int i = 0; i < Others_Contacts.size(); i++) {
					Message("Others Contacts information =" + Others_Contacts.get(i).getText());
				}
			}
		} catch (Exception e) {
			Message("" + e);
		}

	}

//****************************RSA************************************
	@FindBy(xpath = "//android.widget.TextView[starts-with(@text,'RSA')]/parent::android.view.ViewGroup")
	private WebElement RSA;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/tv')]")
	private List<WebElement> RSA_info;
	@FindBy(xpath = "//android.view.View[@content-desc='Locate nearest dealer']/android.widget.TextView")
	private WebElement locate_nearest_dealer;
	@FindBy(xpath = "//android.view.View[@text ='Locate nearest dealer']")
	private WebElement locate_nearest_dealer_real_device;
	@FindBy(xpath = "//android.view.View[@text ='LOCATE THE NEAREST DEALER']")
	private WebElement locate_the_nearest_dealer;
	@FindBy(xpath = "//android.widget.TextView[contains(@text ,'LOCATE THE')]")
	private WebElement locate_the_nearest_dealer_real;
	@FindBy(xpath = "//android.view.View[@resource-id ='OutletState']")
	private WebElement State;
	@FindBy(xpath = "//android.widget.EditText[@resource-id ='com.customerapp.hero:id/text_input_editext']")
	private WebElement registration_number;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement renew_rsa;
	@FindBy(xpath = "(//android.widget.CheckedTextView[@resource-id ='android:id/text1'])[3]")
	private WebElement State_check;
	@FindBy(xpath = "//android.widget.CheckedTextView[@resource-id ='android:id/text1']")
	private List<WebElement> select_state;
	@FindBy(xpath = "//android.view.View[@resource-id ='OutletCity']")
	private WebElement City;
	@FindBy(xpath = "//android.view.View[@resource-id ='OutletLocality']")
	private WebElement Locality;
	@FindBy(xpath = "//android.widget.Button[@resource-id ='accept']")
	private WebElement accept_cookie;
	@FindBy(xpath = "//android.widget.Button[@text ='Search']")
	private WebElement Search_button;
	@FindBy(xpath = "//android.view.View[contains(@text,'HERO MOTOCORP')]")
	private WebElement Local_dealer_fullname;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'HERO MOTOCORP')]")
	private WebElement Local_dealer_fullname_real;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Hero Motocorp')]")
	private WebElement Local_dealer_name;
	@FindBy(xpath = "//android.view.View[contains(@text,'No')]")
	private WebElement Local_dealer_address;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'No')]")
	private WebElement Local_dealer_address_real;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_title' and contains(@text,'?')]")
	private List<WebElement> asked_questions;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_ans']")
	private WebElement answer;

	public WebElement RSA() {
		return RSA;
	}

	public WebElement accept_cookie() {
		return accept_cookie;
	}

	public WebElement Local_dealer_fullname() {
		return Local_dealer_fullname;
	}

	public WebElement Local_dealer_fullname_real() {
		return Local_dealer_fullname_real;
	}

	public WebElement Local_dealer_name() {
		return Local_dealer_name;
	}

	public WebElement Local_dealer_address() {
		return Local_dealer_address;
	}

	public WebElement registration_number() {
		return registration_number;
	}

	public WebElement Local_dealer_address_real() {
		return Local_dealer_address_real;
	}

	public WebElement locate_nearest_dealer() {
		return locate_nearest_dealer;
	}

	public WebElement renew_rsa() {
		return renew_rsa;
	}

	public WebElement locate_nearest_dealer_real_device() {
		return locate_nearest_dealer_real_device;
	}

	public WebElement locate_the_nearest_dealer() {
		return locate_the_nearest_dealer;
	}

	public WebElement locate_the_nearest_dealer_real() {
		return locate_the_nearest_dealer_real;
	}

	public WebElement State() {
		return State;
	}

	public WebElement State_check() {
		return State_check;
	}

	public WebElement City() {
		return City;
	}

	public WebElement Locality() {
		return Locality;
	}

	public void asked_questions() {
		try {
			for (int i = 0; i < asked_questions.size(); i++) {
				Custom_click(asked_questions.get(i), "Open question = " + asked_questions.get(i).getText());
				try {
					msg(answer, "Answer = ");
				} catch (Exception e) {
					Scroll_down_page_Action("Answer");
					msg(answer, "Answer = ");
				}
				Custom_click(asked_questions.get(i), "Close question = " + asked_questions.get(i).getText());
			}
		} catch (Exception e) {
			Message("Asked question is not available");
		}
	}

	public WebElement Search_button() {
		return Search_button;
	}

	public void RSA_info() {
		for (int i = 0; i < RSA_info.size(); i++) {
			msg(RSA_info.get(i), " ");
		}
	}

	public void select_state(String State_name) {
		for (int i = 0; i < select_state.size(); i++) {
			String name = select_state.get(i).getText();
			if (State_name.equalsIgnoreCase(name)) {
				Custom_click(select_state.get(i), name);
				break;
			} else {
//				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if (i == (select_state.size() - 1)) {
					select_state.get(i).click();
					State.click();
					i = 0;
				}
			}
		}
	}

	public void select_city(String City_name) {
		for (int i = 0; i < select_state.size(); i++) {
			String name = select_state.get(i).getText();
			if (City_name.equalsIgnoreCase(name)) {
				Custom_click(select_state.get(i), name);
				break;
			} else {
//				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if (i == (select_state.size() - 1)) {
					select_state.get(i).click();
					City.click();
					i = 0;
				}
			}
		}
	}

	public void select_Locality(String Locality_name) {
		for (int i = 0; i < select_state.size(); i++) {
			String name = select_state.get(i).getText();
			if (Locality_name.equalsIgnoreCase(name)) {
				Custom_click(select_state.get(i), name);
				break;
			} else {
//				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if (i == (select_state.size() - 1)) {
					select_state.get(i).click();
					Locality.click();
					i = 0;
				}
			}
		}
	}

//****************************Technical Support************************************
	@FindBy(xpath = "//android.widget.TextView[starts-with(@text,'Technical')]/parent::android.view.ViewGroup")
	private WebElement Technical_Support;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl1']")
	private WebElement Technical_Support_Manager_Name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl2']")
	private WebElement Technical_Support_Manager_Address;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl3']")
	private WebElement Technical_Support_Manager_Contact_Number;

	public WebElement Technical_Support() {
		return Technical_Support;
	}

	public WebElement Technical_Support_Manager_Name() {
		return Technical_Support_Manager_Name;
	}

	public WebElement Technical_Support_Manager_Address() {
		return Technical_Support_Manager_Address;
	}

	public WebElement Technical_Support_Manager_Contact_Number() {
		return Technical_Support_Manager_Contact_Number;
	}

//****************************Dealer Locator************************************
	@FindBy(xpath = "//android.widget.TextView[starts-with(@text,'Dealer')]/parent::android.view.ViewGroup")
	private WebElement Dealer_Locator;
	@FindBy(xpath = "//android.widget.Spinner[@resource-id='com.customerapp.hero:id/state_sp']//android.widget.TextView")
	private WebElement Select_State;
	@FindBy(xpath = "//android.widget.EditText[@resource-id ='com.customerapp.hero:id/text_input_editext']")
	private WebElement Select_City;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/textView22']")
	private List<WebElement> Select_State_list;
	@FindBy(xpath = "//android.widget.ImageButton[@resource-id='com.customerapp.hero:id/floating_button2']")
	private WebElement map_view;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/service_center_lbl']")
	private List<WebElement> Dealer_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/service_center_address_lbl']")
	private WebElement Dealer_address;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/service_center_km_lbl']")
	private WebElement Dealer_distance;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/service_center_duration_lbl']")
	private WebElement Dealer_duration_time;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/callBtn']")
	private WebElement Call_Dealer;

	public WebElement Dealer_Locator() {
		return Dealer_Locator;
	}

	public WebElement Select_State() {
		return Select_State;
	}

	public WebElement Select_City() {
		return Select_City;
	}

	public void Select_State(String value) {
		for (int i = 0; i < Select_State_list.size(); i++) {
			if (Select_State_list.get(i).getText().equalsIgnoreCase(value)) {
				Custom_click(Select_State_list.get(i), value);
				break;
			} else {
//				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if (i == (Select_State_list.size() - 1)) {
					Select_State_list.get(i).click();
					Select_State.click();
					i = 0;
				}
			}
		}
	}

//	public void Select_City(String value) {
//		for (int i = 0; i < Select_State_list.size(); i++) {
//			if (Select_State_list.get(i).getText().equalsIgnoreCase(value)) {
//				Custom_click(Select_State_list.get(i), value);
//				break;
//			} else {
//				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
//				if (i == (Select_State_list.size() - 1)) {
//					Select_State_list.get(i).click();
//					Select_City.click();
//					i = 0;
//				}
//			}
//		}
//	}
	public List<WebElement> Select_State_list()
	{
		return Select_State_list;
	}
	public WebElement map_view() {
		return map_view;
	}

	public void Dealer_info() {
		int avilable_dealer = Dealer_name.size();
		Message("Total available dealer is =" + avilable_dealer);
		try {
		for (int i = 0; i < 2; i++) {
			Message((i + 1) + " Dealer name =" + Dealer_name.get(i).getText());
			Message((i + 1) + " Dealer address =" + Dealer_address.getText());
//			Message((i + 1) + " Dealer distance =" + Dealer_distance.getText());
//			Message((i + 1) + " Dealer duration time =" + Dealer_duration_time.getText());
			Custom_click(Call_Dealer, (i + 1) + " Call Dealer button ");
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
			if (device.equalsIgnoreCase("realdevice")) {
				driver.navigate().back();
			}
		}
		}catch (Exception e) {
			Message("Some dealer info is missing");
			driver.navigate().back();
			driver.navigate().back();
			
		}
	}

	// ****************************Service_at_home_page************************************
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/tv_ser')]")
	private List<WebElement> service_info;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'	com.customerapp.hero:id/tv_last')]")
	private WebElement last_service;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/tv_history')]")
	private WebElement last_service_date;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_view1']")
	private WebElement View_details_button;
	@FindBy(xpath = "//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/lbl']")
	private WebElement Vehicle_service;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_name']")
	private WebElement Vehicle_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_service1_history1']")
	public WebElement Service_history;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/tv_view1_sch')]")
	public WebElement View_Schedule;

	public void service_info() {
		for (int i = 0; i < service_info.size(); i++) {
			msg(service_info.get(i), " ");
		}
		try {
			if (last_service_date.isDisplayed())
				msg(last_service_date, "last service on ");
		} catch (Exception e) {
			Message("last service date is not given");
		}
	}

	public WebElement View_details_button() {
		return View_details_button;
	}

	public WebElement Vehicle_service() {
		return Vehicle_service;
	}

	public WebElement Vehicle_name() {
		return Vehicle_name;
	}

	public WebElement Service_history() {
		return Service_history;
	}

	public WebElement View_Schedule() {
		return View_Schedule;
	}

	// ****************************Latest_at_home_page************************************
	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/recyclerView'])[1]")
	private WebElement Latest_Vehicle;
	@FindBy(xpath = "(//android.widget.TextView[@index ='1'])[1]")
	private WebElement latest_vehicle_message;

	public WebElement Latest_Vehicle() {
		return Latest_Vehicle;
	}

	public WebElement latest_vehicle_message() {
		return latest_vehicle_message;
	}

	// ****************************verify_EShop************************************
	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/recyclerView'])[2]")
	private WebElement E_shop;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl']")
	private WebElement E_shop_message;

	public WebElement E_shop() {
		return E_shop;
	}

	public WebElement E_shop_message() {
		return E_shop_message;
	}

	// ****************************Benifits_Vehicle_Exchange************************************
	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/recyclerView'])[3]")
	private WebElement Benifits;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl']")
	private WebElement goodlife;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl1'])[1]")
	private WebElement goodlife_message;

	public WebElement Benifits() {
		return Benifits;
	}

	public WebElement goodlife() {
		return goodlife;
	}

	public WebElement goodlife_message() {
		return goodlife_message;
	}

	// ****************************Community_and_Tips************************************
	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/recyclerView'])[2]")
	private WebElement Community;
	@FindBy(xpath = "//android.view.View[@resource-id = 'breadcrumb-1aaaf38848']")
	private WebElement Community_message;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl']")
	private WebElement Community_message_1;
	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/recyclerView'])[3]")
	private WebElement Tips;

	public WebElement Community() {
		return Community;
	}

	public WebElement Community_message() {
		return Community_message;
	}

	public WebElement Community_message_1() {
		return Community_message_1;
	}

	public WebElement Tips() {
		return Tips;
	}
}

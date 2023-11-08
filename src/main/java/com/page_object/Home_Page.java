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

	public Home_Page() {
		PageFactory.initElements(driver, this);
	}

	// *************************Temperature**********************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/weather_lbl']")
	private WebElement temperature;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl1'])[1]")
	private WebElement vehicle_drop_down;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/bike_name_lbl']")
	private List<WebElement> all_vehicle_inside_drop_down;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/vehicle_img']")
	private WebElement vehicle_img;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/ic_notification']")
	private WebElement notification;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/title']")
	private List<WebElement> notification_count;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.customerapp.hero:id/back_btn']")
	private WebElement notification_back;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/collapse_btn']")
	private WebElement Collapse_btn;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/iv_close']")
	private WebElement close_drop_down;

	public WebElement temperature() {
		return temperature;
	}

	public void all_vehicle_inside_drop_down() throws InterruptedException {
	
			Custom_click(vehicle_drop_down, " Drop down");
			Custom_click(all_vehicle_inside_drop_down.get(0), "Select Vehicle");
		
	}

	public WebElement vehicle_img() {
		return vehicle_img;
	}

	public WebElement notification() {
		return notification;
	}

	public int notification_count() {
		return notification_count.size();
	}

	public WebElement notification_back() {
		return notification_back;
	}

	public WebElement Collapse_btn() {
		return Collapse_btn;
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
	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/root'])[1]")
	private WebElement Navigate_menu;
	@FindBy(xpath = "//android.widget.TextView[@text ='Search Destination']")
	private WebElement Search_destination;
	@FindBy(xpath = "//android.widget.EditText[@resource-id ='com.customerapp.hero:id/edittext_search']")
	private WebElement Search_here;
	@FindBy(xpath ="(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_place_name'])[1]")
	private WebElement chose_place_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/service_center_lbl']")
	private WebElement Searched_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/service_center_address_lbl']")
	private WebElement Searched_address;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement Navigate_button;
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id ='com.customerapp.hero:id/navigate']")
	private WebElement Start;
	@FindBy(xpath ="//android.widget.TextView[@resource-id='com.customerapp.hero:id/btn_start']")
	private WebElement Start_button;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/stop_navigation']")
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
	public WebElement chose_place_name()
	{
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
	public WebElement Start_button()
	{
		return Start_button;
	}
	public WebElement stop_navigation()
	{
		return stop_navigation;
	}
	public WebElement change_search() {
		return change_search;
	}

	public WebElement Back_button() {
		return Back_button;
	}

//****************************Documents Page************************************
	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/root'])[2]")
	private WebElement Documents_Menu;
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


	public WebElement Documents_Menu() {
		return Documents_Menu;
	}

	public WebElement Back() {
		return Back;
	}

	public WebElement While_using_the_app() {
		return While_using_the_app;
	}

	public void Documents_list() throws InterruptedException {

		for (int i = 1; i < Documents_list.size(); i++) {
			String name = Documents_list.get(i).getText();
//			Custom_click(Documents_list.get(i), name);
			Message(name);
			i++;
			String doc = Documents_list.get(i).getText();
			if(doc.equalsIgnoreCase("Upload")) {
			Custom_click(Documents_list.get(i), name +" "+ Documents_list.get(i).getText());
			Thread.sleep(2000);
			if (i == 2) {
				Custom_click(While_using_the_app, "While using the app");
				Custom_click(Allow, "Allow");
				Thread.sleep(2000);
				Custom_click(Documents_list.get(i), name +" "+Documents_list.get(i).getText());
			}
//			try {
//				if (Document_Check != null) {
//					Message(Document_Check.getText());
//					Custom_click(Add_Now, name + " Add now");
//					if (i == 1) {
//						Custom_click(While_using_the_app, "While using the app");
//						Custom_click(Allow, "Allow");
//						Thread.sleep(2000);
//						Custom_click(Add_Now, name + " Add now");
//					}
			try {
					Custom_click(Choose_Document_from_library, name + " Document frmo library");
					Thread.sleep(2000);
					driver.navigate().back();
					Custom_click(Documents_list.get(i), name +" "+Documents_list.get(i).getText());
//					Custom_click(Add_Now, name + " Add now");
					Custom_click(Take_a_Photo, "Take a Photo");
					Thread.sleep(2000);
					driver.navigate().back();
//					Custom_click(Add_Now, name + " Add now");
					if(i!=6) {
					Custom_click(Documents_list.get(i), name +" "+Documents_list.get(i).getText());
					Custom_click(Choose_from_Digilocker, "Choose from Digilocker");
					Thread.sleep(2000);
					Custom_click(Back,  " Back from Digilocker Login");
					}
					Custom_click(Documents_list.get(i), name +" "+Documents_list.get(i).getText());
					Custom_click(document_upload_close_button, "Close upload document page");
//				}
			} catch (Exception e) {
				Message(name + " is already available");
				Custom_click(Back, name + " Back Document");
			}
			}
			else
			{
				Message(name + " is already available");
				Custom_click(Documents_list.get(i), name +" "+ Documents_list.get(i).getText());
				Thread.sleep(3000);
				Custom_click(Back, "Back from " +name + " page");
			}
		}
	}

//****************************Relationship Manager************************************
	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/root'])[3]")
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
	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/root'])[4]")
	private WebElement RSA;
	@FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/tv')]")
	private List<WebElement> RSA_info;
	@FindBy(xpath = "//android.view.View[@content-desc='Locate nearest dealer']/android.widget.TextView")
	private WebElement locate_nearest_dealer;
//	@FindBy(xpath = "//android.widget.TextView[@text ='Locate nearest dealer']")
//	private WebElement locate_nearest_dealer;
	@FindBy(xpath = "//android.view.View[@text ='Locate nearest dealer']")
	private WebElement locate_nearest_dealer_real_device;
	@FindBy(xpath = "//android.view.View[@text ='LOCATE THE NEAREST DEALER']")
	private WebElement locate_the_nearest_dealer;
	@FindBy(xpath ="//android.widget.TextView[contains(@text ,'LOCATE THE')]")
	private WebElement locate_the_nearest_dealer_real;
	@FindBy(xpath ="//android.view.View[@resource-id ='OutletState']")
	private WebElement State;
	@FindBy(xpath ="//android.widget.EditText[@resource-id ='com.customerapp.hero:id/text_input_editext']")
	private WebElement registration_number;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement renew_rsa;
	@FindBy(xpath ="(//android.widget.CheckedTextView[@resource-id ='android:id/text1'])[3]")
	private WebElement State_check;
	@FindBy(xpath ="//android.widget.CheckedTextView[@resource-id ='android:id/text1']")
	private List<WebElement> select_state;
	@FindBy(xpath ="//android.view.View[@resource-id ='OutletCity']")
	private WebElement City;
	@FindBy(xpath ="//android.view.View[@resource-id ='OutletLocality']")
	private WebElement Locality;
	@FindBy(xpath ="//android.widget.Button[@resource-id ='accept']")
	private WebElement accept_cookie;
	@FindBy(xpath ="//android.widget.Button[@text ='Search']")
	private WebElement Search_button;
	@FindBy(xpath ="//android.view.View[contains(@text,'HERO MOTOCORP')]")
	private WebElement Local_dealer_fullname;
	@FindBy(xpath ="//android.widget.TextView[contains(@text,'HERO MOTOCORP')]")
	private WebElement Local_dealer_fullname_real;
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Hero Motocorp')]")
	private WebElement Local_dealer_name;
	@FindBy(xpath ="//android.view.View[contains(@text,'No')]")
	private WebElement Local_dealer_address;
	@FindBy(xpath ="//android.widget.TextView[contains(@text,'No')]")
	private WebElement Local_dealer_address_real;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_title']")
	private List<WebElement> asked_questions;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_ans']")
	private WebElement answer;
	public WebElement RSA() {
		return RSA;
	}
	public WebElement accept_cookie()
	{
		return accept_cookie;
	}
	public WebElement Local_dealer_fullname()
	{
		return Local_dealer_fullname;
	}
	public WebElement Local_dealer_fullname_real()
	{
		return Local_dealer_fullname_real;
	}
	public WebElement Local_dealer_name()
	{
		return Local_dealer_name;
	}
	public WebElement Local_dealer_address()
	{
		return Local_dealer_address;
	}
	public WebElement registration_number()
	{
		return registration_number;
	}
	public WebElement Local_dealer_address_real()
	{
		return Local_dealer_address_real;
	}
	public WebElement locate_nearest_dealer() {
		return locate_nearest_dealer;
	}
	public WebElement renew_rsa()
	{
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
	public WebElement State()
	{
		return State;
	}
	public WebElement State_check()
	{
		return State_check;
	}
	public WebElement City()
	{
		return City;
	}
	public WebElement Locality()
	{
		return Locality;
	}
	public void asked_questions()
	{
		try {
	Custom_click(asked_questions.get(2), "Open question = "+asked_questions.get(2).getText());
	msg(answer, "Answer ="+ answer.getText());
	Custom_click(asked_questions.get(2),"Close question = "+asked_questions.get(2).getText());
	Custom_click(asked_questions.get(3), "Open question = "+asked_questions.get(3).getText());
	Scroll_down_page_Action("Answer");
	msg(answer, "Answer ="+answer.getText());
	Custom_click(asked_questions.get(2), "Close question = "+ asked_questions.get(2).getText());
	Custom_click(asked_questions.get(4), "Open question = "+asked_questions.get(4).getText());
	Scroll_down_page_Action("Answer");
	msg(answer, "Answer ="+answer.getText());
	Custom_click(asked_questions.get(3), "Close question = "+asked_questions.get(3).getText());
		}catch(Exception e)	{
			Message("No question is available");
		}
		
	}
 
	public WebElement Search_button()
	{
		return Search_button;
	}
	public void RSA_info()
	{
		for(int i=0;i<RSA_info.size();i++)
		{
			msg(RSA_info.get(i), RSA_info.get(i).getText());
		}
	}
	public void select_state(String State_name)
	{
		for(int i=0;i<select_state.size();i++)
		{
			String name = select_state.get(i).getText();
			if(State_name.equalsIgnoreCase(name))
			{
				Custom_click(select_state.get(i), name);
				break;
			}
			else {
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
			if(i==(select_state.size()-1))
			{
			select_state.get(i).click();
				State.click();
				 i = 0;
			}
			}
			}
		}
	public void select_city(String City_name)
	{
		for(int i=0;i<select_state.size();i++)
		{
			String name = select_state.get(i).getText();
			if(City_name.equalsIgnoreCase(name))
			{
				Custom_click(select_state.get(i), name);
				break;
			}
			else {
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
			if(i==(select_state.size()-1))
			{
				select_state.get(i).click();
				City.click();
				 i = 0;
			}
			}
		}
	}
	public void select_Locality(String Locality_name)
	{
		for(int i=0;i<select_state.size();i++)
		{
			String name = select_state.get(i).getText();
			if(Locality_name.equalsIgnoreCase(name))
			{
				Custom_click(select_state.get(i), name);
				break;
			}
			else {
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
			if(i==(select_state.size()-1))
			{
				select_state.get(i).click();
				Locality.click();
				 i = 0;
			}
			}
		}
	}
//****************************Technical Support************************************
	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/root'])[5]")
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
	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/root'])[6]")
	private WebElement Dealer_Locator;
	@FindBy(xpath = "(//android.widget.TextView[@text])[2]")
	private WebElement Select_State;
	@FindBy(xpath = "(//android.widget.TextView[@text])[3]")
	private WebElement Select_City;
	@FindBy(xpath = "//android.widget.TextView[@text]")
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
				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if (i == (Select_State_list.size() - 1)) {
					Select_State_list.get(i).click();
					Select_State.click();
					i = 0;
				}
			}
		}
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

	public WebElement map_view() {
		return map_view;
	}

	public void Dealer_info() {
		int avilable_dealer = Dealer_name.size();
		Message("Total available dealer is =" + avilable_dealer);
		for (int i = 0; i < avilable_dealer; i++) {
			Message((i + 1) + " Dealer name =" + Dealer_name.get(i).getText());
			Message((i + 1) + " Dealer address =" + Dealer_address.getText());
			Message((i + 1) + " Dealer distance =" + Dealer_distance.getText());
			Message((i + 1) + " Dealer duration time =" + Dealer_duration_time.getText());
			Custom_click(Call_Dealer, (i + 1) + " Call Dealer button ");
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();
		}
	}
	//****************************Service_at_home_page************************************
	@FindBy(xpath ="//android.widget.FrameLayout[@resource-id ='com.customerapp.hero:id/service_card_lay']//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl1']")
	private WebElement Service_status;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/book_now_btn']")
	private WebElement View_details_button;
	@FindBy(xpath ="//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/lbl']")
	private WebElement Vehicle_service;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_name']")
	private WebElement Vehicle_name;
	public WebElement Service_status()
	{
		return Service_status;
	}
	public WebElement View_details_button()
	{
		return View_details_button;
	}
	public WebElement Vehicle_service()
	{
		return Vehicle_service;
	}
	public WebElement Vehicle_name() {
		return Vehicle_name;
	}
	//****************************Latest_at_home_page************************************
	@FindBy(xpath ="(//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/recyclerView'])[1]")
	private WebElement Latest_Vehicle;
	@FindBy(xpath ="(//android.widget.TextView[@index ='1'])[1]")
	private WebElement latest_vehicle_message;
	@FindBy(xpath ="//android.view.View[contains(@text , 'THE LEGEND RETURNS')]")
	private WebElement mute;
//	@FindBy(xpath="//android.widget.Image[@text ='scroll_img']")
//	private WebElement scroll_img;
//	@FindBy(xpath ="//android.widget.Button[@resource-id ='notifyMeButton']")
//	private WebElement Notify_me;
//	@FindBy(xpath ="//android.widget.EditText[@resource-id='userName']")
//	private WebElement user_name;
//	@FindBy(xpath ="//android.widget.EditText[@resource-id='userEmail']")
//	private WebElement user_email;
//	@FindBy(xpath ="//android.widget.EditText[@resource-id='pincode']")
//	private WebElement pincode;
//	@FindBy(xpath ="//android.widget.EditText[@resource-id='userMobile']")
//	private WebElement user_mobile;
//	@FindBy(xpath ="//android.view.View[@content-desc='SEND OTP']/android.widget.TextView")
//	private WebElement Send_OTP_button;
//	@FindBy(xpath ="//android.widget.EditText[contains(@resource-id ,'digit')]")
//	private List<WebElement> otp;
//	@FindBy(xpath ="//android.view.View[@resource-id ='otperrormessage']")
//	private WebElement otp_error_message;
//	@FindBy(xpath ="//android.widget.Button[@resource-id ='lead-gen-submit-button']")
//	private WebElement submit_button;
	public WebElement Latest_Vehicle()
	{
		return Latest_Vehicle;
	}
	public WebElement mute()
	{
		return mute;
	}
//	public WebElement scroll_img()
//	{
//		return scroll_img;
//	}
	public WebElement latest_vehicle_message()
	{
		return latest_vehicle_message;
	}
//	public WebElement Notify_me()
//	{
//		return Notify_me;
//	}
//	public WebElement user_name()
//	{
//		return user_name;
//	}
//	public WebElement user_email()
//	{
//		return user_email;
//	}
//	public WebElement pincode()
//	{
//		return pincode;
//	}
//	public WebElement user_mobile()
//	{
//		return user_mobile;
//	}
//	public WebElement Send_OTP_button()
//	{
//		return Send_OTP_button;
//	}
//	public WebElement submit_button()
//	{
//		return submit_button;
//	}
//	public WebElement otp_error_message()
//	{
//		return otp_error_message;
//	}
//	public void otp()
//	{
//		for(int i=0,j=3;i<otp.size();i++)
//		{
//			custom_sendkeys(otp.get(i), ""+j, " OTP " +j);
//			j++;
//		}
//	}
	//****************************verify_EShop************************************
	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/recyclerView'])[2]")
	private WebElement E_shop;
	@FindBy(xpath ="//android.view.View[@resource-id ='nav-global-location-slot']")
	private WebElement E_shop_location;
	@FindBy(xpath ="(//android.widget.Button[@text])[3]")
	private WebElement Categories;
	@FindBy(xpath ="//android.widget.Button[contains(@text,'BACK')]")
	private WebElement BACK_TO_HERO_MOTOCORP;
	public WebElement E_shop()
	{
		return E_shop;
	}
	public WebElement E_shop_location()
	{
		return E_shop_location;
	}
	public WebElement Categories()
	{
		return Categories;
	}
	public WebElement BACK_TO_HERO_MOTOCORP()
	{
		return BACK_TO_HERO_MOTOCORP;
	}
	//****************************Benifits_Vehicle_Exchange************************************
	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/recyclerView'])[3]")
	private WebElement Benifits;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl']")
	private WebElement goodlife;
	@FindBy(xpath ="//android.widget.RadioButton[@resource-id ='eng_lang_select']")
	private WebElement language;
	@FindBy(xpath ="(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl1'])[1]")
	private WebElement goodlife_message;
	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/recyclerView'])[4]")
	private WebElement Vehicle_Exchange;
	@FindBy(xpath="(//android.widget.ListView)[1]//android.view.View[@index]")
	private List<WebElement> Vehicle_Exchange_info;
	public WebElement Benifits()
	{
		return Benifits;
	}
	public WebElement goodlife()
	{
		return goodlife;
	}
	public WebElement language()
	{
		return language;
	}
	public WebElement goodlife_message()
	{
		return goodlife_message;
	}
	public WebElement Vehicle_Exchange()
	{
		return Vehicle_Exchange;
	}
	public void Vehicle_Exchange_info()
	{
		for(int i=0;i<Vehicle_Exchange_info.size()-1;i++)
		{
			msg(Vehicle_Exchange_info.get(i),Vehicle_Exchange_info.get(i).getText());
		}
	}
	//****************************Community_and_Tips************************************
	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/recyclerView'])[2]")
	private WebElement Community;
	@FindBy(xpath ="//android.view.View[@resource-id = 'breadcrumb-1aaaf38848']")
	private WebElement Community_message;
	@FindBy(xpath="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl']")
	private WebElement Community_message_1;
	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/recyclerView'])[3]")
	private WebElement Tips;
	public WebElement Community()
	{
		return Community;
	}
	public WebElement Community_message()
	{
		return Community_message;
	}
	public WebElement Community_message_1()
	{
		return Community_message_1;
	}
	public WebElement Tips()
	{
		return Tips;
	}
}

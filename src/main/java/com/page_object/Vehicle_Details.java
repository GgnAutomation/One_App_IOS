package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base_Utility;

public class Vehicle_Details extends Base_Utility {

	public Vehicle_Details() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id ='com.customerapp.hero:id/hmcDashboardFrg']")
	private WebElement home;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/side_menu_btn']")
	private WebElement side_menu_button;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/user_name']")
	private WebElement user_name;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/vehicle_name']")
	private WebElement vehicle_name_1;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/vehicle_nam1']")
	private WebElement vehicle_number_1;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/vehicle_detail_btn']")
	private WebElement Vehicle_Details;
	@FindBy(xpath = "//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/tv_model']")
	private WebElement Selected_vehicle;
	@FindBy(xpath ="(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/bike_name_lbl'])[1]")
	private WebElement choose_vehicle;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/img_vehicle']")
	private WebElement Vehicle_img;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_primary_vehicle']")
	private WebElement vehicle_status;
	@FindBy(xpath = "//android.widget.TextView[@resource-id= 'com.customerapp.hero:id/tv_vehicle_no']")
	private WebElement Vehicle_number;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/title'])[1]")
	private WebElement verify_GoodLife;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl1'])[1]")
	private WebElement verify_goodlife_page;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/title'])[2]")
	private WebElement verify_joyRide;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/subtitle']")
	private WebElement verify_joyRide_page;

	public WebElement home() {
		return home;
	}

	public WebElement side_menu_button() {
		return side_menu_button;
	}
	public WebElement user_name()
	{
		return user_name;
	}
	public WebElement vehicle_name_1()
	{
		return vehicle_name_1;
	}
	public WebElement vehicle_number_1()
	{
		return vehicle_number_1;
	}
	public WebElement Vehicle_details() {
		return Vehicle_Details;
	}

	public WebElement Selected_vehicle() {
		return Selected_vehicle;
	}
	public WebElement choose_vehicle()
	{
		return choose_vehicle;
	}
	public WebElement Vehicle_img() {
		return Vehicle_img;
	}

	public WebElement vehicle_status() {
		return vehicle_status;
	}

	public WebElement Vehicle_number() {
		return Vehicle_number;
	}

	public WebElement verify_GoodLife() {
		return verify_GoodLife;
	}

	public WebElement verify_goodlife_page() {
		return verify_goodlife_page;
	}

	public WebElement verify_joyRide() {
		return verify_joyRide;
	}

	public WebElement verify_joyRide_page() {
		return verify_joyRide_page;
	}

//**************************************More details *************************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_details']")
	private WebElement more_details;

	public WebElement more_details() {
		return more_details;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_header']")
	private List<WebElement> Vehicle_header;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_value']")
	private List<WebElement> vehicle_info;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_value'])[4]")
	private WebElement nick_name_edit;
	@FindBy(xpath = "//android.widget.EditText[@resource-id ='com.customerapp.hero:id/text_input_editext']")
	private WebElement nick_name_input_field;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement save_button;

	public void vehicle_info() {
		try {
			for (int i = 0; i < vehicle_info.size(); i++) {
				Message(Vehicle_header.get(i).getText() + " = " + vehicle_info.get(i).getText());
			}
		} catch (Exception e) {
			Message("" + e);
		}
	}

	public WebElement nick_name_edit() {
		return nick_name_edit;
	}

	public WebElement nick_name_input_field() {
		return nick_name_input_field;
	}

	public WebElement save_button() {
		return save_button;
	}

//******************************************My vehicle documents *****************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_documents']")
	private WebElement my_vehicle_documents;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/doc_name']")
	private List<WebElement> Documents_list;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private List<WebElement> Documents_status;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/title']")
	private WebElement Document_Check;
//	@FindBy(xpath = "//android.widget.TextView[@text ='Add now']")
//	private WebElement Add_Now;
//	@FindBy(xpath = "//android.widget.Button[@resource-id = 'com.android.permissioncontroller:id/permission_allow_foreground_only_button']")
//	private WebElement While_using_the_app;
//	@FindBy(xpath = "//android.widget.Button[@resource-id ='com.android.permissioncontroller:id/permission_allow_button']")
//	private WebElement Allow;
//	@FindBy(xpath = "//android.widget.TextView[@text ='Choose from library']")
//	private WebElement Choose_Document_from_library;
//	@FindBy(xpath = "//android.widget.TextView[@text ='Take a Photo']")
//	private WebElement Take_a_Photo;
//	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/cross_btn']")
//	private WebElement document_upload_close_button;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement Back;

	public WebElement my_vehicle_documents() {
		return my_vehicle_documents;
	}

	public WebElement back_button() {
		return Back;
	}

	public void Documents_list() throws InterruptedException {

		for (int i = 0; i < Documents_list.size(); i++) {
			String name = Documents_list.get(i).getText();
			String doc = Documents_status.get(i).getText();
			if(doc.equalsIgnoreCase("Upload")) {
				Message(name +" document is not uploaded yet");
			}
			else
			{
				Message(name +" document is already uploaded");
			}
		}
	}

//******************************************My owners Manual *****************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_owners_manual']")
	private WebElement owners_manual;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/title']")
	private WebElement owners_title;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/imageview']")
	private WebElement Manual_Owners_info;

	public WebElement owners_manual() {
		return owners_manual;
	}

	public WebElement owners_title() {
		return owners_title;
	}

	public WebElement Manual_Owners_info() {
		return Manual_Owners_info;
	}

//********************************************** Service History ***********************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_service_history']")
	private WebElement My_vehicle_Service_history;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id')]")
	private List<WebElement> Service_history;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/brandName']")
	private WebElement service_brand_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/brandDetail2']")
	private WebElement service_seral_no;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/center')]")
	private List<WebElement> sevice_center_info;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/estimatedPrice']")
	private WebElement Estimated_Amount;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/estimatedDate']")
	private WebElement Estimated_Date_Time;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/support')]")
	private List<WebElement> support_info;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/keyArrow']")
	private WebElement collapse_arrow;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/callImg1']")
	private WebElement call_supporter;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_Invoice']")
	private WebElement invoice;
	@FindBy(xpath = "//android.widget.Button[@resource-id ='android:id/button_once']")
	private WebElement button_once;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Hero')]")
	private WebElement invoice_number;

	public WebElement My_vehicle_Service_history() {
		return My_vehicle_Service_history;
	}

	public void Service_history() throws InterruptedException {
		for (int i = 11; i < Service_history.size(); i++) {
			try {
				String service_info = Service_history.get(i).getText();
				if (service_info.equalsIgnoreCase("Details")) {
					Custom_click(Service_history.get(i), service_info);
					Message("Vehicle brand name in Service details= " + service_brand_name.getText());
					Message("Vehicle Serial number in Service details  = " + service_seral_no.getText());
					try {
						if (sevice_center_info.get(0).isDisplayed() == true) {
							Message("Service center name =" + sevice_center_info.get(0).getText());
							Message("Service center address =" + sevice_center_info.get(1).getText());
						}
					} catch (Exception e) {
						Message("Service center name is not given");
					}
					
					Message("******************Job card , Completion date & price ************************");
					Message("Estimated Amount =" + Estimated_Amount.getText());
					Message("Estimated Date & Time =" + Estimated_Date_Time.getText());
					support_information();
					Custom_click(collapse_arrow, "collapse Key arrow in");
					Custom_click(collapse_arrow, "collapse Key arrow out");
					Custom_click(call_supporter, " call supporter ");
					driver.navigate().back();
					driver.navigate().back();
					driver.navigate().back();
					Custom_click(Back, Service_history.get(0).getText());
				} else {
					Message(service_info);
				}
			} catch (Exception e) {
				Message("" + e);
			}
		}
	}

	public void support_information() {
		try {
			for (int i = 0; i < support_info.size(); i++) {
				Message("Support information =" + support_info.get(i).getText());
			}
		} catch (Exception e) {
			Message("" + e);

		}
	}

	// ********************************************** Tips and DIY videos
	// ***********************************
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/rv_item_lbl'])[2]")
	private WebElement Tips_and_DIY_videos;
	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc= 'Tips']/android.widget.TextView")
	private WebElement Tips_info;
	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc='DIY Videos']/android.widget.TextView")
	private WebElement DIY_Videos;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/cross']")
	private WebElement close_my_profile_page;

	public WebElement Tips_and_DIY_videos() {
		return Tips_and_DIY_videos;
	}

	public WebElement Tips_info() {
		return Tips_info;
	}

	public WebElement DIY_Videos() {
		return DIY_Videos;
	}

	public WebElement close_my_profile_page() {
		return close_my_profile_page;
	}

}

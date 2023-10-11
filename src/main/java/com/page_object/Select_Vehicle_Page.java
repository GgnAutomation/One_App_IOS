package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.utility.Base_Utility;

public class Select_Vehicle_Page extends Base_Utility {

	char Vehicle_count;

	public Select_Vehicle_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//android.widget.ImageView[@resource-id = 'com.customerapp.hero:id/ic_edit'])[1]")
	private WebElement edit_nickame_button;
	@FindBy(xpath = "//android.widget.EditText[@resource-id = 'com.customerapp.hero:id/text_input_editext']")
	private WebElement edit_nickame_text;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/edit_bike_name_lbl'])[1]")
	private WebElement Nick_name;
	@FindBy(xpath = "//android.widget.TextView[@text = 'Save']")
	private WebElement save_button;
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id = 'com.customerapp.hero:id/btn_lay']")
	private WebElement continue_button;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/primary_veh_lbl'])[1]")
	private WebElement click_first_vehicle;
	@FindBy(xpath = "//android.widget.Button[@resource-id = 'com.android.permissioncontroller:id/permission_allow_foreground_only_button']")
	private WebElement While_using_the_app;
	@FindBy(xpath = "//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/lbl1']")
	private WebElement vehicle_info;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id = 'com.customerapp.hero:id/cross_btn']")
	private WebElement nick_name_close_button;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/iv_close']")
	private WebElement video_close_button;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/iv_full']")
	private WebElement video_full_video;
	@FindBy(xpath ="//android.widget.Button[@resource-id ='com.android.permissioncontroller:id/permission_allow_button']")
	private WebElement Allow;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/custom_radius_close']")
	private WebElement banner_Img_close;
	public WebElement edit_nickame_button() {
		return edit_nickame_button;
	}

	public WebElement edit_nickame_text() {
		return edit_nickame_text;
	}

	public WebElement Nick_name() {
		return Nick_name;
	}

	public WebElement nick_name_close_button() {
		return nick_name_close_button;
	}
	public WebElement Allow()
	{
		return Allow;
	}
	public WebElement banner_Img_close()
	{
		return banner_Img_close;
	}
	public WebElement continue_button() {
		return continue_button;
	}

	public WebElement click_first_vehicle() {
		return click_first_vehicle;
	}

	public WebElement save_button() {
		return save_button;
	}

	public WebElement While_using_the_app() {
		return While_using_the_app;
	}

	public void vehicle_count() {
		String vehicle_mess = vehicle_info.getText();
		Message(vehicle_mess);
		char vehicle[] = vehicle_mess.toCharArray();
		for (int i = 0; i < vehicle.length; i++) {
			if (Character.isDigit(vehicle[i])) {
				Vehicle_count = vehicle[i];
			}
		}
		Message("Total number of Vehicles registered in this number is = " + Vehicle_count);
	}
		public WebElement video_close_button()
	{
		return video_close_button;
	}
	public WebElement video_full_video()
	{
		return video_full_video;
	}
}

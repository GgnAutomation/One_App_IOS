package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base_Utility;

public class My_Profile_Page extends Base_Utility {
	public My_Profile_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//android.widget.FrameLayout[@resource-id ='com.customerapp.hero:id/hmcDashboardFrg']")
	private WebElement home;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/side_menu_btn']")
	private WebElement side_menu_button;
	@FindBy(xpath = "//android.widget.TextView[@text ='My Profile']")
	private WebElement my_profile;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/user_name']")
	private WebElement user_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/user_mobile_no']")
	private WebElement user_mobile_no;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/user_email']")
	private WebElement user_email;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_details']")
	private WebElement More_details;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/tv')]")
	private List<WebElement> user_info;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/user_dob']")
	private WebElement user_dob;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/gender']")
	private WebElement user_gender;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/blood_group']")
	private WebElement user_blood_group;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement edit_profile_details_button;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/profile_pic_edit_btn']")
	private WebElement profile_pic_edit_btn;
	@FindBy(xpath ="//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']")
	private WebElement while_using_the_app;
	@FindBy(xpath ="//android.widget.Button[@resource-id ='com.android.permissioncontroller:id/permission_allow_button']")
	private WebElement allow;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl'])[1]")
	private WebElement Choose_from_library;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl'])[2]")
	private WebElement Take_a_Photo;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/cross_btn']")
	private WebElement upload_close_button;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement Back;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/cross']")
	private WebElement close_my_profile_page;
	public WebElement home()
	{
		return home;
	}
	public WebElement side_menu_button() {
		return side_menu_button;
	}

	public WebElement my_profile() {
		return my_profile;
	}

	public WebElement user_name() {
		return user_name;
	}

	public WebElement user_mobile_no() {
		return user_mobile_no;
	}

	public WebElement user_email() {
		return user_email;
	}

	public WebElement More_details() {
		return More_details;
	}
	public WebElement Back() {
		return Back;
	}
	public void user_info() {
		msg(user_info.get(0),user_info.get(0).getText() + " = " + user_dob.getText());
		msg(user_info.get(1),user_info.get(1).getText() + " = " + user_gender.getText());
		msg(user_info.get(2),user_info.get(2).getText() + " = " + user_blood_group.getText());
	}

	public WebElement edit_profile_details_button() {
		return edit_profile_details_button;
	}

	public WebElement profile_pic_edit_btn() {
		return profile_pic_edit_btn;
	}
	public WebElement while_using_the_app()
{
	return while_using_the_app;
}
	public WebElement allow()
	{
		return allow;
	}
	public WebElement Choose_from_library() {
		return Choose_from_library;
	}
	public WebElement close_my_profile_page()
	{
		return close_my_profile_page;
	}

	public WebElement Take_a_Photo() {
		return Take_a_Photo;
	}

	public WebElement upload_close_button() {
		return upload_close_button;
	}
//************************************************Edit personal Details**************************	
	@FindBy(xpath ="(//android.widget.EditText[@resource-id='com.customerapp.hero:id/text_input_editext'])[1]")
	private WebElement edit_full_name;
	@FindBy(xpath ="(//android.widget.EditText[@resource-id ='com.customerapp.hero:id/text_input_editext'])[2]")
	private WebElement edit_email_id;
	@FindBy(xpath ="(//android.widget.EditText[@resource-id ='com.customerapp.hero:id/text_input_editext'])[3]")
	private WebElement edit_registered_mobile_number;
	@FindBy(xpath ="(//android.widget.EditText[@resource-id='com.customerapp.hero:id/text_input_editext'])[4]")
	private WebElement edit_date_of_birth;
	@FindBy(xpath ="//android.widget.RadioButton[contains(@resource-id , 'com.customerapp.hero:id')]")
	private List<WebElement> gender_radio_button;
	@FindBy(xpath ="//android.widget.ImageButton[@resource-id ='com.customerapp.hero:id/mtrl_picker_header_toggle']")
	private WebElement DOB_edit_button;
	@FindBy(xpath ="//android.widget.EditText[@text]")
	private WebElement send_dob;
	@FindBy(xpath ="//android.widget.Button[@resource-id='com.customerapp.hero:id/confirm_button']")
	private WebElement confirm_dob;
	@FindBy(xpath ="//android.widget.Button[@resource-id ='com.customerapp.hero:id/cancel_button']")
	private WebElement Cancel_dob;
	@FindBy(xpath ="//android.widget.Spinner[@resource-id = 'com.customerapp.hero:id/filled_exposed']")
	private WebElement blood_group;
	@FindBy(xpath ="//android.widget.EditText[@resource-id ='com.customerapp.hero:id/address_input_editext']")
	private WebElement Street_name;
	@FindBy(xpath ="//android.widget.LinearLayout[@resource-id ='com.customerapp.hero:id/user_pincode_lbl']//android.widget.EditText")
	private WebElement pin_code;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement Save_button;

	public WebElement edit_full_name()
	{
		return edit_full_name;
	}
	public WebElement edit_email_id()
	{
		return edit_email_id;
	}
	public WebElement edit_registered_mobile_number()
	{
		return edit_registered_mobile_number;
	}
	public WebElement edit_date_of_birth()
	{
		return edit_date_of_birth;
	}
	public void gender_selection() throws InterruptedException
	{
		for(int i=0;i<gender_radio_button.size();i++)
		{
			Custom_click(gender_radio_button.get(i), "Tset radio button for =" +gender_radio_button.get(i).getText());
			Thread.sleep(2000);
		}
		Custom_click(gender_radio_button.get(0), "Finally choose is =" +gender_radio_button.get(0).getText());
	}
	public WebElement DOB_edit_button()
	{
		return DOB_edit_button;
	}
	public WebElement send_dob()
	{
		return send_dob;
	}
	public WebElement confirm_dob()
	{
		return confirm_dob;
	}
	public WebElement Cancel_dob()
	{
		return Cancel_dob;
	}
	public WebElement blood_group()
	{
		return blood_group;
	}
	public WebElement Street_name()
	{
		return Street_name;
	}
	public WebElement pin_code()
	{
		return pin_code;
	}
	public WebElement Save_button()
	{
		return Save_button;
	}
//	*******************************Manage License *****************************************
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/manage_license']")
	private WebElement manage_license;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/title']")
	private WebElement License_verify;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/subtitle']")
	private WebElement add_Liense_now;
	@FindBy(xpath ="(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl'])[1]")
	private WebElement Choose_License_from_library;
	@FindBy(xpath ="(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl'])[2]")
	private WebElement Take_License_Photo;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/cross_btn']")
	private WebElement close_button_for_license_upload;
	public WebElement manage_license()
	{
		return manage_license;
	}
	public WebElement License_verify()
	{
		return License_verify;
	}
	public WebElement add_Liense_now()
	{
		return add_Liense_now;
	}
	public WebElement Choose_License_from_library()
	{
		return Choose_License_from_library;
	}
	public WebElement Take_License_Photo()
	{
		return Take_License_Photo;
	}
	public WebElement close_button_for_license_upload()
	{
		return close_button_for_license_upload;
	}
//****************************emergency_contacts***************************************
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/emergency_contacts']")
	private WebElement emergency_contacts;
	public WebElement emergency_contacts()
	{
		return emergency_contacts;
	}
}

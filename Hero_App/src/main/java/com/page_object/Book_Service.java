package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base_Utility;

public class Book_Service extends Base_Utility {
	public Book_Service() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc ='Services']")
	private WebElement Services;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_name']")
	private WebElement Vehicle_brand_Name;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_license_no']")
	private WebElement Vehicle_license_no;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_nickname']")
	private WebElement Vehicle_Nick_Name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_nextservice']")
	private WebElement next_service_info;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/service_date_lbl']")
	private WebElement service_date_time;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement Book_Service_button;

	public WebElement Services() {
		return Services;
	}

	public WebElement Vehicle_brand_Name() {
		return Vehicle_brand_Name;
	}

	public WebElement Vehicle_Nick_Name() {
		return Vehicle_Nick_Name;
	}
	public WebElement Vehicle_license_no()
	{
		return Vehicle_license_no;
	}
	public WebElement next_service_info() {
		return next_service_info;
	}

	public WebElement service_date_time() {
		return service_date_time;
	}
	public WebElement Book_Service_button()
	{
		return Book_Service_button;
	}
	//*********************************Book_service************************************************
	@FindBy(xpath ="//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/tv_select_date']")
	private WebElement select_date;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_date']")
	private WebElement Selected_date;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/date']")
	private List<WebElement> pick_date;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_select_time']")
	private WebElement select_time;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_time']")
	private WebElement Selected_time;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/centerName']")
	private WebElement center_Name;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/centerAddress']")
	private WebElement center_Address;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/keyArrow']")
	private WebElement Center_keyArrow;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl']")
	private WebElement Select_service_center;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement back_btn;
	@FindBy(xpath ="//android.widget.RadioButton[@resource-id ='com.customerapp.hero:id/radio2']")
	private WebElement Service_Type;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/checkBoxText1']")
	private List<WebElement> Customer_Requests;
	@FindBy(xpath ="//android.widget.EditText[@resource-id ='com.customerapp.hero:id/otherIssuesEdt']")
	private WebElement Additional_Instructions;
	public WebElement select_date()
	{
		return select_date;
	}
	public WebElement Selected_date()
	{
		return Selected_date;
	}
	public void pick_date()
	{
		for(int i =0;i<pick_date.size();i++)
		{
			Custom_click(pick_date.get(i),pick_date.get(i).getText());
		}
	}
	public WebElement select_time()
	{
		return select_time;
	}
	public WebElement Selected_time()
	{
		return Selected_time;
	}
	public WebElement center_Name()
	{
		return center_Name;
	}
	public WebElement center_Address()
	{
		return center_Address;
	}
	public WebElement Center_keyArrow()
	{
		return Center_keyArrow;
	}
	public WebElement Select_service_center()
	{
		return Select_service_center;
	}
	public WebElement back_btn()
	{
		return back_btn;
	}
	public WebElement Service_Type()
	{
		return Service_Type;
	}
	public void Customer_Requests()
	{
		for(int i=0;i<Customer_Requests.size();i++)
		{
			Custom_click(Customer_Requests.get(i), Customer_Requests.get(i).getText());
			i++;
		}
	}
	public WebElement Additional_Instructions()
	{
		return Additional_Instructions;
	}
 //*********************************Review Service Details************************************************
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement Review_Service_Details_button;
	@FindBy(xpath ="//android.widget.TextView[contains(@resource-id , 'com.customerapp.hero:id/')]")
	private List<WebElement> Service_Details;
	@FindBy(xpath ="//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/cancel_button']")
	private WebElement cancel_button;
	@FindBy(xpath ="//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/btn_lay']")
	private WebElement Book_service_button;
	public WebElement Review_Service_Details_button()
	{
		return Review_Service_Details_button;
	}
	public void Service_Details()
	{
		for(int i=0;i<Service_Details.size()-2;i++)
		{
			msg(Service_Details.get(i),Service_Details.get(i).getText());
		}
	}
	public WebElement cancel_button()
	{
		return cancel_button;
	}
	public WebElement Book_service_button()
	{
		return Book_service_button;
	}
}

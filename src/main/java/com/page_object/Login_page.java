package com.page_object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.utility.Base_Utility;
@Listeners(com.utility.listner.class)
public class Login_page extends Base_Utility {
	public Login_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//android.widget.ImageView[@content-desc=\"Cancel\"]")
	private WebElement close;
	@FindBy(id = "com.customerapp.hero:id/text_input_editext")
	private WebElement mobile_No;
	@FindBy(xpath = "//android.widget.Button[@resource-id = 'com.android.permissioncontroller:id/permission_allow_foreground_only_button']")
	private WebElement While_using_the_app;
	@FindBy(xpath ="//android.widget.Button[@resource-id ='com.android.permissioncontroller:id/permission_deny_button']")
	private WebElement deny;
	@FindBy(xpath ="//android.widget.Button[@text='OK']")
	private WebElement ok;
	@FindBy(xpath ="//android.widget.Button[@resource-id ='com.android.settings:id/button1']")
	private WebElement open;
	@FindBy(xpath ="//android.widget.Button[@resource-id ='android:id/button1']")
	private WebElement allow;
	@FindBy(xpath = "//android.widget.Button[@resource-id ='com.android.permissioncontroller:id/permission_allow_button']")
	private WebElement Allow;
	@FindBy(id= "com.customerapp.hero:id/cus_orange_button_lay")
	private WebElement continue_button;
	@FindBy(className ="android.widget.EditText")
	private List<WebElement> OTP;
	@FindBy(xpath ="//android.widget.TextView[@text ='Resend']")
	private WebElement resend_button;
	@FindBy(xpath ="//android.widget.TextView[@text = 'Verify']")
	private WebElement verify_button;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_title']")
	private WebElement Wrong_mobile_message;
	@FindBy(xpath ="(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl'])[1]")
	private WebElement Cancel_pop;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/user_no_lbl']")
	private WebElement registered_mobile_no;
	@FindBy(xpath ="//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/term_nd_cond_lbl']")
	private WebElement Terms_of_Use;
	@FindBy(xpath ="(//android.view.View[@text])[23]")
	private WebElement Terms_of_Use_condition;
	@FindBy(xpath ="(//android.widget.TextView[@text])[6]")
	private WebElement Terms_of_Use_condition_for_real_device;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/pp_lbl']")
	private WebElement Privacy_Policy;
	@FindBy(xpath="(//android.view.View[@text])[16]")
	private WebElement Privacy_Policy_condition;
	@FindBy(xpath ="//android.widget.TextView[@text = 'Contact Us']")
	private WebElement contact_us;
	@FindBy(xpath ="(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/fb_text'])[1]")
	private WebElement contact_us_message;
	@FindBy(xpath="//android.widget.ImageView[@resource-id = 'com.customerapp.hero:id/back_btn']")
	private WebElement back_page;
	@FindBy(id ="com.customerapp.hero:id/edit_phn_no_btn")
	private WebElement edit_moble_button;
	public WebElement close()
	{
		return close;
	}
	public WebElement While_using_the_app()
	{
		return While_using_the_app;
	}
	public WebElement open()
	{
		return open;
	}
	public WebElement ok()
	{
		return ok;
	}
	public WebElement allow()
	{
		return allow;
	}
public WebElement Allow()
{
	return Allow;
}
public WebElement deny()
{
	return deny;
}
	public WebElement mobile_No()
	{
		return mobile_No;
	}
	public WebElement Cancel_pop()
	{
		return Cancel_pop;
	}
	public WebElement continue_button()
	{
		return continue_button;
	}
		public void enter_Valid_OTP()
	{
		for(int i=0;i<OTP.size();i++)
		{
			custom_sendkeys(OTP.get(i), ""+(i+1), "enterOTP =" +(i+1));
		}
	}
		public void enter_inavalid_OTP()
		{
			for(int i=0,j=3;i<OTP.size();i++,j++)
			{
				custom_sendkeys(OTP.get(i), ""+(j+1), "OTP is " +(j+1));
			}
		}
		public WebElement resend_button()
		{
			return resend_button;
		}
		public WebElement verify_button()
		{
			return verify_button;
		}
		public WebElement Wrong_mobile_message()
		{
			return Wrong_mobile_message;
		}
		public WebElement registered_mobile_no()
		{
			return registered_mobile_no;
		}
		public WebElement Terms_of_Use()
		{
			return Terms_of_Use;
		}
		public WebElement Terms_of_Use_condition()
		{
			return Terms_of_Use_condition;
		}
		public WebElement Terms_of_Use_condition_for_real_device()
		{
			return Terms_of_Use_condition_for_real_device;
		}
		public WebElement Privacy_Policy()
		{
			return Privacy_Policy;
		}
		public WebElement Privacy_Policy_condition()
		{
			return Privacy_Policy_condition;
		}
		public WebElement contact_us_message()
		{
			return contact_us_message;
		}
		public WebElement contact_us()
		{
			return contact_us;
		}
		public WebElement back_page()
		{
			return back_page;
		}
		public WebElement edit_moble_button()
		{
			return edit_moble_button;
		}
		
}

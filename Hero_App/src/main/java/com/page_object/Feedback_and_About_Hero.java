package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base_Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Feedback_and_About_Hero extends Base_Utility{
	
	public Feedback_and_About_Hero()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id ='com.customerapp.hero:id/hmcDashboardFrg']")
	private WebElement home;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/side_menu_btn']")
	private WebElement side_menu_button;
	@FindBy(xpath ="(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/rv_item_lbl'])[7]")
	private WebElement feedback;
	@FindBy(xpath ="(//android.widget.ImageButton[@content-desc='Show dropdown menu'])[1]")
	private WebElement Category;
	@FindBy(xpath ="(//android.widget.ImageButton[@content-desc='Show dropdown menu'])[2]")
	private WebElement Sub_Category;
	@FindBy(xpath ="(//android.widget.ImageButton[@content-desc='Show dropdown menu'])[3]")
	private WebElement Sub_Sub_Category;
	@FindBy(xpath ="//android.widget.EditText[@resource-id ='com.customerapp.hero:id/et_your_feedback']")
	private WebElement feedback_message;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement submit_feedback;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement back_btn;
	public WebElement home() {
		return home;
	}

	public WebElement side_menu_button() {
		return side_menu_button;
	}
	public WebElement feedback()
	{
		return feedback;
	}
	public WebElement Category()
	{
		return Category;
	}

	public WebElement Sub_Category()
	{
		return Sub_Category;
	}
	
	public WebElement Sub_Sub_Category()
	{
		return Sub_Sub_Category;
	}
	public WebElement feedback_message()
	{
		return feedback_message;
	}
	public WebElement submit_feedback()
	{
		return submit_feedback;
	}
	public WebElement back_btn()
	{
		return back_btn;
	}
	
	//************************************************About Hero***************************************
	@FindBy(xpath ="(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/rv_item_lbl'])[8]")
	private WebElement about_hero;
	@FindBy(xpath ="//android.view.View[@resource-id='container-6a13db6644']/android.view.View")
	private WebElement about_hero_message_1;
	@FindBy(xpath ="//android.widget.TextView[contains(@text,'Manufacturing Happiness')]")
	private WebElement about_hero_message_1_real;
	@FindBy(xpath ="//android.view.View[@resource-id='container-6a13db6644']/android.widget.TextView")
	private WebElement about_hero_message_2;
	@FindBy(xpath ="(//android.view.View[@resource-id='container-6a13db6644']/android.widget.TextView)[2]")
	private WebElement about_hero_message_2_real;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/cross']")
	private WebElement Cross_button;
	public WebElement about_hero()
	{
		return about_hero;
	}
	public WebElement about_hero_message_1()
	{
		return about_hero_message_1;
	}
	public WebElement about_hero_message_1_real()
	{
		return about_hero_message_1_real;
	}
	public WebElement about_hero_message_2()
	{
		return about_hero_message_2;
	}
	public WebElement about_hero_message_2_real()
	{
		return about_hero_message_2_real;
	}
	public WebElement Cross_button()
	{
		return Cross_button;
	}
	//**********************************************Wheels of_Trust_Select_State*********************************
	@FindBy(xpath ="//androidx.recyclerview.widget.RecyclerView[@resource-id ='com.customerapp.hero:id/sideMenuOffer']//android.widget.ImageView")
	private WebElement goodlife;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl']")
	private WebElement goodlife_page_test;
	@FindBy(xpath ="//android.view.View[@resource-id ='cookieNotice']")
	private WebElement cookieNotice;
	@FindBy(xpath ="//android.widget.Button[@text ='I Understand']")
	private WebElement Accept_cookie;
	@FindBy(xpath ="//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/iv_trust']")
	private WebElement wheels_of_trust;
	@FindBy(xpath ="//android.widget.RadioButton[@resource-id ='eng_lang_select']")
	private WebElement Language_select;
	@FindBy(xpath ="(//android.view.View[contains(@text , 'Vehicle')])[1]")
	private WebElement Vehicle_Details;
	@FindBy(xpath ="//android.view.View[@resource-id ='QRCodeState']")
	private WebElement State;
	@FindBy(xpath ="//android.widget.CheckedTextView[@resource-id ='android:id/text1']")
	private List<WebElement> Select_State;
	public WebElement goodlife()
	{
		return goodlife;
	}
	public WebElement goodlife_page_test()
	{
		return goodlife_page_test;
	}
	public WebElement wheels_of_trust()
	{
		return wheels_of_trust;
	}
	public WebElement Language_select()
	{
		return Language_select;
	}
	public WebElement Vehicle_Details()
	{
		return Vehicle_Details;
	}
	public WebElement State()
	{
		return State;
	}
	public void Select_State(String State_Name)
	{
		for(int i=0;i<Select_State.size();i++)
		{
			String State_name = Select_State.get(i).getText();
			if(State_name.equalsIgnoreCase(State_Name))
			{
				Custom_click(Select_State.get(i), State_name);
				break;
			}
			else
			{
				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if(i== (Select_State.size()-1))
				{
					Select_State.get(i).click();
					State.click();
					i=0;
				}
			}
		}
	}
	public WebElement cookieNotice()
	{
		return cookieNotice;
	}
	public WebElement Accept_cookie()
	{
		return Accept_cookie;
	}
 //**********************************************Wheels of_Trust_Select_city*********************************
	@FindBy(xpath ="//android.view.View[@resource-id ='QRCodeCity']")
	private WebElement City;
	@FindBy(xpath ="//android.widget.CheckedTextView[@resource-id ='android:id/text1']")
	private List<WebElement> Select_city;
	@FindBy(xpath ="//android.widget.EditText[@resource-id = 'pincode']")
	private WebElement Pincode;
	@FindBy(xpath ="//android.view.View[contains(@text , 'Select Two')]")
	private WebElement Two_Wheeler;
	@FindBy(xpath ="//android.widget.Image[@text = 'motorcycle']")
	private WebElement motorcycle;
	public WebElement City()
	{
		return City;
	}
	public void Select_city(String State_Name)
	{
		for(int i=0;i<Select_city.size();i++)
		{
			String State_name = Select_city.get(i).getText();
			if(State_name.equalsIgnoreCase(State_Name))
			{
				Custom_click(Select_city.get(i), State_name);
				break;
			}
			else
			{
				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if(i== (Select_city.size()-1))
				{
					Select_city.get(i).click();
					City.click();
					i=0;
				}
			}
		}
	}
	public WebElement Pincode()
	{
		return Pincode;
	}
	public WebElement Two_Wheeler()
	{
		return Two_Wheeler;
	}
	public WebElement motorcycle()
	{
		return motorcycle;
	}
	//**********************************************Wheels of_Trust_Select_company*********************************
	@FindBy(xpath ="//android.view.View[@resource-id ='QRcodeMake']")
	private WebElement Company;
	@FindBy(xpath ="//android.widget.CheckedTextView[@resource-id ='android:id/text1']")
	private List<WebElement> Select_Company;
	public WebElement Company()
	{
		return Company;
	}
	public void Select_Company(String State_Name)
	{
		for(int i=0;i<Select_Company.size();i++)
		{
			String State_name = Select_Company.get(i).getText();
			if(State_name.equalsIgnoreCase(State_Name))
			{
				Custom_click(Select_Company.get(i), State_name);
				break;
			}
			else
			{
				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if(i== (Select_Company.size()-1))
				{
					Select_Company.get(i).click();
					Company.click();
					i=0;
				}
			}
		}
	}
	//**********************************************Wheels of_Trust_Select_Model*********************************
	@FindBy(xpath ="//android.view.View[@resource-id ='QRCodeModel']")
	private WebElement Model;
	@FindBy(xpath ="//android.widget.CheckedTextView[@resource-id ='android:id/text1']")
	private List<WebElement> Select_Model;
	@FindBy(xpath ="//android.widget.EditText[@resource-id ='datepicker-view-mode']")
	private WebElement enter_registraction_months_and_Years;
	@FindBy(xpath ="//android.widget.Button[@text ='Next']")
	private WebElement next_button;
	public WebElement Model()
	{
		return Model;
	}
	public void Select_Model(String State_Name)
	{
		for(int i=0;i<Select_Model.size();i++)
		{
			String State_name = Select_Model.get(i).getText();
			if(State_name.equalsIgnoreCase(State_Name))
			{
				Custom_click(Select_Model.get(i), State_name);
				break;
			}
			else
			{
				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
				if(i== (Select_Model.size()-1))
				{
					Select_Model.get(i).click();
					Model.click();
					i=0;
				}
			}
		}
	}
	public WebElement enter_registraction_months_and_Years()
	{
		return enter_registraction_months_and_Years;
	}
	public WebElement next_button()
	{
		return next_button;
	}
	//**********************************************Wheels of_Trust_Verify_Vehicle_Condition*********************************
	@FindBy(xpath ="//android.view.View[contains(@text ,'silencer')]")
	private WebElement silencer;
	@FindBy(xpath ="//android.widget.RadioButton[@resource-id ='smokeYes']")
	private WebElement silencer_smoke;
	@FindBy(xpath ="//android.view.View[contains(@text , 'Starting')]")
	private WebElement Starting_Vehicle;
	@FindBy(xpath ="//android.view.View[contains(@text , 'Check')]")
	private WebElement How_to_check_all_issue;
	@FindBy(xpath ="//android.widget.TextView[contains(@text , 'How to')]")
	private WebElement How_to_check_all_issue_real;
	@FindBy(xpath ="//android.view.View[contains(@text ,'We are happy to assist')]")
	private WebElement issue_message;
	@FindBy(xpath ="//android.widget.TextView[contains(@text ,'We are happy to assist')]")
	private WebElement issue_message_real;
	@FindBy(xpath ="//android.view.View[@text ='×']")
	private WebElement close_issue_instraction;
	@FindBy(xpath ="//android.widget.TextView[@text ='×']")
	private WebElement close_issue_instraction_real;
	@FindBy(xpath ="//android.widget.RadioButton[@resource-id ='startYes']")
	private WebElement Start_normally;
	@FindBy(xpath ="//android.view.View[contains(@text , 'Lights & Indicators')]")
	private WebElement Light_Indicators;
	@FindBy(xpath ="//android.widget.RadioButton[@resource-id ='WorkingYes']")
	private WebElement Light_Indicators_condition;
	@FindBy(xpath="//android.view.View[contains(@text , 'Front Tyre')]")
	private WebElement Front_Tyre;
	@FindBy(xpath ="//android.widget.RadioButton[@resource-id ='fronTtyreOk']")
	private WebElement Front_Tyre_condition;
	@FindBy(xpath="//android.view.View[contains(@text , 'Rear Tyre')]")
	private WebElement Rear_Tyre;
	@FindBy(xpath ="//android.widget.RadioButton[@resource-id ='rearTyreOk']")
	private WebElement Rear_Tyre_condition;
	@FindBy(xpath ="//android.view.View[contains(@text , 'Body Parts')]")
	private WebElement Body_Parts;
	@FindBy(xpath="//android.widget.RadioButton[@resource-id ='bodyPartOk']")
	private WebElement Body_Parts_condition;
	public WebElement silencer()
	{
		return silencer;
	}
	public WebElement silencer_smoke()
	{
		return silencer_smoke;
	}
	public WebElement Starting_Vehicle()
	{
		return Starting_Vehicle;
	}
	public WebElement How_to_check_all_issue()
	{
		return How_to_check_all_issue;
	}
	public WebElement How_to_check_all_issue_real()
	{
		return How_to_check_all_issue_real;
	}
	public WebElement issue_message()
	{
		return issue_message;
	}
	public WebElement issue_message_real()
	{
		return issue_message_real;
	}
	public WebElement close_issue_instraction()
	{
		return close_issue_instraction;
	}
	public WebElement close_issue_instraction_real()
	{
		return close_issue_instraction_real;
	}
	public WebElement Start_normally()
	{
		return Start_normally;
	}
	public WebElement Light_Indicators()
	{
		return Light_Indicators;
	}
	public WebElement Light_Indicators_condition()
	{
		return Light_Indicators_condition;
	}
	public WebElement Front_Tyre()
	{
		return Front_Tyre;
	}
	public WebElement Front_Tyre_condition()
	{
		return Front_Tyre_condition;
	}
	public WebElement Rear_Tyre()
	{
		return Rear_Tyre;
	}
	public WebElement Rear_Tyre_condition()
	{
		return Rear_Tyre_condition;
	}
	public WebElement Body_Parts()
	{
		return Body_Parts;
	}
	public WebElement Body_Parts_condition()
	{
		return Body_Parts_condition;
	}
	//*************************************Wheels of_Trust_Verify_Your_Details*****************************
	@FindBy(xpath ="//android.view.View[contains(@text,'Sign in')]")
	private WebElement sign_in;
	@FindBy(xpath ="//android.widget.TextView[contains(@text,'Sign in')]")
	private WebElement sign_in_real;
	@FindBy(xpath ="(//android.widget.Image[contains(@text ,'whatsapp')])[1]")
	private WebElement whatsapp_button;
	@FindBy(xpath ="//android.view.View[@resource-id ='root']//android.view.View")
	private List<WebElement> whatsapp_info;
	@FindBy(xpath ="//android.view.View[@resource-id ='root']//android.widget.TextView")
	private List<WebElement> whatsapp_info_real;
	@FindBy(xpath ="//android.view.View[@text ='✕']")
	private WebElement whatsapp_close;
	@FindBy(xpath ="//android.widget.TextView[@text ='✕']")
	private WebElement whatsapp_close_real;
	@FindBy(xpath ="//android.view.View[contains(@text ,'Login')]")
	private WebElement Login;
	@FindBy(xpath ="//android.widget.TextView[contains(@text ,'Login')]")
	private WebElement Login_real;
	@FindBy(xpath ="//android.widget.EditText[@resource-id ='name']")
	private WebElement name;
	@FindBy(xpath ="//android.widget.EditText[@resource-id ='number']")
	private WebElement number;
	@FindBy(xpath ="//android.widget.EditText[@resource-id ='otp']")
	private WebElement otp;
	@FindBy(xpath="//android.widget.Button[@resource-id ='sendOtpQrcode']")
	public WebElement send_otp;
	@FindBy(xpath ="//android.view.View[contains(@text,'Please enter')]")
	public WebElement otp_message;
	@FindBy(xpath ="//android.widget.TextView[contains(@text,'Please enter')]")
	public WebElement otp_message_real;
	@FindBy(xpath ="//android.widget.Button[@text ='Submit']")
	public WebElement submit;
	public WebElement sign_in()
	{
		return sign_in;
	}
	public WebElement sign_in_real()
	{
		return sign_in_real;
	}
	public WebElement whatsapp_button()
	{
		return whatsapp_button;
	}
	public void whatsapp_info()
	{
		for(int i=1;i<4;i++)
		{
			msg(whatsapp_info.get(i),whatsapp_info.get(i).getText());
		}
	}
	public void whatsapp_info_real()
	{
		for(int i=0;i<3;i++)
		{
			msg(whatsapp_info_real.get(i),whatsapp_info_real.get(i).getText());
		}
	}
	public WebElement whatsapp_close()
	{
		return whatsapp_close;
	}
	public WebElement whatsapp_close_real()
	{
		return whatsapp_close_real;
	}
	public WebElement Login()
	{
		return Login;
	}
	public WebElement Login_real()
	{
		return Login_real;
	}
	public WebElement name()
	{
		return name;
	}
	public WebElement number()
	{
		return number;
	}
	public WebElement otp()
	{
		return otp;
	}
	public WebElement otp_message_real()
	{
		return otp_message_real;
	}
	public WebElement send_otp()
	{
		return send_otp;
	}
	public WebElement submit()
	{
		return submit;
	}
	public WebElement otp_message()
	{
		return otp_message;
	}
	//**********************************************Joyride*********************************
	@FindBy(xpath ="//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/iv_joyride']")
	private WebElement Joyride;
	@FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id')]")
	private List<WebElement> Joyride_info;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement nearest_dealer;
	public WebElement Joyride()
	{
		return Joyride;
	}
	public void Joyride_info()
	{
		for(int i=1;i<Joyride_info.size()-1;i++)
		{
		msg(Joyride_info.get(i),Joyride_info.get(i).getText());
		}
	}
	public WebElement nearest_dealer()
	{
		return nearest_dealer;
	}
}

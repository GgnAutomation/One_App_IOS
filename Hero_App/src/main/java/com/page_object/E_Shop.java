package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base_Utility;

public class E_Shop extends Base_Utility {

	public E_Shop() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Eshop']/android.view.ViewGroup/android.widget.TextView")
	private WebElement E_shop;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/navigation_bar_item_small_label_view'])[3]")
	private WebElement E_shop_pCloudy;
	@FindBy(xpath = "//android.view.View[@content-desc='cart']")
	private WebElement shoping_cart;
	@FindBy(xpath="//android.view.View[contains(@text,'You have no items')]")
	private WebElement shoping_cart_items;
	@FindBy(xpath = "//android.view.View[@content-desc='wishlist']")
	private WebElement wishlist;
	@FindBy(xpath = "//android.view.View[@resource-id ='block-customer-login-heading']")
	private WebElement customer_login_heading;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='block-customer-login-heading']")
	private WebElement customer_login_heading_real;
	@FindBy(xpath="//android.view.View[contains(@text,'If you have an account')]")
	private WebElement registered_custombers_message;
	@FindBy(xpath="//android.widget.TextView[contains(@text,'If you have an account')]")
	private WebElement registered_custombers_message_real;
	@FindBy(xpath = "//android.widget.EditText[@resource-id ='email']")
	private WebElement enter_email_or_mobile_number;
	@FindBy(xpath ="//android.view.View[@content-desc='Continue']")
	private WebElement Continue_button;
	@FindBy(xpath ="//android.view.View[contains(@text, 'Verify your mobile')]")
	private WebElement verify_mobile;
	@FindBy(xpath ="//android.widget.TextView[contains(@text, 'Verify your mobile')]")
	private WebElement verify_mobile_real;
	@FindBy(xpath ="//android.view.View[contains(@text,'Please enter 4-Digit OTP')]")
	private WebElement verify_mobile_message;
	@FindBy(xpath ="//android.widget.TextView[contains(@text,'Please enter 4-Digit OTP')]")
	private WebElement verify_mobile_message_real;
	@FindBy(xpath ="//android.view.View[@resource-id ='otp-pop-up-close']")
	private WebElement otp_pop_up_close;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='otp-pop-up-close']")
	private WebElement otp_pop_up_close_real;
	@FindBy(xpath ="//android.view.View[@resource-id ='block-new-customer-heading']")
	private WebElement new_customer_heading;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='block-new-customer-heading']")
	private WebElement new_customer_heading_real;
	@FindBy(xpath ="//android.view.View[@content-desc= 'CREATE AN ACCOUNT']/android.widget.TextView")
	private WebElement Create_Account;
	public WebElement E_shop()
	{
		return E_shop;
	}
	public WebElement E_shop_pCloudy()
	{
		return E_shop_pCloudy;
	}
	public WebElement shoping_cart()
	{
		return shoping_cart;
	}
	public WebElement shoping_cart_items()
	{
		return shoping_cart_items;
	}
	public WebElement wishlist()
	{
		return wishlist;
	}
	public WebElement customer_login_heading()
	{
		return customer_login_heading;
	}
	public WebElement customer_login_heading_real()
	{
		return customer_login_heading_real;
	}
	public WebElement registered_custombers_message()
	{
		return registered_custombers_message;
	}
	public WebElement registered_custombers_message_real()
	{
		return registered_custombers_message_real;
	}
	public WebElement enter_email_or_mobile_number()
	{
		return enter_email_or_mobile_number;
	}
	public WebElement Continue_button()
	{
		return Continue_button;
	}
	public WebElement verify_mobile()
	{
		return verify_mobile;
	}
	public WebElement verify_mobile_real()
	{
		return verify_mobile_real;
	}
	public WebElement verify_mobile_message()
	{
		return verify_mobile_message;
	}
	public WebElement verify_mobile_message_real()
	{
		return verify_mobile_message_real;
	}
	public WebElement otp_pop_up_close()
	{
		return otp_pop_up_close;
	}
	public WebElement otp_pop_up_close_real()
	{
		return otp_pop_up_close_real;
	}
	public WebElement new_customer_heading()
	{
		return new_customer_heading;
	}
	public WebElement new_customer_heading_real()
	{
		return new_customer_heading_real;
	}
	public WebElement Create_Account()
	{
		return Create_Account;
	}
	//*********************************** new_customers ******************************
	@FindBy(xpath ="//android.view.View[@content-desc='javascript:void(0);']")
	private WebElement user_account;
	@FindBy(xpath ="//android.view.View[@resource-id = 'block-new-customer-heading']")
	private WebElement newcustomer_heading;
	@FindBy(xpath ="//android.widget.TextView[@resource-id = 'block-new-customer-heading']")
	private WebElement newcustomer_heading_real;
	@FindBy(xpath ="//android.view.View[contains(@text,'Creating an account')]")
	private WebElement newcustomer_message1;
	@FindBy(xpath ="//android.widget.TextView[contains(@text,'Creating an account')]")
	private WebElement newcustomer_message1_real;
	@FindBy(xpath="//android.widget.TextView[contains(@text ,'See order and')]")
	private WebElement newcustomer_message2;
	@FindBy(xpath ="//android.widget.TextView[contains(@text ,'Track order')]")
	private WebElement newcustomer_message3;
	@FindBy(xpath ="//android.widget.TextView[contains(@text ,'Check out faster')]")
	private WebElement newcustomer_message4;
	@FindBy(xpath ="//android.view.View[@content-desc='Create an Account']/android.widget.TextView")
	private WebElement create_account;
	@FindBy(xpath ="//android.widget.EditText[@resource-id = 'firstname']")
	private WebElement firstname;
	@FindBy(xpath ="//android.widget.EditText[@resource-id = 'lastname']")
	private WebElement lastname;
	@FindBy(xpath ="//android.widget.CheckBox[@resource-id ='is_subscribed']")
	private WebElement CheckBox;
	@FindBy(xpath ="//android.widget.EditText[@resource-id ='mobile']")
	private WebElement mobile;
	@FindBy(xpath ="//android.view.View[@content-desc='Get OTP']/android.widget.TextView")
	private WebElement OTP;
	@FindBy(xpath ="//android.widget.EditText[@resource-id ='email_address']")
	private WebElement email_address;
	@FindBy(xpath ="//android.widget.CheckBox[@resource-id ='custom-checkbox']")
	private WebElement checkbox_for_T_and_C;
	@FindBy(xpath="//android.widget.Button[@resource-id ='register-submit']")
	private WebElement create_an_account;
	@FindBy(xpath ="//android.widget.TextView[@text ='BACK']")
	private WebElement back_button;
	@FindBy(xpath ="//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement back;
	public WebElement user_account()
	{
		return user_account;
	}
	public WebElement newcustomer_heading()
	{
		return newcustomer_heading;
	}
	public WebElement newcustomer_heading_real()
	{
		return newcustomer_heading_real;
	}
	public WebElement newcustomer_message1()
	{
		return newcustomer_message1;
	}
	public WebElement newcustomer_message1_real()
	{
		return newcustomer_message1_real;
	}
	public WebElement newcustomer_message2()
	{
		return newcustomer_message2;
	}
	public WebElement newcustomer_message3()
	{
		return newcustomer_message3;
	}
	public WebElement newcustomer_message4()
	{
		return newcustomer_message4;
	}
	public WebElement create_account()
	{
		return create_account;
	}
	public WebElement firstname()
	{
		return firstname;
	}
	public WebElement lastname()
	{
		return lastname;
	}
	public WebElement CheckBox()
	{
		return CheckBox;
	}
	public WebElement mobile()
	{
		return mobile;
	}
	public WebElement email_address()
	{
		return email_address;
	}
	public WebElement OTP()
	{
		return OTP;
	}
	public WebElement checkbox_for_T_and_C()
	{
		return checkbox_for_T_and_C;
	}
	public WebElement create_an_account()
	{
		return create_an_account;
	}
	public WebElement back_button()
	{
		return back_button;
	}
	public WebElement back()
	{
		return back;
	}
	@FindBy(xpath ="//android.view.View[@text ='']")
	private WebElement Side_menu;
	@FindBy(xpath ="//android.view.View[@content-desc='HOME']")
	private WebElement HOME;
	@FindBy(xpath="//android.view.View[contains(@resource-id,'menu')]")
	private List<WebElement> All_menu_inside_side_menu;
	@FindBy(xpath="//android.view.View[@content-desc]/android.widget.TextView")
	private List<WebElement> list_of_name;
	@FindBy(xpath="//android.view.View[contains(@text,'₹')]")
	private List<WebElement> list_of_price;
	public WebElement Side_menu()
	{
		return Side_menu;
	}
	public void All_menu_inside_side_menu()
	{
		for(int i=2;i<All_menu_inside_side_menu.size();i++)
		{
			String menu_name = All_menu_inside_side_menu.get(i).getText();
		 if(i==2 ||i==3)
			{
				Custom_click(All_menu_inside_side_menu.get(i), menu_name);
				for(int j=0 ,k=i;j<list_of_price.size()-1;j++)
				{
					Message(list_of_name.get(k).getText() +" = " + list_of_price.get(j).getText());
					k++;
				}
				Custom_click(All_menu_inside_side_menu.get(i), menu_name);
			}
		 else
			{
			 Message(menu_name);
			}
		}
	}
	public WebElement HOME()
	{
		return HOME;
	}
}

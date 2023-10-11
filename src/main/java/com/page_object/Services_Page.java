package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base_Utility;

public class Services_Page extends Base_Utility {
	public Services_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc ='Services']")
	private WebElement Services;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_name']")
	private WebElement Vehicle_brand_Name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_nickname']")
	private WebElement Vehicle_Nick_Name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_license_no']")
	private WebElement Vehicle_Number;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_service_type']")
	private WebElement Vehicle_Service_type;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_service_booking_no']")
	private WebElement Vehicle_service_booking_no;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_nextservice']")
	private WebElement next_service_info;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/service_date_lbl']")
	private WebElement service_date_time;

	public WebElement Services() {
		return Services;
	}

	public WebElement Vehicle_brand_Name() {
		return Vehicle_brand_Name;
	}

	public WebElement Vehicle_Nick_Name() {
		return Vehicle_Nick_Name;
	}

	public WebElement Vehicle_Number() {
		return Vehicle_Number;
	}

	public WebElement Vehicle_Service_type() {
		return Vehicle_Service_type;
	}

	public WebElement Vehicle_service_booking_no() {
		return Vehicle_service_booking_no;
	}

	public WebElement next_service_info() {
		return next_service_info;
	}

	public WebElement service_date_time() {
		return service_date_time;
	}

//*********************************************verify_Dealer_information********************************
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id , 'com.customerapp.hero:id/tv_dealer')]")
	private List<WebElement> dealer_info;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement navigate_button;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/distance_text']")
	private WebElement dealer_distance;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement back_button;

	public void dealer_info() {
		try {
			Message("Dealer name =" + dealer_info.get(0).getText());
			Message("Dealer Address =" + dealer_info.get(1).getText());
			Custom_click(dealer_info.get(0), dealer_info.get(0).getText());
			Custom_click(navigate_button, navigate_button.getText());
//	Custom_click(navigate_button, navigate_button.getText());	// for pcloudy comment this line and below one
//	msg("Dealer distance =" +dealer_distance.getText());
		} catch (Exception e) {
			Message("Dealer name is not given" +e);
				}
		driver.navigate().back();
	}

	public WebElement back_button() {
		return back_button;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_rm']")
	private WebElement manager_type;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_rm_name']")
	private WebElement manager_name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_rm_phone']")
	private WebElement manage_phone_number;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/iv_call']")
	private WebElement call_manager;

	public WebElement manager_type() {
		return manager_type;
	}

	public WebElement manager_name() {
		return manager_name;
	}

	public WebElement manage_phone_number() {
		return manage_phone_number;
	}

	public WebElement call_manager() {
		return call_manager;
	}

//*********************************************View_Service_Schedule********************************
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/service_schedule_lay']")
	private WebElement Service_Schedule;
	@FindBy(xpath = "//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/tv_km']")
	private WebElement Kilometer;
	@FindBy(xpath="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_daystext']")
	private WebElement Days;
	@FindBy(xpath = "//android.widget.SeekBar[@content-desc ='Value, 0']")
	private WebElement Kilometer_750;
	@FindBy(xpath ="//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id')]")
	private List<WebElement> Service_schedule;
	@FindBy(xpath ="//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_subtitle']")
	private List<WebElement> Service_schedule_subtitle;
	@FindBy(xpath ="//android.widget.TextView[@text ='15.5k km']")
	private WebElement KM_15500;
	@FindBy(xpath ="//android.widget.TextView[@text ='18.5k km']")
	private WebElement KM_18500;
	@FindBy(xpath ="//android.widget.TextView[@text ='21.5k km']")
	private WebElement KM_21500;
	@FindBy(xpath ="//android.widget.TextView[@text ='24.5k km']")
	private WebElement KM_24500;
	@FindBy(xpath ="//android.widget.TextView[@text ='27.5k km']")
	private WebElement KM_27500;
	@FindBy(xpath ="//android.widget.TextView[@text = '560+ days']")
	private WebElement days_560;
	@FindBy(xpath ="//android.widget.TextView[@text = '660+ days']")
	private WebElement days_660;
	@FindBy(xpath ="//android.widget.TextView[@text = '760+ days']")
	private WebElement days_760;
	@FindBy(xpath ="//android.widget.TextView[@text = '860+ days']")
	private WebElement days_860;
	@FindBy(xpath ="//android.widget.TextView[@text = '960+ days']")
	private WebElement days_960;
	public WebElement Service_Schedule() {
		return Service_Schedule;
	}
	public WebElement KM_15500()
	{
		return KM_15500;
	}
	public WebElement KM_18500()
	{
		return KM_18500;
	}
	public WebElement KM_21500()
	{
		return KM_21500;
	}
	public WebElement KM_24500()
	{
		return KM_24500;
	}
	public WebElement KM_27500()
	{
		return KM_27500;
	}
	public WebElement Kilometer() {
		return Kilometer;
	}
	public WebElement Days()
	{
		return Days;
	}
	public WebElement days_560()
	{
		return days_560;
	}
	public WebElement days_660()
	{
		return days_660;
	}
	public WebElement days_760()
	{
		return days_760;
	}
	public WebElement days_860()
	{
		return days_860;
	}
	public WebElement days_960()
	{
		return days_960;
	}
	public WebElement Kilometer_750() {
		return Kilometer_750;
	}
	public void Service_schedule()
	{
		int i =0;
		try {
			Thread.sleep(2000);
		for(i=4;i<Service_schedule.size();i++)
		{
			if(i<10)
			{
			Message(Service_schedule.get(i).getText() + " = " +Service_schedule.get(i+3).getText());
			if(i==6)
			{
				i=9;
			}
			}
			else if(i>=10)
			{
				String Service_heading = Service_schedule.get(i).getText();
				Custom_click(Service_schedule.get(i), Service_heading);
				for(int j=0;j<Service_schedule_subtitle.size();j++)
				{
					Message(Service_schedule_subtitle.get(j).getText());
				}
				Custom_click(Service_schedule.get(i),Service_heading);
			}
		}
		}catch(Exception IndexOutOfBoundsException)
		{
			Message("" + Service_schedule.size()+" = " +i);
		}
		
	}
	public void Service_schedule_More_Than_15500()
	{
		int i =0;
		try {
			Thread.sleep(2000);
			for(i=5;i<Service_schedule.size();i++)
		{
			if(i<11)
			{
				Message(Service_schedule.get(i).getText() + " = " +Service_schedule.get(i+3).getText());
			if(i==7)
			{
				i=10;
			}
			}
			else if(i>=11)
			{
				String Service_heading = Service_schedule.get(i).getText();
				Custom_click(Service_schedule.get(i), Service_heading);
				for(int j=0;j<Service_schedule_subtitle.size();j++)
				{
					Message(Service_schedule_subtitle.get(j).getText());
				}
				Custom_click(Service_schedule.get(i),Service_heading);
			}
		}
		}catch(Exception IndexOutOfBoundsException)
		{
			Message("" + Service_schedule.size()+" = " +i);
		}
	}
//*********************************************Last Serviced********************************
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id= 'com.customerapp.hero:id/service_history_lay']")
	private WebElement Last_serviced_history;
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

	public WebElement Last_serviced_history() {
		return Last_serviced_history;
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

	public void Service_history() throws InterruptedException {
		for (int i = 0; i < Service_history.size(); i++) {
			try {
				String service_info = Service_history.get(i).getText();
				if (service_info.equalsIgnoreCase("Details")) {
					Custom_click(Service_history.get(i), service_info);
					Message("Vehicle brand name in Service details= " + service_brand_name.getText());
					Message("Vehicle Serial number in Service details  = " + service_seral_no.getText());
					try {
						if (sevice_center_info.get(0).isDisplayed() == true) {
							Message("Service center name =" + sevice_center_info.get(0).getText());

						}
					} catch (Exception e) {
						Message("Service center name is not given");
					}
					Message("Service center address =" + sevice_center_info.get(1).getText());
					Message("******************Job card , Completion date & price ************************");
					Message("Estimated Amount =" + Estimated_Amount.getText());
					Message("Estimated Date & Time =" + Estimated_Date_Time.getText());
					if (invoice.getText().equalsIgnoreCase("Download invoice")) {
						Custom_click(invoice, "Download invoice");
						Thread.sleep(6000);
					}
					try {
						Custom_click(invoice, "view invoice");
						Thread.sleep(2000);
						Message("invoice number =" + invoice_number.getText());
						driver.navigate().back();
					} catch (Exception e) {
						Message("Not able to download invoice");
					}
					support_information();
					Custom_click(collapse_arrow, "collapse Key arrow in");
					Custom_click(collapse_arrow, "collapse Key arrow out");
					Custom_click(call_supporter, " call supporter ");
					driver.navigate().back();
					driver.navigate().back();
					driver.navigate().back();
					Custom_click(back_button, Service_history.get(0).getText());
			} else {
				Message(service_info);
				}
			} catch (Exception e) {
				Message("" + e);
			}
		}
	}

//*********************************************Tips & DIY********************************
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/tips_diy_constraint_lay']")
	private WebElement Tips_and_DIY;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'com.customerapp.hero:id')]")
	private List<WebElement> tips_list;
	@FindBy(xpath = "//android.widget.ImageView[@content-desc ='PDF PAGE']")
	private WebElement image_verify;
	@FindBy(xpath = "//android.widget.TextView[@text ='DIY Videos']")
	private WebElement DIY_Videos_button;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/lbl')]")
	private List<WebElement> DIY_Videos_list;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/play_pause_button']")
	private WebElement play_video;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/cross_btn']")
	private WebElement Video_close_button;

	public WebElement Tips_and_DIY() {
		return Tips_and_DIY;
	}

	public void tips_list() throws InterruptedException {
		for (int i = 1; i < tips_list.size(); i++) {
			try {
			String tips = tips_list.get(i).getText();
			Message(tips);
			Custom_click(tips_list.get(i), tips);
			Thread.sleep(5000);
			if (image_verify.isDisplayed()) {
				Message(tips + " PDF image is available for guide");
			} else {
				Message(tips + " PDF image is not available for guide");
			}
			Custom_click(back_button, "Back from " + tips);
			i++;
			}catch(Exception e)
			{
				Message(""+e);
				
			}
		}
	}

	public WebElement DIY_Videos_button() {
		return DIY_Videos_button;
	}

	public void DIY_Videos_list() throws InterruptedException {
		for (int i = 2; i < DIY_Videos_list.size(); i++) {
			try {
				String video = DIY_Videos_list.get(i).getText();
				Message(video + " Video");
				i++;
				Custom_click(DIY_Videos_list.get(i), video);
				Thread.sleep(3000);
				Custom_click(play_video, video + " Play video");
				Thread.sleep(1000);
				Custom_click(Video_close_button, video + " close");
				i++;

			} catch (Exception e) {
				Message("" + e);

			}
		}
	}
}

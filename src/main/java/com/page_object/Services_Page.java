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

	// *********************************Book_service************************************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement Book_Service_button;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_date']")
	private WebElement Selected_date;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/date']")
	private List<WebElement> pick_date;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_select_time']")
	private WebElement select_time;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/centerName']")
	private WebElement center_Name;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/centerAddress']")
	private WebElement center_Address;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/keyArrow']")
	private WebElement Center_keyArrow;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl']")
	private WebElement Select_service_center;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement back_btn;
	@FindBy(xpath = "//android.widget.RadioButton[@resource-id ='com.customerapp.hero:id/radio2']")
	private WebElement Service_Type;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/checkBoxText1']")
	private List<WebElement> Customer_Requests;
	@FindBy(xpath = "//android.widget.EditText[@resource-id ='com.customerapp.hero:id/otherIssuesEdt']")
	private WebElement Additional_Instructions;

	public WebElement Book_Service_button() {
		return Book_Service_button;
	}

	public WebElement Selected_date() {
		return Selected_date;
	}

	public void pick_date() {
		for (int i = 0; i < pick_date.size(); i++) {
			Custom_click(pick_date.get(i), pick_date.get(i).getText());
		}
	}

	public WebElement select_time() {
		return select_time;
	}

	public WebElement center_Name() {
		return center_Name;
	}

	public WebElement center_Address() {
		return center_Address;
	}

	public WebElement Center_keyArrow() {
		return Center_keyArrow;
	}

	public WebElement Select_service_center() {
		return Select_service_center;
	}

	public WebElement back_btn() {
		return back_btn;
	}

	public WebElement Service_Type() {
		return Service_Type;
	}

	public void Customer_Requests() {
		for (int i = 0; i < Customer_Requests.size(); i++) {
			Custom_click(Customer_Requests.get(i), Customer_Requests.get(i).getText());
			i++;
		}
	}

	public WebElement Additional_Instructions() {
		return Additional_Instructions;
	}

	// ********************Review Service Details********************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement Review_Service_Details_button;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id , 'com.customerapp.hero:id/')]")
	private List<WebElement> Service_Details;
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/cancel_button']")
	private WebElement cancel_button;
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/btn_lay']")
	private WebElement Book_service_button;

	public WebElement Review_Service_Details_button() {
		return Review_Service_Details_button;
	}

	public void Service_Details() {
		for (int i = 0; i < Service_Details.size() - 2; i++) {
			msg(Service_Details.get(i), " ");
		}
	}

	public WebElement cancel_button() {
		return cancel_button;
	}

	public WebElement Book_service_button() {
		return Book_service_button;
	}

	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl'])[1]")
	private WebElement Confirm_Book;

	public WebElement Confirm_Book() {
		return Confirm_Book;
	}

//*********************************************Serviced booked information********************************
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id')]")
	private List<WebElement> Service_booked_info;

	public void Service_booked_info() {
		for (int i = 1; i < Service_booked_info.size() - 1; i++) {
			Message(Service_booked_info.get(i).getText());
		}
	}

	public void Service_rescheduled_info() {
		for (int i = 13; i < Service_booked_info.size() - 1; i++) {
			Message(Service_booked_info.get(i).getText());
		}
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/btn_lbl']")
	private WebElement Go_back_to_home;

	public WebElement Go_back_to_home() {
		return Go_back_to_home;
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
			driver.navigate().back();
//	Custom_click(navigate_button, navigate_button.getText());	// for pcloudy comment this line and below one
//	msg("Dealer distance =" +dealer_distance.getText());
		} catch (Exception e) {
			Message("Dealer name is not given" + e);
		}
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

//**************************************verify_Reschedule_Service**************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/btn_lbl' and @text='Reschedule']")
	private WebElement Reschedule_service_btn;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/tv')]")
	private List<WebElement> booked_info;
	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.customerapp.hero:id/rv_date']//android.widget.TextView")
	private List<WebElement> select_date;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_time']")
	private WebElement Selected_time;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/btn_lbl' and @text='Confirm']")
	private WebElement confirm_btn;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/btn_lbl' and @text='Cancel']")
	private WebElement cancel_btn;

	public WebElement Reschedule_service_btn() {
		return Reschedule_service_btn;
	}

	public void booked_info() {
		for (int i = 0; i < booked_info.size() - 1; i++) {
			msg(booked_info.get(i), "");
		}
	}

	public void select_date() {
		for (int i = 0; i < select_date.size(); i++) {
			Custom_click(select_date.get(i + 1), select_date.get(i + 1).getText() + "/" + select_date.get(i).getText()
					+ " " + select_date.get(i + 2).getText());
			i++;
			i++;
		}
	}

	public WebElement Selected_time() {
		return Selected_time;
	}

	public WebElement confirm_btn() {
		return confirm_btn;
	}

	public WebElement cancel_btn() {
		return cancel_btn;
	}

//**************************************verify_Cancel_Service**************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/btn_lbl' and starts-with(@text,'Cancel')]")
	private WebElement cancel_service_btn;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_title']")
	private WebElement cancel_title;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/textMessage']")
	private WebElement cancel_message;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/btn_lbl' and @text='Yes']")
	private WebElement yes_button;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/btn_lbl' and @text='No']")
	private WebElement No_button;
	@FindBy(id = "com.customerapp.hero:id/tv_title")
	private WebElement cancel_info1;

	public WebElement cancel_info1() {
		return cancel_info1;
	}

	@FindBy(id = "com.customerapp.hero:id/textMessage")
	private WebElement cancel_info2;

	public WebElement cancel_info2() {
		return cancel_info2;
	}

	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/iv_close']")
	private WebElement cancel_pop;

	public WebElement cancel_pop() {
		return cancel_pop;
	}

	public WebElement cancel_service_btn() {
		return cancel_service_btn;
	}

	public WebElement cancel_title() {
		return cancel_title;
	}

	public WebElement cancel_message() {
		return cancel_message;
	}

	public WebElement yes_button() {
		return yes_button;
	}

	public WebElement No_button() {
		return No_button;
	}

//*********************************************View_Service_Schedule********************************
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/service_schedule_lay']")
	private WebElement Service_Schedule;
	@FindBy(xpath = "//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/tv_km']")
	private WebElement Kilometer;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_daystext']")
	private WebElement Days;
	@FindBy(xpath = "//android.widget.SeekBar[@content-desc ='Value, 0']")
	private WebElement Kilometer_750;
	@FindBy(xpath = "//android.widget.TextView[@text ='750']")
	private WebElement value_750;
	@FindBy(xpath = "//android.widget.TextView[@text ='3500']")
	private WebElement value_3500;
	@FindBy(xpath = "//android.widget.TextView[@text ='6500']")
	private WebElement value_6500;
	@FindBy(xpath = "//android.widget.TextView[@text ='9500']")
	private WebElement value_9500;
	@FindBy(xpath = "//android.widget.TextView[@text ='12500']")
	private WebElement value_12500;
	@FindBy(xpath = "//android.widget.TextView[starts-with(@text ,'+12.5')]")
	private WebElement value_12500k;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id')]")
	private List<WebElement> Service_schedule;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/tv_subtitle']")
	private List<WebElement> Service_schedule_subtitle;
	@FindBy(xpath = "//android.widget.TextView[@text ='15.5k km']")
	private WebElement KM_15500;
	@FindBy(xpath = "//android.widget.TextView[@text ='18.5k km']")
	private WebElement KM_18500;
	@FindBy(xpath = "//android.widget.TextView[@text ='21.5k km']")
	private WebElement KM_21500;
	@FindBy(xpath = "//android.widget.TextView[@text ='24.5k km']")
	private WebElement KM_24500;
	@FindBy(xpath = "//android.widget.TextView[@text ='27.5k km']")
	private WebElement KM_27500;
	@FindBy(xpath = "//android.widget.TextView[@text ='60']")
	private WebElement days_60;
	@FindBy(xpath = "//android.widget.TextView[@text ='160']")
	private WebElement days_160;
	@FindBy(xpath = "//android.widget.TextView[@text ='260']")
	private WebElement days_260;
	@FindBy(xpath = "//android.widget.TextView[@text ='360']")
	private WebElement days_360;
	@FindBy(xpath = "//android.widget.TextView[@text ='460']")
	private WebElement days_460;
	@FindBy(xpath = "//android.widget.TextView[starts-with(@text ,'+460')]")
	private WebElement days_460_above;
	@FindBy(xpath = "//android.widget.TextView[@text = '560+ days']")
	private WebElement days_560;
	@FindBy(xpath = "//android.widget.TextView[@text = '660+ days']")
	private WebElement days_660;
	@FindBy(xpath = "//android.widget.TextView[@text = '760+ days']")
	private WebElement days_760;
	@FindBy(xpath = "//android.widget.TextView[@text = '860+ days']")
	private WebElement days_860;
	@FindBy(xpath = "//android.widget.TextView[@text = '960+ days']")
	private WebElement days_960;

	public WebElement Service_Schedule() {
		return Service_Schedule;
	}

	public WebElement KM_15500() {
		return KM_15500;
	}

	public WebElement KM_18500() {
		return KM_18500;
	}

	public WebElement KM_21500() {
		return KM_21500;
	}

	public WebElement KM_24500() {
		return KM_24500;
	}

	public WebElement KM_27500() {
		return KM_27500;
	}

	public WebElement Kilometer() {
		return Kilometer;
	}

	public WebElement Days() {
		return Days;
	}

	public WebElement days_560() {
		return days_560;
	}

	public WebElement days_660() {
		return days_660;
	}

	public WebElement days_760() {
		return days_760;
	}

	public WebElement days_860() {
		return days_860;
	}

	public WebElement days_960() {
		return days_960;
	}

	public WebElement Kilometer_750() {
		return Kilometer_750;
	}

	public WebElement days_60() {
		return days_60;
	}

	public WebElement days_160() {
		return days_160;
	}

	public WebElement days_260() {
		return days_260;
	}

	public WebElement days_360() {
		return days_360;
	}

	public WebElement days_460() {
		return days_460;
	}

	public WebElement days_460_above() {
		return days_460_above;
	}

	public WebElement value_750() {
		return value_750;
	}

	public WebElement value_3500() {
		return value_3500;
	}

	public WebElement value_6500() {
		return value_6500;
	}

	public WebElement value_9500() {
		return value_9500;
	}

	public WebElement value_12500() {
		return value_12500;
	}

	public WebElement value_12500k() {
		return value_12500k;
	}

	public void Service_schedule() {
		int i = 0;
		try {
			Thread.sleep(2000);
			for (i = 5; i < 16; i++) {
				if (i < 11) {
					Message(Service_schedule.get(i).getText() + " = " + Service_schedule.get(i + 3).getText());
					if (i == 7) {
						i = 10;
					}
				} else if (i >= 11) {
					String Service_heading = Service_schedule.get(i).getText();
					Custom_click(Service_schedule.get(i), Service_heading);
					for (int j = 0; j < Service_schedule_subtitle.size(); j++) {
						Message(Service_schedule_subtitle.get(j).getText());
					}
					Custom_click(Service_schedule.get(i), Service_heading);
				}
			}
		} catch (Exception IndexOutOfBoundsException) {
			Message("" + Service_schedule.size() + " = " + i);
		}

	}

	public void Service_schedule_More_Than_15500() {
		int i = 0;
		try {
			Thread.sleep(2000);
			for (i = 6; i < 17; i++) {
				if (i < 12) {
					Message(Service_schedule.get(i).getText() + " = " + Service_schedule.get(i + 3).getText());
					if (i == 8) {
						i = 11;
					}
				} else if (i >= 12) {
					String Service_heading = Service_schedule.get(i).getText();
					Custom_click(Service_schedule.get(i), Service_heading);
					for (int j = 0; j < Service_schedule_subtitle.size(); j++) {
						Message(Service_schedule_subtitle.get(j).getText());
					}
					Custom_click(Service_schedule.get(i), Service_heading);
				}
			}
		} catch (Exception IndexOutOfBoundsException) {
			Message("" + Service_schedule.size() + " = " + i);
		}
	}

//*********************************************Last Serviced********************************
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id= 'com.customerapp.hero:id/service_history_lay']")
	private WebElement Last_serviced_history;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/title')]")
	private WebElement Service_title;
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
		try {
			msg(Service_title, "Service info =");
		} catch (Exception e) {
			for (int i = 0; i < Service_history.size(); i++) {
				String service_info = Service_history.get(i).getText();
				if (service_info.equalsIgnoreCase("Details")) {
					Custom_click(Service_history.get(i), service_info);
					Message("Vehicle brand name in Service details= " + service_brand_name.getText());
					Message("Vehicle Serial number in Service details  = " + service_seral_no.getText());
					try {
						if (sevice_center_info.get(0).isDisplayed() == true) {
							Message("Service center name =" + sevice_center_info.get(0).getText());

						}
					} catch (Exception d) {
						Message("Service center name is not given");
					}
					Message("Service center address =" + sevice_center_info.get(1).getText());
					support_information();
					Custom_click(collapse_arrow, "collapse Key arrow in");
					Custom_click(collapse_arrow, "collapse Key arrow out");
					Custom_click(call_supporter, " call supporter ");
					driver.navigate().back();
					driver.navigate().back();
//					driver.navigate().back();
					Custom_click(back_button, Service_history.get(0).getText());
				} else {
					Message(service_info);
				}

			}
		}
	}

//*********************************************Tips & DIY********************************
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id ='com.customerapp.hero:id/tips_diy_constraint_lay']")
	private WebElement Tips_and_DIY;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'com.customerapp.hero:id/lbl')]")
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
		String tips = "";
		Message("" + tips_list.size());
		try {
			for (int i = 1; i < 16; i++) {
				Thread.sleep(1000);
				tips = tips_list.get(i).getText();
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
			}
		} catch (Exception e) {
			Message("" + e);
		}
	}

	public WebElement DIY_Videos_button() {
		return DIY_Videos_button;
	}

	public void DIY_Videos_list() throws InterruptedException {
		try {
			for (int i = 2; i < 12; i++) {

				String video = DIY_Videos_list.get(i).getText();
				Message(video + " Video");
				i++;
				Custom_click(DIY_Videos_list.get(i), video);
				Thread.sleep(3000);
				try {
					Custom_click(play_video, video + " Play video");
					Thread.sleep(1000);
					Custom_click(Video_close_button, video + " close");
					i++;

				} catch (Exception e) {
					Message("" + e);
					Custom_click(Video_close_button, video + " close");
				}
			}
		} catch (Exception e) {
			Message("" + e);
		}
	}
}

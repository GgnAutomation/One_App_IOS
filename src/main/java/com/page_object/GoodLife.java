package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base_Utility;

public class GoodLife extends Base_Utility {
	public GoodLife() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/navigation') and @text='GoodLife']")
	private WebElement GoodLife;
	@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.customerapp.hero:id/SliderDots']/android.widget.ImageView")
	private List<WebElement> SliderDots;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.customerapp.hero:id/goodLifeSlider_imageview']")
	private WebElement goodlife_Slider_image;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl1']")
	private WebElement goodlife_text;

	public WebElement goodLife() {
		return GoodLife;
	}

	public void SliderDots() throws InterruptedException {
		for (int i = 0; i < SliderDots.size(); i++) {
			Custom_click(SliderDots.get(i), "Slider " + (i + 1));
			Thread.sleep(1000);
		}
	}

	public WebElement goodlife_Slider_image() {
		return goodlife_Slider_image;
	}

	public WebElement goodlife_text() {
		return goodlife_text;
	}

//******************************Pro Membership*******************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/planlbl' and @text='Pro']")
	private WebElement plan_name1;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id')]")
	private List<WebElement> plan_info;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/viewPlans']")
	private WebElement viewPlans_arrow;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/tv')]")
	private List<WebElement> membership_plan_info;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/btn_lbl']")
	private WebElement Become_a_pro_member;
	@FindBy(xpath = "//android.widget.CheckBox[@resource-id='com.customerapp.hero:id/goodlifeMemberChkBox']")
	private WebElement MemberChkBox;
	@FindBy(xpath = "//android.widget.CheckBox[@resource-id='com.customerapp.hero:id/radio_button_term2']")
	private WebElement tearms_conditions_ChkBox;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.customerapp.hero:id/back_btn']")
	private WebElement back_btn;

	public WebElement plan_name1() {
		return plan_name1;
	}

	public void plan_info() {
		for (int i = 0; i < plan_info.size(); i++) {
			msg(plan_info.get(i), " ");
		}
	}

	public WebElement viewPlans_arrow() {
		return viewPlans_arrow;
	}

	public void membership_plan_info() {
		for (int i = 0; i < membership_plan_info.size(); i++) {
			msg(membership_plan_info.get(i), " ");
		}
	}

	public WebElement Become_a_pro_member() {
		return Become_a_pro_member;
	}

	public WebElement MemberChkBox() {
		return MemberChkBox;
	}

	public WebElement tearms_conditions_ChkBox() {
		return tearms_conditions_ChkBox;
	}

	public WebElement back_btn() {
		return back_btn;
	}

	// ******************************Silver,Gold & Platinum
	// Membership*******************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/planlbl' and @text='Silver']")
	private WebElement plan_name2;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/planlbl' and @text='Gold']")
	private WebElement plan_name3;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/planlbl' and @text='Platinum']")
	private WebElement plan_name4;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/benefit')]")
	private List<WebElement> plan_benifits;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tv_title' and starts-with(@text,'Experience')]")
	private WebElement ex_surprise;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl2']")
	private WebElement message1;

	public WebElement plan_name2() {
		return plan_name2;
	}

	public WebElement plan_name3() {
		return plan_name3;
	}

	public WebElement plan_name4() {
		return plan_name4;
	}

	public void plan_benifits() {
		for (int i = 0; i < plan_benifits.size(); i++) {
			msg(plan_benifits.get(i), " ");
			if (i == 2) {
				msg(ex_surprise, " ");
			}
		}
	}

	public WebElement message1() {
		return message1;
	}

	// ******************************What’s so Good in Good
	// life?*******************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl3']")
	private WebElement goodLife_message1;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl4']")
	private WebElement goodLife_message2;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/benefit_lbl'and contains(@text,'Welcome e-com.')]")
	private WebElement goodLife_benifit_1;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/benefit_lbl'and contains(@text,'Reward Points on all Service')]")
	private WebElement goodLife_benifit_2;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/benefit_lbl'and contains(@text,'Upto 9000 Upgrade')]")
	private WebElement goodLife_benifit_3;

	public WebElement goodLife_message1() {
		return goodLife_message1;
	}

	public WebElement goodLife_message2() {
		return goodLife_message2;
	}

	public WebElement goodLife_benifit_1() {
		return goodLife_benifit_1;
	}

	public WebElement goodLife_benifit_2() {
		return goodLife_benifit_2;
	}

	public WebElement goodLife_benifit_3() {
		return goodLife_benifit_3;
	}

	// ******************************Ultimate savings*******************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl5']")
	private WebElement Ultimate_savings_title;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/percentageTV')]")
	private List<WebElement> Ultimate_percentage;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tvValue']")
	private List<WebElement> Ultimate_Value;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tvSunDes']")
	private List<WebElement> Ultimate_msg;

	public WebElement Ultimate_savings_title() {
		return Ultimate_savings_title;
	}

	public void ultimate() {
		for (int i = 0; i < Ultimate_percentage.size(); i++) {
			msg(Ultimate_percentage.get(i), "" + " " + Ultimate_Value.get(i).getText());
			msg(Ultimate_msg.get(i), " ");
		}
	}

	// ******************************Exclusive membership
	// offers*******************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl6']")
	private WebElement Exive_mem_offers;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tvMainText']")
	private WebElement Exive_mem_offers_1;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tvSunDes' and contains(@text,'Shopping vouchers')]")
	private WebElement Exive_mem_offers_2;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tvSpecial']")
	private WebElement Exive_mem_offers_3;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tvHeroProduct']")
	private WebElement Exive_mem_offers_4;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tvExperience']")
	private WebElement Exive_mem_offers_5;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tvBikingExpeditions']")
	private WebElement Exive_mem_offers_6;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tvEveryMonth']")
	private WebElement Exive_mem_offers_7;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/tvMember']")
	private WebElement Exive_mem_offers_8;

	public WebElement Exive_mem_offers() {
		return Exive_mem_offers;
	}

	public WebElement Exive_mem_offers_1() {
		return Exive_mem_offers_1;
	}

	public WebElement Exive_mem_offers_2() {
		return Exive_mem_offers_2;
	}

	public WebElement Exive_mem_offers_3() {
		return Exive_mem_offers_3;
	}

	public WebElement Exive_mem_offers_4() {
		return Exive_mem_offers_4;
	}

	public WebElement Exive_mem_offers_5() {
		return Exive_mem_offers_5;
	}

	public WebElement Exive_mem_offers_6() {
		return Exive_mem_offers_6;
	}

	public WebElement Exive_mem_offers_7() {
		return Exive_mem_offers_7;
	}

	public WebElement Exive_mem_offers_8() {
		return Exive_mem_offers_8;
	}

	// ******************************Earning History*******************************
	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc='Earning History']/android.widget.TextView")
	private WebElement Earning_History;
	@FindBy(xpath = "//android.widget.LinearLayout[@resource-id ='com.customerapp.hero:id/linearLayout19']//android.widget.TextView")
	private List<WebElement> Earning_History_value;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id , 'com.customerapp.hero:id/textView')]")
	private List<WebElement> Earning_History_heading;

	public WebElement Earning_History() {
		return Earning_History;
	}

	public void earning_history() {
		try {
			for (int i = 0, j = 0; i < Earning_History_value.size(); i++) {
				Message(Earning_History_heading.get(j).getText() + " = " + Earning_History_value.get(i).getText());
				if (j == 3) {
					j = -1;
				}
				j++;
			}
		} catch (Exception e) {
			Message(" No Earning history ");
		}
	}

	// ******************************Redemption
	// History*******************************
	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc='Redemption History']/android.widget.TextView")
	private WebElement Redemption_History;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/title']")
	private WebElement Redemption_History_value;

	public WebElement Redemption_History() {
		return Redemption_History;
	}

	public WebElement Redemption_History_value() {
		return Redemption_History_value;
	}

	// ******************************Complete Profile*******************************
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/renewal_txt'])[1]")
	private WebElement Profile_text;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/view_detail_btn'])[1]")
	private WebElement update_profile;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl']")
	private WebElement update_profile_text;
	@FindBy(xpath = "//android.widget.Image[@text ='Hero GoodLife']")
	private WebElement profile_goodlife;

	public WebElement Profile_text() {
		return Profile_text;
	}

	public WebElement update_profile() {
		return update_profile;
	}

	public WebElement update_profile_text() {
		return update_profile_text;
	}

	public WebElement profile_goodlife() {
		return profile_goodlife;
	}

	// ******************************Welcome Rewards*******************************
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/renewal_txt'])[2]")
	private WebElement Welcome_text;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/view_detail_btn'])[2]")
	private WebElement View_Details;

	public WebElement Welcome_text() {
		return Welcome_text;
	}

	public WebElement View_Details() {
		return View_Details;
	}

	// ******************************Refer a Friend*******************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/offer_frnd_lbl']")
	private WebElement Referral_Offer;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/points_earning_redemption_view_detail_btn']")
	private WebElement Know_more;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id')]")
	private List<WebElement> Referral_all_offer;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/termCondition']")
	private WebElement term_Condition;

	public WebElement Referral_Offer() {
		return Referral_Offer;
	}

	public WebElement Know_more() {
		return Know_more;
	}

	public void Referral_all_offer() {
		for (int i = 0; i < Referral_all_offer.size() - 1; i++) {
			if (i < 7) {
				msg(Referral_all_offer.get(i), "");
			} else if (i == 7) {
				Custom_click(Referral_all_offer.get(i), Referral_all_offer.get(i).getText());
			}

		}
	}

	public WebElement term_Condition() {
		return term_Condition;
	}

	// ******************************winner
	// information*********************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl7']")
	private WebElement lucky_member;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/lbl8']")
	private WebElement lucky_member_msg;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/view_all_winner']")
	private WebElement winner_of_month;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl1']")
	private WebElement winner_month;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/winner')]")
	private List<WebElement> Winner_info;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/digital_voucher_peice']")
	private WebElement Total_winner;

	public WebElement lucky_member() {
		return lucky_member;
	}

	public WebElement lucky_member_msg() {
		return lucky_member_msg;
	}

	public WebElement winner_of_month() {
		return winner_of_month;
	}

	public WebElement winner_month() {
		return winner_month;

	}

	public void Winner_info() {
		Message("******** Please look some winner name********");
		for (int i = 0; i < Winner_info.size(); i++) {
			msg(Winner_info.get(i), "");
		}
	}

	public WebElement Total_winner() {
		return Total_winner;
	}

//******************************Points Earning & Redemption*******************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl3']")
	private WebElement point_earning_message;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/benefit_lbl' and @text='A rewarding journey for 3 years']")
	private WebElement benifit_1;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/benefit_lbl' and contains(@text,'Earn tier based Reward Points on Service')]")
	private WebElement benifit_2;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/benefit_lbl' and contains(@text,'Redeem points to get vouchers of service')]")
	private WebElement benifit_3;
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.customerapp.hero:id/view_btn']")
	private WebElement View_details_arrow;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/points_earning_redemption_view_detail_btn']")
	private List<WebElement> points_earning_redemption_view_detail;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl19']")
	private WebElement Tier3_message;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/lbl13']")
	private WebElement Tier3_distance;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id/lbl')]")
	private List<WebElement> point_earn_condition;
	@FindBy(xpath = "//android.widget.TextView[@resource-id = 'com.customerapp.hero:id/lbl3']")
	private List<WebElement> Tier3_distance_message;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/thats_not_end_lbl1']")
	private WebElement point_earning_end_message;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement back_button;

	public WebElement point_earning_message() {
		return point_earning_message;
	}

	public void points_earning_redemption_view_detail() {
		for (int i = 0; i < points_earning_redemption_view_detail.size(); i++) {
			String name = points_earning_redemption_view_detail.get(i).getText();
			if (name.equalsIgnoreCase("View Details")) {
				Custom_click(points_earning_redemption_view_detail.get(i), "points earning redemption" + name);
			}
		}
	}

	public WebElement benifit_1() {
		return benifit_1;
	}

	public WebElement benifit_2() {
		return benifit_2;
	}

	public WebElement benifit_3() {
		return benifit_3;
	}

	public WebElement View_details_arrow() {
		return View_details_arrow;
	}

	public WebElement Tier3_message() {
		return Tier3_message;
	}

	public void point_earn_condition() {
		try {
			for (int i = 0; i < point_earn_condition.size() - 1; i++) {
				if (i < 3) {
					msg(point_earn_condition.get(i), "");
				} else if (i >= 3 && i <= 12) {
					msg(point_earn_condition.get(i), "" + " = " + point_earn_condition.get(i + 1).getText());
					i++;
				} else if (i == 13) {
					msg(point_earn_condition.get(i), "");
				} else if (i >= 14 && i <= 24) {
					Message(point_earn_condition.get(i).getText() + " = " + point_earn_condition.get(i + 1).getText());
					i++;
				} else {
					break;
				}
			}
		} catch (Exception e) {
			Message("" + e);
		}
	}

	public void Tier3_distance_message() {
		int size = Tier3_distance_message.size();
		Message(Tier3_distance.getText() + " = " + Tier3_distance_message.get(size - 1).getText());
	}

	public WebElement point_earning_end_message() {
		return point_earning_end_message;
	}

	public WebElement back_button() {
		return back_button;
	}

	// ******************************show_more_service_privilegers*******************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/down_ic_btn']")
	private WebElement show_more_service_privilegers;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/benefit_lbl']")
	private List<WebElement> service_previleges_all_message;

	public WebElement show_more_service_privilegers() {
		return show_more_service_privilegers;
	}

	public void service_previleges_all_message() {
		for (int i = 0; i < service_previleges_all_message.size(); i++) {
			Message(service_previleges_all_message.get(i).getText());
		}
	}

	// ******************************Benefits and
	// Experiences****************************
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/down_ic_btn'])[2]")
	private WebElement show_more_Benefits_and_Experiences;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/benefit_lbl']")
	private List<WebElement> Benefits_message;

	public WebElement show_more_Benefits_and_Experiences() {
		return show_more_Benefits_and_Experiences;
	}

	public void Benefits_message() {
		for (int i = 2; i < Benefits_message.size(); i++) {
			Message(Benefits_message.get(i).getText());
		}
	}

	// ******************************Remarkable Rewards
	// *******************************
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/down_ic_btn'])[3]")
	private WebElement Show_more_in_remarkable_rewards;
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/benefit_lbl']")
	private List<WebElement> Remarkable_Rewards_message;

	public WebElement Show_more_in_remarkable_rewards() {
		return Show_more_in_remarkable_rewards;
	}

	public void Remarkable_Rewards_message() {
		for (int i = 2; i < Remarkable_Rewards_message.size(); i++) {
			Message(Remarkable_Rewards_message.get(i).getText());
		}
	}

}

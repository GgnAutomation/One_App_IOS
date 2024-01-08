package Page_Test;

import org.testng.annotations.Test;

import com.page_object.GoodLife;
import com.utility.Base_Utility;

public class GoodLife_test extends Base_Utility {

	public GoodLife ob;
	public Login_Page_Test login;
	String version = config_getdata("version");
	String device = config_getdata("Platform_name");

	@Test(priority = 0)
	public void TC100_verify_image_in_goodlife_page() throws InterruptedException {
		Message("*********************Goodlife_page**************************");
		ob = new GoodLife();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(3000);
		Custom_click(ob.goodLife(), ob.goodLife().getText());
		Thread.sleep(2000);
		ob.SliderDots();
		msg(ob.goodlife_text(), "Look below all " + ob.goodlife_text().getText());
	}

	@Test(priority = 1)
	public void TC101_Verify_Pro_Membership() throws InterruptedException {
		Custom_click(ob.plan_name1(), ob.plan_name1().getText());
		ob.plan_info();
		Custom_click(ob.viewPlans_arrow(), "View plans arrow");
		Thread.sleep(2000);
		Custom_click(ob.Become_a_pro_member(), ob.Become_a_pro_member().getText());
		Custom_click(ob.MemberChkBox(), ob.MemberChkBox().getText());
		Custom_click(ob.tearms_conditions_ChkBox(), "Tearms and Condition agreement check box ");
		Custom_click(ob.back_btn(), "Back from Profile form");
		Custom_click(ob.back_btn(), "Back from GoodLife plans");
	}

	@Test(priority = 2)
	public void TC102_Verify_Silver_Membership() throws InterruptedException {
		Custom_click(ob.plan_name2(), ob.plan_name2().getText());
		ob.plan_info();
		Custom_click(ob.viewPlans_arrow(), "View plans arrow");
		Thread.sleep(2000);
		Custom_click(ob.Become_a_pro_member(), ob.Become_a_pro_member().getText());
		Custom_click(ob.back_btn(), "Back from Profile form");
		Custom_click(ob.back_btn(), "Back from GoodLife plans");
	}

	@Test(priority = 3)
	public void TC103_Verify_Gold_Membership() throws InterruptedException {
		Custom_click(ob.plan_name3(), ob.plan_name3().getText());
		ob.plan_info();
		Custom_click(ob.viewPlans_arrow(), "View plans arrow");
		Thread.sleep(2000);
		Custom_click(ob.Become_a_pro_member(), ob.Become_a_pro_member().getText());
		Custom_click(ob.back_btn(), "Back from Profile form");
		Custom_click(ob.back_btn(), "Back from GoodLife plans");
	}

	@Test(priority = 4)
	public void TC104_Verify_Platinum_Membership() throws InterruptedException {
		Scroll_down_page_Action("Platinum");
		Custom_click(ob.plan_name4(), ob.plan_name4().getText());
		ob.plan_info();
		Custom_click(ob.viewPlans_arrow(), "View plans arrow");
		Thread.sleep(2000);
		Custom_click(ob.Become_a_pro_member(), ob.Become_a_pro_member().getText());
		Custom_click(ob.back_btn(), "Back from Profile form");
		Custom_click(ob.back_btn(), "Back from GoodLife plans");
	}

	@Test(priority = 5)
	public void TC105_View_All_Membership_Plan() {
		Custom_click(ob.viewPlans_arrow(), "View All plan infor arrow");
		ob.membership_plan_info();
		Scroll_down_page_Action("Experience surprises");
		ob.plan_benifits();
		Custom_click(ob.back_btn(), "Back from GoodLife plans");
		Message(ob.message1().getText());
		Scroll_down_page_Action("View details");
	}

//	@Test(priority = 2)
//	public void TC095_Verify_Earning_History_in_Pro_Membership()
//	{
//		Custom_click(ob.Earning_History(), ob.Earning_History().getText());
//			ob.earning_history();
//		}
//	@Test(priority = 3)
//	public void TC096_Verify_Redemption_History_in_Pro_Membership()
//	{
//		Custom_click(ob.Redemption_History(), ob.Redemption_History().getText());
//		try {
//		msg(ob.Redemption_History_value(),ob.Redemption_History_value().getText());
//		}catch(Exception e) {
//			Message("Redemption History value is given");
//		}
//		Custom_click(ob.back_button(), " Back from Transaction History");
//		Custom_click(ob.show_more_service_privilegers(), ob.show_more_service_privilegers().getText());
//		}
//	@Test(priority = 4)
//	public void TC097_Verify_Complete_profile()
//	{
//		msg(ob.Profile_text(),ob.Profile_text().getText());
//		Custom_click(ob.update_profile(), ob.update_profile().getText());
//		msg(ob.update_profile_text(),ob.update_profile_text().getText());
//		msg(ob.profile_goodlife(),ob.profile_goodlife().getText());
//		Custom_click(ob.back_button(), " Back from Complete Profile Rewards");
//	}
//	@Test(priority = 5)
//	public void TC098_Verify_Welcome_Rewards()
//	{
//		msg(ob.Welcome_text(),ob.Welcome_text().getText());
//		Custom_click(ob.View_Details(), ob.View_Details().getText());
//		msg(ob.update_profile_text(),ob.update_profile_text().getText());
//		msg(ob.profile_goodlife(),ob.profile_goodlife().getText());
//		Custom_click(ob.back_button(), " Back from Complete Profile Rewards");
//	}
//	@Test(priority = 6)
//	public void TC099_Verify_refer_friend_in_Goodlife() throws InterruptedException
//	{
//		msg(ob.Referral_Offer(),ob.Referral_Offer().getText());
//		if(version.equalsIgnoreCase("11")) {
//		scrollByText("Points Earning & Redemption");  //for pCloudy version 11.0.0 only
//		}
//		Custom_click(ob.Know_more(), ob.Know_more().getText());
//		ob.Referral_all_offer();
//		Thread.sleep(2000);
//		Custom_click(ob.back_button(), " Back from Vehicle Purchase Referral");
//		Custom_click(ob.term_Condition(), ob.term_Condition().getText());
//		Custom_click(ob.back_button(), " Back from Terms of Use");
//		Custom_click(ob.back_button(), " Back from Referrals");
//	}
	@Test(priority = 6)
	public void TC106_verify_Points_Earning_and_Redemption() {
		msg(ob.benifit_1(), ob.benifit_1().getText());
		msg(ob.benifit_2(), ob.benifit_2().getText());
		msg(ob.benifit_3(), ob.benifit_3().getText());
		Custom_click(ob.View_details_arrow(), ob.View_details_arrow().getText());
		ob.point_earn_condition();
		Scroll_down_page_Action("Become a GoodLife Member");
		msg(ob.Tier3_message(), ob.Tier3_message().getText());
		ob.Tier3_distance_message();
		msg(ob.point_earning_end_message(), ob.point_earning_end_message().getText());
		Custom_click(ob.back_button(), " Back from points earning redemption ");
	}

	@Test(priority = 7)
	public void TC107_Whats_so_Good_in_Good_life() {
		Scroll_down_page_Action("View details");
		msg(ob.goodLife_message1(), ob.goodLife_message1().getText());
		msg(ob.goodLife_message2(), ob.goodLife_message2().getText());
		msg(ob.goodLife_benifit_1(), ob.goodLife_benifit_1().getText());
		msg(ob.goodLife_benifit_2(), ob.goodLife_benifit_2().getText());
		msg(ob.goodLife_benifit_3(), ob.goodLife_benifit_3().getText());
	}

	@Test(priority = 8)
	public void TC108_Verify_Ultimate_savings() {
		Scroll_down_page_Action("Exclusive membership offers");
		msg(ob.Ultimate_savings_title(), ob.Ultimate_savings_title().getText());
		ob.ultimate();
	}

	@Test(priority = 9)
	public void TC109_verify_Exclusive_membership_offers() {
		Scroll_down_page_Action("Our Lucky goodlife memebr");
		msg(ob.Exive_mem_offers(), ob.Exive_mem_offers().getText());
		msg(ob.Exive_mem_offers_1(), ob.Exive_mem_offers_1().getText());
		msg(ob.Exive_mem_offers_2(), ob.Exive_mem_offers_2().getText());
		msg(ob.Exive_mem_offers_3(), ob.Exive_mem_offers_3().getText());
		msg(ob.Exive_mem_offers_4(), ob.Exive_mem_offers_4().getText());
		msg(ob.Exive_mem_offers_5(), ob.Exive_mem_offers_5().getText());
		msg(ob.Exive_mem_offers_6(), ob.Exive_mem_offers_6().getText());
		msg(ob.Exive_mem_offers_7(), ob.Exive_mem_offers_7().getText());
		msg(ob.Exive_mem_offers_8(), ob.Exive_mem_offers_8().getText());
	}

	@Test(priority = 10)
	public void TC110_verify_Winner_informaton() {
		Scroll_down_page_Action("View all winners");
		msg(ob.lucky_member(), ob.lucky_member().getText());
		msg(ob.lucky_member_msg(), ob.lucky_member_msg().getText());
		Custom_click(ob.winner_of_month(), ob.winner_of_month().getText());
		msg(ob.winner_month(), "Winner month =" + ob.winner_month().getText());
		ob.Winner_info();
		msg(ob.Total_winner(), "Total =" + ob.Total_winner().getText());
		Custom_click(ob.back_button(), " Back from Winner Of The Month ");
		Custom_click(ob.back_button(), " Back from Good life page ");

	}

//	@Test(priority = 9)
//	public void TC102_verify_Service_Privilegers() {
//		if(version.equalsIgnoreCase("11")) {
//		Scroll_down_page_Action("Service_Privilegers"); // for version 11.0.0
//		}
//		Custom_click(ob.show_more_service_privilegers(), ob.show_more_service_privilegers().getText());
//		ob.service_previleges_all_message();
//		if(version.equalsIgnoreCase("allother")) {
//		scrollByText("Show Less"); // for all other device
//		}
//		Custom_click(ob.show_more_service_privilegers(), ob.show_more_service_privilegers().getText());
//
//	}
//	@Test(priority = 10)
//	public void TC103_verify_Benefits_and_Experiences()
//	{
//		if(version.equalsIgnoreCase("allother")) {
//		Scroll_down_page_Action("Benefits and Experiences");  // for all other device
//		}	
//		Custom_click(ob.show_more_Benefits_and_Experiences(), ob.show_more_Benefits_and_Experiences().getText() +" in Benefits & Experiences" );
//		if(version.equalsIgnoreCase("11")) {
//		scrollByText("Show Less");   // for version 11.0.0
//		}
//		ob.Benefits_message();
//		Scroll_down_page_Action("Benefits and Experiences"); 
//		Custom_click(ob.show_more_Benefits_and_Experiences(), ob.show_more_Benefits_and_Experiences().getText() +" in Benefits & Experiences" );
//		Custom_click(ob.back_button(), " Back from Hero GoodLife ");
//	}
//	@Test(priority = 11)
//	public void TC106_verify_Remarkable_Rewards()
//	{
//		if(version.equalsIgnoreCase("11")) {
//		Scroll_down_page_Action("Remarkable show more"); // for version 11.0.0
//		}
//		Custom_click(ob.Show_more_in_remarkable_rewards(), ob.Show_more_in_remarkable_rewards().getText());
//		Scroll_down_page_Action("Remarkable show Less"); 
//		ob.Remarkable_Rewards_message();
//		Custom_click(ob.show_more_Benefits_and_Experiences(), ob.show_more_Benefits_and_Experiences().getText());
//		Custom_click(ob.back_button(), " Back from Hero GoodLife ");
//	}

}
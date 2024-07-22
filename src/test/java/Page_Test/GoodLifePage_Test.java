package Page_Test;

import org.testng.annotations.Test;

import com.page_object.Goodlifepage;
import com.utility.Base_Utility;

public class GoodLifePage_Test extends Base_Utility {
	public Goodlifepage ob;
	public Login_Page_Test login;
	String version = config_getdata("version");
	String device = config_getdata("Platform_name");

	@Test(priority = 0)
	public void TC107_Verify_goodlife_info() throws InterruptedException {
		Message("*********************Goodlife_page**************************");
		ob = new Goodlifepage();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(5000);
		Custom_click(ob.goodLife(), ob.goodLife().getText());
		Thread.sleep(10000);
		msg(ob.goodlife_msg1(), "ReWared message = ");
		msg(ob.plan_name(), "Plan name ");
		msg(ob.point_value(), "Point Value =");
		Custom_click(ob.Renew_membership(), "Renew Membership");

	}

	@Test(priority = 1)
	public void TC108_View_All_Membership_Plan() {

		ob.membership_plan_info();
		Scroll_down_page_Action("surprises");
		ob.plan_benifits();
	}

	@Test(priority = 2)
	public void TC109_Become_a_Gold_Member() {
		Custom_click(ob.Renew_membership(), ob.Renew_membership().getText());
		Custom_click(ob.Renew_membership(), ob.Renew_membership().getText());
		custom_sendkeys(ob.Nominee_Name(), "Rahul Kumar", "Nominee name");
		Custom_click(ob.Nominee_Relationship_with_Member(), "Nominee Relationship with member");
		Custom_click(ob.Nominee_Relationship_with_Member(), "Nominee Relationship with member");
		driver.navigate().back();
		custom_sendkeys(ob.Nominee_Contact_Number(), "9878098767", "Nominee Contact number");
		driver.navigate().back();
		Custom_click(ob.Nominee_address_same_as_member(), "Check box same address as member");
		Custom_click(ob.back_btn(), "Back from Profile Form nominee details");
		Custom_click(ob.back_btn(), "Back from Profile Form member details");
		Custom_click(ob.back_btn(), "Back from GoodLife plans");

	}

	@Test(priority = 3)
	public void TC110_Verify_Membership_Information() {
		Custom_click(ob.Show_More(), ob.Show_More().getText());
		ob.Membership_info();
	}

	@Test(priority = 4)
	public void TC111_Earning_and_Redemption_History() {
		Custom_click(ob.Earning_and_R_History(), "Earning & Redemption History");
		Custom_click(ob.Earning_History(), "Earning History");
		ob.Earning_History_value();
		Custom_click(ob.Redemption_History(), "Redemption history");
		ob.Earning_History_value();
		Custom_click(ob.back_btn(), "Back from Transaction History");
		Custom_click(ob.Show_More(), ob.Show_More().getText());
	}

	@Test(priority = 5)
	public void TC112_Complete_Profile() throws InterruptedException {
		msg(ob.Complete_Profile(), "");
		msg(ob.Complete_Profile_benifit(), "");
		Custom_click(ob.Update_Profile_btn(), "Update profile button");
		Thread.sleep(3000);
		Custom_click(ob.back_btn(), "Back from Complete Profile Rewards");
	}

	@Test(priority = 6)
	public void TC113_Verify_Welcome_Rewards() throws InterruptedException {
		msg(ob.Welcome_Rewards(), "");
		msg(ob.Welcome_Rewards_benifit(), "");
		Custom_click(ob.View_detail_btn(), "Welcome rewardsa view details button");
		Thread.sleep(3000);
		Custom_click(ob.back_btn(), "Back from Welcome Rewards");

	}

	@Test(priority = 7)
	public void TC114_Verify_refer_friend_in_Goodlife() throws InterruptedException {
		msg(ob.Referral_Offer(), ob.Referral_Offer().getText());
		Scroll_down_page_Action("Winner Of The Month");
		Custom_click(ob.Know_more(), ob.Know_more().getText());
		ob.Referral_all_offer();
		Thread.sleep(2000);
		Custom_click(ob.back_btn(), " Back from Vehicle Purchase Referral");
		Custom_click(ob.term_Condition(), ob.term_Condition().getText());
		Custom_click(ob.back_btn(), " Back from Terms of Use");
		Custom_click(ob.back_btn(), " Back from Referrals");

	}

	@Test(priority = 8)
	public void TC115_Verify_Winner_Of_The_Month() {
		Custom_click(ob.Winner_Of_The_Month(), "Winner of the Month");
		ob.Winner_of_the_month_info();
		Custom_click(ob.back_btn(), " Back from Winner Of The Month");
	}

	@Test(priority = 9)
	public void TC116_verify_Points_Earning_and_Redemption() {
		Scroll_down_page_Action("Points Earning and Redemption view details");
		msg(ob.point_earning_message(), "");
		Custom_click(ob.View_details_arrow(), "Points earning redemption view detail button");
		ob.point_earn_condition();
		Scroll_down_page_Action("Become a GoodLife Member");
		msg(ob.Tier3_message(), " ");
		ob.Tier3_distance_message();
		msg(ob.point_earning_end_message(), " ");
		Custom_click(ob.back_btn(), " Back from points earning redemption ");
	}

	@Test(priority = 10)
	public void TC117_verify_Service_Privilegers() {
		Scroll_down_page_Action("Service Privilegers");
		Custom_click(ob.show_more_service_privilegers(),
				ob.show_more_service_privilegers().getText() + "for view Service Privilegers");
		ob.service_previleges_all_message();
		Custom_click(ob.show_more_service_privilegers(),
				ob.show_more_service_privilegers().getText() + "for collapse Service Privilegers");

	}

	@Test(priority = 11)
	public void TC118_verify_Benefits_and_Experiences() {
		Custom_click(ob.show_more_Benefits_and_Experiences(),
				ob.show_more_Benefits_and_Experiences().getText() + " in Benefits & Experiences");
		scrollByText("Show Less");
		ob.Benefits_message();
		Custom_click(ob.show_more_Benefits_and_Experiences(),
				ob.show_more_Benefits_and_Experiences().getText() + " collapse Benefits & Experiences");
		Custom_click(ob.back_btn(), " Back from Hero GoodLife ");
	}

}

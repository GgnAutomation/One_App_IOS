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
	public void TC095_verify_image_in_goodlife_page() throws InterruptedException {
		Message("*********************Goodlife_page**************************");
		ob = new GoodLife();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(3000);
		Custom_click(ob.goodLife(), ob.goodLife().getText());
		Thread.sleep(2000);
			if (ob.goodlife_image().isDisplayed() == true) {
				Message("Image available on Goodlife page");
			} else {
				Message("Image missing on Good Life ");
			}
			msg(ob.goodlife_text(),ob.goodlife_text().getText());
		
	}
	@Test(priority = 1)
	public void TC096_Verify_Pro_Membership() throws InterruptedException
	{
		msg(ob.plan_name(),"Plan Name =" +ob.plan_name().getText());
		ob.plan_info();
		Custom_click(ob.show_more_service_privilegers(), ob.show_more_service_privilegers().getText());
		ob.pro_membership_plan_info();
	}
	@Test(priority = 2)
	public void TC097_Verify_Earning_History_in_Pro_Membership()
	{
		Custom_click(ob.Earning_History(), ob.Earning_History().getText());
			ob.earning_history();
		}
	@Test(priority = 3)
	public void TC098_Verify_Redemption_History_in_Pro_Membership()
	{
		Custom_click(ob.Redemption_History(), ob.Redemption_History().getText());
		try {
		msg(ob.Redemption_History_value(),ob.Redemption_History_value().getText());
		}catch(Exception e) {
			Message("Redemption History value is given");
		}
		Custom_click(ob.back_button(), " Back from Transaction History");
		Custom_click(ob.show_more_service_privilegers(), ob.show_more_service_privilegers().getText());
		}
	@Test(priority = 4)
	public void TC099_Verify_Complete_profile()
	{
		msg(ob.Profile_text(),ob.Profile_text().getText());
		Custom_click(ob.update_profile(), ob.update_profile().getText());
		msg(ob.update_profile_text(),ob.update_profile_text().getText());
		msg(ob.profile_goodlife(),ob.profile_goodlife().getText());
		Custom_click(ob.back_button(), " Back from Complete Profile Rewards");
	}
	@Test(priority = 5)
	public void TC100_Verify_Welcome_Rewards()
	{
		msg(ob.Welcome_text(),ob.Welcome_text().getText());
		Custom_click(ob.View_Details(), ob.View_Details().getText());
		msg(ob.update_profile_text(),ob.update_profile_text().getText());
		msg(ob.profile_goodlife(),ob.profile_goodlife().getText());
		Custom_click(ob.back_button(), " Back from Complete Profile Rewards");
	}
	@Test(priority = 6)
	public void TC101_Verify_refer_friend_in_Goodlife() throws InterruptedException
	{
		msg(ob.Referral_Offer(),ob.Referral_Offer().getText());
		if(version.equalsIgnoreCase("11")) {
		scrollByText("Points Earning & Redemption");  //for pCloudy version 11.0.0 only
		}
		Custom_click(ob.Know_more(), ob.Know_more().getText());
		ob.Referral_all_offer();
		Thread.sleep(2000);
		Custom_click(ob.back_button(), " Back from Vehicle Purchase Referral");
		Custom_click(ob.term_Condition(), ob.term_Condition().getText());
		Custom_click(ob.back_button(), " Back from Terms of Use");
		Custom_click(ob.back_button(), " Back from Referrals");
	}
	@Test(priority = 7)
	public void TC102_verify_Winner_informaton()
	{	if(version.equalsIgnoreCase("allother")) {
		scrollByText("Points Earning & Redemption"); // All device version 
	}
		Custom_click(ob.winner_of_month(), ob.winner_of_month().getText());
		msg(ob.winner_month(),"Winner month =" +ob.winner_month().getText());
			ob.Winner_info();
			msg(ob.Total_winner(),"Total ="+ob.Total_winner().getText());
			Custom_click(ob.back_button(), " Back from Winner Of The Month ");
		
	}
	
	@Test(priority = 8)
	public void TC103_verify_Points_Earning_and_Redemption() {
		msg(ob.point_earning_message(),ob.point_earning_message().getText());
			ob.points_earning_redemption_view_detail();
			ob.point_earn_condition();
			msg(ob.Tier3_message(),ob.Tier3_message().getText());
			ob.Tier3_distance_message();
			msg(ob.point_earning_end_message(),ob.point_earning_end_message().getText());
			Custom_click(ob.back_button(), " Back from points earning redemption ");
	}
	@Test(priority = 9)
	public void TC104_verify_Service_Privilegers() {
		if(version.equalsIgnoreCase("11")) {
		Scroll_down_page_Action("Service_Privilegers"); // for version 11.0.0
		}
		Custom_click(ob.show_more_service_privilegers(), ob.show_more_service_privilegers().getText());
		ob.service_previleges_all_message();
		if(version.equalsIgnoreCase("allother")) {
		scrollByText("Show Less"); // for all other device
		}
		Custom_click(ob.show_more_service_privilegers(), ob.show_more_service_privilegers().getText());

	}
	@Test(priority = 10)
	public void TC105_verify_Benefits_and_Experiences()
	{
		if(version.equalsIgnoreCase("allother")) {
		Scroll_down_page_Action("Benefits and Experiences");  // for all other device
		}	
		Custom_click(ob.show_more_Benefits_and_Experiences(), ob.show_more_Benefits_and_Experiences().getText() +" in Benefits & Experiences" );
		if(version.equalsIgnoreCase("11")) {
		scrollByText("Show Less");   // for version 11.0.0
		}
		ob.Benefits_message();
		Custom_click(ob.show_more_Benefits_and_Experiences(), ob.show_more_Benefits_and_Experiences().getText() +" in Benefits & Experiences" );
	}
	@Test(priority = 11)
	public void TC106_verify_Remarkable_Rewards()
	{
		if(version.equalsIgnoreCase("11")) {
		Scroll_down_page_Action("Remarkable show more"); // for version 11.0.0
		}
		Custom_click(ob.Show_more_in_remarkable_rewards(), ob.Show_more_in_remarkable_rewards().getText());
		Scroll_down_page_Action("Remarkable show Less"); 
		ob.Remarkable_Rewards_message();
		Custom_click(ob.show_more_Benefits_and_Experiences(), ob.show_more_Benefits_and_Experiences().getText());
		Custom_click(ob.back_button(), " Back from Hero GoodLife ");
	}

}
package Page_Test;

import java.util.LinkedHashMap;
import java.util.Map;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.My_Profile_Page;
import com.utility.Base_Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

@Listeners(com.utility.listner.class)
public class My_Profile_Page_Test extends Base_Utility {
	public Map<String, String> map;
	public Login_Page_Test login;
	public My_Profile_Page ob;
	String device = config_getdata("Platform_name");

	@Test(priority = 0)
	public void TC042_Verify_My_Profile() throws InterruptedException {
		Message("************************My_Profile_Page_Test**************************");
		ob = new My_Profile_Page();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(5000);
		Custom_click(ob.home(), "Home");
		Thread.sleep(2000);
		Custom_click(ob.side_menu_button(), "Side menu button");
		Custom_click(ob.my_profile(), "My profile");
		Thread.sleep(2000);
		msg(ob.user_name(), "User name = ");
		msg(ob.user_mobile_no(), "User mobile number = ");
		try {
			msg(ob.user_email(), "User email = ");
		} catch (Exception e) {
			error_message("Email id does not given");
		}
	}

	@Test(priority = 1)
	public void TC043_Degilocker_info_and_my_Vehicles_info() throws InterruptedException {
		msg(ob.Didi_info(), "Digi info =");
		msg(ob.Vehicle_name(), "Vehicle name =");
		msg(ob.vin_number(), "Vehicle number =");
		Custom_click(ob.vin_number(), "My vehicle");
		Thread.sleep(2000);
		Custom_click(ob.Back(), "Back from My vehicle");
	}

	@Test(priority = 2)
	public void TC044_edit_profile_button() throws InterruptedException {
		Custom_click(ob.edit_profile_details_button(), "Edit profile details button");
		Custom_click(ob.profile_pic_edit_btn(), "profile pic edit button");
		Custom_click(ob.Choose_from_library(), " Chose profile pic from liberary ");
		try {
			if (ob.allow().isDisplayed()) {
				Custom_click(ob.allow(), "Allow");
			}
		} catch (Exception e) {
			Message("No pop given");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Custom_click(ob.profile_pic_edit_btn(), "profile pic edit button");
		Custom_click(ob.Take_a_Photo(), " Take a pic for profile ");
		try {
			if (ob.while_using_the_app().isDisplayed()) {
				Custom_click(ob.while_using_the_app(), "while_using_the_app");
			}
		} catch (Exception e) {
			Message("No pop given");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Custom_click(ob.profile_pic_edit_btn(), "profile pic edit button");
		Custom_click(ob.upload_close_button(), " Upload close button ");

	}

	@Test(priority = 3)
	public void TC045_edit_Personal_Details() throws InterruptedException {
		map = new LinkedHashMap<>();
		map.put("Name", ob.edit_full_name().getText());
		map.put("Email ID", ob.edit_email_id().getText());
		map.put("Registered mobile number", ob.edit_registered_mobile_number().getText());
		custom_sendkeys(ob.edit_full_name(), config_getdata("edit_name_in_personal_detail"), " Change Name");
		driver.navigate().back();
		ob.gender_selection();
		driver.navigate().back();
		custom_sendkeys(ob.edit_email_id(), config_getdata("edit_email_id"), " Change Email id");
		driver.navigate().back();
		Thread.sleep(2000);
		Custom_click(ob.edit_date_of_birth(), " Date of Birth");
		try {
			Custom_click(ob.DOB_edit_button(), "Edit DOB");
		} catch (Exception e) {
			Custom_click(ob.edit_date_of_birth(), " Date of Birth");
			Custom_click(ob.DOB_edit_button(), "Edit DOB");
		}
		ob.send_dob().clear();
		custom_sendkeys(ob.send_dob(), config_getdata("edit_DOB"), "change dob in mm/dd/yyyy");
		if (ob.confirm_dob().isEnabled()) {
			Custom_click(ob.confirm_dob(), " Confirm DOB");
		} else {
			Message("DOB is not accepted " + config_getdata("edit_DOB"));
			Custom_click(ob.Cancel_dob(), " Cancel DOB");
		}

		driver.navigate().back();
		Custom_click(ob.blood_group(), " Blood group");
		Thread.sleep(2000);
		Custom_click(ob.blood_group(), " Blood group");
		Thread.sleep(2000);
		Scroll_down_page_Action("Street name");
		custom_sendkeys(ob.Street_name(), "Jindal colony", "Street name");
		driver.navigate().back();
		Thread.sleep(2000);
		Custom_click(ob.pin_code(), "Pin code");
		ob.pin_code().clear();
		custom_sendkeys(ob.pin_code(), "110027", "Pin code");
		Thread.sleep(2000);
		Custom_click(ob.Save_button(), "Save button");
		try {
			if (ob.edit_profile_details_button().isDisplayed()) {
				Message("Personal Details editd sucessfully");
			}
		} catch (Exception e) {
			Custom_click(ob.Back(), " Back from profile Details");

		}

	}

	@Test(dependsOnMethods = "TC045_edit_Personal_Details()", priority = 4)
	public void TC046_change_original_Personal_Details() throws InterruptedException {
		Custom_click(ob.edit_profile_details_button(), "Edit profile details button");
		custom_sendkeys(ob.edit_full_name(), map.get("Name"), " Original Name");
		driver.navigate().back();
		String email = map.get("Email ID");
		if (email.isBlank()) {
			custom_sendkeys(ob.edit_email_id(), "name@gmail.com", "Original Email id");
		} else {
			custom_sendkeys(ob.edit_email_id(), map.get("Email ID"), "Original Email id");
		}
		driver.navigate().back();
		Thread.sleep(2000);
		Custom_click(ob.Save_button(), "Save button");
		Thread.sleep(3000);

	}

	@Test(priority = 5)
	public void TC047_Manage_License() throws InterruptedException {
		Custom_click(ob.manage_license(), " Manage License");
		Thread.sleep(2000);
		try {
			if (ob.licence_image().isDisplayed()) {
				Message("Manage License is already given");
			}
		} catch (Exception e) {
			Message("Manage License is not given");
			msg(ob.License_verify(), "License verify = ");
			Custom_click(ob.add_Liense_now(), "  Add License now");
			Custom_click(ob.Choose_License_from_library(), ob.Choose_License_from_library().getText());
			Thread.sleep(1000);
			driver.navigate().back();
			Custom_click(ob.add_Liense_now(), "  Add License now");
			Custom_click(ob.Take_License_Photo(), ob.Take_License_Photo().getText());
			Thread.sleep(1000);
			driver.navigate().back();
			Custom_click(ob.add_Liense_now(), "  Add License now");
			Custom_click(ob.Choose_from_Digilocker(), ob.Choose_from_Digilocker().getText());
			Thread.sleep(1000);
			driver.navigate().back();
			Custom_click(ob.add_Liense_now(), " Add License now");
			Custom_click(ob.close_button_for_license_upload(), " Close license upload page");
		}
		Custom_click(ob.Back(), " Back from Driver License");
	}

	@Test(priority = 6)
	public void TC048_Verify_emergency_contacts() throws InterruptedException {
		Scroll_down_page_Action("Emergency contacts");
		Custom_click(ob.emergency_contacts(), "Emergency contacts");
		Thread.sleep(2000);
		try {
			if (ob.License_verify().isDisplayed()) {
				msg(ob.License_verify(), "Emergency contacts = ");
				Custom_click(ob.add_Liense_now(), "  Add Emergency contacts");
				Custom_click(ob.allow(), "Allow Hero App to access your contacts?");
				Custom_click(ob.Back(), " Back from Select Contacts page");
			}
		} catch (Exception e) {
			Message("Emergency contacts is already given");
		}
		Custom_click(ob.Back(), " Back from Emergency Contacts page");
		Custom_click(ob.Back(), " Back from profile Details");

	}
}
package Page_Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.Services_Page;
import com.utility.Base_Utility;

@Listeners(com.utility.listner.class)
public class Services_Page_Test extends Base_Utility {
	public Login_Page_Test login;
	public Services_Page ob;
	String device = config_getdata("Platform_name");
	String version = config_getdata("version");
	@Test(priority = 0)
	public void TC066_Vehicle_details_on_service_page() throws InterruptedException {
		Message("************************Service Page**************************");
		ob = new Services_Page();
//		login = new Login_Page_Test();
//		login.login();
			Thread.sleep(2000);
			Custom_click(ob.Services(), " Services button");
			msg(ob.Vehicle_brand_Name(),"Vehicle brand name = " + ob.Vehicle_brand_Name().getText());
				try {
				msg(ob.Vehicle_Nick_Name(),"Vehicle nick name = " + ob.Vehicle_Nick_Name().getText());
			}catch(Exception e) { Message("Vehicle nick name is not given");}
			try {
				msg(ob.Vehicle_Number(),"Vehicle number =" + ob.Vehicle_Number().getText());
			}catch(Exception e) { Message("Vehicle number is not given");}
		
	}

	@Test(priority = 1)
	public void TC067_verify_service_type() {
			try {
				msg(ob.Vehicle_Service_type(),"Vehicle Service type =" + ob.Vehicle_Service_type().getText());
			}catch(Exception e) { Message("Vehicle Service type is not given");}
			try {
				msg(ob.Vehicle_service_booking_no(),"Vehicle Service booking number = " + ob.Vehicle_service_booking_no().getText());
			}catch(Exception e) { Message("Vehicle Service booking number is not given");}
			String service_status = ob.next_service_info().getText();
			Message("Service status =" + service_status);
			try {
				msg(ob.service_date_time(),"Service date and time =" + ob.service_date_time().getText());
			}catch(Exception e) { Message("Service date and time is not given");}
	}

	@Test(priority = 2)
	public void TC068_verify_Dealer_information() {
		ob.dealer_info();
		}

	@Test(priority = 3)
	public void TC069_Verify_dealer_manager_info() throws InterruptedException {
			try {
			msg(ob.manager_type(),"Manager type =" + ob.manager_type().getText());
			msg(ob.manager_name(),"Manager name =" + ob.manager_name().getText());
			Custom_click(ob.call_manager(), " Call amanger");
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			msg(ob.manage_phone_number(),"Manager contact number =" + ob.manage_phone_number().getText());
			Scroll_down_page_Action("Service Schedule");
				if(ob.Service_Schedule().isDisplayed()) { 
					Message("Service Schedule is visible"); }
			}catch(Exception e) { Message("Manager information is not given");}
			
	}

	@Test(priority = 4)
	public void TC070_View_Service_schedule_750() {
			Custom_click(ob.Service_Schedule(), "View Service Schedule");
			Custom_click(ob.Kilometer(), ob.Kilometer().getText());
			Custom_click(ob.Kilometer_750(), "750 Kilometer");
			ob.Service_schedule();
		}

	@Test(priority = 5)
	public void TC071_View_Service_schedule_3500() {
		if (device.equalsIgnoreCase("realdevice")) {
		swipe_page_direction(46, 295, 159, 295, "3500 Kilometer");	// for real device
		}
		else if (device.equalsIgnoreCase("emulator")) {
			swipe_page_direction(69, 412, 250, 412, "3500 Kilometer");   // for Emulator
		}
		else {
			if(version.equalsIgnoreCase("11")) {
		swipe_page_direction(98, 565, 335, 565, "3500 Kilometer"); 	// for pCloudy device-11
		}
		else {
		swipe_page_direction(98, 465, 240, 465, "3500 Kilometer"); 	// for pCloudy device-13
		}
		}
		ob.Service_schedule();
	}

	@Test(priority = 6)
	public void TC072_View_Service_schedule_6500() {
		if (device.equalsIgnoreCase("realdevice")) {
		swipe_page_direction(159, 295, 290, 295, "6500 Kilometer");	// for real device
		}
		else if (device.equalsIgnoreCase("emulator")) {
			swipe_page_direction(250, 412, 435, 412, "6500 Kilometer"); // for Emulator
		}
		else {
			if(version.equalsIgnoreCase("11")) {
			swipe_page_direction(335, 565, 590, 565, "6500 Kilometer"); 	// for pCloudy device-11
			}
			else {
			swipe_page_direction(240, 465, 440, 465, "6500 Kilometer"); 	// for pCloudy device-13
			}
			}
			ob.Service_schedule();
		}

	@Test(priority = 7)
	public void TC073_View_Service_schedule_9500() {
		if (device.equalsIgnoreCase("realdevice")) {
		swipe_page_direction(290, 295, 416, 295, "9500 Kilometer"); // for real device
		}	else if(device.equalsIgnoreCase("emulator")) {
			swipe_page_direction(435, 412, 620, 412, "9500 Kilometer"); // for emulator
		}
		else {
			if(version.equalsIgnoreCase("11")) {
			swipe_page_direction(590, 565, 840, 565, "9500 Kilometer"); 	// for pCloudy device-11
			}
			else {
			swipe_page_direction(440, 465, 628, 465, "9500 Kilometer"); 	// for pCloudy device-13
			}
		}
			ob.Service_schedule();
		
	}

	@Test(priority = 8)
	public void TC074_View_Service_schedule_12500() {
		if (device.equalsIgnoreCase("realdevice")) {
		swipe_page_direction(416, 295, 545, 295, "12500 Kilometer"); // for real device
		} else if(device.equalsIgnoreCase("emulator")) {
			swipe_page_direction(620, 412, 824, 412, "12500 Kilometer"); // for Emulator
		}
		else {
			if(version.equalsIgnoreCase("11")) {
			swipe_page_direction(840, 565, 1100, 565, "12500 Kilometer"); 	// for pCloudy device -11
			}
			else {
			swipe_page_direction(628, 465, 815, 465, "12500 Kilometer"); 	// for pCloudy device-13
			}
		}
			ob.Service_schedule();
		
	}

	@Test(priority = 9)
	public void TC075_View_Service_schedule_15500() {
		if (device.equalsIgnoreCase("realdevice")) {
		swipe_page_direction(545, 295, 675, 295, "15500 Kilometer"); // for real device
		}  else if(device.equalsIgnoreCase("emulator")) {
			swipe_page_direction(824, 412, 1002, 412, "15500 Kilometer"); // for Emulator
		}
		else {
			if(version.equalsIgnoreCase("11")) {
			swipe_page_direction(1100, 565, 1350, 565, "15500 Kilometer"); 	// for pCloudy device-11
			}
			else {
			swipe_page_direction(815, 465, 1005, 465, "15500 Kilometer"); 	// for pCloudy device-13
			}
		}
			String text = ob.KM_15500().getText();
			Custom_click(ob.KM_15500(), text);
			Message("Paid Service for = " + text);
			ob.Service_schedule_More_Than_15500();
		
	}

	@Test(dependsOnMethods = "TC075_View_Service_schedule_15500()", priority = 10)
	public void TC076_View_Service_schedule_18500() {
		
			String text = ob.KM_18500().getText();
			Custom_click(ob.KM_18500(), text);
			Message("Paid Service for = " + text);
			ob.Service_schedule_More_Than_15500();
		

	}

	@Test(dependsOnMethods = "TC075_View_Service_schedule_15500()", priority = 11)
	public void TC077_View_Service_schedule_21500() {
		
			String text = ob.KM_21500().getText();
			Custom_click(ob.KM_21500(), text);
			Message("Paid Service for = " + text);
			ob.Service_schedule_More_Than_15500();
		
	}

	@Test(dependsOnMethods = "TC075_View_Service_schedule_15500()", priority = 12)
	public void TC078_View_Service_schedule_24500() {
		
			String text = ob.KM_24500().getText();
			Custom_click(ob.KM_24500(), text);
			Message("Paid Service for = " + text);
			ob.Service_schedule_More_Than_15500();
		
	}

	@Test(dependsOnMethods = "TC075_View_Service_schedule_15500()", priority = 13)
	public void TC079_View_Service_schedule_27500() {
	
			String text = ob.KM_27500().getText();
			Custom_click(ob.KM_27500(), text);
			Message("Paid Service for = " + text);
			ob.Service_schedule_More_Than_15500();
		
	}

	@Test(priority = 14)
	public void TC080_View_Service_schedule_60_days() {
		
			Custom_click(ob.Days(), ob.Days().getText());
			if (device.equalsIgnoreCase("emulator")) {
			swipe_page_direction(1002, 412, 69, 412, "60 Days"); // for Emulator
			} else if(device.equalsIgnoreCase("pcloudy")) {
				if(version.equalsIgnoreCase("11")) {
			swipe_page_direction(1357, 565, 98, 565, "60 Days"); // for pCloudy -11
				}
				else {
			swipe_page_direction(1005, 465, 100, 465, "60 Days"); 	// for pCloudy device-13
			try {
			if(ob.Service_Schedule().isDisplayed()) {
			Custom_click(ob.Service_Schedule(), "View Service Schedule"); 
			Custom_click(ob.Days(), ob.Days().getText()); 
			}}catch(Exception e) { }
			}
			}
			ob.Service_schedule();
		
	}

	@Test(priority = 15)
	public void TC081_View_Service_schedule_160_days() {
		if (device.equalsIgnoreCase("realdevice")) {
			swipe_page_direction(46, 295, 159, 295, "160 Days");	// for real device
		} else if(device.equalsIgnoreCase("emulator")) {
		swipe_page_direction(69, 412, 250, 412, "160 Days");     // for Emulator
		}
		else {
			if(version.equalsIgnoreCase("11")) {
			swipe_page_direction(98, 565, 335, 565, "160 Days");    // for pCloudy -11
			}
			else {
			swipe_page_direction(98, 465, 240, 465, "160 Days"); 	// for pCloudy device-13
			}
		}
			ob.Service_schedule();
	
	}

	@Test(priority = 16)
	public void TC082_View_Service_schedule_260_days() {
		if (device.equalsIgnoreCase("realdevice")) {
			swipe_page_direction(159, 295, 290, 295, "260 Days");	// for real device
		}else if(device.equalsIgnoreCase("emulator")) {
			swipe_page_direction(250, 412, 435, 412, "260 Days"); // for Emulator
		} else {
			if(version.equalsIgnoreCase("11")) {
			swipe_page_direction(335, 565, 590, 565, "260 Days"); 	// for pCloudy device
			}
			else {
			swipe_page_direction(240, 465, 440, 465, "260 Days"); 	// for pCloudy device-13
			}
			}
			ob.Service_schedule();
	
	}

	@Test(priority = 17)
	public void TC083_View_Service_schedule_360_days() {
		if (device.equalsIgnoreCase("realdevice")) {
			swipe_page_direction(290, 295, 416, 295, "360 Days"); // for real device
		}else if(device.equalsIgnoreCase("emulator")) {
			swipe_page_direction(435, 412, 620, 412, "360 Days"); // for emulator
		} else {
			if(version.equalsIgnoreCase("11")) {
			swipe_page_direction(590, 565, 840, 565, "360 Days"); 	// for pCloudy device-11
			}
			else {
			swipe_page_direction(440, 465, 628, 465, "360 Days"); 	// for pCloudy device-13
			}
		}
			ob.Service_schedule();
		
	}

	@Test(priority = 18)
	public void TC084_View_Service_schedule_460_days() {
		if (device.equalsIgnoreCase("realdevice")) {
			swipe_page_direction(416, 295, 545, 295, "460 Days"); // for real device
		} else if(device.equalsIgnoreCase("emulator")) {
		    swipe_page_direction(620, 412, 824, 412, "460 Days"); // for Emulator
		}
		else {
			if(version.equalsIgnoreCase("11")) {
			swipe_page_direction(840, 565, 1100, 565, "460 Days"); 	// for pCloudy device-11
			}
			else {
			swipe_page_direction(628, 465, 820, 465, "460 Days"); 	// for pCloudy device-13
			}
		}
			ob.Service_schedule();
		
	}

	@Test(priority = 19)
	public void TC085_View_Service_schedule_560_days() {
		if (device.equalsIgnoreCase("realdevice")) {
			swipe_page_direction(545, 295, 675, 295, "560 Days"); // for real device
		}  else if(device.equalsIgnoreCase("emulator")) {
			swipe_page_direction(824, 412, 1002, 412, "560 Days"); // for Emulator
		}
		else {
			if(version.equalsIgnoreCase("11")) {
			swipe_page_direction(1100, 565, 1350, 565, "560 Days"); 	// for pCloudy device-11
			}
			else {
			swipe_page_direction(820, 465, 1005, 465, "560 Days"); 	// for pCloudy device-13
			}
		}
			String text = ob.days_560().getText();
			Custom_click(ob.days_560(), text);
			Message("Paid Service for = " + text);
			ob.Service_schedule_More_Than_15500();
		
	}

	@Test(dependsOnMethods = "TC085_View_Service_schedule_560_days()", priority = 20)
	public void TC086_View_Service_schedule_660_days() {
	
			String text = ob.days_660().getText();
			Custom_click(ob.days_660(), text);
			Message("Paid Service for = " + text);
			ob.Service_schedule_More_Than_15500();
		
	}

	@Test(dependsOnMethods = "TC085_View_Service_schedule_560_days()", priority = 21)
	public void TC087_View_Service_schedule_760_days() {
	
			String text = ob.days_760().getText();
			Custom_click(ob.days_760(), text);
			Message("Paid Service for = " + text);
			ob.Service_schedule_More_Than_15500();
		
	}

	@Test(dependsOnMethods = "TC085_View_Service_schedule_560_days()", priority = 22)
	public void TC088_View_Service_schedule_860_days() {
		
			String text = ob.days_860().getText();
			Custom_click(ob.days_860(), text);
			Message("Paid Service for = " + text);
			ob.Service_schedule_More_Than_15500();
	
	}

	@Test(dependsOnMethods = "TC085_View_Service_schedule_560_days()", priority = 23)
	public void TC089_View_Service_schedule_960_days() {
		
			String text = ob.days_960().getText();
			Custom_click(ob.days_960(), text);
			Message("Paid Service for = " + text);
			ob.Service_schedule_More_Than_15500();
			try {
			Custom_click(ob.back_button(), " Back from Servie Schedule");
			if(ob.Last_serviced_history().isDisplayed()) { Message("Last service history is visible");}
			}catch (Exception e) {Custom_click(ob.back_button(), " Back from Servie Schedule"); }
		
	}

	@Test(priority = 24)
	public void TC090_Verify_Last_Serviced() throws InterruptedException {
		
			Custom_click(ob.Last_serviced_history(), "Last serviced history");
			Thread.sleep(2000);
			ob.Service_history();
			Custom_click(ob.back_button(), " Back from servie history");
		
	}

	@Test(priority = 25)
	public void TC091_Verify_all_tips_list() throws InterruptedException {
		Scroll_down_page_Action("Tips and DIY");
		Custom_click(ob.Tips_and_DIY(), "Tips and DIY");
		ob.tips_list();
	}

	@Test(priority = 26)
	public void TC092_Verify_all_DIY_Videos_list() throws InterruptedException {
		Custom_click(ob.DIY_Videos_button(), "DIY video button");
		ob.DIY_Videos_list();
		Custom_click(ob.back_button(), " Back from Tips and DIY page");
	}
}

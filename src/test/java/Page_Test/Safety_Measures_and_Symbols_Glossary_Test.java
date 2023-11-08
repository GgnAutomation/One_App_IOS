package Page_Test;

import org.testng.annotations.Test;

import com.page_object.Safety_Measures_and_Symbols_Glossary;
import com.utility.Base_Utility;

public class Safety_Measures_and_Symbols_Glossary_Test extends Base_Utility{
	
	public Safety_Measures_and_Symbols_Glossary ob;
	public Login_Page_Test login;
	@Test(priority = 0)
	public void TC053_Verify_Safety_Measures() throws InterruptedException
	{
		Message("************************Safety Measures and Symbols Glossary Test**************************");
		ob = new Safety_Measures_and_Symbols_Glossary();
//		login = new Login_Page_Test();
//		login.login();
		Thread.sleep(4000);
		//if execute all class together then please comment out below two line.
		Custom_click(ob.home(), ob.home().getText());
		Custom_click(ob.side_menu_btn(), " Side Menu Button ");
		Custom_click(ob.Safety_Measures(), ob.Safety_Measures().getText());
		ob.Safety_message();
		Custom_click(ob.back_button(), "Back from Stay Safe While Riding page");
	}
	@Test(priority = 1)
	public void TC054_Verify_Symbols_Glossary()
	{
		Custom_click(ob.side_menu_btn(), " Side Menu Button ");
		Custom_click(ob.Symbols_Glossary(), ob.Symbols_Glossary().getText());
		ob.Symbols_Glossary_message();
		Custom_click(ob.back_button(), "Back from Symbols Glossary page");
//		driver.navigate().back();
	}
}

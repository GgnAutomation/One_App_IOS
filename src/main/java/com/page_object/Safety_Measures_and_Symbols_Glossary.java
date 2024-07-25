package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base_Utility;

public class Safety_Measures_and_Symbols_Glossary extends Base_Utility {

	public Safety_Measures_and_Symbols_Glossary() {
		PageFactory.initElements(driver, this);
	}

//************************************Safety Measures**************************
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/rv_item_lbl'])[5]")
	private WebElement Safety_Measures;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id')]")
	private List<WebElement> Safety_message;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/back_btn']")
	private WebElement back_button;

	public WebElement Safety_Measures() {
		return Safety_Measures;
	}

	public void Safety_message() {
		for (int i = 0; i < Safety_message.size(); i++) {
			msg(Safety_message.get(i), "");
		}
	}

	public WebElement back_button() {
		return back_button;
	}

//************************************Symbols Glossary**************************
	@FindBy(xpath = "//android.widget.TextView[@resource-id ='com.customerapp.hero:id/navigation_bar_item_large_label_view']")
	private WebElement home;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id ='com.customerapp.hero:id/side_menu_btn']")
	private WebElement side_menu_btn;
	@FindBy(xpath = "(//android.widget.TextView[@resource-id ='com.customerapp.hero:id/rv_item_lbl'])[6]")
	private WebElement Symbols_Glossary;
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.customerapp.hero:id')]")
	private List<WebElement> Symbols_Glossary_message;

	public WebElement home() {
		return home;
	}

	public WebElement side_menu_btn() {
		return side_menu_btn;
	}

	public WebElement Symbols_Glossary() {
		return Symbols_Glossary;
	}

	public void Symbols_Glossary_message() {
		try {
			for (int i = 0, j = 0; i < Symbols_Glossary_message.size(); i++) {
				msg(Symbols_Glossary_message.get(i), "");
				if (i == Symbols_Glossary_message.size() - 1) {
					String name = Symbols_Glossary_message.get(i).getText();
						if (j == 4) {
							Message("All message priented successfully");
							Custom_click(back_button, "Back from Symbols Glossary page");
							break;
						}
						Scroll_down_page_Action(name);
						j++;
						i = 4;
					}
				}
		} catch (Exception e) {
			Custom_click(back_button, "Back from Symbols Glossary page");
		}
	}
}

package com.test.web.dropDownPage;

import com.test.web.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class DropDownPage extends BasePage {

    @FindBy(xpath="//*[@id=\"content\"]/ul/li[11]/a")
    public static WebElement dropdown;
    @FindBy(id="dropdown")
    public static WebElement dropdownOption;

    DropDownPage() {
        PageFactory.initElements(driver, this);
    }

    public static void clickDropDown(){

        dropdown.click();
    }


    public static void clickOption1(){

        Select objSelect = new Select(dropdownOption);
        objSelect.selectByValue("1");
    }
}


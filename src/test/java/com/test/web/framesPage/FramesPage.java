package com.test.web.framesPage;

import com.test.web.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FramesPage extends BasePage {

    @FindBy(xpath="//*[@id=\"content\"]/ul/li[22]/a")
    public WebElement framesLink;
    @FindBy(xpath="//*[@id=\"content\"]/div/ul/li[1]/a")
    public WebElement nestedFramesLink;
    @FindBy(xpath="//*[@id=\"content\"]/div/ul/li[2]/a")
    public WebElement iFramesLink;

    FramesPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnFrames(){

     framesLink.click();

    }

    public  void  validateHyperlinks(){


        Assert.assertTrue(nestedFramesLink.isDisplayed());
        Assert.assertTrue(iFramesLink.isDisplayed());
    }
}

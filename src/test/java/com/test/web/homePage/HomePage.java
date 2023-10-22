package com.test.web.homePage;

import com.test.web.basepage.BasePage;
import com.test.web.driver.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage extends BasePage {




    @FindBy(xpath="//*[@id=\"content\"]/div/h3")
    public WebElement heading;

    @FindBy(xpath="//*[@id=\"content\"]/ul/li[1]/a")
    public WebElement abtestLink;



    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage(String url){

        driver.get(url);
        wait.forLoading(5);
    }
    public void clickABLink() {
        abtestLink.click();
    }

    public void validateHeading() {
        String actual=heading.getText();
        String expected="A/B Test Variation 1";
        Assert.assertEquals(actual,expected);

    }

    public void navigateBack(){
        driver.navigate().back();
    }
}

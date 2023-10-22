package com.test.web.homePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class HomePageSteps {


    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^I am on the Home Page \"([^\"]*)\" of heroku Website$")
    public void i_am_on_the_Home_Page_of_heroku_Website(String url) {
        homePage.goToHomePage(url);

    }


    @Then("^I select AB Test link$")
    public void i_select_ABTest_link() {
        homePage.clickABLink();
    }

    @Then("^I validate the heading$")
    public void i_validate_heading() {
        homePage.validateHeading();

    }
    @And("^I click back$")
    public void i_click_back()  {
        homePage.navigateBack();

    }
}

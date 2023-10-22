package com.test.web.dropDownPage;

import io.cucumber.java.en.Then;


public class DropDownPageSteps {

    private DropDownPage dropDownPage;

    public DropDownPageSteps() {
        this.dropDownPage = new DropDownPage();
    }


    @Then("^I select dropdown and select option1$")
    public void i_click_on_dropdown() {

        dropDownPage.clickDropDown();
        dropDownPage.clickOption1();
    }

}

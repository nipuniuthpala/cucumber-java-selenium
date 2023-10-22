package com.test.web.framesPage;
import io.cucumber.java.en.Then;

public class FramesPageSteps {

    private FramesPage framesPage;

    public FramesPageSteps() {
        this.framesPage = new FramesPage();
    }

    @Then("^I click on Frames$")
    public void i_click_on_frames() {

        framesPage.clickOnFrames();

    }
    @Then("^I see the hyperlinks$")
    public void i_see_hyperlinks() {

        framesPage.validateHyperlinks();

    }
}

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/test/web/TestWeb.feature");
formatter.feature({
  "name": "Assignment testing.",
  "description": "  web site assignment.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test_Web"
    }
  ]
});
formatter.scenario({
  "name": "Validate Website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test_Web"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Home Page \"http://the-internet.herokuapp.com/\" of heroku Website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.test.web.homePage.HomePageSteps.i_am_on_the_Home_Page_of_heroku_Website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select AB Test link",
  "keyword": "When "
});
formatter.match({
  "location": "com.test.web.homePage.HomePageSteps.i_select_ABTest_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the heading",
  "keyword": "Then "
});
formatter.match({
  "location": "com.test.web.homePage.HomePageSteps.i_validate_heading()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click back",
  "keyword": "And "
});
formatter.match({
  "location": "com.test.web.homePage.HomePageSteps.i_click_back()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select dropdown and select option1",
  "keyword": "And "
});
formatter.match({
  "location": "com.test.web.dropDownPage.DropDownPageSteps.i_click_on_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click back",
  "keyword": "And "
});
formatter.match({
  "location": "com.test.web.homePage.HomePageSteps.i_click_back()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Frames",
  "keyword": "And "
});
formatter.match({
  "location": "com.test.web.framesPage.FramesPageSteps.i_click_on_frames()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the hyperlinks",
  "keyword": "Then "
});
formatter.match({
  "location": "com.test.web.framesPage.FramesPageSteps.i_see_hyperlinks()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
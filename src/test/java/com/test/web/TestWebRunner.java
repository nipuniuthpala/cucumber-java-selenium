package com.test.web;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/test/web/TestWeb.feature"},
        strict = true, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        glue = {"com.test.web.driver",
                "com.test.web.homePage","com.test.web.dropDownPage","com.test.web.framesPage","com.test.web.basepage"})
public class TestWebRunner {
}

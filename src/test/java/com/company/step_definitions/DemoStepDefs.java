package com.company.step_definitions;

import com.company.utilities.ConfigurationReader;
import com.company.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class DemoStepDefs {
    @Given("I go to the application")
    public void i_go_to_the_application() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @Then("it should be there")
    public void it_should_be_there() {
        assertEquals("Practice", Driver.getDriver().getTitle());
    }

    // BREYK : 12.10
}

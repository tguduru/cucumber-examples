package org.tguduru.testing.cucumber.impl;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 10/4/16
 */
public class RegistrationImplTest {

    @Given("a user")
    public void given() {
        System.out.println("Testing with Cucumber");
    }

    @When("call save")
    public void callService() {

    }

    @Then("user saved")
    public void success() {

    }
}

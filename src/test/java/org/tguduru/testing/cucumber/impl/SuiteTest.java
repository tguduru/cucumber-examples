package org.tguduru.testing.cucumber.impl;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 10/4/16
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json"})
public class SuiteTest {
}

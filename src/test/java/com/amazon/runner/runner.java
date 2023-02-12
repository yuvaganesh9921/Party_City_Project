package com.amazon.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\com\\amazon\\feature",glue = {"com.amazon.setdefniation","hooks"},dryRun = false,tags = "@Tc_9614",plugin = {"html:target\\report\\partycity.html","json:target\\report\\partycity.json"})
public class runner extends AbstractTestNGCucumberTests{

}

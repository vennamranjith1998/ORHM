package com.StepDefination;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="ORANGEHRMAPPLICATIONCUCUMBER",
                              // name of the folder in which the feature file is created
glue="com.StepDefination",
// glue will connect the feature file with the WebDriver Test Script implemented with userDefined methods
  monochrome=true
  //dryRun = true // will remove the junk data from the OutPut console
 
)

public class TestRunner {

}

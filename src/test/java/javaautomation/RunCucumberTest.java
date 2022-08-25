package javaautomation;

import org.junit.jupiter.api.Timeout;
import org.junit.platform.suite.api.ConfigurationParameter;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import java.util.concurrent.TimeUnit;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("javaautomation")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")

 class RunCucumberTest {
	

	
}
package runTest;


import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("features")
@ConfigurationParameter(key = "cucumber.glue", value = "outsera.web.steps,outsera.web.configuration")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
@ConfigurationParameter(key = "cucumber.monochrome", value = "true")
@ConfigurationParameter(key = "cucumber.snippet-type", value = "camelcase")
@ConfigurationParameter(key = "cucumber.filter.tags", value = "@smokeTest")

public class RunTest {
}

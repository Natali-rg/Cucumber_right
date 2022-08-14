package appium.steps;

import appium.BaseAppiumSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainAppiumSteps extends BaseAppiumSteps {
    @When("^Open site \"([^\"]*)\"$")
    public void openSite(String url) throws Throwable {
       driver.get(url);
       Thread.sleep(5000);
    }

    @Then("^Get title$")
    public void getTitle() {
        System.out.println(driver.getTitle());
    }
}

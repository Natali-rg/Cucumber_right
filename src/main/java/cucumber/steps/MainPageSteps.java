package cucumber.steps;

import cucumber.BaseCucumber;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.MainPage;

public class MainPageSteps extends BaseCucumber {
    static MainPage mainPage=null;
    static final String mainURL="https://dnipro.ithillel.ua/";
    @When("^I open site \"([^\"]*)\"$")
    public void iOpenSite(String siteURL) throws Throwable {
        driver.get(siteURL);
        switch (siteURL){
            case mainURL:
                mainPage=new MainPage(driver);
                break;
        }
    }

    @Then("^Text description button must equals \"([^\"]*)\"$")
    public void textDescriptionButtonMustEquals(String mExTitle) throws Throwable {
        Assert.assertEquals(mainPage.getMTitleText(), mExTitle);
    }
}

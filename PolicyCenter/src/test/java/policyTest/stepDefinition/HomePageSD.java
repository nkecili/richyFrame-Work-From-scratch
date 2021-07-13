package policyTest.stepDefinition;

import PageClasses.HomePageClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import static helpers.SetUp.homePageClass;

public class HomePageSD extends HomePageClass {

    @Given("user is landed on home page")
    public void user_is_landed_on_home_page() {
        String actualTitle =  getHomePageTitle();
        String expectedTitle = "Business and Personal Insurance Solutions | Travelers Insurance";
        Assert.assertEquals(expectedTitle,actualTitle);


    }

    @Then("user should see the home page logo")
    public void user_should_see_the_home_page_logo() {
        boolean verifyLogo =  getLogo();
        Assert.assertTrue(verifyLogo);

    }



}

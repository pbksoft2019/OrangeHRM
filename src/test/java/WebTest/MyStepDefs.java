package WebTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs
{
    // object created for HomePage to call methods from homepage
    HomePage homePage = new HomePage();

    // first step user is on home page
    @Given("user is on home page")
    public void userIsOnHomePage()
    {
        homePage.verifyUserIsOnHomePage();
    }
    // next step user enters log in details
    @When("user enters username as{string} and password as {string}")
    public void userEntersUsernameAsAndPasswordAs(String Username, String Password)
    {
        // method to enter log in details
        homePage.enterLoginDetails( Username, Password );
    }
    // next step user clicks on log in button
    @And("user clicks on Login")
    // method to click on log in button
    public void userClicksOnLogin()
    {
        homePage.clickOnLogin();
    }
    // method to see error message
    @Then("user should see {string}")
    public void userShouldSeeErrorMessage(String ErrorMessage)
    {
        // error message method
        homePage.userShouldSeeErrorMessage(ErrorMessage);
    }
}


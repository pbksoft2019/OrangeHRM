package WebTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs
{
    // object created for LogIn page to call methods from particular page
    LogIn logIn = new LogIn();
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
        logIn.enterLoginDetails( Username, Password );
    }
    // next step user clicks on log in button
    @And("user clicks on Login")
    // method to click on log in button
    public void userClicksOnLogin()
    {
        logIn.clickOnLogin();
    }
    // method to see error message
    @Then("user should see {string}")
    public void userShouldSeeErrorMessage(String ErrorMessage)
    {
        // error message method
        logIn.userShouldSeeErrorMessage(ErrorMessage);
    }
}


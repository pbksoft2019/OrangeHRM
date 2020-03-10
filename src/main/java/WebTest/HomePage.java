package WebTest;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    // locator for username field
    private By _userName = By.id( "txtUsername" );
    // locator for password field
    private By _password = By.id( "txtPassword" );
    // locator for login button
    private By _LoginButton = By.id( "btnLogin" );
    // locator for actual error message field
    private By _actual = By.id( "spanMessage" );

    // method for entering login details
    public void enterLoginDetails(String Username, String Password)
    {
        // input for username from feature file
        enterText( _userName, Username );
        // input for password from feature file
        enterText( _password, Password );
    }
    // method for click on login button
    public void clickOnLogin()
    {
        clickOnElement( _LoginButton );
    }
    // assert method for error message
    public void userShouldSeeErrorMessage(String ErrorMessage)
    {
        // string expected message from feature field
        String expected = ErrorMessage;
        // compare actual and expected
        assertTextMessage( "Your Log in is unsuccessful  ", expected, _actual );
    }
    // method to verify that user is on home page
    public void verifyUserIsOnHomePage()
    {
        assertURL( "https://opensource-demo.orangehrmlive.com/" );
    }
}

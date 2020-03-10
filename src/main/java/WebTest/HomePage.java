package WebTest;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    //
    public void verifyUserIsOnHomePage()
    {
        assertURL( "https://opensource-demo.orangehrmlive.com/" );
    }
}

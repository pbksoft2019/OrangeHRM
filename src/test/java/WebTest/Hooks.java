package WebTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import static com.sun.deploy.cache.Cache.copyFile;

public class Hooks extends Utils
{
    // object created for Browser selector page to use methods of that page
    BrowserSelector browserSelector = new BrowserSelector();
    // before method for opening browser
    @Before
    // open browser method from Browser selector page
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
    }
    // after method to close browser and take screenshot if test fails
    @After
    public void closeBrowser(Scenario scenario) throws IOException
    {
        if (scenario.isFailed())
        {
            String screenShotName = scenario.getName().replaceAll(  "[.,:;?!]", "")+ timeStamp()+".png";
            try
            {
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs( OutputType.FILE );
                File destinationPath = new File( System.getProperty( "user.dir" ) + "/target/Destination/screenshots/" + screenShotName );
                copyFile(sourcePath,destinationPath);
                scenario.write( "!!!!!!!Scenario Failed....!!!!!! Please see attached screenshot for the error/issue" );
                scenario.embed( ((TakesScreenshot)driver).getScreenshotAs( OutputType.BYTES ),"image/png");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        // close browser once test case execution finished
        driver.quit();
    }
}

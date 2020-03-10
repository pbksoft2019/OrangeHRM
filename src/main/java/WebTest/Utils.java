package WebTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// utils class created to store reusable methods
public class Utils extends BasePage
{
    // method for time stamp
    public static String timeStamp()
    {
        DateFormat dateFormat = new SimpleDateFormat( "ddmmyyhhmmss" );
        Date date = new Date();
        return dateFormat.format( date );
    }
    // method for enter text in any text field
    public void enterText(By by, String text)
    {
        driver.findElement( by ).sendKeys( text );
    }
    // method for getting current url and compare
    public static void assertURL(String text)
    {
        Assert.assertTrue( driver.getCurrentUrl().contains( text ) );
    }
    // method for get text from elements
    public static String getTextElement(By by)
    {
        String get_text = driver.findElement( by ).getText();
        return get_text;
    }
    // method for click on element
    public static void clickOnElement(By by)
    {
        driver.findElement( by ).click();
    }
    // assert method for compare actual and expected result
    public void assertTextMessage(String massage, String expected, By by)
    {
        String actual = getTextElement( by );
        Assert.assertEquals( massage, expected, actual );
    }
}

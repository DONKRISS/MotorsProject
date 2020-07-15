package co.uk.motors.hooks;

import co.uk.motors.commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Hook extends BrowserManager
{
    private String chromeBrowser ="Chrome";
    public Scenario scenario;

    @Before
    public void setup( Scenario scenario  )
    {
        this.scenario = scenario;
        launchBrowser(chromeBrowser);
    }
    @After
    public void tearDown()
    {
        String timeNow= new SimpleDateFormat("HHmmss").format(new GregorianCalendar().getTime());
                String fileName = String.format("screenshot_%s",timeNow);

                if(scenario.isFailed())
                {
                    try{
                        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                        scenario.embed(screenshot,fileName);
                         } catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
                    closeBrowser();
    }
}

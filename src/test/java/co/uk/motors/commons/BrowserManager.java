package co.uk.motors.commons;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class  BrowserManager extends DriverManager
{
         private WebDriver initChrome()
    {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }


        private WebDriver initHeadlessChrome()
        {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-gpu", "--headless");

            return new ChromeDriver(options);
        }

    private WebDriver initfirefox()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private WebDriver initopera()
    {
        WebDriverManager.operadriver().setup();
        return new OperaDriver();
    }

    public void launchBrowser (String browser)
    {
        switch (browser)

        {
            case  "Chrome":
            driver = initChrome();
            break;

            case "Firefox":
                driver = initfirefox();
                break;
            case "Headless":
                driver = initHeadlessChrome();
                break;
            case "opera":
                driver = initopera();
                break;
            default:
                    driver =initHeadlessChrome();
        }
       driver.manage().window().maximize();
    }
    public void closeBrowser()
    {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}

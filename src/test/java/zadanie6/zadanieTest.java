package zadanie6;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by student08 on 16.12.15.
 */
public class zadanieTest {

    private static HomePage homePage;
    private static ZadanieHomePage zadanieHome;


    private static WebDriver webDriver;

    @BeforeClass
    public static void setUp()
    {
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void newPageTest(){

        webDriver.navigate().to("https://testingcup.pgs-soft.com/");

        homePage=new HomePage(webDriver);
        zadanieHome=new ZadanieHomePage(webDriver);


        homePage.clickThisLink();
        zadanieHome.loginAss("username", "password");

    }

}

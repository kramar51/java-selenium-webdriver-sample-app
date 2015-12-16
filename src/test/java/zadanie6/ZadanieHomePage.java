package zadanie6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student08 on 15.12.15.
 */
public class ZadanieHomePage {
    private ZadanieHomeLocators zadanieHomePage;

    public ZadanieHomePage(WebDriver driver) {

        zadanieHomePage = new ZadanieHomeLocators();
        PageFactory.initElements(driver,zadanieHomePage);
    }

    public void loginAss(String loginm, String pass){
        zadanieHomePage.login.sendKeys(loginm);
        zadanieHomePage.password.sendKeys(pass);
        zadanieHomePage.button.click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class logoutPage {
    WebDriver driver;

    By dropdownProfile = By.xpath("//span[@class='oxd-userdropdown-tab']");
    By LogoutMenu = By.xpath("//a[text()='Logout']");
    By verifyLogout = By.xpath("//h5[text()='Login']");

    public logoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickDropdown(){
        driver.findElement(dropdownProfile).click();
    }
    public void clickLogout(){
        driver.findElement(LogoutMenu).click();
    }
    public void verifyLogout(){
        String getVerifyLogout = driver.findElement(verifyLogout).getText().trim();
        assertEquals("Login", getVerifyLogout);
    }
}

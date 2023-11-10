package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class loginPage {
    WebDriver driver;

    By Username = By.xpath("//input[@name='username']");
    By Password = By.xpath("//input[@name='password']");
    By LgnBtn = By.xpath("//button[@type='submit']");
    By Header = By.xpath("//h6[text()='Dashboard']");

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void inputUsername(String username){
        driver.findElement(Username).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(Password).sendKeys(password);
    }
    public void ClickLogin(){
        driver.findElement(LgnBtn).click();
    }
    public void verifyLoginSuccess(){
        String getHeader = driver.findElement(Header).getText().trim();
        assertEquals("Dashboard", getHeader);
    }
}

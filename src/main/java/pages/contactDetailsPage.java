package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class contactDetailsPage {
    WebDriver driver;

    By contactDetailMenu = By.xpath("//a[text()='Contact Details']");
    By UpdateStreet = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input");
    By clickSave = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button");

    public contactDetailsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickContactMenu(){
        driver.findElement(contactDetailMenu).click();
    }

    public void UpdateStreet(String street) {
        driver.findElement(UpdateStreet).sendKeys(street);
    }
    public void saveContactDetail(){
        driver.findElement(clickSave).click();
    }
}

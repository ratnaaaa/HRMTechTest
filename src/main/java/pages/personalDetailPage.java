package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class personalDetailPage {
    WebDriver driver;

    By MyInfoMenu = By.xpath("//span[text()='My Info']");
    By fieldInformasi = By.xpath("//input[@name='firstName']");
    By btnSave = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button");

    public personalDetailPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickMyInfoMenu(){
        driver.findElement(MyInfoMenu).click();
    }

    public void updateFirstName(String firstName){
        driver.findElement(fieldInformasi).sendKeys(firstName);
    }
    public void clickSave(){
        driver.findElement(btnSave).click();
    }

}

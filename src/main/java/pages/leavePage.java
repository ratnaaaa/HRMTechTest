package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class leavePage {

    //Untuk bagian leave tidak ada fungsi untuk menambahkan leave
    // jadi tasknya saya ubah hanya untuk akses apply saja

    WebDriver driver;
    By leaveMenuList = By.xpath("//span[text()='Leave']");
    By applyMenu = By.xpath("//a[text()='Apply']");
    By verifyLeavePage = By.xpath("//h6[text()='Apply Leave']");

    public leavePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLeaveMenu(){
        driver.findElement(leaveMenuList).click();
    }

    public void clickApplyLeave(){
        driver.findElement(applyMenu).click();
    }

    public void verifyLeavePage(){
        String getVerifyLeave = driver.findElement(verifyLeavePage).getText();

        assertEquals("Apply Leave", getVerifyLeave);
    }

}

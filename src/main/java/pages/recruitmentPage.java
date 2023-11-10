package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class recruitmentPage {
    WebDriver driver;

    By recruitmenMenu = By.xpath("//span[text()='Recruitment']");
    By vacanciesMenu = By.xpath("//a[text()='Vacancies']");
    By addVacancies = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    By addVacancyName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input");
    By clickFieldJobTitle = By.xpath("//div[@class='oxd-select-wrapper'])]");

    By selectJobTitle = By.xpath("//div[@class='oxd-select-text-input' and contains (text(), 'QA Engineer')]");
    By selectHiringManager = By.xpath("//div[@class='oxd-autocomplete-wrapper']");
    By saveVacancies = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/button[2]");

    public recruitmentPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickrecruitmen(){
        driver.findElement(recruitmenMenu).click();
    }

    public void clickVacancies(){
        driver.findElement(vacanciesMenu).click();
    }
    public void addVacancies(){
        driver.findElement(addVacancies).click();
    }
    public void addVacancyName(String vacancyName){
        driver.findElement(addVacancyName).sendKeys(vacancyName);
    }
    public void selectJobTitle() {
        Actions action = new Actions(driver);
        WebElement clickField = driver.findElement(clickFieldJobTitle);
        action.moveToElement(clickField);

        List<WebElement> options = (List<WebElement>) driver.findElement(selectJobTitle);
        for (WebElement option : options){
            if (option.getText().equals("QA Engineer")){
                option.click();
            }
        }
    }
    public void seletHiringManager(){
        Select drpHiringMngr = new Select(driver.findElement(selectHiringManager));
        drpHiringMngr.selectByVisibleText("Paul  Collings");
    }
    public void saveVacancies(){
        driver.findElement(saveVacancies).click();
    }




}

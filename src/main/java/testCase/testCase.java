package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.loginPage;
import pages.personalDetailPage;
import pages.contactDetailsPage;
import pages.logoutPage;
import pages.recruitmentPage;
import pages.leavePage;

import java.util.concurrent.TimeUnit;

public class testCase {
    WebDriver driver;

    loginPage objLoginPage;
    personalDetailPage objUpdatePersonalDetail;
    contactDetailsPage objContactdetail;
    logoutPage objLogoutPage;
    recruitmentPage objrecruitmenPage;
    leavePage objLeavePage;


    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void doLogin(){
        objLoginPage = new loginPage(driver);
        objLoginPage.inputUsername("Admin");
        objLoginPage.inputPassword("admin123");
        objLoginPage.ClickLogin();
        objLoginPage.verifyLoginSuccess();
    }
    @Test
    public void UpdatePersonalDetail(){
        objLoginPage = new loginPage(driver);
        objUpdatePersonalDetail = new personalDetailPage(driver);
        objLoginPage.inputUsername("Admin");
        objLoginPage.inputPassword("admin123");
        objLoginPage.ClickLogin();
        objUpdatePersonalDetail.clickMyInfoMenu();
        objUpdatePersonalDetail.updateFirstName("John");
        objUpdatePersonalDetail.clickSave();

    }

    @Test
    public void UpdateContactDetail(){
        objLoginPage = new loginPage(driver);
        objUpdatePersonalDetail = new personalDetailPage(driver);
        objContactdetail = new contactDetailsPage(driver);
        objLoginPage.inputUsername("Admin");
        objLoginPage.inputPassword("admin123");
        objLoginPage.ClickLogin();
        objUpdatePersonalDetail.clickMyInfoMenu();
        objContactdetail.clickContactMenu();
        objContactdetail.UpdateStreet("Jalan Jalan");
        objContactdetail.clickContactMenu();
    }
    @Test
    public void addJobTitle() {
        objLoginPage = new loginPage(driver);
        objrecruitmenPage = new recruitmentPage(driver);
        objLoginPage.inputUsername("Admin");
        objLoginPage.inputPassword("admin123");
        objLoginPage.ClickLogin();
        objrecruitmenPage.clickrecruitmen();
        objrecruitmenPage.clickVacancies();
        objrecruitmenPage.addVacancies();
        objrecruitmenPage.addVacancyName("QA Testing");
        objrecruitmenPage.selectJobTitle();
        objrecruitmenPage.seletHiringManager();
        objrecruitmenPage.saveVacancies();
    }

    @Test
    public void applyLeave(){
        objLoginPage = new loginPage(driver);
        objLeavePage = new leavePage(driver);
        objLoginPage.inputUsername("Admin");
        objLoginPage.inputPassword("admin123");
        objLoginPage.ClickLogin();
        objLeavePage.clickLeaveMenu();
        objLeavePage.clickApplyLeave();
        objLeavePage.verifyLeavePage();
    }

    @Test
    public void doLogout(){
        objLoginPage = new loginPage(driver);
        objLogoutPage = new logoutPage(driver);
        objLoginPage.inputUsername("Admin");
        objLoginPage.inputPassword("admin123");
        objLoginPage.ClickLogin();
        objLogoutPage.clickDropdown();
        objLogoutPage.clickLogout();
        objLogoutPage.verifyLogout();
    }
    @AfterTest
    public void AfterTest(){
        driver.quit();
    }

}

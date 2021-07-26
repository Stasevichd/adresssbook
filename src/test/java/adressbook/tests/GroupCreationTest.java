package adressbook.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class GroupCreationTest {
  ChromeDriver wd;
   String baseUrl;
   boolean acceptNextAlert = true;
   StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp()  {
    System.setProperty("webdriver.chrome.driver", "C:\\Projects\\tools\\chromedriver.exe");
    wd = new ChromeDriver();
    wd.manage().window().maximize();
    wd.get("http://localhost:8080/addressbook/");
    wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    login("admin", "secret");
  }

  @Test
  public void groupCreate()  {
    gotoGroupPage();
    initGroupCreation();
    fillCreationForm(new GroupDate("test1", "test2", "test3"));
    submitGroupCreation();
    returntoGroupPage();
  }

  private void returntoGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  private void fillCreationForm(GroupDate groupDate) {

    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys(groupDate.getName());
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys(groupDate.getHeader());
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupDate.getFooter());
  }

  private void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  private void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  private void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  private void login(String userName, String password) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(userName);
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    wd.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = wd.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

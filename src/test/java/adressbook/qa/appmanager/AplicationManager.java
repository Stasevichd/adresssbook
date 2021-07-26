package adressbook.qa.appmanager;

import adressbook.qa.model.GroupDate;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AplicationManager {
  ChromeDriver wd;

  public void init() {
    System.setProperty("webdriver.chrome.driver", "C:\\Projects\\tools\\chromedriver.exe");
    wd = new ChromeDriver();
    wd.manage().window().maximize();
    wd.get("http://localhost:8080/addressbook/");
    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    login("admin", "secret");
  }

  public void returntoGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  public void fillCreationForm(GroupDate groupDate) {

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

  public void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  public void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  public void login(String userName, String password) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(userName);
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  public void stop() {
    wd.quit();
  }
  public void deleteSelectedGroups() {
    wd.findElement(By.name("delete")).click();
  }

  public void selectGroup()
  {
    wd.findElement(By.name("selected[]")).click();
  }
}

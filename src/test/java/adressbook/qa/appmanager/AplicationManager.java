package adressbook.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AplicationManager {
  ChromeDriver wd;

  private  NavigationHelper navigationHelper;
  private  GroupHelper groupHelper;
  private SessionHelper sessionHelper;

  public void init() {
    System.setProperty("webdriver.chrome.driver", "C:\\Projects\\tools\\chromedriver.exe");
    wd = new ChromeDriver();
    wd.manage().window().maximize();
    wd.get("http://localhost:8080/addressbook/");
    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}

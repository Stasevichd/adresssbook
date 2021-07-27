package adressbook.qa.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.time.Duration;

public class AplicationManager {
  WebDriver wd;

  private  NavigationHelper navigationHelper;
  private  GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private UserHelper userHelper;
  private String browser;

  public AplicationManager(String browser) {

    this.browser = browser;
  }

  public void init() {

    if (browser == BrowserType.FIREFOX){
      System.setProperty("webdriver.gecko.driver", "C:\\Projects\\tools\\geckodriver.exe");
      wd = new FirefoxDriver();
    }else {if (browser == BrowserType.CHROME){
      System.setProperty("webdriver.chrome.driver", "C:\\Projects\\tools\\chromedriver.exe");
      wd = new ChromeDriver();
      wd.manage().window().maximize();
    }else if(browser == BrowserType.EDGE){
      System.setProperty("webdriver.edge.driver", "C:\\Projects\\tools\\msedgedriver.exe");
      wd = new EdgeDriver();
    }


    }

    wd.get("http://localhost:8080/addressbook/");
    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    userHelper = new UserHelper(wd);
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
  public UserHelper getUserHelper() {return userHelper;}
}

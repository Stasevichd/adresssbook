package adressbook.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartTest {
  ChromeDriver wd;

@Test
  public void initWD(){
    System.setProperty("webdriver.chrome.driver", "C:\\Projects\\tools\\chromedriver.exe");
    wd = new ChromeDriver();
    wd.manage().window().maximize();
    wd.get("https://service.2fa-chain.kz/");
  }
}

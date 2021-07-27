package adressbook.qa.tests;

import adressbook.qa.appmanager.AplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

  protected final AplicationManager app = new AplicationManager(BrowserType.CHROME);

  @BeforeClass(alwaysRun = true)
  public void setUp()  {
    app.init();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    app.stop();

  }

  public AplicationManager getApp() {
    return app;
  }
}

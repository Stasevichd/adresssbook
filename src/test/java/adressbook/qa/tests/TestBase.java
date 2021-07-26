package adressbook.qa.tests;

import adressbook.qa.appmanager.AplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

  protected final AplicationManager app = new AplicationManager();

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

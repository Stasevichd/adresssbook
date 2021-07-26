package adressbook.qa.tests;

import adressbook.qa.model.GroupDate;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation()  {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillCreationForm(new GroupDate("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.returntoGroupPage();
  }


}

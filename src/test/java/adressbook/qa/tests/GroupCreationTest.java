package adressbook.qa.tests;

import adressbook.qa.model.GroupDate;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation()  {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupDate("test1", null, null));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returntoGroupPage();
  }


}

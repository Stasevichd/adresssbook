package adressbook.qa.tests;

import adressbook.qa.model.GroupDate;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation()  {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupDate("test1", null, null));

  }


}

package adressbook.qa.tests;

import adressbook.qa.model.GroupDate;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase{
  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupDate("test1", "test1", "test1"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returntoGroupPage();

  }
}

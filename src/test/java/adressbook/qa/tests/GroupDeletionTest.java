package adressbook.qa.tests;

import adressbook.qa.model.GroupDate;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


  @Test
  public void testGroupDeletion() {

    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereGroup()){
      app.getGroupHelper().createGroup(new GroupDate("test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returntoGroupPage();
  }


}

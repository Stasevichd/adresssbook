package adressbook.qa.tests;

import org.testng.annotations.Test;

public class UserDeletionTest extends TestBase{

  @Test
  public void testUserDeletion(){
    app.getNavigationHelper().gotoHome();
    app.getUserHelper().selectUser();
    app.getUserHelper().deleteSelectedUsers();
    app.getUserHelper().submitUserDelete();
  }
}

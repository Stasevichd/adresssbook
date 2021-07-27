package adressbook.qa.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{

  @Test
  public void testUserDeletion(){
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectUser();
    app.getContactHelper().deleteSelectedUsers();
    app.getContactHelper().submitContactDelete();
  }
}

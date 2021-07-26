package adressbook.qa.tests;

import adressbook.qa.model.UserDate;
import org.testng.annotations.Test;

public class UserModificationTest extends TestBase{

  @Test
  public void testUserModification(){
    app.getNavigationHelper().gotoHome();
    app.getUserHelper().selectUserToModify();
    app.getUserHelper().fillUserForm(new UserDate("mr", "smit","Neo" ));
    app.getUserHelper().submitUserModify();
  }
}

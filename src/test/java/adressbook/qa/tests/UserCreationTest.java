package adressbook.qa.tests;

import adressbook.qa.model.UserDate;
import org.testng.annotations.Test;

public class UserCreationTest extends TestBase{

  @Test
  public void testUserCreation(){
  app.getNavigationHelper().gotoUserCreation();
  app.getUserHelper().fillUserForm(new UserDate("Janes", "Bond","Rambo"));
  app.getUserHelper().submitUserCreation();



  }
}

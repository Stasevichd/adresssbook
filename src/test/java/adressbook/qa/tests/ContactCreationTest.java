package adressbook.qa.tests;

import adressbook.qa.model.ContactDate;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation(){
  app.getNavigationHelper().gotoContactCreation();
  app.getContactHelper().fillContactForm(new ContactDate("Janes", "Bond","Rambo","test9" ),true );
  app.getContactHelper().submitContactCreation();



  }
}

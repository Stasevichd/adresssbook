package adressbook.qa.tests;

import adressbook.qa.model.ContactDate;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase{

  @Test
  public void testUserModification(){
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selecContactToModify();
    app.getContactHelper().fillContactForm(new ContactDate("mr", "smit","Neo",null ),false );
    app.getContactHelper().submitContactModify();
  }
}

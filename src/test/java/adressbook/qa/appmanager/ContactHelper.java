package adressbook.qa.appmanager;

import org.openqa.selenium.WebDriver;
import adressbook.qa.model.ContactDate;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase{

 // private ContactDate сontactDate;

  public void deleteSelectedUsers(){
    click(By.xpath("//input[@value='Delete']"));

  }

  public void fillContactForm(ContactDate  contactDate,boolean creation){
    type(By.name("firstname"), contactDate.getFirstName());
    type(By.name("lastname"), contactDate.getLastName());
    type(By.name("nickname"), contactDate.getNickName());
    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactDate.getGroup());
    }else{
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

  }

  public ContactHelper(WebDriver wd){
    super(wd);
  }
  public void submitContactCreation() {
    click(By.name("submit"));
  }
  public void selectUser(){
    click(By.name("selected[]"));
  }


  public void submitContactDelete() {
    wd.switchTo().alert().accept();
  }

  public void selecContactToModify() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
  }

  public void submitContactModify() {
    click(By.xpath("//input[@name='update']"));
  }
}

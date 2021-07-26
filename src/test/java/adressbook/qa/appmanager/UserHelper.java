package adressbook.qa.appmanager;


import adressbook.qa.model.UserDate;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserHelper extends HelperBase{

  public void deleteSelectedUsers(){
    click(By.xpath("//input[@value='Delete']"));

  }

  public void fillUserCreation(UserDate userDate ){
    type(By.name("firstname"),userDate.getFirstName());
    type(By.name("lastname"),userDate.getLastName());
    type(By.name("nickname"), userDate.getNickName());

  }

  public UserHelper(ChromeDriver wd){
    super(wd);
  }
  public void submitUserCreation() {
    click(By.name("submit"));
  }
  public void selectUser(){
    click(By.name("selected[]"));
  }


  public void submitUserDelete() {
    wd.switchTo().alert().accept();
  }
}

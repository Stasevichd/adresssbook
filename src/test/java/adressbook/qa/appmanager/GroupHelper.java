package adressbook.qa.appmanager;

import adressbook.qa.model.GroupDate;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupHelper {
  private ChromeDriver wd;

  public GroupHelper(ChromeDriver wd) {
    this.wd = wd;
  }

  public void returntoGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  public void fillCreationForm(GroupDate groupDate) {

    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys(groupDate.getName());
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys(groupDate.getHeader());
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupDate.getFooter());
  }

  public void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  public void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  public void deleteSelectedGroups() {
    wd.findElement(By.name("delete")).click();
  }

  public void selectGroup()
  {
    wd.findElement(By.name("selected[]")).click();
  }
}

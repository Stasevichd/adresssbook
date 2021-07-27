package adressbook.qa.model;

public class ContactDate {
  private final String firstName;
  private final String lastName;
  private final String nickName;
  private final String group;

  public ContactDate(String firstName, String lastName, String nickName, String group) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.group = group;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickName() {
    return nickName;
  }

  public String getGroup() {
    return group;
  }
}

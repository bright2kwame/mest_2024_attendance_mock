package user;

import java.util.Date;
import java.util.UUID;

// a base implementation of the user of the system
// this class cannot be instantiated
abstract class BaseUser {
    private String id;
    private String authToken;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    //record the time a new instance is created
    private Date dateCreated;

    public BaseUser(String firstName, String lastName,
      String middleName, String email){
       this.firstName = firstName;
       this.lastName = lastName;
       this.middleName = middleName;
       this.email = email;

       this.dateCreated = new Date();
       this.id = UUID.randomUUID().toString();
       this.authToken = UUID.randomUUID().toString();
      }

    //only get the user id, no setter for this
    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    public String getMiddleName() {
        return middleName;
    }

    
  public void setEmail(String email) {
      this.email = email;
  }

  public String getEmail() {
      return email;
  }
  // all children must implement this method
  abstract void login(String email);
    
}
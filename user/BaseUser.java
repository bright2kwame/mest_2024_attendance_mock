package user;

import java.util.Date;
import java.util.UUID;

import subscription.BaseSub;

// a base implementation of the user of the system
// this class cannot be instantiated
abstract class BaseUser {
    private String id;
    // athorisation token, a unique to identity the user, we used it for
    // authorisation
    private String authToken;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    // record the time a new instance is created
    private Date dateCreated;


    public BaseUser(String firstName, String lastName,
            String middleName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;

        this.dateCreated = new Date();
        this.id = UUID.randomUUID().toString();
        this.authToken = UUID.randomUUID().toString();
    }

    // only get the user id, no setter for this
    public String getId() {
        return id;
    }

    // get the user's last name
    public String getLastName() {
        return lastName;
    }

    // set the user's last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // get the date the user was created
    public Date getDateCreated() {
        return dateCreated;
    }

    // set the user's first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // get the user's first name
    public String getFirstName() {
        return firstName;
    }

    // set the middle name of the user
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // acess to the middle name
    public String getMiddleName() {
        return middleName;
    }

    // allow user to set the user email
    public void setEmail(String email) {
        this.email = email;
    }

    // give access to the user's email
    public String getEmail() {
        return email;
    }

    // all children must implement this method
    abstract void login(String email);

}
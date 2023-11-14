package user;

public class Eit extends BaseUser {

    public Eit(String firstName, String lastName,
            String middleName, String email) {
        super(firstName, lastName, middleName, email);

    }

    // the login implementation of the eit user
    @Override
    public void login(String email) {
        System.out.println("EIT logged in");
    }
}

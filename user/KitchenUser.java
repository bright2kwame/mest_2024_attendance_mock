package user;

public class KitchenUser extends BaseUser {

    public KitchenUser(String firstName, String lastName, String middleName, String email) {
        super(firstName, lastName, middleName, email);
    }

    // login implementation of the kitchen
    @Override
    void login(String email) {
        System.out.println("Kitchen Staff logged in");
    }

}

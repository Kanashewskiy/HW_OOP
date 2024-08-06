package EXP_1;

public interface UserController <T extends User>{

    void create(String firstName, String lastName, String middleName);

}

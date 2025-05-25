public class User {
    public String firstName;
    public String lastName;
    public String email;
    public String role;

    public User() {} // Required by Firebase

    public User(String firstName, String lastName, String email, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
    }
}

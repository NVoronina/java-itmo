package homework6.users;

public class Admin extends User {
    @Override
    public String getName() {
        return "Admin: " + super.getName();
    }
}

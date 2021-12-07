package homework6.bank;

public class Employee extends Person implements PersonInterface {
    private String bankName;

    public Employee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public void getInfo() {
        System.out.println("Employee: " + this.getName().concat(" ").concat(this.getSurname()).concat(this.bankName));
    }
}

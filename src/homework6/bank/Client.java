package homework6.bank;

public class Client extends Person {
    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public void getInfo() {
        System.out.println("Client: " + this.getName().concat(" ").concat(this.getSurname()).concat(this.bankName));
    }
}

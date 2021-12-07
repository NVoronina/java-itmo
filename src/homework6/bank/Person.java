package homework6.bank;

public abstract class Person implements PersonInterface {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    abstract void getInfo();
}

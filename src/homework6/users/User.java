package homework6.users;

import java.util.Scanner;

public class User {
    private int age;
    private String name;

    public User() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст пользователя");
        this.age = scanner.nextInt();
        System.out.println("Введите имя пользователя");
        this.name = scanner.next();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

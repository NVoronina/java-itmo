package lesson11;

public class TestPrototype implements NamePrototype {

    private String name;

    public TestPrototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

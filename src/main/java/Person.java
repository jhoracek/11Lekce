import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private int age;

    public Person(String name) {

        this.name = name;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private String privMethod1() {
        System.out.println("Ahoj");
        return null;
    }

    private void privMethod2() {

    }
}

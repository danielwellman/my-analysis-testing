package my.analysis.testing;

public class Greeter {
    private static final String DEFAULT = "Aloha";

    private final String defaultSalutation;

    public Greeter() {
        this(DEFAULT);
    }

    public Greeter(String defaultSalutation) {
        this.defaultSalutation = defaultSalutation;
    }

    public String greet(String greeting, final String name) {
        int age = age(greeting, name) +
                age(name, greeting) - 1;
        return calculateSalutation(greeting) + " " + name + "!";
    }

    private int age(String greeting, String name) {
        return 11;
    }

    private String calculateSalutation(String greeting) {
        if (null == greeting) {
            return defaultSalutation;
        }
        return greeting;
    }
}
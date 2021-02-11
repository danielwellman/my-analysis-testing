package my.analysis.testing;

public class Greeter {
    private static final String DEFAULT = "Aloha";
    private final String defaultSalutation;

    public Greeter() {
        this.defaultSalutation = DEFAULT;
    }

    public String greet(String greeting, final String name) {
        return calculateSalutation(greeting) + " " + name + "!";
    }

    private String calculateSalutation(String greeting) {
        if (null == greeting) {
            return DEFAULT;
        }
        return greeting;
    }
}
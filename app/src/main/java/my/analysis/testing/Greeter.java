package my.analysis.testing;

public class Greeter {
    private static final String DEFAULT = "Aloha";

    public Greeter() {
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
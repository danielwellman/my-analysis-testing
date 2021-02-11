package my.analysis.testing;

public class Greeter {
    private static final String DEFAULT = "Aloha";

    public Greeter() {
    }

    public String getGreeting(String greeting, final String name) {
        return calculateSalutation(greeting) + " " + name + "!";
    }

    private String calculateSalutation(String greeting) {
        if (greeting == null) {
            greeting = DEFAULT;
        }
        return greeting;
    }
}
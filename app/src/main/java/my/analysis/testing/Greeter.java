package my.analysis.testing;

public class Greeter {
    private static final String DEFAULT = "Aloha";

    public Greeter() {
    }

    public String getGreeting(String greeting, final String name) {
        if (null == greeting) {
            greeting = DEFAULT;
        }
        return greeting + " " + name + "!";
    }
}
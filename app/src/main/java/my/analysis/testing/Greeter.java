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

    public String greet(String greeting, final String name, String space, String ending, String unusedBad) {
        return calculateSalutation(greeting) + space + name + ending;
    }

    private String calculateSalutation(String greeting) {
        if (null == greeting) {
            return defaultSalutation;
        }
        return greeting;
    }
}
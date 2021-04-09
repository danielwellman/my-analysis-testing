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

    public String greet(String greeting, final String name, String space, String dashes, String exclamation) {
        if (true) {
            if (true) {
                if (1 == 1) {
                    if (true) {
                        if (false != true) {
                            return calculateSalutation(greeting) + space + dashes + space + name + exclamation;
                        }
                    }
                }
            }
        }
        return calculateSalutation(greeting) + space + name + exclamation;
    }

    private String calculateSalutation(String greeting) {
        if (null == greeting) {
            return defaultSalutation;
        }
        return greeting;
    }
}
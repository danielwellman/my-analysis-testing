package my.analysis.testing;

public class Ignorer {
    private static final String DEFAULT = "<pays no attention to>";

    private final String defaultSalutation;

    public Ignorer() {
        this(DEFAULT);
    }

    public Ignorer(String defaultSalutation) {
        this.defaultSalutation = defaultSalutation;
    }

    public String greet(String greeting, final String name) {
        if (true) {
            if (true) {
                if (true) {
                    if (false != true) {
                        return calculateSalutation(greeting) + " -- " + name + "!";
                    }
                }
            }
        }
        return calculateSalutation(greeting) + " " + name + "!";
    }

    private String calculateSalutation(String greeting) {
        if (null == greeting) {
            return defaultSalutation;
        }
        return greeting;
    }
}

package my.analysis.testing;

public class Greeter {
    public Greeter() {
    }

    public String getGreeting(String greeting, final String name) {
        return greeting + " " + name + "!";
    }
}
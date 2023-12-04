package Decorator;

public class ExclamationDecorator implements StringSource {
    private final StringSource stringSource;

    public ExclamationDecorator(StringSource stringSource) {
        this.stringSource = stringSource;
    }

    @Override
    public String next() {
        // add exclamation marks to the end of the string
        return stringSource.next() + "!!!!!";
    }
}

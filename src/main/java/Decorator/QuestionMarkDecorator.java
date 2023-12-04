package Decorator;

public class QuestionMarkDecorator implements StringSource {
    private final StringSource stringSource;

    public QuestionMarkDecorator(StringSource stringSource) {
        this.stringSource = stringSource;
    }

    @Override
    public String next() {
        // add question marks to the beginning of the string
        return "??? " + stringSource.next();
    }
}

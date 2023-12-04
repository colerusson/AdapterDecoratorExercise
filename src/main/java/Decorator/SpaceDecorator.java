package Decorator;

public class SpaceDecorator implements StringSource {
    private final StringSource stringSource;

    public SpaceDecorator(StringSource stringSource) {
        this.stringSource = stringSource;
    }

    @Override
    public String next() {
        // remove all spaces from the string
        return stringSource.next().replaceAll(" ", "");
    }
}

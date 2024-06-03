package apple;

public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple a) {
        String at = a.getWeight() > 150? "heavy":"light";
        return "A " + at + " " + a.getColor() + " apple.";
    }
}

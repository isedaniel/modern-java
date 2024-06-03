import apple.Apple;
import apple.AppleColor;
import apple.AppleFancyFormatter;
import apple.AppleSimpleFormatter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple(100);
        Apple apple2 = new Apple(200, AppleColor.GREEN);

        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);

        Apple.prettyPrintApple(apples, new AppleFancyFormatter());

        Apple.prettyPrintApple(apples, new AppleSimpleFormatter());
    }
}
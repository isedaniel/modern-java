import apple.Apple;
import apple.AppleColor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple(100);
        Apple apple2 = new Apple(200, AppleColor.GREEN);

        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);

        Apple.prettyPrintApple(apples, Main::prettyPrint);

    }

    private static String prettyPrint(Apple a) {
        String at = a.getWeight() > 150? "heavy":"light";
        return "A " + at + " " + a.getColor() + " apple.";
    }
}
package apple;

import java.util.List;

public class Apple {
    private final int weight;
    private final AppleColor color;

    public static void prettyPrintApple(List<Apple> inventory, Formatter f) {
        for (Apple a : inventory) {
            String output = f.accept(a);
            System.out.println(output);
        }
    }

    public Apple(int weight) {
        this.weight = weight;
        this.color = AppleColor.RED;
    }

    public Apple(int weight, AppleColor color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public AppleColor getColor() {return this.color;}
}


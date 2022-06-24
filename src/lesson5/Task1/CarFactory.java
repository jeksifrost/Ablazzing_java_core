package lesson5.Task1;

public class CarFactory {

    public static Jiguli makeJiguli() {
        return new Jiguli();
    }

    public static Toyota makeToyota() {
        return new Toyota();
    }
}

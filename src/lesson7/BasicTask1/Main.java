package lesson7.BasicTask1;

public class Main {

    public static void main(String[] args) {

        Fly duckInjured = new Duck(true);
        Fly duckNotInjured = new Duck(false);
        Fly airplaneWithPassengers = new Airplane(10);
        Fly airplaneWithoutPassengers = new Airplane(-1);

        try {
            duckInjured.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

        try {
            duckNotInjured.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

        try {
            airplaneWithPassengers.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

        try {
            airplaneWithoutPassengers.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

    }
}

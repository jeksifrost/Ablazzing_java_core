package lesson5.Task1;

public class Main {

    public static void main(String[] args) {
        Jiguli jiguli = new Jiguli();
        Toyota toyota = new Toyota();
        jiguli.breakdown();
        toyota.music();

        Car[] cars = new Car[40];
        for (int i = 0; i < 40; i++) {
            if (i < 20) {
                cars[i] = new Toyota();
            } else {
                cars[i] = new Jiguli();
            }
        }

        for (Car car: cars) {
            if (car instanceof Toyota myToyota){
                myToyota.music();
            } else if (car instanceof Jiguli myJiguli){
                myJiguli.breakdown();
            }
        }


    }
}

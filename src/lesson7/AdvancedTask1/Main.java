package lesson7.AdvancedTask1;

public class Main {

    public static void main(String[] args) {

        Plant rose = new Rose();
        Plant fern = new Fern();
        Tree spruce = new Spruce(8);
        Tree pine = new Pine(5);

        Tree[] trees = {spruce, pine};
        Plant[] plants = {rose, fern};

        for (Tree tree: trees) {
            tree.smell();
        }

        for (Plant plant: plants) {
            if (plant instanceof Rose) {
                ((Rose) plant).smell();
            }
            plant.blossom();
        }

    }
}

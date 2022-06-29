package lesson7.AdvancedTask1;

public class Spruce implements Tree{

    private int cone;

    public Spruce(int cone) {
        this.cone = cone;
    }

    public int getCone() {
        return cone;
    }

    public void setCone(int cone) {
        this.cone = cone;
    }

    public void smell() {
        System.out.println("Ель: умеет пахнуть");
    }
}

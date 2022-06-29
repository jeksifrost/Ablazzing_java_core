package lesson7.AdvancedTask1;

public class Pine implements Tree{

    private int cone;

    public Pine(int cone) {
        this.cone = cone;
    }

    public int getCone() {
        return cone;
    }

    public void setCone(int cone) {
        this.cone = cone;
    }

    public void smell() {
        System.out.println("Сосна: умеет пахнуть");
    }
}

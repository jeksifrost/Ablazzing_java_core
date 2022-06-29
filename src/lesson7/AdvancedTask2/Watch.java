package lesson7.AdvancedTask2;

public class Watch {

    boolean isBroken;

    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public void tick() throws BrokenWatchException{
        if (isBroken) {
            throw new BrokenWatchException("Ошибка: Часы сломались");
        } else {
            System.out.println("Часы тикают");
        }
    }
}

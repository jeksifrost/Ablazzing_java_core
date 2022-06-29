package lesson7.BasicTask1;

public class Duck implements Fly{

    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    public void fly() throws FlyException{
        if (isInjured) {
            throw new FlyException("Ошибка: утка ранена");
        } else {
            System.out.println("утка летит");
        }
    }
}

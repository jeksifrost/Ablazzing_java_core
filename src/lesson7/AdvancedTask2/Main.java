package lesson7.AdvancedTask2;

public class Main {

    public static void main(String[] args) {

        Watch watchUnbroken = new Watch(false);
        Watch watchBroken = new Watch(true);

        Employee employee1 = new Employee(watchUnbroken);
        Employee employee2 = new Employee(watchBroken);

        Shop shop1 = new Shop(employee1);
        Shop shop2 = new Shop(employee2);

        Brand brand = new Brand(shop1, shop2);

        for (Shop shop: brand.getShops()) {
            try {
                shop.getEmployee().getWatches().tick();
            } catch (BrokenWatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}

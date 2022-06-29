package lesson7.AdvancedTask2;

import java.util.ArrayList;
import java.util.Arrays;

public class Brand {

    ArrayList<Shop> shops = new ArrayList<>();

    public Brand(Shop... shops) {
        this.shops.addAll(Arrays.asList(shops));
    }

    public ArrayList<Shop> getShops() {
        return shops;
    }

    public void setShops(ArrayList<Shop> shops) {
        this.shops = shops;
    }
}

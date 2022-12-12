package HW6Java;

import java.util.TreeMap;

public class Store_nootbook {
    public static void main(String[] args) {
        nootbook noot_1 = new nootbook("acer", "98");
        nootbook noot_2 = new nootbook("Samsung", "200");
        TreeMap<String, Integer> characteris = new TreeMap<>();
        characteris = noot_1.create_characteristic(2, 3, 10);
        System.out.println(noot_1);
        System.out.println(noot_2);
        System.out.println(characteris);
    }

}

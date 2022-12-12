package HW6Java;

import java.util.ArrayList;
import java.util.TreeMap;

public class nootbook {
    String model;
    String cost;
    Integer ram;
    Integer hdd;
    Integer os;
    ArrayList<String> nootbook;
    TreeMap<String, Integer> characteristic;
    TreeMap<ArrayList<String>, TreeMap<String, Integer>> nootbook_with_characteristic;

    public nootbook(String model_input, String cost_input) {
        nootbook = new ArrayList<String>();
        model = model_input;
        cost = cost_input;
        nootbook.add(model);
        nootbook.add(cost);
    }

    public TreeMap<String, Integer> create_characteristic(Integer input_ram, Integer input_hdd, Integer input_os) {
        characteristic = new TreeMap<>();
        ram = input_ram;
        hdd = input_hdd;
        os = input_os;
        characteristic.put("ram", input_ram);
        characteristic.put("hdd", input_hdd);
        characteristic.put("os", input_os);
        return characteristic;
    }
}

package HW6Java;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class nootbook {
    String model;
    Integer cost;
    String ram;
    String hdd;
    String os;
    String colour;
    List<String> nootbook;
    TreeMap<String, Integer> characteristic;

    public nootbook(String model_input, Integer cost_input) {
        nootbook = new ArrayList<String>();
        model = model_input;
        cost = cost_input;
    }

    public String toString() {
        return model + " " + cost;
    }

    public void create_characteristic(String ram_input,String hdd_input,String os_input,String colour_input) {
        characteristic = new TreeMap<>();
        ram = ram_input;
        hdd = hdd_input;
        os = os_input;
        colour = colour_input;
        characteristic.put(colour_input, null);
        characteristic.put(ram,null);
        characteristic.put(hdd,null);
        characteristic.put(colour,null);
    }
}

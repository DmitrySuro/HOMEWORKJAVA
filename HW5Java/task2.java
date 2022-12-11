package HW5Java;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class task2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> spisok = new TreeMap<>();
        spisok.put(0, "Светлана Петрова");
        spisok.put(1, "Кристина Белова");
        spisok.put(2, "Анна Мусина");
        spisok.put(3, "Анна Крутова");
        spisok.put(4, "Иван Юрин");
        spisok.put(5, "Петр Лыков");
        spisok.put(6, "Павел Чернов");
        spisok.put(7, "Петр Чернышов");
        spisok.put(8, "Мария Федорова");
        spisok.put(9, "Марина Светлова");
        spisok.put(10, "Мария Савина");
        spisok.put(11, "Мария Рыкова");
        spisok.put(12, "Марина Лугова");
        spisok.put(13, "Анна Владимирова");
        spisok.put(14, "Иван Мечников");
        spisok.put(15, "Петр Петин");
        spisok.put(16, "Иван Ежов");
        // System.out.println(spisok.get(0).substring(0, spisok.get(0).indexOf(" ")));
        LinkedHashMap<String, Integer> spisok_sort = new LinkedHashMap<>();
        for (int i = 0; i < spisok.size(); i++) {
            int count = 0;
            for (int j = 1; j < spisok.size(); j++) {
                if (spisok.get(i).substring(0, spisok.get(i).indexOf(" ")).equals(spisok.get(j).substring(0,
                        spisok.get(j).indexOf(" ")))) {
                    count++;
                }
            }
            if (count > 1) {
                spisok_sort.put(spisok.get(i).substring(0, spisok.get(i).indexOf(" ")), count);
            }
        }
        System.out.println(spisok_sort);

    }

}

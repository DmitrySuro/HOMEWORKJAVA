package HW5Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Реализуйте структуру телефонной книги
//  с помощью HashMap, учитывая, что 1 человек 
//  может иметь несколько телефонов.
public class task1 {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> telephone_book = new HashMap<>();
        List<Integer> telephone_list = new ArrayList<>();
        telephone_list.add(456);
        telephone_list.add(4343);
        telephone_book.put("Ivan Ivanov", telephone_list);
        System.out.println(telephone_book);
        
    }
}

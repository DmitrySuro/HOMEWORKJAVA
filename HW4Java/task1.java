package HW4Java;

import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.
public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> my_list = new LinkedList<>();
        my_list.add(1);
        my_list.add(10);
        my_list.add(5);
        my_list.add(2);
        my_list.add(20);
        LinkedList<Integer> reverse_list = new LinkedList<>();
        for (int i = my_list.size() - 1; i > 0; i--) {
            reverse_list.add(my_list.get(i));
        }
        System.out.println(reverse_list);
    }
}

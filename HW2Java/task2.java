package HW2Java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class task2 {
    public static void main(String[] args) throws Exception {
        int[] arr = { 5, 4, 3, 276, 9, 24, 57, -23 };
        
        FileWriter log = new FileWriter("log_arr.txt");
        FileOutputStream out = new FileOutputStream("c://temp//testFile2.txt");
        out.write(log.getBytes());



        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    flag = false;

                }
            log.append();
            }    
        }  
        log.close();    
    }
}

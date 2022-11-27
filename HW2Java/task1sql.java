package HW2Java;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class task1sql {/**
 * @param args
 * @throws FileNotFoundException
 */
public static void main(String[] args) throws Exception {
    
    FileReader rd = new FileReader("C:/Users/Пользователь/Desktop/HomeWorkJava/HW2Java/task1.json");
    Scanner st = new Scanner(rd);
    String s = st.nextLine();
    rd.close();
    System.out.println(s);
    String s = s.split(',',1);
    System.out.println(s);    



}
    
}

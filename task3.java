import java.util.Scanner;

public class task3 {public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    String first_number = iScanner.nextLine();
    iScanner.close();

    Scanner iScanner = new Scanner(System.in);
    System.out.println("Выберите знак '+', '-','*','/': ");
    String action_sign = iScanner.nextLine();
    iScanner.close();

    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    String second_number = iScanner.nextLine();
    iScanner.close();
}
    
}

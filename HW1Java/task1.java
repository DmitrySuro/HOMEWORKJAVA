// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

package HW1Java;

import java.util.Scanner;

public class task1 {public static void main(String[] args) {
    
    Scanner iScanner = new Scanner(System.in);
    String digit = iScanner.nextLine();
    int n = Integer.valueOf(digit);
    iScanner.close();
    double res = (n*(n-1))/2;
    System.out.println(res);

}
    
    
    


}
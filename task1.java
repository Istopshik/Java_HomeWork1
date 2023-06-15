import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
    // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
System.out.println("Enter number: ");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    scan.close();

    int factorial = 1;
    int triangle = 0;
    
        for (int i = 1; i <= number; i++) {
            triangle = triangle + i;
        }
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
       

    System.out.printf("triangle = %d; factorial = %d \n", triangle, factorial);




    }
}
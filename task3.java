import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        //3) Реализовать простой калькулятор (+-/*)
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scan.nextInt();
        System.out.println("Введите операцию умножения, деления, сложения или вычетания: ");
        char operation;
        operation = scan.next().charAt(0);
        System.out.println("Введите второе число: ");
        int secondNumber = scan.nextInt();
        scan.close();

        int result;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Операция сложения: " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Операция вычетания: "+ result);
                break;    
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Операция умножения: "+ result);
                break;
            case '/':
                result = firstNumber / secondNumber;
                System.out.println("Операция деления: "+ result); 
                break;   
            default:
                System.out.println("Вы ввели значение не по инструкции!");
                break;
        }
    }
}

package exception3;

import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your two Integer");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try{
            System.out.println(num1 / num2);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}
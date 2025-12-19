/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7.mamac;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Lab7MAMAC {

    /**
     * @param args the command line arguments
     */
  


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                 System.out.println("Hi, welcome to the Mathulog!");

        System.out.println("Enter numbers ");
        int num1 = scanner.nextInt();
                System.out.println("Your first number is " + num1);
        int num2 = scanner.nextInt();
                System.out.println("Your second number is " + num2);
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        System.out.print("Enter a number for factorial: ");
        int factNum = scanner.nextInt();
        System.out.println("Factorial: " + factorial(factNum));

        int[] numbers = {5, 10, 15, 20, 25};
        System.out.println("Sum of array elements: " + sumArray(numbers));

        System.out.print("Enter a number to check prime: ");
        int primeNum = scanner.nextInt();
        
        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is prime.");
        } else {
            System.out.println(primeNum + " is not prime.");
        }
        scanner.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        return sum;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
    
    



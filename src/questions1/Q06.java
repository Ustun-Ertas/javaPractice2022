package questions1;

import java.util.Scanner;

public class Q06 {

    //write a Java Program to swap two numbers
    //12
    //10

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr two numbers to swap :");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();

        System.out.println("Before swapping numbers :"+ n1+ " " + n2);
        double temp = n1;
        n1=n2;
        n2=temp;
        System.out.println("After swapping numbers :"+ n1+ " " + n2);

    }
}

package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Bir sayı giriniz: ");
                int sayi = scanner.nextInt();

                System.out.println("Girilen sayı dahil, tek sayılar:");
                for (int i = 1; i <= sayi; i += 2) {
                    System.out.print(i + " ");
                }
            }
        }



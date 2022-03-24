package practice_basic_day03;

import java.util.Scanner;

public class Q01_MethodCreation01 {

    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("yapacaginiz dort islem * + - / olarak seciniz :");

        char islem = scanner.next().charAt(0);

        System.out.print("birinci sayi: ");
        double sayi1= scanner.nextDouble();
        System.out.print("ikinci sayi: ");
        double sayi2= scanner.nextDouble();

        hesapMakinasi(islem,sayi1,sayi2);
    }

    private static void hesapMakinasi(char islem, double sayi1, double sayi2) {

        switch (islem) {

            case '+':
                System.out.println(sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
                break;
            case '-':
                System.out.println(sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
                break;
            case '*':
                System.out.println(sayi1 + "-" + sayi2 + "=" + (sayi1 * sayi2));
                break;
            case '/':
                System.out.println(sayi1 + "-" + sayi2 + "=" + (sayi1 / sayi2));
                break;


                default:
                    System.out.println("hatali islem girisi");
        }


    }


}
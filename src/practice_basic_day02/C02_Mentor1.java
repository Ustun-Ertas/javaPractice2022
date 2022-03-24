package practice_basic_day02;

import java.util.Scanner;

public class C02_Mentor1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int deger= scanner.nextInt();


        String sonuc=deger%2==0? "Bu sayi cift sayidir": "Bu bir tek sayidir";
        System.out.println("sonuc" +sonuc);
    }
}

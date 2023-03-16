package practice_basic_day03;

public class Q13_WhileLoop01 {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {

        int sayi = 1234;
        int toplam = 0;

        while(sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Basamaklarındaki rakamların toplamı: " + toplam);

    }

}
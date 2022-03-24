package studentPratice;

import java.util.Scanner;

public class UcakFiyati {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int km, yas, tip;
        System.out.println("Mesafeyi Giriniz: ");

        km= scan.nextInt();
        System.out.println("\nYasinizi Giriniz");

        yas= scan.nextInt();
        System.out.println("\nYolculuk Tipini Seciniz(1= Tek Gidis, 2=Gidis/Donus): ");
        tip= scan.nextInt();
        double normalFiyat,yasindirimi,tipIndirimi;

        if (km>0 && yas>0 && (tip==1 || tip==2 )) {
            normalFiyat = km * 0.10;
            if (yas < 10) {
                yasindirimi = normalFiyat * 0.5; //burda indirim oranini hesapliyorum
            } else if (yas >= 10 && yas <= 20) {
                yasindirimi = normalFiyat * 0.10;
            } else if (yas >= 60) {
                yasindirimi = normalFiyat * 0.30;
            } else {
                yasindirimi = 0;
            }
            normalFiyat -= yasindirimi;// fiyatta indirim payimi cikartiyorum
            if (tip == 2) {
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = (normalFiyat - tipIndirimi) * 2;
            }
            System.out.println("Bilet Tutari: " + normalFiyat + "PLN");
        }else {
            System.out.println("Girdiginiz degerler eksik veya yanlis lutfen tekrar deneyiniz !");
        }

    }
}



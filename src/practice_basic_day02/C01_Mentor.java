package practice_basic_day02;

import java.util.Scanner;

public class C01_Mentor {

    public static void main(String[] args) {
        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */


        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen mesleginizi qa/dev/ba/pm seklinde giriniz : ");
        String jobTitle =scan.next().trim().toLowerCase();

        if (jobTitle.equals("qa")){
            System.out.println("meseleginiz : Quality Analyst");

        }else if (jobTitle.equals("dev")){
            System.out.println("Mesleginiz : Developer");

        } else if (jobTitle.equals("ba")){
            System.out.println("Mesleginiz : Business Analyst");

        } else if (jobTitle.equals("pa")){
            System.out.println("Mesleginiz : Project Manager");
        }
        else
            System.out.println("hatali giris");
    }
}

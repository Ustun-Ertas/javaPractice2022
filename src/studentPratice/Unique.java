package studentPratice;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {

        //Bir metindeki unique karakteri bulunan bir kod yaziniz. Hello==> Heo


        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen bir meting giriniz : ");
        String str=scan.next().toLowerCase();


        for (int i = 0; i <str.length(); i++) {

            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.print(str.charAt(i));

            }

        }


    }
}

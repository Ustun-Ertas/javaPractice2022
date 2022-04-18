package questions2;

import java.util.Scanner;

public class Q03 {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("bir metin giriniz :");
        String str= scanner.nextLine();

        int index=0;

        do {
            if (index%2==1){//indexi tek sayi olan
                System.out.print(str.charAt(index)+ " ");//tek sayiya sahip olan indexdeki karakterleri yan yana yazdirir
            }
            index++;
        }while (index<str.length());//indexi str nin uzunlugundan kucuk oldugu surece
        {

        }
    }
}

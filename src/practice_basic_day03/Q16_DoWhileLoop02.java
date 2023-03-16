package practice_basic_day03;

import java.util.Scanner;

public class Q16_DoWhileLoop02 {
    /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Bir kelime girin: ");
                String kelime = scanner.nextLine();

                int uzunluk = kelime.length();
                int orta = uzunluk / 2;

                if (uzunluk % 2 == 1 && uzunluk >= 3) {
                    System.out.println(kelime.charAt(orta));
                } else {
                    System.out.println("Yanlış kelime girdiniz.");
                }
            }
        }



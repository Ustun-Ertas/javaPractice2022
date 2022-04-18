package questions2;

public class Q04 {
     /*
There is a lonely monkey in the island
He needs to eat 4 bananas every day
there are just 165 bananas in that island
Create following variables and find how many days
monkey can survive.
Use do while loop, increment and decrement and if statements
int numberOfBananas =165, survivalDays = 1;
boolean monkeyAlive = true;
*/
     public static void main(String[] args) {

         int numberOfBananas =165;
         int survivalDays = 0;
         boolean monkeyAlive = true;

         do {
             System.out.println("The monkey eats 4 banana everyday");
             numberOfBananas-=4;//toplam muz sayilarini her seferinde 4 muz eksilir
             survivalDays++;//yasadigi gun sayisi 1 artirir.
             if (numberOfBananas<4){//4 den az muz kalirsa
                 monkeyAlive=false;//maymun hayata degil
                 System.out.println("Today " + survivalDays+ " .day banana finish, Monkey is dead :(");

             }else System.out.println("Today " + survivalDays+ " . day monkey still lives");

         }while (monkeyAlive);
         System.out.println("Total monkey living days :" +survivalDays+1);
     }
}

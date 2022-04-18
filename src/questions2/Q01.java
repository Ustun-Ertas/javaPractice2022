package questions2;

public class Q01 {

    public static void main(String[] args) {
        /*

  Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

  Test data:
  Input = AAABBCDD
  output = A3B2C1D2
          */

        String str = "AAABBCDD";
        frekans(str);

    }

    private static void frekans(String str) {

        int sayac = 0;
        String ouput = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    sayac++;
                }

            }
            if (!ouput.contains(str.substring(i,i+1))) {
                ouput +=str.substring(i,i+1)+sayac;
            } sayac = 0;
        }
        System.out.println("ouput = " + ouput);
    }
}




package practice_basic_day05.ObjeOlusturma_ogretmen;

public class BookClass {

    String adi,yazar;
    int yayinyili;

    public BookClass(String adi, String yazar, int yeyinyili) {
        this.adi = adi;
        this.yazar = yazar;
        this.yayinyili = yeyinyili;
    }

    public BookClass(String adi, String yazar) {
        this.adi = adi;
        this.yazar = yazar;
    }

    public void yazdir(){

        System.out.println("kitap : "+adi + "yazar : "+yazar + "yayin yili :"+yayinyili);
    }

    public static void main(String[] args) {

        BookClass kitap1 = new BookClass("Harry Potter and The Goblet of Fire","JK Rowling",2000);
        BookClass kitap2 = new BookClass("Crime and Punishment","Dostoyevsky");
        kitap1.yazdir();
        kitap2.yazdir();

    }
}

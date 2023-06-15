package gun48_Java.day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
         String mi yoksa StringBuilder mi daha hizlidir ?
         bunun icin bir String olusturup, 1000 kere sonuna . ekleyelim
         oncesinde ve sonrasinda zamani alip aradaki farki bulalim.

         ayni islemi string builder icin de yapalim
         */
        LocalTime baslangic=LocalTime.now();
        String str="Ahhhh Java";

        for (int i = 0; i <10000 ; i++) {
            str+=".";
        }
        LocalTime bitis=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);
        
        int StringZaman=bitis.getNano()-baslangic.getNano();
        System.out.println("StringZaman = " + StringZaman);

        baslangic=LocalTime.now();
        StringBuilder sb= new StringBuilder("Ahhhh Java");
        for (int i = 0; i <10000; i++) {
            sb.append(".");
        }
        bitis=LocalTime.now();
        StringZaman=bitis.getNano()-baslangic.getNano();
        System.out.println("StringBuilderZaman = " + StringZaman);



    }
}

package gun48_Java.day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer,String> sinifList = new HashMap<>();

        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Kayra, Emiroglu, Java");
        sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList);
        System.out.println(sinifList.keySet());// keylerin listesini getirin.
        System.out.println(sinifList.values());// degerleri getirir.
        System.out.println(sinifList.values().size());//4

        //tum ogrencilerin isim ve soyisimlerini alt alta yazdirin.

        Collection<String> tumValueColl = sinifList.values();
        String[] eachArr;
        int sira=1;

        for (String each : tumValueColl) {
            /*
             buradaki each bize her bir ogrenciye ait,
             ayni yapidaki isim, soyisim , brans bilgilerini iceren String'ler
             getiriyor.
             */
            eachArr=each.split(", ");
            System.out.println(sira + " - " + eachArr[0]+" "+eachArr[1] );
            sira++;

        }
        /*
         Map'de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek
         bir sinif listesi olusturun.
         */

        List<String> sinifIsimSoyisim= new ArrayList<>();

        for (String each: tumValueColl) {

            eachArr=each.split(", ");
            sinifIsimSoyisim.add(eachArr[0]+" "+eachArr[1]);

        }
        System.out.println(sinifIsimSoyisim);



    }
}

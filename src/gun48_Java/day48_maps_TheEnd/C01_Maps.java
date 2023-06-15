package gun48_Java.day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_Maps {
    public static void main(String[] args) {
        /*
        eger bir elementle ile ilgili tutacagimiz bilgiler coksa veya kompleks ise
        bu defa ic ice map kullanmayi tercih edebiliriz.

        ic ice maap kullandigmizda dahaa fazla dataayi,
        daha duzenli olarak tutma imkanımız olur.
        Ancak, bilgiye ulasmak ve manipule etmek zorlasacaktır.

        Ornek olarak dudnku map'imizi map'lerden olusan bir map olarak
        olusturalim.
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(103,"Kayra, Emiroglu, Java");
        sinifMap.put(104,"Derya, Deniz, Tester");
         */

        Map<String,String> ogr101= new HashMap<>();
        ogr101.put("isim","Enes");
        ogr101.put("soyisim","Cem");
        ogr101.put("brans","Tester");
        Map<String,String> ogr102= new HashMap<>();
        ogr102.put("isim","Kayra");
        ogr102.put("soyisim","Emiroglu");
        ogr102.put("brans","JDev");
        Map<String,String> ogr103= new HashMap<>();
        ogr103.put("isim","Derya");
        ogr103.put("soyisim","Deniz");
        ogr103.put("brans","Devops");

        Map<Integer,Map<String,String>> ogrenciNested=new HashMap<>();
        ogrenciNested.put(101,ogr101);
        ogrenciNested.put(102,ogr102);
        ogrenciNested.put(103,ogr103);

        Set< Map.Entry<Integer,Map<String,String>>> ogrenciEntrySet =ogrenciNested.entrySet();

        for (Map.Entry each:ogrenciEntrySet) {
            System.out.println(each);
        }
        //102 nolu kisinin ismini yazdiralim
        System.out.println(ogrenciNested.get(102).get("isim"));


    }
}

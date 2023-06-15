package gun48_Java.day48_maps_TheEnd;

import gun48_Java.day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap=ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);
        sinifListMap.clear();

        System.out.println("clearden sonra map : "+sinifListMap);

        sinifListMap=ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(114,"Aradiginiz deger yok"));

        System.out.println(sinifListMap.isEmpty());//false

        sinifListMap.putIfAbsent(104,"Derya, Okyanus, Developer");
        sinifListMap.putIfAbsent(106,"Aysun, Can, Devops");
        ReusableMethods.entryYazdir(sinifListMap);
        /*
         SinifListesiMap'e key  olarak 106 yoksa , value "Mevlut, Han, Tester"
         106 daha onceden varsa, eskiden var olan datayi dedgistirmek istediginizden
         emin misiniz ? yazdirin.

         106'nin oldugunu kontrol etmek icin containsKey daha mantıklı ama biz
         yeni ogrendigimiz method ile yapalim.
         */


        if(sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester")==null){
            System.out.println("kayıt basarili");
        }else {
            System.out.println("Eski degeri degistirmek istediginizden emin misiniz?");
        }



    }
}

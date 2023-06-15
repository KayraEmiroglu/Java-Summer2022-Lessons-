package gun48_Java.day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {
        /*
        verilen bir stringddeki kullanilan harfleeri
        ve kullanilan harflerin tekrar sayisini
        H=20 seklinde yazdirin.
         */

        String str="Heeeeelllooooo Woooorrrllllllddd";
        //space'leri saymamasi icin once onları yok edelim.
        str=str.replaceAll("\\W","");

        String[] harflerArr=str.split("");
        System.out.println(Arrays.toString(harflerArr));

        Map<String,Integer> harfKullanimSayilariMap=new HashMap<>();
        Integer harfKullanimSayisi;

        for (String each:harflerArr) {
            if(!harfKullanimSayilariMap.containsKey(each)){
                harfKullanimSayilariMap.put(each,1);
            }else{
                harfKullanimSayisi=harfKullanimSayilariMap.get(each);
                harfKullanimSayilariMap.put(each,++harfKullanimSayisi);
            }

        }
        System.out.println(harfKullanimSayilariMap);

    }

}

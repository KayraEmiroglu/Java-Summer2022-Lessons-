package gun48_Java.day46_maps;

import java.util.*;

public class ReusableMethods {

    public static Map<Integer,String> mapOlustur(){
        Map<Integer,String> sinifMap = new HashMap<>();

        sinifMap.put(101,"Ali, Can, JDev");
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(103,"Kayra, Emiroglu, Java");
        sinifMap.put(104,"Derya, Deniz, Tester");

        return sinifMap;
    }

    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira=1;
        for (String each : ogrenciMap.values() ) {
            System.out.println(sira+" - "+each);
            sira++;
        }

    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakiList=new ArrayList<>();
        String[] eachArr;

        for (String each : ogrenciMap.values()) {
            eachArr=each.split(", ");
            methoddakiList.add(eachArr[0]+ " "+eachArr[1]);
        }

        return methoddakiList;

    }

    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) {

        // brans = bransdakiOgrenciSayisi

        Map<String,Integer> bransOgrSayiMap = new TreeMap<>();//Harf sayisina göre oldu
        Collection<String> valuesColl= sinifListMap.values();
        String[] valueArr;
        String  brans;
        Integer bransdakiOgrSayisi ;

        for (String each:valuesColl) {
            valueArr=each.split(", ");
            brans=valueArr[2];

            if(!bransOgrSayiMap.containsKey(brans)){
                bransOgrSayiMap.put(brans,1);
            }else {
                bransdakiOgrSayisi=bransOgrSayiMap.get(brans);
                bransOgrSayiMap.put(brans,++bransdakiOgrSayisi);
            }
        }
        System.out.println(bransOgrSayiMap);

    }

    public static void entryYazdir(Map<Integer, String> sinifListMap) {
        Set<Map.Entry<Integer,String>> sinifListEntrySeti=sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each:sinifListEntrySeti ) {
            System.out.println(each);
        }

    }
}

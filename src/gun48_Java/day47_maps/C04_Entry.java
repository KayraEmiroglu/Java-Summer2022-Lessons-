package gun48_Java.day47_maps;

import gun48_Java.day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        /*
         Java Entry<K,V> map'in icerisinde bulunan her bir kaydi
         K=V seklinde tutaar
         dolayisiylaa herhaangi bir Entry'e ulastigimizda
         hem key'e hem de value'yaa ulaasabilir ve istedigimiz islemleri yaapabiliriz.

         entry.getKey() bize key'i getirir.
         entry.getValue() bize value'yu getirir.
         entry.setValue()
         */

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);
        //her bir elemani alt alta yazdirin.
        Set<Map.Entry<Integer,String>> sinifEntrySet=sinifListMap.entrySet();

        for (Map.Entry each:sinifEntrySet) {
            System.out.println(each);
            
        }
        /*
        Map'in tum elemaanlarinda avarsa Tester kurs ismini QA olaraka degistirelim.
        
         */
        String eachValue;
        for (Map.Entry<Integer,String>each:sinifEntrySet) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }
        System.out.println(sinifListMap);


    }
}

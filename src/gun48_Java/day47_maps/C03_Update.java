package gun48_Java.day47_maps;

import gun48_Java.day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
        /*
        map.contains(key) verdigimiz key'in map'ded olup olmadıgını boolean olarak doner
        map.contains(value) bir butun oalrak value'nun map'de olup olmadıgını doner

        ONEMLI NOT: map.contaains(value) icindeki bir parcayi bulmada ise yaramaz.
        Eger value icindeki bir parcayi aratmak istiyorsaka map uzerinde manipulation
        yapmamız lazim.

        map.get(key) => verilen key'e aait degeri dondurur.
         */

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        System.out.println(sinifListMap.containsKey(104));//true
        System.out.println(sinifListMap.containsKey(114));//false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));//true
        System.out.println(sinifListMap.containsValue("JDev"));//false

        //Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim.
        //Map'lerde replace tum value'yu dedgistirmek istersek kullanilabilir.
        //kismi degisikliklerde kullanamayız.

       //  Collection<String> valueCollection= sinifListMap.values();

      //  for (String each:valueCollection) {
      //      each=each.replace("JDev","JavaDeveloper");
      //  }
      //  System.out.println(sinifListMap);

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // Map'i guncelleme yapmak icin yeni key, yenideger'i map'e eklemeliyiz
        // ornegin key 101 icin value Ali, Can ,JDev
        // guncelleme icin sinifLisMap.put(101,Ali, Can ,JavaDeveloper)

        // bunu yapabilmek icin her bir key'e ve ona ait value'ya ihtiyacim var

           Set<Integer> keySeti= sinifListMap.keySet();
           String eachValue;
        for (Integer each:keySeti) {
            eachValue= sinifListMap.get(each);
            eachValue=eachValue.replace("JDev","JavaDeveloper");
            sinifListMap.put(each,eachValue);
            /*
             Biz key'lerin tamamini aldik
             her bir key'in value'sunu get'irdik
             value uzerinde degisikligi yapip
             yeni halini put(key, yeniDeger) ile map'e koyduk.
             */
        }
        System.out.println(sinifListMap);



    }
}

package gun48_Java.day24_Array_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_istenmeyenleriSil {
    public static void main(String[] args) {
        /*
        Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
         kalan elementleri yeni bir array yapin
         */

        String[] sehirler={"Istanbul","Ankara","Mersin","Konya","Kastamonu"};
        String istenmeyenHarf="a";
        List<String> kalanlar=new ArrayList<>();

        for (int i = 0; i < sehirler.length ; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)) {
                kalanlar.add(sehirler[i]);
            }
        }
        //loop bittiginde istenmeyen harf icermeyen sehirler,listeye eklenmis
        //olacak
        System.out.println("Liste"+kalanlar);

        //yeni bir array olusturup , listeyi ona aktaralim.
        String[] kalanlarArrayi=new String[kalanlar.size()];
        for (int i = 0; i < kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);

        }
        //sehirler array'inin yeni degerini atayalim.
        sehirler=kalanlarArrayi;

        System.out.println("Sehirler arraayinin son hali : "+Arrays.toString(sehirler));

    }
}

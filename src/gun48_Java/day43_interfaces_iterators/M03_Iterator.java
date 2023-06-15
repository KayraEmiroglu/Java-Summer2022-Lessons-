package gun48_Java.day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste= new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);// [10, 20, 30]

        // liste'deki tum elementleri INDEX KULLANMADAN 3 arttırın.

        for (Integer each:liste) {
            each+=3;
            System.out.print(each + " ");//13 23 33
        }
        System.out.println();
        System.out.println(liste);

        /*
         Java index yapisi olmayan collection'lardaki
         elementlere ulasmak veya degistirmek icin
         Iterator interface'ini olusturmustur.

         Iteraator interface oldugundan ondan obje uretmemiz mumkun degildir.
         bunun yerine bize iterator döndüren liste.iterator(); kullanıyoruz.


         */
        System.out.println(liste);// [10, 20, 30]
        Iterator it1 = liste.iterator();
        //Iteraator'da geri dnus yok, adim adim sona ulastiktan sonra
        // baasa gelmek isterseniz yenidedn bir iterator olusturmanız gerekir.

        while (it1.hasNext()){

        }



    }
}

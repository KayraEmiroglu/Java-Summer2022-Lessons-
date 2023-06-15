package gun48_Java.day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        /*
        Collections <Dataturu> nu object secmeniz durumunda
        Collection'a farkli data turlerinden objeler koymanıza izin verir.
        Bu depolama acisindan bize esneklik sağlar
        Ancak islem yaparkjen tum objeleri Object olarak tanimladgımızdan
        cok fazla casting yapmamız gerekebilir.
         */

        List<String> liste =new ArrayList<>();
        //liste.add(5);
        //liste.add('C');
        //liste.add(true);
        List<Object> liste1 =new ArrayList<>();
        liste1.add(5);
        liste1.add('C');
        liste1.add(true);
        liste1.add("Ali");
        System.out.println(liste1);

        liste1.set(0, (Integer)liste1.get(0)+5);
        liste1.set(3,liste1.get(3)+"can");
        liste1.set(2,!(Boolean)(liste1.get(2)));


        System.out.println(liste1);

        Set<Object> set1= new HashSet();
        set1.add(5);
        set1.add(true);
        set1.add('5');

    }
}

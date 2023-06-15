package gun48_Java.day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {
        /*
        List ile calisirken en kotu ozelligi
        elemanları tek tek eklemek
         */


        Integer[] arr={2,3,5,6,7,8,4,2,6,9,8,1,3,6,4,2,7,0};

        /*
        bu kadar cok elemaanli bir listeyi
        tek tek eleman olaarak girmek yerine
        array olusturup,for loop ile olusturdugumuz list'e tasiyabiliriz.
         */

        List <Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);

        /*
        Bu islemi yapmasi icin Java'nin olusturdugu bir method daha var
        ancak bu yontemin cok yan etkisi var.

        1- bu sekilde olusturulan listede add, remove gibi size'i degistiren
        method'lar kullanılamaz.

        2-asList method'u ile olusturulan liste ve


         */

        List <Integer> sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2);

        sayilar.add(5);
        System.out.println(sayilar);

        arr[0]=20;
        System.out.println(Arrays.toString(arr));//[20, 3, 5, 6, 7, 8, 4, 2, 6, 9, 8, 1, 3, 6, 4, 2, 7, 0]
        System.out.println(sayilar2);




    }
}

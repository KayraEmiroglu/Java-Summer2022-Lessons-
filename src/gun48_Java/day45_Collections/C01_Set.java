package gun48_Java.day45_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // verilen bir array'deki tekrar eden elementleri silip
        // tekrarsız halini array'e atan kod yaziniz.

        int[] arr={4,5,3,6,8,5,19,19,19,8,4,2,5,7,9,1,2,5,7,6};
        Set<Integer> tekrarsizSet= new HashSet<>();
        /*
        mat kume mantıgıyla calisir, her element unique'dir.

         */

        for (int each :arr) {

            tekrarsizSet.add(each);

        }
        System.out.println("set "+tekrarsizSet);

        int[] tekrarsizArr=new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(tekrarsizArr));
        int i=0;
        //sette index mantığı yok ondan dolayı for each ile yaptık
        for (int each:tekrarsizSet) {
            tekrarsizArr[i]=each;
            i++;
        }
        arr=tekrarsizArr;
        System.out.println("son hali array "+Arrays.toString(arr));


    }
}

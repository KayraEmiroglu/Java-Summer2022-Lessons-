package gun48_Java.day24_Array_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {

        int[] arr={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        //arraaydeki tum elemanlari inceleyelim tek sayi olanları list'e atayalim

        for (int each:arr // gelecek dataların turu,loop icinde ne isim verdigim,ve nereden aldıgım
             ) {
            if(!(each%2==0)){
                liste.add(each);
            }

        }
        System.out.println(liste);


    }
}

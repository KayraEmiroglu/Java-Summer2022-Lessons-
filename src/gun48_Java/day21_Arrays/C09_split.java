package gun48_Java.day21_Arrays;

import java.util.Arrays;

public class C09_split {
    public static void main(String[] args) {
        /*
        split() bir array method'u degil,String methodudur.
        ama array dondurdugu icin bu konuda anlatiyoruz.

        split() ile herhangi bir String'i istedigimiz sekilde parcalara bolup
        bir array haline getiriyoruz.
         */

        String str="Java ne kadar guzel";
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        String[] kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));

        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));

        


    }
}

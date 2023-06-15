package gun48_Java.day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

    /*
    array'i yaapan sembol[] idi
    arrayList'ded ise <> diamond kullaniriz
     */

        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);// []

        //bir list'e eleman eklemek istersek

        isimler.add("Basak");
        System.out.println(isimler.add("Ayse"));// true doner
        System.out.println(isimler);// Basak,Ayse

        /*
        Stringde bir method calistirdigimizde
        assign yapmazsak String degismiyordu

        String isim="Kayra"
        isim.toUpperCase();//KAYRA
        sout(isim)->Kayra

         */

        /*
        List'in tek kotu tarafi array alt yapisini kullandigi icin elemanlari
        birer birer eklemek zorunda olmamızdır.
         */

    }
}

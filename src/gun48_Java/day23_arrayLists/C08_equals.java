package gun48_Java.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> urunler2= new ArrayList<>();
        urunler.add("Ikram");
        urunler.add("Nutella");
        urunler.add("Cay");
        urunler.add("Cekirdek");

        System.out.println(urunler.equals(urunler2));//false




    }
}

package gun48_Java.day23_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
        public static void main(String[] args) {
                List<String> urunler= new ArrayList<>();
                urunler.add("Nutella");
                urunler.add("Ikram");
                urunler.add("Cekirdek");
                urunler.add("Cay");


                Collections.sort(urunler);
                System.out.println(urunler);// [Cay, Cekirdek, Ikram, Nutella]

                /*
                List ile gelen sort method'unda siralama ozelligine girmek gerekiyor
                bunun yerine Collections class'indan sort method'unu kullanıyoruz
                bu method listemizi natural order'a gore siralar.
                 */
        }
}

package gun48_Java.day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Beni psikopata bağlamayin";
        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        /*
        eğer büyük kucuk harf donusumunde local bir dili esas alamak isterseniz
        bu method kullanılabilir.
         */




    }
}

package gun48_Java.day10_stringManipulation;

public class C05_Length {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";

        System.out.println(str.length());//str'in karakter sayisini döndürür.

        //son karakterini yazdıralım
        System.out.println(str.charAt(str.length()-1));

        //sondan 3. karakteri yazdıralim
        System.out.println(str.charAt(str.length()-3));

        /*
        Javada null pointer (isaretleyici) bir değer değil
        karşısına yazıldığı variable'in hiç bir değer almadığının işaretcisidir.
         */


        String str2="";//str2'ye bir değer atanmış mıdır? EVET
                        // Bu değer nedir : hiçlik

        String str3=null;//str3'ye bir değer atanmış mıdır? HAYIR
                         //null bu değer atamamayı işaret etmektedir

        System.out.println(str2.length());// 0
        //System.out.println(str3.length());// bir değer atanmamıl ki nasıl uzunluğu olsun?
                                          //NullPointerException olarak hataa verir.
        //null değer atanmadığının işaretçisidir.



    }
}

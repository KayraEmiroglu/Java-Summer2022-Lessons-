package gun48_Java.day10_stringManipulation;

public class C06_IndexOf {

    public static void main(String[] args) {

        String str="Java ogrenmek cok güzel";

        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf("g"));//6
        System.out.println(str.indexOf("t"));//bana integer döndürüyor.
                                             //int de yok diye bir değer bulunmuyor
                                             //0 dersek J'nin indexidir.
                                             //- bir değer dönerse biz aranan string'in str'da olmadığını anlariz
                                             //Java -1 döndürmeyi tercih etmiştir.

        String str5="asjcanjdcasdjcaasjkcndsadcöjsacdjasdc";
        //str5'de p harfi kullanılmış mıdır?
        if(str5.indexOf("a")==-1){
            System.out.println("str5 de istenen harf yoktur.");
        }else {
            System.out.println("str5 de istenen karakter kullanılmış");
        }
    }
}

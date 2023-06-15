package gun48_Java.day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle = "Java cok kolay, Java cok guzel.";
        String kelime="kolay";

        //verilen kelime için aşşağıdaki şartlardan uygun olanı yazan bir program yazınız.
        /*
        -verilen kelime cümlede kullanılmamış
        -verilen kelime cümlede sadece  1 kere kullanılmış
        -verilen kelime cümlede birden fazla kullanılmış.
         */

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen Kelime hiç cümlede kullanılmamış");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen Kelime cümlede 1 defa kullanılmış");
        }else{
            System.out.println("verilen kelime cümlede birden fazla kullanılmış");
        }


    }
}

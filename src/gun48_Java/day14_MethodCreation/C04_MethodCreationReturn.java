package gun48_Java.day14_MethodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        verilen isim ve soyismi ilk harfi buyuk
        geriye kalanlari * olacak şekilde değiştirip
        bize bu halini donduren bir method olusturun.

        Not:programin ilerleyen kısımlarında isim ve soyismi bu
        sekilde kullanmak istiyoruz.

         */

        String isim="enes";
        String soyisim="bozkurt";

        String gizliIsım=isimGizle(isim,soyisim);
        System.out.println(gizliIsım);


    }

    public static String isimGizle(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1)
                .replaceAll("\\w", "*");

        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1)
                .replaceAll("\\w", "*");

            return isim +","+soyisim;
    }
}

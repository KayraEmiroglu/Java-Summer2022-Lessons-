package gun48_Java.day14_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

        /*
          Input olarak verilen isim ve soyismi
          ilk harfi buyuk , geriye kalan harfler * olacak şekilde
          I****,K*****
         */

        String isim="enes";
        String soyisim="bozkurt";

        ismiGizle(isim,soyisim);

    }

    public static void ismiGizle(String isim, String soyisim) {
       isim = isim.substring(0,1).toUpperCase()+isim.substring(1)
               .replaceAll("\\w","*");

        soyisim = soyisim.substring(0,1).toUpperCase()+soyisim.substring(1)
                .replaceAll("\\w","*");
        System.out.println(isim +","+ soyisim);


    }
}

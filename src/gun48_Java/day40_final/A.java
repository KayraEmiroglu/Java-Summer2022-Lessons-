package gun48_Java.day40_final;

public class A {
    protected String isim="Cuneyt";
    final static String OKUL="Yildiz Koleji";
    /*
    Bir variabl finaal olarak tanimlandiysa
    baska class'lardan veya icinde oldugumz class'dan
    bu variable'a baska deger atanmasi mumkun degildir.

    Madem ki degeri degistirilemiyor genelde static de yaparak
    bu variable'a erisim kolaylastirabilir.
    ve genelde static final olarak belirlenen variable isimleri BUYUK harfle yazilir.

     */

    final void finalMethod(){
        System.out.println("Final method override edilemez");
    }



}

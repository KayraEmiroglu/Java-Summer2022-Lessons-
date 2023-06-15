package gun48_Java.day36_inheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe {
    int saatUcreti = 11;
    int gunlukMesai = 7;

    protected void maas() {
        System.out.println("Isciler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void issizlikSigorta() {
        System.out.println("yanhizmetliler %30 indirimli ozel sigorta yaptırabilir.");
    }

    public static void main(String[] args) {
        /*
         overriding child class'daki bir methodun
         parent class'daki ayni isimdeki methodu
         etkisiz haale getirerek kendisinin
         spesifik ozelligini ortaya cikarmasidir.

         Overriding'i nerede dikkate alıyoruz?
         bir obje olusturulurken data turu ve constructor farkli ise

         eger bir obje olusturulurken data turu ve constructor farkli
         ise objenin ozelliklerini belirlerken
         3 konuyaa dikkat cekmeliyiz.
         1- Obje constructor'in oldugu class'da olusur

         2-Objenin ozelliklerini aramaya data turunun oldugu class'dan başlarız.
         bu class'da ozellik bulunamazsa parent class'lara bakilir
         orada da bulamazsak CTE verir.

         eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz.

         3- aranan ozellik method ise degeri yazdirmadan once override edilmis mi
         diye kontrol etmemiz gerekir.
         eger override edildiyse en guncel degeri yazdiririz.

         */
        BMuhasebe yh1=new EYanHizmetler();
        System.out.println(yh1.gunlukMesai);// Muhasebe 8
        System.out.println(yh1.saatUcreti);// Muhasebe 10
        yh1.maas();//YH
        yh1.ozelSigorta();//M
        yh1.sigorta();//P
        System.out.println(yh1.isim);//P
        System.out.println(yh1.soyisim);//P
        System.out.println(yh1.departman);//P
        //System.out.println(yh1.issizlikSigorta);
        //Aramaya muhasebeden basladigimizdadn
        //issizlikSigortasi bulamadik CTE
    }
}

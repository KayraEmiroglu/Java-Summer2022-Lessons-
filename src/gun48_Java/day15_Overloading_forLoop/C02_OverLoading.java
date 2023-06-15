package gun48_Java.day15_Overloading_forLoop;

public class C02_OverLoading {
    public static void main(String[] args) {

        /*
        Javada oluşturdugumuz methodların isminin yaptığı işler ile uyumlu olmasını
        isteriz.Mesela bir stringin bir bölümünü almak için java 2 ader substring() methodu veya
        Verilen stringdeki bazi parcaları yenileri değiştirmek için 2 adet replace()
        methodu var.

        Java ayni isimde birden fazla method varsa hangisinin kullanılacağına
        parammetre sayisi ve parametrelerin data türüne göre karar verir.
         */

        String str="bu java ogrenilecek baska yolu yok";
        str.substring(2);
        str.replace('c','v');
        str.replace("j","h");

        /*
        Aynı isimde ama farklı methodları oluşturmak için
        değiştirebileceğimiz şeyler
        1-parametre sayisi
        2-ayni sayida parametreye sahip olsa bile, parametrelerin data
        türlerini değiştirebiliriz.
        3-Ayni sayida ve aynı data türünde parametreleri olan methodlarda
        parametrelerin sıralısı
         */

    }
}

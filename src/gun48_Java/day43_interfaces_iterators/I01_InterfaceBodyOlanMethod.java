package gun48_Java.day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {


    void motor();
    public void yakit();
    public abstract String aku();

    /*
     normal bir class da oldugumuzu dusunsek
     iki tane acces modifier kullanma ihtimali olamaz.

     asagidaki method'da goreceginiz gibi
     interface'ded istisnai olarak body'si
     olan method'lar olsuturulabilir.
     Bu ozellik Java 8'den sonra kullanılmaya baslamistir.
     bir interface'e yeni bir method eklememiz  gerektiginde
     eskiden beri bu interface'i implement eden tum class'lara gidip
     yeni eklenen method'u override etmemiz gerekirdi.

     Bu ozellik sayesinde baasina defauly veya static keyword ekleyerek
     interface'de yeni ve body'si olan bir method olusturursak
     bu method'un child class'lar tarafından override edilme MECBURİYETİ olmaza.
     Ve eskiden implement etmis class'lari degistirmemiz gerekmez.

     Bu istisnai bir durumdur ve interface icin olusturulan
     genel kuralları bozmaz.

     Bu method'larin body'si olsa da bunlara concrete method denmez.
     ama override edilme mecburiyetleri yoktur

     Buradaki defalt kelimesi acces modifier degil istisnai durumun
     belirtilmesi icindir.

     O zaman nicin 2 keyword (static, defaualt) tanimlanmistir ?

     Bu iki farkli kelimenin amaci child class'lardan bu method'a nasil
     erisilebilecegini belirlemek icindir.Static keyword kullanilirsa, child
     class'dan bu method'a erismek icin InterfaceAdı.methodAdı yeterli olur.

     default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir.
     */

    public default void teker(){
        System.out.println("Tum arabaların tekeri vardir.");
    }
    public static void direksiyon(){
        System.out.println("Tum arabaların direksiyonu vardir.");
    }


}

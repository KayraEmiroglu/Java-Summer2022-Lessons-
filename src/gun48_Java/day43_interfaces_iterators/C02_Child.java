package gun48_Java.day43_interfaces_iterators;

public class C02_Child implements I01_InterfaceBodyOlanMethod {


    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
     parent interface'de abstract olan 3 method'u implement ettigimizde
     Java itirazini durdurur.
     Sonradan ekledigimiz default veya static keywordile tanimladgimiz
     method'lari implement etmememiz sorun olusturmadı.
     */

    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();

        C02_Child obj = new C02_Child();
        obj.teker();

    }

}

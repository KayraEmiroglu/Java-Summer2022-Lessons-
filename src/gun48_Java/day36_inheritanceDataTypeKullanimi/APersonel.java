package gun48_Java.day36_inheritanceDataTypeKullanimi;

public class APersonel {

    protected String isim="Isim belirtilmedi";
    protected String soyisim="Soyisim belirtilmedi";
    protected String departman="Depaartman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelimiz maas alir.");
    }

    protected void sigorta(){
        System.out.println("Tum personelimiz sigortalidir.");
    }


}

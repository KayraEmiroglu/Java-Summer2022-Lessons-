package gun48_Java.day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonel{

    protected int saatUcreti=10;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Muhasebe minimum : "+(30*gunlukMesai*saatUcreti));
    }

    protected void ozelSigorta(){
        System.out.println("Isteyen calisanlara %50 indirimli ozel sigorta yapilir");
    }

}

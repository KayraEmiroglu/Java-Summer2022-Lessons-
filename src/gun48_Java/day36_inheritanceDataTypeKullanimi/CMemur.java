package gun48_Java.day36_inheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe {

    int saatUcreti=12;
    int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptırabilir.");
    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);// 9
        System.out.println(mmr1.saatUcreti);// 12
        mmr1.maas();
        mmr1.ozelSigorta();
        mmr1.sigorta();// Personel
        System.out.println(mmr1.isim);// Personel
        System.out.println(mmr1.soyisim);// Personel
        System.out.println(mmr1.departman);// Personel

        BMuhasebe mhsb1=new BMuhasebe();
        /*
         Her ne kadar memur clas'inin icinde olsamda
         olusturdugum obje Muhasebe class'indan
         Cunku data turu ve constructor BMuhasebe


        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturlabilen bir data turudur

        */
        System.out.println(mhsb1.gunlukMesai);// 8 Muhasebe
        System.out.println(mhsb1.saatUcreti);// 10 Muhasebe
        mhsb1.maas();// Muhasebe
        mhsb1.ozelSigorta();// Muhasebe
        mhsb1.sigorta();// Personel
        System.out.println(mhsb1.isim);// Personel
        System.out.println(mhsb1.soyisim);// Personel
        System.out.println(mhsb1.departman);// Personel

    }
}

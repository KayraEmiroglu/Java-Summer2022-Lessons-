package gun48_Java.day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
         %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */
        double satisFiyati=100;
        double indirimOrani=60;

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimliFiyat = " + indirimliFiyat);

    }

    public static double indirimliFiyatHesapla(double satisFiyat,double indirimOrani) {
        double indirimliFiyat=satisFiyat*(1-indirimOrani/100);
        
        return indirimliFiyat;
    }
}

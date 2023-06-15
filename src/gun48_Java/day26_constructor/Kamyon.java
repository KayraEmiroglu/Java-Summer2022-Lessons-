package gun48_Java.day26_constructor;

public class Kamyon {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        /*
         bizim temel amacimiz KamyonRunner'da argument olarak girilen degerin
         Kamyon class'inde instance variable'a atanmasi
         Ancak scope konusunda ogrendigimiz gibi
         Kamyon constructor scope'ında marka oldugu icin
         instance markaya gitmiyor

         Bu karisikligi gidermek icin instance variable'ları
         belirli hale getirmemiz lazim.
         Java bunun icin this keywordu olusturmustur

         Genel kullanim acisindan this keyword'u kodu herkesin anlamisini
         kolaylastirdigi icin tercih edilir.

         */
    }
    public Kamyon(){

    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "\nmarka= " + marka +
                "\nmodel= " + model +
                "\nyil= " + yil +
                "\nfiyat= "  + fiyat
                ;
    }
}

package gun48_Java.day25_constructor;

public class Car {
    /*
    Bu class bizim kalıphanemiz
    Bir araba olusturmak icin ihtiyacımız olan
    variable ve method'lari bu class'da belirleriz

    sonra farkli class'larda araba olusturmamiz gerekirse
    bu class'dan bir obje olusturup
    burada belirlenen variable ve method'lara gore araba uretiriz.
     */

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;



    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir.");
    }
    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+" km hiz yapar.");

    }

}

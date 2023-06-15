package gun48_Java.day41_abstratcClass_Interface;



public abstract class EToyota extends DAraba {


    @Override
    public void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir.");
    }
    /*
    Parent class'daki standart belirleyici method'lar
    (Abstract method)'larin tamami child class tarafindan override edilmelidir.

    concrete method'larin override edilme mecburiyeti yoktur.
    İstersek override edebiliriz, istemezsek etmeyiz.

    Aslinda Toyota class'i da obje uretecegimiz class değil.
    bu durumda eger proje tasarimi yapiyorsaniz.
    Toyota class'ini da abstract yapmaniz güzel olur.

     */

}

package gun48_Java.day35_inheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen {

    Matematikciler(){
        System.out.println("Matematik parametresiz cons");
    }
    Matematikciler(String isim){
        this();
        System.out.println("Matematik parametreli cons");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tugba");
    }
    /*
    this() cons call, icinde bulunan class'daki construclari
    super() ise parent class'da bulunan constructarlari cagirir.

    this() veya super() parametre yapisina uygun bir cons bulamazsa
    Java CTE verir.

    constructor konnusunda gordugumuz this.
    o class'dadki instance variable'lari refere ediyordu.

    inheritance'da da super. vardir.
    super.parent class'daki instance'lari refere eder.
     */

}

package gun48_Java.day25_constructor;

public class C03 {

    /*
    proje olustururken bazi class'lar run etmek icin degil
    variable ve method olusturup bunları baska class'lardan kullanmak icin
    olusturulur.
     */
    /*
    Default constructor, parametresizdir goremesek bile ihtiyac oldugunda calisir


    Class icerisinde parametreli veya parametresiz herhangi bir constructor
    olusturursak Java default constructor'i siler.
     */

    C03(){

    }
    /*
    Olusturdugumuz parametresiz bu constructor
    Default constructor ile 1-1 aynidir.
    ama biz olusturdugumuz icin buna
    default constructor demeyiz
    parametresiz constructor deriz.
     */

    String isim="Etka";
    public void method01(){
        System.out.println("C03 method calisti");

    }
    public static void method02(){
        System.out.println("static method calisti");
    }
}

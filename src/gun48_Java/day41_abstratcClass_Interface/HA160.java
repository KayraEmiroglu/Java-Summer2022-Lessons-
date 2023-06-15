package gun48_Java.day41_abstratcClass_Interface;


import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes {

    /*
    Abstract parent silsilesinden gelen
    ilk concrete class
    Parent'i olan tum class'daki abstract method'lari
    concrete hale donusturmek (override) Zorundadir.

    Bu kuralin istyisnasi
    parent class'lardan herhangi birinde concrete hale donusturulmus,
    abstract method'lardir
     */
    public static void main(String[] args) {
        HA160 arb1 = new HA160();
        // concrete bir class'dan istedigimiz objeyi uretebiliriz.
        FMercedes arb2 = new FMercedes();

        //EToyota arb3=new EToyota();
        // abstract class'lar constructor barindirir ama obje uretemezler.
        // Toyota class'i abstract class oldugundan obje uretilemez.

        List<String> lis1= new ArrayList<>();
        /*
        Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde
        Data turunu istedigimiz abstract class
        Constructor'i ise child'i olan concret bir classdan seçeriz.
         */



    }
}

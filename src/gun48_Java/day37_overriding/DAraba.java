package gun48_Java.day37_overriding;

public class DAraba {
    /*
     Parent class'dan override edilmesini istemediginiz method'lari
     private, static veya final yapabilirsiniz.
     */

    void yakit(){
        System.out.println("Tum arabalar yakit kullanir");
    }

    void marka(){
        System.out.println("Tum arabalaarin markasi vardir.");
    }
    void motor(){
        System.out.println("Tum arabalarin motoru vardir");
    }


}

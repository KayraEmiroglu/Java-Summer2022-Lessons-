package gun48_Java.day37_overriding;

public abstract class EToyota extends DAraba {

    void marka(){
        System.out.println("Markamiz Toyota.");
        /*
        super.marka();
        eger hem overridden hem de overridding method'un calismasini istersek
        ilk satira super.marka() yazabiliriz.
         */
    }



    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir.");
    }


}

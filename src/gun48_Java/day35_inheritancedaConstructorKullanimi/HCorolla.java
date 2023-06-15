package gun48_Java.day35_inheritancedaConstructorKullanimi;

public class HCorolla extends GToyota{

    HCorolla(){
        System.out.println("Corolla parametresiz cons");
    }
    HCorolla(String isim){
        System.out.println("Corolla parametreli cons");
    }
}

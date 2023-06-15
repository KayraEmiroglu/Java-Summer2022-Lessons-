package gun48_Java.day35_inheritancedaConstructorKullanimi;

public class DMuhasebe extends DPersonel {

    DMuhasebe(){
        System.out.println("Muhasebe Parametresiz cons");
    }
    DMuhasebe(String isim){
        System.out.println("Muhasebe Parametreli cons");
    }

}

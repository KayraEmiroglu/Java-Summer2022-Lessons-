package gun48_Java.day35_inheritancedaConstructorKullanimi;

public class GToyota {

    GToyota(){
        System.out.println("Toyota parametresiz cons");
    }
    GToyota(String isim){
        //super(isim); extends olmadigi icin super(); cons. call 'u java kabul etmez.
        System.out.println("Toyota parametreli cons");
    }

}

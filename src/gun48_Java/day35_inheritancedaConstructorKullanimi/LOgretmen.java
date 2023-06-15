package gun48_Java.day35_inheritancedaConstructorKullanimi;

public class LOgretmen {

    LOgretmen() {
        super();
        System.out.println("Ogretmen parametresiz cons");
    }

    LOgretmen(String isim) {
        this();
        System.out.println("Ogretmen parametreli cons");

    }

}

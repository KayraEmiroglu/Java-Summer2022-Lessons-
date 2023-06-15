package gun48_Java.day35_inheritancedaConstructorKullanimi;

public class KDizel extends HCorolla {

    KDizel(){
        System.out.println("Kdizel parametresiz cons");
    }
    KDizel(String isim){
        super(isim);
        System.out.println("Kdizel parametreli cons"+isim);
    }

    public static void main(String[] args) {

        KDizel obj1= new KDizel();

    }

}

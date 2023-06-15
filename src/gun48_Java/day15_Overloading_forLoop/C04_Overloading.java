package gun48_Java.day15_Overloading_forLoop;

public class C04_Overloading {public static void main(String[] args) {

    topla(5,8);
    topla(5.2,3);
    topla(3.4,6.1);
    topla(5,6.2);
    /*
    Java hangi methodun calısacağına karar verirken optimizasyon yapar
    -eger hic cast yapmadan kullabileceği bir method varsa onu kullanır
    -eger cast yapmadan kullanacagi bir method yoksa en az cast yaparak kullanabileceği
    methodu tercih eder.
     */

}
    public static void topla(int sayi1 ,int sayi2){
        System.out.println("İki integer'in toplami : "+ (sayi1+sayi2));
    }

    public static void topla(double sayi1 ,int sayi2){
        System.out.println("bir double bir int toplami : "+ (sayi1+sayi2));
    }
    public static void topla(double sayi1 ,double sayi2){
        System.out.println("İki double'in toplami : "+ (sayi1+sayi2));
    }


}


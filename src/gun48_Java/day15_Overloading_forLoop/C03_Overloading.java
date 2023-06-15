package gun48_Java.day15_Overloading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {

        topla(5,8);
        topla(5.2,3);
        topla(3.4,6.1);

    }
    public static void topla(int sayi1 ,int sayi2){
        System.out.println("İki integer'in toplami : "+ (sayi1+sayi2));
    }

    /*
    ---Bir classta parametre sayisi ve parametre türleri aynı olan 2 method
    olusturamayız!!!!.
    public static void topla(int sayi3 ,int sayi4){
        System.out.println("İki integer'in toplami : "+ (sayi3+sayi4));
    }*/

    public static void topla(double sayi1 ,int sayi2){
        System.out.println("bir double bir int toplami : "+ (sayi1+sayi2));
    }
    public static void topla(int sayi1 ,double sayi2){
        System.out.println("bir int bir double toplami : "+ (sayi1+sayi2));
    }

    public static void topla(double sayi1 ,double sayi2){
        System.out.println("İki double'in toplami : "+ (sayi1+sayi2));
    }


}

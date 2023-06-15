package gun48_Java.day31_timeFormatter_varargs;

public class C02_Varargs {
    public static void main(String[] args) {

        //verilen 2 int'i toplayıp sonucu yazdiran bir method olusturun.

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;

        toplaYazdir(sayi1, sayi2, sayi3,sayi4);

    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Verilen dört sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("Verilen üç sayinin toplami : " + (sayi1 + sayi2 + sayi3));
    }

    public static void toplaYazdir(int sayi1, int sayi2) {
        System.out.println("Verilen iki sayinin toplami : " + (sayi1 + sayi2));

    }
}

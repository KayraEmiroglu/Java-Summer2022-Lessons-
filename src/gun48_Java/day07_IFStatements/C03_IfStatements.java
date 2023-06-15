package gun48_Java.day07_IFStatements;

public class C03_IfStatements {
    public static void main(String[] args) {
        /*
        bir if statementta  {} kullanılmazsa java ilk satırı şart ile bağlar,
        sonraki satırlar bağımsız olur

        Eğer birden fazla satir ayni if şartına bağlanmışsa mutlaka {} kullanmalıyız.

         */

        int sayi = 23;

        if (sayi > 0)
            System.out.println("sayi pozitif");
        System.out.println("pozitif kalacaktir");
        System.out.println("Ucuncu satir");

        if (sayi % 2 == 0)
            System.out.println("sayi çift");
        System.out.println("cift kalacaktir");


        if (sayi % 5 == 0)
            System.out.println("sayi 5'in tam kati");


    }
}

package gun48_Java.day03_scanner;

public class C02_Swaap {
    public static void main(String[] args) {
        int sayi1 = 30;
        int sayi2 = 50;
        int temp=0;

       /* temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("swapden sonra sayi1 :" + sayi1);
        System.out.println("swapden sonra sayi2 :" + sayi2);*/

        sayi1 = sayi2 + sayi1;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println("swapden sonra sayi1 :" + sayi1);
        System.out.println("swapden sonra sayi2 :" + sayi2);

    }
}

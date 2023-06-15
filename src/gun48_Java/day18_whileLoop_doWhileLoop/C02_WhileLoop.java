package gun48_Java.day18_whileLoop_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin ve
        bu sayının rakamlari toplamini yazdirin
         */

        int input=5432;
        int toplam=0,birlerBasamagi=0,temp=input;

        while(temp>0){
            birlerBasamagi=temp%10;
            temp/=10;
            toplam+=birlerBasamagi;



        }
        System.out.println(input + " sayisinin rakamlar toplami:"+toplam);

    }
}

package gun48_Java.day21_Arrays;

public class C01_Array_MaxSayiyiBulma {
    public static void main(String[] args) {
        /*
        Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
         */

        int[] sayilar={3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);



    }

    private static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0];

        for (int i = 1; i < sayilar.length ; i++) {
            if(sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }


        }


        System.out.println("Arraydaki en buyuk sayi : " + maxSayi);


    }
}

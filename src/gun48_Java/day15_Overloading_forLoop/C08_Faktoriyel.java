package gun48_Java.day15_Overloading_forLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {
        /*
        input olarak verilen bir tam sayi için faktoriyel hesaplayıp yazdıran
        bir method olusturun.

        verilen sayi negatif veya 20den buyuk olursa
        girilen sayinin faktoriyeli hesaplanamaz uyarısı yazdirin.
         */

        int input=5;

        faktoriyelHesapla(input);





    }

    public static void faktoriyelHesapla(int input) {
        int faktoryel=1;
        if(input<0 || input>19){
            System.out.println("Verilen sayi icin faktoryel hesaplanamaz");
        }else if(input==0){
            System.out.println("0! = 1dir");
        }else {
            for (int i = 1 ; i <=input ; i++) {
                faktoryel*=i;
            }
            System.out.println(faktoryel);
        }

    }
}

package lambda.lambda_Functional_Programming01;

import java.util.stream.IntStream;

public class Fp05 {
    public static void main(String[] args) {
        System.out.println(get7den100Toplam());
        System.out.println(get7den100Toplam02());
        System.out.println(get2den11Carpim());
        System.out.println(faktoriyel(5));
        System.out.println(ikiCiftSayiArasindakiToplam(10,1));
        System.out.println(ikiSayiArasindakiSayiTopla(32,23));

    }

    //1) 7'den 100'e kadar
    // integer değerlerinin toplamını bulan bir method oluşturun.
    //1.yol
    public static int get7den100Toplam(){
       return IntStream.range(7,101).reduce(0,Math::addExact);
    }
    //2.yol
    public static int get7den100Toplam02(){
        return IntStream.rangeClosed(7,100).reduce(0,Math::addExact);
    }
    //2)2'den 11'e kadar
    // integer değerlerinin çarpımını bulan bir method oluşturun.
    public static int get2den11Carpim(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }
    //3)Verilen bir sayının faktoriyelini
    // hesaplayan bir method oluşturun.
    // (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static int faktoriyel(int x){
        if(x>0 && x<13){
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0'dan buyuk deger giriniz.");
        return 1;
    }
    //4) Verilen iki sayı arasındaki
    // çift sayıların toplamını bulan bir method oluşturun.
    public static int ikiCiftSayiArasindakiToplam(int x,int y){
        int z=0;
        if(x>y){
            z=x;
            x=y;
            y=z;

        }

            return IntStream.rangeClosed(x,y).filter(Utils::ciftElemanlariSec).reduce(Math::addExact).getAsInt();
    }
    //5)Verilen iki sayı arasındaki tüm sayıların
    //rakamlarının toplamını hesaplayan bir method oluşturun
    //23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public static int ikiSayiArasindakiSayiTopla(int x ,int y){
        int z=0;
        if(x>y){
            z=x;
            x=y;
            y=z;
        }
        return IntStream.rangeClosed(x,y).map(Utils::rakamlarToplami).sum();
    }


}

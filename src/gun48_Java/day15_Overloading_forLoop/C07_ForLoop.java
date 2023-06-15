package gun48_Java.day15_Overloading_forLoop;

import static gun48_Java.day15_Overloading_forLoop.C06_StringTerseCevirme.terstenYazdir1;

public class C07_ForLoop {
    public static void main(String[] args) {

        terstenYazdir1("Zekeriya");


        //100 den 1 e kadar(sınırlar dahil) 8 ile bölünebilen sayilari yazdirin
        int toplam=0;
        for (int i =100; i >0 ; i--) {
            if (i%8==0){
                System.out.print(i+" ");
            }

        }

    }
}

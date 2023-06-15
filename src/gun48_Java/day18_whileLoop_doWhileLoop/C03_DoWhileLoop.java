package gun48_Java.day18_whileLoop_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
           while loop'da once kontrol edip sonra islem yaptıgımız icin
           islem bittikten sonra loop'un kırılması icin bir kez daha basa donmemiz
           gerekiyor.Bu durumda fazladan bir islem yapiliyor.
         */

        int sayi=7;

         while(sayi<10){
            System.out.println(sayi);
            sayi++;
        }


         /*
           do- while loop ile calistgimizda bu dezavantaj ortadan kalkar.
          */

        sayi=7;

        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<10);


    }
}

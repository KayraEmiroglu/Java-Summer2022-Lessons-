package gun48_Java.day16_ForLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*

       Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
       1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
         - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
         - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
         - Sayi hem 3’un hem 5’in kati ise sayi yerine "Java Guzeldir" yazdirin.


         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 100 den kucuk bir tam sayi giriniz");
        int number1= scan.nextInt();

        for (int i = 1; i <=number1; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("Java Guzeldir ");
            } else if (i%3==0) {
                System.out.print("Java ");
            } else if (i%5==0) {
                System.out.print("Guzeldir ");
            }else{
                System.out.print(i+" ");
            }

        }

    }
}

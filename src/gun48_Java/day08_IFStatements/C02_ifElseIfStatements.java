package gun48_Java.day08_IFStatements;

import java.util.Scanner;

public class C02_ifElseIfStatements {
    public static void main(String[] args) {
            /*
     Kullanıcıdan 100 üzerinden notunu isteyin.
     Not'u harf sistemine çevirip yazdırın.
     50'den kucukse "D",
     50ye eşit 60 tan küçükse "C",
     60a eşit 80 den küçükse"B",
     80'nin uzerinde ise "A"
     */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 0'dan 100 e kadar bir not değeri grinz");
        double notes = scan.nextDouble();
        
        if(notes<0 || notes>100){
            System.out.println("Lütfen geçerli bir not giriniz");
        } else if (notes<50) {
            System.out.println("Notunuz : D");
        }else if (50 <= notes && notes<60) {
            System.out.println("Notunuz : C");
        }else if (60 <= notes && notes<80 ) {
            System.out.println("Notunuz : B");
        }else  {
            System.out.println("Notunuz : A");
        }


    }
}

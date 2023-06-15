package gun48_Java.day07_IFStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        /*
        Bir önceki soruda kullanıcı negatif değer girerse uyarın

        Not: birden fazla if - else if birbirine bağlı ise son durum önemlidir.
        Eğer else ile bitiyorsa bütün ihtimaller kapsanıyor demektir.
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");

        int yas = scan.nextInt();

        if(yas<0) {
            System.out.println("Lütfn geçerli bir yaş yaziniz");

        }else if(yas<65){
            System.out.println("emekli olamazsın,çalışmalisin");
            System.out.println("Bu kadadr yıl daha çalışmalısın : "+ (65-yas));
        }else{
            System.out.println("emekli olabilirsin");
        }
    }
}

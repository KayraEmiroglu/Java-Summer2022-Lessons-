package gun48_Java.day08_IFStatements;


import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        /*
        emeklilik kontrolü yapan bir program yaziniz
        cinsiyet olarak E(erkek) veya K(kadın) değişkenlerini
        kabul etsin farklı bir harf veya sembol girilirse hata mesaji versin

        emeklilik için kadınlarda yaş siniri 60
        erkeklerde 60 olsun

        negatif yas veya 80'den büyük yaş girilirse hata mesaji versin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi yazınız"+
                "\n Kadin K için erkek için E harfini giiniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas =scan.nextDouble();

        if(cinsiyet=='E'){
            if(yas<0 || yas>80){
                System.out.println("Geçerli bir yaş giriniz");
            } else if (yas<65) {
                System.out.println("Emekli olamazsın");
            }else {
                System.out.println("Emekli olabilirsin.");
            }

        }else if(cinsiyet=='K'){
            if(yas<0 || yas>80){
                System.out.println("Geçerli bir yaş giriniz");
            } else if (yas<60) {
                System.out.println("Emekli olamazsın");
            }else {
                System.out.println("Emekli olabilirsin.");
            }

        }else {
            System.out.println("Lütfen geçerli bir tercih giriniz");
        }

    }
}

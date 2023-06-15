package gun48_Java.day03_scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {
        //kullanıcdan ismini isteyin
        //girilen ismi
        //isminiz:... şeklinde yazdırın

        //İnsanların dünyasından kodlarımızın bulunduğu class'a değer almak için
        //Scanner classını kullanırız.

        //1-Scanner objesi oluşturalım
        Scanner scan = new Scanner(System.in);
        //2-Kullanıcıya ne istediğimizi söyliyelim
        System.out.println("Lütfen isminizi giriniz!");

        //3-oluşturduğumuz scan objesiyle kullancının girdiği değeri alıp
        //oluşturacağımız uygun bir variable'a atayalım.

        String kullaniciIsmi=scan.next();
        System.out.println("İsminiz :" + kullaniciIsmi);

    }

}

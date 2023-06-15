package gun48_Java.day07_IFStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {

        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
        *** String icin equals method’unu kullanin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String day=scan.next().toLowerCase();
        //Pazar , pazar, PAZAR PaZaR , PAzar ??? bilemeyiz,
        //pazar, pazar,pazar, pazar , pazar

        if(day.equals("pazar") || day.equals("cumartesi")){
            System.out.println("Girilen gün Haftasonu");
        }
        if(day.equals("pazartesi") || day.equals("sali") || day.equals("çarşamba")
        || day.equals("perşembe") || day.equals("cuma")){
            System.out.println("Girilen gün haftaiçi");
        }

        if(!(day.equals("pazartesi") || day.equals("sali") || day.equals("çarşamba")
                || day.equals("perşembe") || day.equals("cuma")||day.equals("cumartesi")
        || day.equals("pazar"))){

            System.out.println("lütfen geçerli bir gün giriniz");

        }



    }
}

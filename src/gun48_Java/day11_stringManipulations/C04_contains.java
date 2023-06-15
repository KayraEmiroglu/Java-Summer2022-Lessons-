package gun48_Java.day11_stringManipulations;




public class C04_contains {
    public static void main(String[] args) {


        String cumle = "Java buyuk , dunya kucuk";
        cumle=cumle.toLowerCase();
        //requirements'de buyuk harf kucuk harf hassasiyeti hakkında bir şey söylenmemiş
        //ikinci olarak da her iki kelimeyi de içerme durumu acıklanmamış
        // bu durumda gorevi bize kim verdiyse ona sormak lazım.

        // ek requirements:ikisini de içeriyorsa "Karar ver buyuk mu yazdirayım kucuk mu?"
        //case sensitive olmasın.

        if(cumle.contains("kucuk")&& cumle.contains("buyuk")){
            System.out.println("Karar ver buyuk mu yazdırayım kucuk mu yazdırayım");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        }else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());

        }else{
            System.out.println("Cumle kucuk ya da buyuk kelimesi içermiyor");
        }



    }

}

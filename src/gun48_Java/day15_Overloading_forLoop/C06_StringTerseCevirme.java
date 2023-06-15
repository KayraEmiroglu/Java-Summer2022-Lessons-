package gun48_Java.day15_Overloading_forLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {
        //input olarak verilen Stringi terse cevirip yazdiran bir method oluşturun

        String input="Ey edip adanada pide ye";

        terstenYazdir1(input);

    }

    public static void terstenYazdir1(String input) {
        String tersInput="";

        for (int i = input.length()-1; i >=0; i--) {
            tersInput+=input.substring(i,i+1);
        }
        System.out.println("tersInput = " + tersInput);
    }
}

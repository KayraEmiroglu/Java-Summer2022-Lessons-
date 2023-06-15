package gun48_Java.day14_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
     //verilen 3 basamkli bir sayinin
     //rakamlari toplamini yazdiran bir method olusturalim


        int input=423;

        rakamlariTopla(input);




    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input=input/10;
        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        rakamlarToplami+=input;

        System.out.println("rakamlarToplami = " + rakamlarToplami);
        
    }
}

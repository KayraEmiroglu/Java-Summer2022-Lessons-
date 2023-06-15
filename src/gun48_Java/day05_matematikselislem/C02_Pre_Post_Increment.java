package gun48_Java.day05_matematikselislem;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {


        int sayi=10;


        System.out.println("preincrement : "+ ++sayi);//11

        System.out.println("postincrement : "+ sayi++);//11

        System.out.println("post-increment'den sonra : " + sayi);//12

        sayi++;//13
        ++sayi;//14



    }
}

package gun48_Java.day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {
        String str="123a5";
        int sayi=0;
        try {
             sayi=Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sadece rakamlardan olusmalidir");
        } catch(Exception e){
            System.out.println("Ongorulemeyen bir hata olustu.");
        }
        System.out.println("Saayinin kare :"+ sayi*sayi);



        /*
        Kullanicidan String olarak bir deger aliyor ve bunu
        integer'a ceviriyorsak
        NumberFormatException ile karsiableceigimiz ongururz
        NFE aaldigmizda kodun durmamasini istiyorsak try-catch ile
        cevreleyebilriiz.

        Eeger bilmedigim bir exception daha olusursaa kodum durmasin istiyorsaak
        bir kere daha catch cumlesi ekleyip onaa en genis Exception'i yazabiliriz
         */


    }
}

package gun48_Java.day41_abstratcClass_Interface;

public class C01_Exception {


    public static void main(String[] args) {
        try {

            calis();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private static void calis() {

        throw new RuntimeException("Çoook çalış");
        /*
         throw ile kontrollu exception olustururken
         parametre olarak istedigimiz hata mesajini girebiliriz.
         */

    }
}
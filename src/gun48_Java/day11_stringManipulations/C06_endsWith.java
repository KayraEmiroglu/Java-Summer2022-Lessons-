package gun48_Java.day11_stringManipulations;

public class C06_endsWith {
    public static void main(String[] args) {


        String email="kayra@gmail.com";

        if(!(email.contains("@gmail.com"))){
            System.out.println("Lütfen gmail adresi giriniz");
        } else if (email.endsWith("gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("Lütfen yazımı kontrol ediniz");
        }


    }
}

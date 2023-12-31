package gun48_Java.day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {
    public static void main(String[] args) {
        int k;

        try {
            FileInputStream fis=new FileInputStream("src/gun48_Java.day39_exceptions/Test.txt");


            while ((k=fis.read())!=-1){
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi veya dosya bozuk.");
        } catch (IOException e) {
            System.out.println("Dosyadaan bilgiler okunamadı");
        }

    }
}

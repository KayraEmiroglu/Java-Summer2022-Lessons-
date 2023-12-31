package gun48_Java.day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : " + tarihSaat);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println(dtf1.format(tarihSaat));//25/7/22 09:41

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat));//25/Tem/2022 21:41
    }
}

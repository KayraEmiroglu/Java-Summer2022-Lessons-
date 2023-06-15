package gun48_Java.day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat);//2022-07-23T19:34:18.181113100

        System.out.println(tarihSaat.plusMonths(3).plusHours(3));

    }
}

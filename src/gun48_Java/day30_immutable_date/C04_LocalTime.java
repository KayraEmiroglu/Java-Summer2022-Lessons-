package gun48_Java.day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println("time1 = " + time1);
        /*
         Bizim olusturdugumuz date ve time
         canli saat veya tarih degildir.
         LocalTime.now(); kullandigimiz satirda o anki tarih
         veya saati alip bizim variable'imizaa store eder.
         time1 varaiable'inin degeri sabittir.
         */

        Thread.sleep(3000);

        time1=LocalTime.now();
        System.out.println("time1 = " + time1);

        System.out.println(time1.minusMinutes(200));//16:08:04.346461800





    }
}

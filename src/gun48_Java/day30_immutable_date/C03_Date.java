package gun48_Java.day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);//2022-07-23

        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getYear());
        System.out.println(tarih.getDayOfWeek());//SATURDAY
        System.out.println(tarih.getMonthValue());//7
        System.out.println(tarih.isLeapYear());// false

        LocalDate tarih2=LocalDate.of(2001,5,15);
        System.out.println(tarih2);

        LocalDate tarih3 = LocalDate.of(1990, Month.JANUARY,10);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));

        System.out.println(tarih.minusWeeks(20));

        System.out.println(tarih.isAfter(tarih2));// true

        //iki farkli dogum gunu girildiginde hangisinde
        //doganin daha buyuk oldugunu bulunuz.
        // tarih 2 ve tarih3 icin yapalim

        if(tarih2.isAfter(tarih3)){
            System.out.println(tarih3+" tarihinde dogan daha buyuk.");
        }else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2+" tarihinde dogan daha buyuk");
        }else{
            System.out.println("iki tarih birbiri ile ayni");
        }


    }
}

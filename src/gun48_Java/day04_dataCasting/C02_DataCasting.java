package gun48_Java.day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {

        int sayi1=23;
        int sayi2=5;

        System.out.println(sayi1/sayi2);//ikisi de intiger olduğundan sonucu int olarak kabul edip yazdırır.
        //4.6 değil  yazdırır.


        System.out.println(25*7/3);//58.6-> 58


        double sayi3=5;
        System.out.println(sayi1/sayi3);// 4.6 iki variable'ın data türü değişik olduğunda
                                        //daha kapsaamlı olanı data türü olarak kabul eder.






    }

}

package lambda.lambda_Functional_Programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

    /*
     1) Lambda functional programming Java 8 ile kullanmaya baslanmıstır.
     2)functional programming "Ne yapılacak"(What to do) uzerine yogunlasilir.
     3)Structered Programming"Nasıl yapilacak" uzerine yogunlasir.
     4)Functional programming arrays ve collections ile kullanilir.
     5)entryset() methodu ile Map Set'e donusturulerek Functional programming de kullanılır.

     */

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(l);
        listElemanlariniYazdirStructed(l);
        System.out.println();
        listElemanlariniYazdirFunctional(l);
        System.out.println();
        ciftElemanlariYazdirStructured(l);
        System.out.println();
        ciftElemanlariYazdirFunctional(l);
        System.out.println();
        tekElemanlarinKareleriniYazdir(l);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(l);
        System.out.println();
        tekrarsizCiftElemanlariKareYazdir(l);
        System.out.println();
        getMaxEleman01(l);
        System.out.println("Min eleman:");
        getMinEleman01(l);
        getMinEleman02(l);
        getTekrarsizElemanlarinYarisi(l);
    }
    //1) Ardışık list elementlerini aynı satırda aralarında bosluk bırakarak
    //yazdıran bir method olusturun(Structured).

    public static void listElemanlariniYazdirStructed(List<Integer> list){

        for(Integer w:list){

            System.out.print(w+" ");

        }
    }
    //1) Ardışık list elementlerini aynı satırda aralarında bosluk bırakarak
    //yazdıran bir method olusturun(Functional).

    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(t-> System.out.print(t+" "));
        //stream() methodu collection'dan elementleri akışa dahil etmek için
        //ve methodlara ulaşmak için kullanılır

    }
    //2)  çift list elemanlarını aynı satırda aralarında bosluk bırakarak
    //yazdıran bir method olusturun(Structured).

    public static void ciftElemanlariYazdirStructured(List<Integer> list){

        for (Integer w:list ) {
            if(w%2==0){
                System.out.print(w+" ");
            }
        }

    }
    //2)  çift list elemanlarını aynı satırda aralarında bosluk bırakarak
    //yazdıran bir method olusturun(Functional).

    public static void ciftElemanlariYazdirFunctional(List<Integer> list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

    }

    //3)Ardışık tek list elemanlarının karelerini aynı satırda aralarında
    //bosluk bırakarak yazdıran bir method olusturun

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){

        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
        //elemanların degerleri degisecekse map methodu kullanilr
    }
    //4)Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı
    // satırda aralarında bosluk bırakara yazdiran bir method olusturun.

    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){

        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
        //distinct() methodu unique değerleri alır.
        //stream bazı listte olan methodları kullanmayı engeller.
    }
    //5)Tekrarsiz cift elemanların karelerinin toplamini hesaplayan bir method olusturn.

    public static void tekrarsizCiftElemanlariKareYazdir(List<Integer> list){
     Integer toplam=  list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
        //reduce() methodunu kullandıgımız zaman bir kontenyera atamamız lazım.
    }
    //6)Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlariKupCarpimi(List<Integer> list){

        Integer carpim=list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpim);
    }

    //7) list elemanlari arasından en buyuk degeri bulan bir method olusturun.
    //1.yol:
    public static void getMaxEleman01(List<Integer> list){

       Integer max =  list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u? t : u );
        System.out.println(max);

    }
    //2.yol:
    public static void getMaxEleman02(List<Integer> list){

       Integer max =  list.stream().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
       System.out.println(max);
    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    //1.yol:
    public static void getMinEleman01(List<Integer> list){
        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("la "+min);
    }
    //2.yol:
    public static void getMinEleman02(List<Integer> list){
        Integer min = list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("sa "+min);
    }

    //9)List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void getYedidenBuyukCiftMin(List<Integer> list){

        Integer min = list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
        System.out.println(min);
    }
    //2.yol
    public static void getYedidenBuyukCiftMin02(List<Integer> list){

       Integer min= list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
       System.out.println(min);
    }
    //3.yol
    public static void getYedidenBuyukCiftMin03(List<Integer> list){
        Integer min = list.stream().filter(t->t%2==0).filter(t->t>7).findFirst().get();
        System.out.println(min);
    }
    //10)Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı
    //değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void getTekrarsizElemanlarinYarisi(List<Integer> list){

       List<Double>doubleList= list.stream().
                distinct().
                filter(t-> t>5).
                map(t->t/2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(doubleList);

    }


}

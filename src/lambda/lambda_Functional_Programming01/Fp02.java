package lambda.lambda_Functional_Programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
      1) t-> "Logic" , (t,u)-> "Logic"
      Bu yapıya "Lambda Expression"
      2) Functional Programming kapsamında "Lambda Expression" yerine
      "Method Reference" tercih edilir.
      3)"Method Reference" kullanimi "Class name :: Method Name"
        Aynı zamanda kendi class'larinizi da kullanabilirsiniz.

        Ornegin bir Animal class'iniz var ve bu class "eat()" methoduna sahip
        ==> "Animal ::eat"
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
        listElemanlariYazdir(l);
        System.out.println();
        ciftElemanlariYazdirFunctional(l);
        System.out.println();
        tekElemanlarinKareleriniYazdir(l);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(l);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(l);
        tekrarsizCiftElemanlarinKupCarpimi(l);
        enBuyukDegerliEleman(l);
        yedidenBuyukEnKucukCift(l);
        bestenBuyukElemanlarinYarisi(l);
    }
    //1)Ardışık list elemanlarını aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariYazdir(List<Integer> list){
        list.stream().forEach(Utils::ayniSatirdaBoslukYazdir);
    }
    //2)Ardışık çift list elementlerini aynı satırda aralarında
    //boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBoslukYazdir);
        //filter methodu false'leri geçirmez
    }
    //3)Ardışık tek list elemanlarının karelerini aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
        list.stream().filter(Utils::telElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBoslukYazdir);

    }
    //4)Ardışık tek list elemanlarının küplerini tekrarsız olarak
    // aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){
        list.stream().distinct().
                filter(Utils::telElemanlariSec).
                map(Utils::kupunuAl).
                forEach(Utils::ayniSatirdaBoslukYazdir);
    }

    //5)  Tekrarsız çift elemanların
    // karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){

         Integer toplam=list.stream().
                distinct().
                filter(Utils::ciftElemanlariSec).
                map(Utils::karesiniAl).
                reduce(0,Math::addExact);
        System.out.println(toplam);


    }
    //6) Tekrarsiz cift elemanlarin
    // küpünün çarpimini hesaplayan bir method olusturun

    public static void tekrarsizCiftElemanlarinKupCarpimi(List<Integer> list){
       Integer carpim = list.stream().distinct().filter(Utils::ciftElemanlariSec).
                map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);
    }
    //7)List elemanlari arasindan en buyuk degeri bulan bir method olusturun.
    public static void enBuyukDegerliEleman(List<Integer> list){
       Integer maxDeger= list.stream().distinct().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println(maxDeger);
    }
    //9)List elemanlari arasindan 7'den buyuk ,cift, en kucuk değeri bulan
    //bir method olusturun.
    public static void yedidenBuyukEnKucukCift(List<Integer> list){
       Integer minDeger= list.stream().
                distinct().
                filter(t-> t>7 &&  t%2==0 ).reduce(Math::min).get();
        System.out.println(minDeger);
    }
    //10) Ters siralama ile tekrarsiz ve 5'ten buyuk elemanlarin yari degerlerini
    // bulan bir method yaziniz
    public static void bestenBuyukElemanlarinYarisi(List<Integer> list){
        List<Double> sonuc =list.stream().distinct().filter(t-> t>5).map(Utils::yariyaBol).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);

    }

}

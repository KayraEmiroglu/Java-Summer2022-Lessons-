package lambda.lambda_Functional_Programming01;

import java.util.ArrayList;
import java.util.List;

public class Fp04 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        System.out.println(l);
        System.out.println(uzunlugu12denAzMi(l));
        System.out.println(xIleBaslamiyorMu(l));
        System.out.println(rIleBitiyorMu(l));
    }

    //9)Tüm elemanların uzunluklarının
    // 12'den az olup olmadığını kontrol eden bir method oluşturu

    public static boolean uzunlugu12denAzMi(List<String> list){
        return list.stream().allMatch(t-> t.length()<12);
    }
    //10)Hiçbir elemanın 'X' ile başlamadığını
    // kontrol eden bir method oluşturun.ü

    public static boolean xIleBaslamiyorMu(List<String> list){

        return list.stream().noneMatch(t-> t.startsWith("X"));
    }
    //11) Herhangi bir elemanın
    // 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.

    public static boolean rIleBitiyorMu(List<String> list){
        return list.stream().anyMatch(t->t.endsWith("r")||t.endsWith("R"));

    }


}

package gun48_Java.day24_Array_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {


        String[] arr={"Ismail","Nurullah","Fatih"};
        /*
         Uzun listeler olusturmamiz gerektiginde,
         tek tek eklemek yerine array olsuturup, bunları list'e cevirmek
         daha pratik olabilir.
         1-loop ile array'deki tum elementleri list'e atabiliriz.
         2-Arrays.asList() kullanabiliriz.
           Ancak bu method'un 2 tane kotu yan etkisi var.
           -Arrays class'i kullanildiği icin array ozellikleri gecerli olur
           dolayısıyla list'te olaan add,remove gibi size'i değiştiren methodlar
           bu sekilde olusturulan list'lerde kullanılamaz.
           -kaynak olan array ile urun olan lis ozdeslestirilir.
            birinde yapılan degisiklik, otomatik olarak digerine de islenir
         */

        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList);//[Ismail, Nurullah, Fatih]

        //1. yan etki
        //sinifList.add("Erdi");//UnsupportedOperationException
        //sinifList.remove(1);//UnsupportedOperationException

        arr[1]="Emre";
        System.out.println("Degisim sonrasi array: "+Arrays.toString(arr));
        System.out.println("Arrayi degistirince list: "+ sinifList);//[Ismail, Emre, Fatih]

        sinifList.set(0,"Utku");
        System.out.println("List'i degistirince list "+sinifList);//[Utku, Emre, Fatih]
        System.out.println("List'i degistirince array :"+Arrays.toString(arr));//[Utku, Emre, Fatih]




        //List<Integer> sayilar=Arrays.asList(new Integer[5]); bu sekilde de olusturabiliriz.



    }
}

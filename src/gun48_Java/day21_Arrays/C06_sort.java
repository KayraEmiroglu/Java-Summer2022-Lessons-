package gun48_Java.day21_Arrays;

import java.util.Arrays;

public class C06_sort {
    public static void main(String[] args) {

        int[] sayilar = {5,5,5,7,7,1,6,4,3,9};

        //Array'i Arrays class'ini kullanarak sirali hale getirebiliriz

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));


    }
}

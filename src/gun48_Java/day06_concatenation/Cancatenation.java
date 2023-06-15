package gun48_Java.day06_concatenation;

public class Cancatenation {
    public static void main(String[] args) {

        String Str1 = "Java";
        String Str2 = "Güzeldir";
        int  sayi1 = 5;
        int sayi2= 4;

        //yukaridaki variable'lari kullanarak istenen metinleri yazdiralim

        System.out.println(Str1+" "+Str2+" "+sayi1+sayi2 );//Java güzeldir 54

        System.out.println(Str1+""+Str2+" "+(sayi1+sayi2));//Java güzeldir 9

        System.out.println(sayi1+sayi2+" "+Str1);// 9 java

        System.out.println(sayi1+(sayi2+" "+Str2));//54 güzeldir


        System.out.println(Str1.concat(" ").concat(Str2));//Java güzeldir

    }
}

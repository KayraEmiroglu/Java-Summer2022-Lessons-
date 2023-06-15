package gun48_Java.day10_stringManipulation;

public class C01_charAt {

    public static void main(String[] args) {

        String str = "Java ogrenmek ne guzel";
        System.out.println(str.charAt(0));//ilk harfi yazdırır. J

        System.out.println(str.toUpperCase().charAt(7));//R

        System.out.println(str.charAt(21));// l

        //System.out.println(str.charAt(22));
        //son harfi bulmak için str'in uzunluğunun 1 eksiğini index olarak gireriz
        //eğer index olarak uzunluğu veya daha büyük bir saayıyı girersek Java exception verir


        // charAt() kullandıdğımızda sonuc char olacağı için artık manipulation yapamayiz..


    }

}

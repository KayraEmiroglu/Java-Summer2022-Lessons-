package gun48_Java.day16_ForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        bazen tek değişken sorunu çözmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        // 3 tane * yaz deseler  yan yanyana

        for (int i = 1; i <=3 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        //yan yana 4 tane * yazin desek
        for (int i = 1; i <=4 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        //bu tur durumlarda ic ice(Nested) loop kullanmak gerekir.

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

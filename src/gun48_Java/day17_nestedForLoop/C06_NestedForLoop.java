package gun48_Java.day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
            Verilen stringin asagidaki gibi yazdiran bir program yazalim
            input=Deniz
            D
            De
            Den
            Deni
            Deniz
         */

        String input="Adana";

        for (int i = 1; i <=input.length(); i++) {

            for (int j = 0; j <i ; j++) {
                System.out.print(input.charAt(j));
            }
            System.out.println();
        }



    }
}

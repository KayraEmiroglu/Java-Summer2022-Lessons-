package gun48_Java.day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*
            Verilen yükseklik ve boy degerine göre
            * lardan  oluşan bir dikdortgen oluşturalim


            yükseklik;3 boy;4

            ****
            ****
            ****
         */

        int yukseklik=3;
        int boy =4;

        for (int i = 1; i <=yukseklik ; i++) {

            for (int j = 1; j <=boy ; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

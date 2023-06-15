package gun48_Java.day22_multiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {

        //verilen bir multi-dimensional array'in
        // tüm elementlerini yazdiran bir method olusturun.

        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};

        elementlariYazdir(sayilar);

    }

    public static void elementlariYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) {//i=0,1,2 degerleri olacak
            for (int j = 0; j <sayilar[i].length; j++) {//inner arraylerin uzunluguna gelecek
                System.out.print(sayilar[i][j]+" ");

            }

        }




    }
}

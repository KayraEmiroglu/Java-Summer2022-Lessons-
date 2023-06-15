package gun48_Java.day15_Overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        //1'den 5 e kadar olan tam sayilari toplayalim.
        int toplam =0;
        for (int i = 1; i <=5; i++) {
            toplam+=i;
            System.out.println(toplam);
        }
        toplam=0;
        for (int i = 10; i <21 ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);
            toplam=0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);
        toplam=0;

        for (int i = 30; i <51 ; i++) {
            if(i%2==0){
                toplam+=i;
            }

        }
        System.out.println(toplam);


        //1500 ile 1600 arasında 7 ile bölünen sayıları toplayın
        toplam=0;
        for (int i =1500; i <=1600; i++) {
            if(i%7==0){
                toplam+=i;
            }

        }
        System.out.println("toplam = " + toplam);


    }

}

package gun48_Java.day05_matematikselislem;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=sayi1+1;//sayi2->11

        sayi2+=5;//sayi2->16

        /*
        pre veya post increment/decrement
        sadece ++ ve -- işlemi için geçerlidir.
        bu iki işlem için sayıdan sonra veya önce yazılmasına göre farklı iki işleyiş olur.

         */


        int sayi3 = sayi2++;  //1-sayi2 değeri sayi3'e atanacak
                              //2-sayi2 bir arttırılacak

        System.out.println("sayi3 :"+sayi3);//16
        System.out.println("sayi2 :"+sayi2);//17

        /*
        ++ veya -- variabledan sonra olursa buna post.... denir.
        Bu durumda o satırda yapılan iki işlemden arttırma veya
        azaltma işlemi sonuncudur.
         */




        int sayi4=++sayi1;   //1- sayi1 bir arttırlacak
                             //2-sayi1'in arttırılan değeri sayi4'e aatanacak.

        System.out.println("sayi4 :"+sayi4);//11
        System.out.println("sayi1 :"+sayi1);//11

        /*
        Eğer ++ veya -- variabledan önce ise buna pre..... denir.
        Bu dudrumda o satırda yapılan iki işlemden öncelikli olan
        arttırma veya azaltmadır.
         */



    }

}

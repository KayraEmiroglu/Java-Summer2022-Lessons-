package gun48_Java.day18_whileLoop_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        /*
           9dan 190a kadar 7nin kati olan tum tamsayilaari ekrana yazdiriniz

         */
        int bas=9;
        int bitis=190;
        int temp=bas;

        do{
            if(temp%7==0){
                System.out.print(temp+" ");
            }
            temp++;
        }while(temp<=bitis);


    }
}

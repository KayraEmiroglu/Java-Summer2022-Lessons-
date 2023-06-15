package gun48_Java.day40_final;

final public class B extends A{
    public static void main(String[] args) {
        B obj=new B();

        obj.isim="Alp";

        System.out.println(A.OKUL);

        System.out.println(Integer.MAX_VALUE);

        /*
        bir class finaal olarak belirlenirse,
        o class inherit edilemez.
         */


    }
}

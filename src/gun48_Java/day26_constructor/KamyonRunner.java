package gun48_Java.day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1=new Kamyon();
        System.out.println("Kamyon1 ozellikleri :"+ kamyon1.toString());


        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,500000);
        System.out.println("Kamyon2 ozellikleri :"+ kamyon2.toString());

        Kamyon kamyon3= new Kamyon("Man","as900",2007,400000);
        System.out.println("kamyon3 ozellikleri :" + kamyon3);

        Kamyon kamyon4= new Kamyon("Scania","S540");
        System.out.println("Kamyon4 bilgileri "+kamyon4);

    }
}

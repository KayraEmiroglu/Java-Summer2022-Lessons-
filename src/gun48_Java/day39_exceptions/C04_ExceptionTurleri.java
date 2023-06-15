package gun48_Java.day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {

        String str;
        /*
        System.out.println(str);
        deger ataamasi yapmadan bir variable'i kullanmaya calisirsaniz.
        Java Compile Time'da bunu farkeder ve size izin vermez.

         */
        str=null;

        //System.out.println(str.length());
        //NullPoniterException
        //RunTimeException


        Object obj="Java Java Java";
        Integer sayi= (Integer)obj;

        String str2="Hava Civa";
        /*
        Java bazi casting islemlerine cpmpile time'da izin vermez.

        Ancak baazen syntax uygun olabilir.
        bu durumda Java kodun calismasina itiraz etmez.
         */




    }
}

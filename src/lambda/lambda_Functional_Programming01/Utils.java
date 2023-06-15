package lambda.lambda_Functional_Programming01;

public class Utils {

    public static void ayniSatirdaBoslukYazdir(Object str){

        System.out.print(str+" ");

    }

    public static boolean ciftElemanlariSec(int x){



        return x%2==0;
    }
    public static boolean telElemanlariSec(int x){



        return x%2!=0;
    }
    public static int karesiniAl(int x){

        return x*x;
    }
    public static int kupunuAl(int x){
        return x*x*x;
    }
    public static double yariyaBol(int x){

        return x/2.0;
    }

    public static int rakamlarToplami(int x){
        int sum=0;
        while(x>0){
            sum+= x%10;
            x/=10;
        }
        return sum;

    }


}

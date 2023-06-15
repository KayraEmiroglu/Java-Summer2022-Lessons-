package gun48_Java.day07_IFStatements;

public class C02_IfStatements {
    public static void main(String[]args){

        int sayi=-23;

        if(sayi>0){
            System.out.println("sayi pozitif");
        }
        if(sayi%2==0){
            System.out.println("sayi çift");
        }

        if (sayi%5==0){
            System.out.println("sayi 5'in tam kati");
        }
        /*
        Basit if cümleleri kodun diğer parçalarından bağımsızdır
        sadece bir şart kontrol eder, şart sağlanıyorsa, if body çalışır yoksa çalışmaz
        birden fazla basit if cümlesi var ise girilen şarta bağlı olarak ,
        tümünde if bodysi çalışabilir,kısmen if bodyleri çalışabilir
        veya hiçbir if bodysi çalışmayadabilir.
         */
    }
}

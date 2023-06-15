package gun48_Java.day35_inheritancedaConstructorKullanimi;

public class DMemur extends DMuhasebe {
    /*
     Extends keyword kullanilan classlarda
     ister default constructor bulunsun
     istersek de biz yeni constructor(lar) olusturalim.
     Java constructor'in ilk satirina
     super(); constructor call yazar

     super(); constructor call, default cons.'a benzer
     gorunmese de orada vardir ve calisir
     ancak biz ilk satira farkli bir constructor call yazarsak
     Java super(); siler

     Eger biz mudahale edip kendi constructor call'umuzu olusturmazsak
     Javanın default olarak olusturdugu constructor call her zaman
     parametresizdir. --> super();
     */

    DMemur(){
        System.out.println("Memur Parametresiz cons");
    }
    DMemur(String isim){
        System.out.println("Memur Parametreli cons");
    }

    public static void main(String[] args) {

        DMemur mmr1= new DMemur("kayra");

    }

}

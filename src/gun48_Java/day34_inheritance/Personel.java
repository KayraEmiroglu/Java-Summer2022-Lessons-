package gun48_Java.day34_inheritance;

public class Personel {
    /*
     Eger parent class olacak sekilde tasarladiginiz bir class varsa
     veya ilerded bu class'i parent yapmak isteyenler olabilir diyorsaniz.
     Variable ve method'larin acces modifier'ini protected olmalidir.
     */
    int persNo;
    String isim="Isim belitrilmedi";
    String departman="Departman belirtilmedi";


    public void maas(){
        System.out.println("Tum personelin maasi vardir.");
    }

    public void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar.");
    }

    public void fazlaMesaiUcreti(){
        System.out.println("Personel fazla mesai ucretini statusune gore alir.");
    }



}

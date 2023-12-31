package gun48_Java.day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        /*
        verilen Stringdeki kullanilan harfleri tekrarsiz olarak
        yazdırıp kelimede kullanilan farklı harf sayisini veren bir
        method yaziniz.
         */

        String input = "Java her zaman güzel";

        tekrarsizYap(input);


    }

    public static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W","");//Javaherzamanguzel
        System.out.print(islenecekKelime.substring(0,1));//J
        benzersizInput+=islenecekKelime.substring(0,1);//"J"
        for (int i = 1; i <islenecekKelime.length() ; i++) {

            if(!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }

        }
        System.out.println();
        System.out.println("benzersizInput = " + benzersizInput);

    }
}

package gun48_Java.day14_MethodCreation;

import gun48_Java.day13_MethodCreation.C03_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        //input olrak verilen 4 harflı bir stringi
        //tersten yazdıran bir method oluşturalım.


        terstenYazdir("edip");
        C03_MethodCreation.topla(1,2);
    }
    public static void terstenYazdir(String input){

        String tersInput=input.substring(3)+input.substring(2,3)
                +input.substring(1,2)+input.substring(0,1);

        System.out.println(tersInput);

    }
}

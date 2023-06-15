package gun48_Java.day32_stringBuilder;

public class C04_subsequence {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Kayra");
        sb.substring(0,3);
        //Bu  method String dodndurdugu icin StringBuilder'in eski halini degistirmez

        System.out.println(sb);//Kayra

        sb.subSequence(0,3);
        System.out.println(sb);//Kayra



    }
}

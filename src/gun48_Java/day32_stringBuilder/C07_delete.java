package gun48_Java.day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java her zaman guzel.");

        sb.delete(8,9);
        System.out.println(sb);//Java herzaman guzel.
        sb.deleteCharAt(8);
        System.out.println(sb);//Java heraman guzel.

        //bastan baslayarak her loop'da ilk silip kalaani yazdiralim.
        int son=sb.length();

        for (int i = 0; i <son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }


    }
}

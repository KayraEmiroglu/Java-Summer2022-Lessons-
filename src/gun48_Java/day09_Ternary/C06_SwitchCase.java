package gun48_Java.day09_Ternary;




public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullaanıcıdan gün ismini alin
        hafta içi veya hafta sonu olduğunu yazdırın
         */

        String input ="CUMA";
        input = input.toLowerCase();

        switch (input){
            case "pazartesi":
                System.out.println("Haftaiçi");
                break;
            case "sali":
                System.out.println("Haftaiçi");
                break;
            case "carsamba":
                System.out.println("Haftaiçi");
                break;
            case "persembe":
                System.out.println("Haftaiçi");
                break;
            case "cuma":
                System.out.println("Haftaiçi");
                break;
            case "cumartesi":
                System.out.println("Haftasonu");
                break;
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("geçerli bir gün giriniz!");
        }




    }
}

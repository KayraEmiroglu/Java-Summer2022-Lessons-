package gun48_Java.day07_IFStatements;

public class C01_AndOperatorleri {
    public static void main(String[]args){

        int a=10,b=15,c=20;

        System.out.println(a>0 && b<20 && c>=b);

        System.out.println(a<0 && b<20 && c>=b);

        /*
        Java and operatörü konusunda bize iki seçenek sunar.
        && kullanırsak ,İlk false bulduğunda artık sonucun false olacağını bilir ve geriye kalan şartları incelemez.
        & kullanırsak tüm şartları kontrol eder sonra sonucu belirler.
        Bu çalışma usulünden dolayı & operatörü, && operatörüne göre daha yavaş olabilir.
         */
        System.out.println(a<0 & b<20 & c>=b);
    }
}

package gun48_Java.day13_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {


        // input olarak verilen 2 integeri toplayıp sonucunu yazdıran
        // bir method oluşturun.

        int input1=10;
        int input2=20;

        // method 4 adımda oluşturulur.
        // 1. adım  method call
        //2. adım argument eklenmesi gerekiyorsa ekleyelim.
        //eger methodun return type voidden farklı olucaksa
        //bir variable oluşturup, method callu assign edelim

        topla(input1,input2);




    }

    public static void topla(int input1, int input2) {
        //3. adım method deklarasyonunda değiştirilmesi gereken
        //bölümleri değiştir
        // 4. eğer return type void dısında bir şeyse
        // return keywordu ve dönecek değeri hesaplamalıyız.
        System.out.println("girilen iki sayının toplamı : "+ (input1+input2));



    }
}

package gun48_Java.day25_constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";


        System.out.println("Car1 bilgileri\n Marka : "+ car1.marka+"\nModel : "+car1.model+"\nYil : "+
                car1.yil+"\nfiyat : "+ car1.fiyat);

        Car car2=new Car();



        System.out.println("Car2 bilgileri\n Marka : "+ car2.marka+"\nModel : "+car2.model+"\nYil : "+
                car2.yil+"\nfiyat : "+ car2.fiyat);
        /*
        Herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        Java degeri su siralama ile arar
        1- o obje olusturulduktan sonra bir deger atandi mi ?
        2- Objenin olusturuldugu class'da variable 'a bir deger atanmis mi bakar?
        3- O zaman data turune gore Java default degeri atar.
         */



    }
}

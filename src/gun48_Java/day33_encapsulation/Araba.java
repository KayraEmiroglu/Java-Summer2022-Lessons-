package gun48_Java.day33_encapsulation;

public class Araba {
    String marka = "Marka belirtilmedi";// marka'nin acces modifier'i default acces modifier
                                        // oldugundan,package icerisinden kullanabilir
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli";//tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim
    // private yaptıgımız model ve yakit variable'larina erisimi yetkilendirelim.
    // modele deger atanabilsin ama görülemesin (setter)
    // yakita ise  görülebilsin ama yeni deger atanamasin(getter)
    //
    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}

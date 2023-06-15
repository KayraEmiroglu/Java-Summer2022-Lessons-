package gun48_Java.day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str= "1Bu2gu3n Ja*va- cok g3uz/el";
        //stri bugun java cok guzel haaline getirin.

        //replaaceAll () deki all'un amacı ayni özellikteki tüm karakterleri kapsamasaadır.
        //butun sayıları sil
        //butun ozel karakterli sil

        // \\s -> bosluk(space)
        // \\S -> bosluk dısında tüm karakterler
        // \\w ->harf ve rakamlar
        // \\W -> harf ve rakamlar dışındaki her şey
        // \\d -> rakamlar
        // \\D -> rakamların dışında her şey
        //tum ozel kaarakterleri  silelim dediğimizde spaceler de silinyor
        //spaceleri korumak içinen basta onların yerine cumlede bulunmayacak bir string koyalım
        //"qazwsx"

        str=str.replaceAll("\\s","qazwsx")
                .replaceAll("\\d","").
                replaceAll("\\W","")
                .replace("qazwsx"," ");
        System.out.println(str);

    }
}

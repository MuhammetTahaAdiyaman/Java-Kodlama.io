//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //şimdi bir dizi oluşturalım daha sonra neden arraylist'e ihtiyacımız var onu aktaralım.
        String[] sehirler1 = {"Bursa","İstanbul","Ankara"};
        //4.şehir olarak izmiri eklemek istediğimizde
        //sehirler1[3] = "İzmir";
        //indexofbound yani dizi sınırlarını aştı hatası aldık.
        //bunu şu şekilde çözebiliyoruz
        sehirler1 = new String[4];
        sehirler1[3] = "İzmir";
        System.out.println(sehirler1[3]);
        //peki ben sehirler1[1] elemanını ekrana bastığımda Bursa mı verecek yoksa başka bir şey mi =
        System.out.println(sehirler1[1]);
        //null hatası aldık.
        //neden böyle oldu hemen açıklayalım.
        /*
            Bellekte iki tane alan vardır bir tanesi stack diğeri ise heap
            String[] sehirler1 = new String[]{} bir şey tanımladığımızda
            new'e kadar olan şu kısım:  String[] sehirler1 stack bellekte oluşturuluyor.
            ben new dediğim anda git heap bellekte {Bursa,Ankara,İstanbul} değerlerini oluşturuyor. Ve ayırdığı alana bir kod veriyor örneğin 101 adında
            newlemek aslında referans oluştur anlamına gelmektedir.
            yani stack kısmına bir adres değeri vermiş oluyoruz 101.
            daha sonra biz ne yaptık şunu yaptık: sehirler1 = new String[4]; biz bunu yaptığımız anda new dediğimiz için gidip bellekte yeni bir alan oluşturuyor
            ve bu alana şu değerleri yerleştiriyor {, , , İzmir} ilk 3 değer null şekilde oluşturuyor. ve buna da bir numara veriyor 102 şeklinde.
            artık şehirler1 stack noktasında 101 adresini değil 102 adresini tutmaya başlıyor.
            101 alanı tutan olmadığı için java garbage collector gelip onu atacak.

         */


    }

}
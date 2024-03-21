//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //biz classları birden fazla kullanım amacı var ama;
        //bir hepsiburada düşünelim ürünün adı cinsi fiyatı resmi  var biz bunları bir arada class ile tutabiliyoruz
        //bir class oluşturalım.

        //biz array nasıl oluşturduk
        int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9};
        //gerçek hayatta bu şekilde değil de şu şekilde geliyor
        //Product[] products = new Product[] {new Product(),new Product()}; //yukarıdaki arraydan hiçbir farkı yok.
        //urunler dizisinin içinde iki tane eleman var demek oluyor.

        //yukarıdakiler tanımlamaydı şimdi aşağıdan devam ediyorum.
        Product product1 = new Product();
        product1.setName("Laptop");

        //ikinci ürünü oluşturalım.
        Product product2 = new Product();
        product2.setName("Telefon");

        //artık ben Product arrayimde şu şekilde yazdırabilirim.
        Product[] products = new Product[] {product1,product2};

        //şimdi ürünlerimin ismine for ile ulaşalım.
        for(int i=0; i<products.length;i++){
            System.out.println(products[i].getName());
        }
    }
}
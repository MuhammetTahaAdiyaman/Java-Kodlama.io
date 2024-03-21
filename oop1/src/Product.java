//classlar PascalCase olarak isimlendirilir.
public class Product {
    //burada bir ürünü tanımlamıyorum, ürünü tanımlayabilecek ortamı hazırlıyorum.
    //bu Product class'ında hangi özellikleri tutacağız ?
    private String name;
    private double unitPrice;
    private double discount;
    private String imageUrl;
    private int unitInStock;
    //burada bir şablon oluşturuyoruz fieldları yazarak.
    //field'lar camelCase olarak yazılır.
    //şimdi oluşturduğumuz şablondan yani class'dan nesneler oluşturmak için main'e gidelim.

    //private: sadece o class içinde kullanılabilir anlamına gelmektedir.
    //private olduğu için biz bu değerlere artık getter ve setter methodları ile erişim sağlayabiliyoruz.
    //hemen getter ve setter işlemlerini gerçekleştirelim.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }
}

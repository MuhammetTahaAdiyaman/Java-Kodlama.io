//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //iki tip class vardır.
        //1-özellik tutucu class
        //2-operasyon tutucu class (manage)


        //nesnemizi oluşturalım.
        Product product1 = new Product();
        //bunun anlamı şu şekilde Product türünde product1 nesnesi oluşturmuş olduk.
        //şimdi field oluşturmuşduk ya o fieldlara bir değer atamalarını gerçekleştirelim.
        //şablonumuzu dolduralım.
//        product1.name = "Delonghi Kahve Makinesi";
//        product1.unitPrice = 7500;
//        product1.discount = 7;
//        product1.unitInStock = 3;
//        product1.imageUrl = "undefined.svg";
        //değer atama işlemine set value denir.
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("image1.svg");
        //atanan değerleri okuma işlemine de get value denir.
        //System.out.println(product1.name);

        //ikinci ürünümüzü oluşturalım.
        Product product2 = new Product();
//        product2.name = "Smeg Kahve Makinesi";
//        product2.unitPrice = 12500;
//        product2.discount = 2;
//        product2.unitInStock = 5;
//        product2.imageUrl = "undefined2.svg";
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(3);
        product2.setUnitPrice(12500);
        product2.setUnitInStock(9);
        product2.setImageUrl("image2.svg");
        //üçüncü ürünümüzü oluşturalım.
        Product product3 = new Product();
//        product3.name = "Siemens Kahve Makinesi";
//        product3.unitPrice = 4500;
//        product3.discount = 3;
//        product3.unitInStock = 9;
//        product3.imageUrl = "undefined3.svg";
        product3.setName("Siemens Kahve Makinesi");
        product3.setDiscount(10);
        product3.setUnitPrice(3500);
        product3.setUnitInStock(2);
        product3.setImageUrl("image3.svg");
        //gerçek hayatta biz dataları yukarıdaki gibi yazmayız bir veri kaynağından gelir.
        //hepsiburada da olduğu gibi ürünleri listelemek istediğimi varsayalım bunu da array ile yapacağız.
        Product[] products  = new Product[] {product1,product2,product3};
        //biz arraylari for ile geziyorduk.
        for(Product product:products){
            System.out.println(product.getName());
        }


        //------------------------------------------------

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("0101");
        individualCustomer.setPhone("0552123123");
        individualCustomer.setFirstName("Muhammet Taha");
        individualCustomer.setLastName("Adıyaman");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("0202");
        corporateCustomer.setPhone("055020201");
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setTaxNumber("000220202002");

        //bankanın müşterilerini bir araya toplayalım.
        Customer[] customers = {individualCustomer,corporateCustomer};
        //biz Customer türünde bir array oluşturduk ancak içine eleman olarak bir individualCustomer bir de CorporateCustomer türünde nesne verdik kızmadı nedeni inheritance.
        
    }
}
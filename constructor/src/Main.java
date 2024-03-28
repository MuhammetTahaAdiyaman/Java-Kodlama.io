//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        //constructor sayesinde ilk değer atamalarını da gerçekleştirebiliriz.
        Product product1 = new Product(1,"Iphone 11","Telephone",20000,12,"black","1234");
        //ilk değer atamasının yapıldığını anlamak için örneğin name'i çağıralım.
        System.out.println(product1.getName());
    }
}
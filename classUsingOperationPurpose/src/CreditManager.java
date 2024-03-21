public class CreditManager {
    public void calculate(){
        System.out.println("Kredi Hesaplandı");
        //yarın bir gün konut kredisi de geldiğind genellikle şu şekilde bir operasyon görürüz yanlış şekilde.
//        if(creditType == 0){
//            System.out.println("İhtiyaç kredisi hesaplandı");
//        }else{
//            System.out.println("Konut kredisi hesaplandı");
//        }
        //yukarıda if ile yazılmış olan kod hatalı bir kod tekniğidir bunun yerine artık polymorphisim tekniğini kullanabiliriz.

    }

    public void add(){
        System.out.println("Kredi eklendi");
    }
}

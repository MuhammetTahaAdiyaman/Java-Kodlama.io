public class MortgageManager implements ICreditManager {
    //extends ettiğimiz zaman inhertiance diyoruz artık mortgageManager içinde add ve calculate operasyonları var demek.
//burada da aynı vehiclemanager da olduğu gibi override edip her krediyi kendine has hesaplanmasını gerçekleştireceğiz.

    @Override
    public void add() {
        System.out.println("Mortgage kredisi eklendi.");
    }

    @Override
    public void calculate() {
        System.out.println("Mortgage kredisi hesaplandı.");
    }
}

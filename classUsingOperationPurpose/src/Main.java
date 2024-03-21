import java.util.ArrayList;
import java.util.Collections;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //classların bir diğer kullanım amacı ise operasyon tutmalarıdır.
        //creditManager adında bir class oluşturalım ve operasyonlarını içinde tanımlayalım.

        //classı yaratalım ve bir nesne oluşturalım.
//        CreditManager creditManager = new CreditManager();
//        creditManager.add();
//        creditManager.calculate();
//
//        //MortgageManager nesnesini oluşturalım.
//        MortgageManager mortgageManager = new MortgageManager();
//        mortgageManager.add();
//        mortgageManager.calculate();

        //şimdi Creditmanager arrayi oluşturalım.
//        ICreditManager[] credits = new ICreditManager[3];
//        credits[0] = new MortgageManager();
//        credits[1] = new VehicleManager();
//        credits[2] = new OfficerManager();
        //burada şu oluyor; credits 0.elemanı mortagage referansını 1.elemanı ise vehiclemanager referansını tutuyor.

//        for(int i=0; i<credits.length;i++){
//            credits[i].calculate();
//        }

        //yepyeni bir kredi ekliyorum. Officer adında yukarıya hemen eklemelerini yaptık bu işlem SOLID prensibinde O harfine denk gelmektedir.

        //şimdi biz Credit manager'ı class olarak ayarlamıştık biz bunu interface olarak yaparsak
        //her kredi ürünü kendi kodlarını yani add ve calculate metodunu doldursun istiyorum.
        //şimdi diğer kredilerin hepsini implements yapalım extends olanları.
        //biz yukarıdaki creditmanager arrayini artık array şeklinde değilde bir arraylist içinde yazıyor olacağız.
        ArrayList<ICreditManager> credits = new ArrayList<ICreditManager>();
        credits.add(new MortgageManager());
        credits.add(new VehicleManager());
        credits.add(new OfficerManager());

        for(ICreditManager credit : credits){
            credit.calculate();
        }
    }

}
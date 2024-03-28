public class KrediUI {
    //arayüzden çağırılacağını varsayalım
    public void krediHesapla(BaseKrediManager baseKrediManager){
        //ogretmen veya tarimkredimanager çağırmamız gerekiyor.
        //hepsini tek tek yazmaya gerek yok.
        //basekredimanageri kullanalım.
        baseKrediManager.hesapla();
    }
}

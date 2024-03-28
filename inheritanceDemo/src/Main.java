//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*

            Yazılımda en önemli olgu değişimdir. İnsanların hayatını programlıyoruz.
            değişime direnmeyen programlar yazmamız gerekmektedir.

         */

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new AskerKrediManager());
        //ben buraya hem ogretmen hem de tarim krediyi yollayabilirim.
        //çünkü basekredimanager hem ogretmenkredimanager hem de tarimkredimanager referansını tutabilir.
        //yeni bir kredi gelsin askerkredimanager adında kodda değişiklik olmadan krediuı da çağırabileceğiz.
        //buna biz aslında kısaca polymorphism diyoruz
    }
}
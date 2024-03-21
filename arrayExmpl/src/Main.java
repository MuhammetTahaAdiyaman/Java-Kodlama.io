//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1,2,3,4,5,6,7,8,9,10};
        int aranacak = 9;
        boolean varMi = sayiBul(sayilar,aranacak);
        mesajVer(varMi,aranacak);
    }

    public static boolean sayiBul(int[] sayilar, int aranacak){
        boolean varMi = false;
        for(int sayi:sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }
        return varMi;
    }

    public static void mesajVer(boolean varMi,int aranacak){
        String mesaj = "";
        if(varMi){
            mesaj = "sayı mevcuttur: " + aranacak;
            System.out.println(mesaj);
        }else{
            mesaj = "sayı mevcut değildir: " + aranacak;
            System.out.println(mesaj);
        }
    }
}
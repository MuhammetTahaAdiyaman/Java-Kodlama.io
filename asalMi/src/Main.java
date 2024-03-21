//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi = 13;
        boolean asalMi = true;
        for(int i=2; i<sayi;i++){
            if(sayi%i==0){
              asalMi = false;
              break;
            }
        }
        if(asalMi){
            System.out.println("sayi asaldir");
        }else{
            System.out.println("sayi asal değildir");
        }
    }
}
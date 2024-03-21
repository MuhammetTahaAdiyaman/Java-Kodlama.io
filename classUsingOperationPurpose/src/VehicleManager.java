public class VehicleManager implements ICreditManager {
    //şimdi creditmanager içinde bulunan add ve calculte methodları burada da kullanabiliriz.
    //ama her krediyi kendine göre hesaplamamız gerekmektedir
    //bundan dolayı burada bir overriding işlemi yapalım.

    @Override
    public void add() {
        System.out.println("Vehicle kredisi eklendi.");
    }

    @Override
    public void calculate() {
        System.out.println("Vehicle kredisi hesaplandı.");
    }
}

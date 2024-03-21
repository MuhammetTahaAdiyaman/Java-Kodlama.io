

public class OfficerManager implements ICreditManager{
    @Override
    public void add() {
        System.out.println("Officer kredisi eklendi");
    }

    @Override
    public void calculate() {
        System.out.println("Officer kredisi hesaplandı");
    }
}

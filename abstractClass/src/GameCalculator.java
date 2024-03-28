public abstract class GameCalculator {
    //hesaplama kadın için ayrı erkek için ayrı çocuk için ayrı ancak gameover herkes için aynı
    public abstract void hesapla();

    public void gameOver(){
        System.out.println("oyun bitti");
    }
}

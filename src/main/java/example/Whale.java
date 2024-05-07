package example;

public abstract class Whale {
    public String welDone = "werkstatt";
    private final int a = 1;
    public void game(){
        System.out.println("Play");
    }
     void dive() {
        System.out.println("Whale");
    }

    public static void main(String[] args) {
          Whale whale = new Orca();
          whale.dive();
          whale.game();

      }
}
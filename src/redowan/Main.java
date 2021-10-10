package redowan;

public class Main {

    public static void main(String[] args) {
        Player player =new Player("Shakib",75);
        Cricket cricket =new Cricket("International match",20,player);

        cricket.display();

        Football football=new Football();

    }
}

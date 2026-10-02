import java.util.Scanner;
public class Game {
    private Player player;
    private Coin coin;
    public Game() {
        player = new Player(100);
        coin = new Coin(Math.random());
        System.out.println("Your starting balance is: " + player.getBalance());
    }
    public void play() {
        Scanner s = new Scanner(System.in);
        System.out.println("How much are you willing to risk? Heh.");
        int risk = s.nextInt();
        System.out.println("What is your guess? heads or tails?");
    }
}

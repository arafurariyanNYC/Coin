import java.util.Scanner;
public class Game {
    private Player player;
    private Coin coin;
    public Game() {
        player = new Player(100);
        coin = new Coin(Math.random());
        System.out.println("Your starting balance is: " + player.getBalance());
    }
    public void average(double num1, double num2) {
        double average = (num1 + num2) / 2.0;
        System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
        
    }
    public void play() {
        Scanner s = new Scanner(System.in);
        System.out.println("How much are you willing to risk? Heh.");
        int risk = s.nextInt();
        System.out.println("What is your guess? heads or tails?");
        String guess = s.next().toLowerCase();
        boolean correct = player.flip(coin, guess, risk);
        if (correct) 
            System.out.println("You guessed correctly! Your new balance is: " + player.getBalance());
        else 
            System.out.println("You guessed incorrectly. Your new balance is: " + player.getBalance());
        play();
    }
}

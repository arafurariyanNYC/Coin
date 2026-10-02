public class Main {
    public static void main(String[] args) {
        Coin coin = new Coin(.9);
        coin.flip(100);
        System.out.println("Coin state: " + coin.getState());
        System.out.println("Heads: " + coin.getHeads());
        System.out.println("Tails: " + coin.getTails());
        coin.setPtails(0.5);
        coin.flip(1000);
        System.out.println("After flipping 1000 times:");
        System.out.println("Heads: " + coin.getHeads());
        System.out.println("Tails: " + coin.getTails());
        
        Player poo = new Player(100);
        poo.flip(coin, "heads", 50);
        System.out.println("Player balance: " + poo.getBalance());
    }
}

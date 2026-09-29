public class Main {
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.flip();
        System.out.println("Coin state: " + coin.getState());
        System.out.println("Heads: " + coin.getHeads());
        System.out.println("Tails: " + coin.getTails());
        coin.flip(99);
        System.out.println("After flipping 99 times:");
        System.out.println("Heads: " + coin.getHeads());
        System.out.println("Tails: " + coin.getTails());
    }
}

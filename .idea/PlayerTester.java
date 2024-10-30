public class PlayerTester {
    public static void main(String[] args) {
        Player player1 = new Player('X');
        Player player2 = new Player('O');

        System.out.println(player1);
        System.out.println(player2);

        System.out.println("Player 1 symbol: " + player1.getSymbol());
        System.out.println("Player 2 symbol: " + player2.getSymbol());

        player1.setSymbol('O');
        System.out.println("Player 1 symbol after change: " + player1.getSymbol());

        Player player3 = new Player('O');
        System.out.println("player1 equals player2: " + player1.equals(player2));
        System.out.println("player1 equals player3: " + player1.equals(player3));
    }
}


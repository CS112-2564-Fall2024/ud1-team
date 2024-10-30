public class Player {
    private char symbol;
    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return symbol == player.symbol;
    }

    @Override
    public String toString() {
        return "Player{symbol=" + symbol + '}';
    }
}
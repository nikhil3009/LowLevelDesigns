import Model.Board;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.setUpGame();
        System.out.println("Winner is:"+game.startGame());

    }
}
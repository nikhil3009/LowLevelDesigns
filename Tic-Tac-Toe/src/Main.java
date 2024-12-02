
public class Main {

	public static void main(String[] args) {
		TicTacToeGame newgame = new TicTacToeGame();
		newgame.InitializeGame();
		System.out.println("winner of the game is : "+newgame.startGame());

	}

}

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
	Deque<Player> players;
	Board gameBoard;
	
	
	public void InitializeGame()
	{
		players = new LinkedList<>();
		PlayingPieceX cross = new PlayingPieceX();
		Player player1 =new Player("player1",cross);
		
		PlayingPieceO nought = new PlayingPieceO();
		Player player2 = new Player("player2",nought);
		
		players.add(player1);
		players.add(player2);
		
		gameBoard = new Board(3);
		
	}
	
	public String startGame() {
		boolean noWinner = true;
		while(noWinner) {
			Player playerTurn = players.removeFirst();
			
			gameBoard.printBoard();
			List<Pair> freeCells = gameBoard.getFreeCells();
			if(freeCells.isEmpty()) {
				noWinner = true;
				continue;
			}
			System.out.println("Player "+playerTurn.name +" enter row and column");
			Scanner input = new Scanner(System.in);
			String s = input.nextLine();
			String[] values = s.split(",");
			int row = Integer.valueOf(values[0]);
			int col = Integer.valueOf(values[1]);
			
			boolean addPieceSucessfully = gameBoard.addPiece(row, col, playerTurn.playingPiece);
			
			if(!addPieceSucessfully) {
				System.out.println("Incorrect position choosen,try again");
				players.addFirst(playerTurn);			
				}
			players.addLast(playerTurn);
			
			boolean isWinner = checkWinner(row,col,playerTurn.playingPiece.pieceType);
			if(isWinner) {
				return playerTurn.name;
			}
			
			
		}
		return "TIE";
	}
	public boolean checkWinner(int row, int col, PieceType pieceType) {
		boolean rowMatch = true;
		boolean colMatch = true;
		boolean crossMatch = true;
		boolean antiCrossmatch = true;
		
		for(int i=0;i<gameBoard.size;i++) {
			if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
				rowMatch  = false;
			}
		}
		for(int i=0;i<gameBoard.size;i++) {
			if(gameBoard.board[i][col] == null || gameBoard.board[i][col].pieceType != pieceType) {
				colMatch  = false;
			}
		}
		
		for(int i=0,j=0;i<gameBoard.size;i++,j++) {
			if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
				crossMatch  = false;
			}
		}
		for(int i=0,j=gameBoard.size-1;i<gameBoard.size;i++,j--) {
			if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
				antiCrossmatch  = false;
			}
		}
		return rowMatch || colMatch || crossMatch || antiCrossmatch;
	}	

}

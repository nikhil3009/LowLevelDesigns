import java.util.ArrayList;
import java.util.List;

public class Board {
	
	int size;
	PlayingPiecee[][] board;
	
	Board(int size){
		this.size = size;
		board = new PlayingPiecee[size][size];
	}
	
	public boolean addPiece(int row, int col, PlayingPiecee piece) {
		if(board[row][col] !=null) {
			return false;
		}
		board[row][col] = piece;
		return true;
	}
	
	public List<Pair> getFreeCells(){
		List<Pair> cells = new ArrayList<>();
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(board[i][j] == null) {
					cells.add(new Pair(i,j));
				}
			}
		}
		return cells;
	}
	
	public void printBoard() {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(board[i][j] != null) {
					System.out.print(board[i][j].pieceType.name()+ " ");
					
				}
				else {
					System.out.print(" ");
				}
				System.out.print("|");
			}
			System.out.println();
		}
	}
	
	
	
	
}

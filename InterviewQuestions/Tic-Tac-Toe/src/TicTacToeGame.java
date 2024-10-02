import Model.*;

import java.util.*;
public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public void setUpGame(){
        players = new LinkedList<>();
        PlayingPieceX cross = new PlayingPieceX();
        Player player1 = new Player("Nick",cross);
        PlayingPieceO circle = new PlayingPieceO();
        Player player2 = new Player("Jev",circle);
        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();
            List<Pair> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces == null){
                noWinner = false;
                continue;
            }

            System.out.println("player:"+ playerTurn.getName()+"Enter position in terms of row and col:");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputCol,playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position selected-Position already filled");
                players.addFirst(playerTurn);
                continue;
            }
            boolean isWinner = checkWinner(inputRow,inputCol,playerTurn.getPlayingPiece().pieceType);

            if(isWinner){
                return playerTurn.getName();
            }
            players.addLast(playerTurn);
        }
        return "Game is Tied";
    }
    public boolean checkWinner(int inputRow, int inputCol, PieceType pieceType){
        int size  = gameBoard.size;
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean dia = true;
        boolean revd = true;
        for(int i=0;i<size;i++){
            if(gameBoard.board[inputRow][i] == null || gameBoard.board[inputRow][i].pieceType != pieceType ){
                rowMatch = false;
            }

        }
        for(int i=0;i<size;i++){
            if(gameBoard.board[i][inputCol] == null || gameBoard.board[i][inputCol].pieceType != pieceType ){
                colMatch = false;
            }

        }

        for(int i=0,j=0;i<size;i++,j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType ){
                dia = false;
            }
        }
        for(int i=0,j=size-1;i<size;i++,j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType ){
                revd = false;
            }
        }
        return rowMatch || colMatch || dia || revd;
    }
}

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players= new LinkedList<>();
    Player winner;

    public Game(){
        initializeGame();
    }

    public void initializeGame(){
        board = new Board(10,4,3);
        dice  = new Dice(1);
        winner = null;
        addPlayers();
    }
    public void addPlayers(){
        Player p1 = new Player("p1",1);
        Player p2 = new Player("p2",1);
        players.add(p1);
        players.add(p2);
    }

    public void startGame(){

        while (winner == null){
            Player playerTurn = findTurn();
            System.out.println("Player turn is : "+ playerTurn.id+" and current position is: " + playerTurn.currentPosition);
            int dicenum = dice.rollDice();
            int playerNewPos = playerTurn.currentPosition+dicenum;
            playerNewPos = jumpCheck(playerNewPos);
            playerTurn.currentPosition = playerNewPos;
            System.out.println("Player turn is : "+ playerTurn.id + " and new position is : " + playerTurn.currentPosition);

            if(playerNewPos >= board.cells.length*board.cells.length){
                winner = playerTurn;
            }
        }
        System.out.println("Winner is : " + winner.id);
    }

    public Player findTurn(){
        Player playerTurn = players.removeFirst();
        players.addLast(playerTurn);
        return playerTurn;
    }

    private int jumpCheck(int playerNewPos){
        if(playerNewPos >= board.cells.length*board.cells.length){
            return playerNewPos;
        }
        Cell c = board.getCell(playerNewPos);
        if(c.jump != null && c.jump.start == playerNewPos){
            return c.jump.end;
        }
        return playerNewPos;
    }
}

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public  Board(int gameSize, int noOfSnakes, int noOdLadders){
        initializeBoardSize(gameSize);
        addSnakesAndLadders(cells,noOfSnakes,noOdLadders);
    }

    public void initializeBoardSize(int size){
        cells = new Cell[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Cell cell = new Cell();
                cells[i][j] = cell;
            }
        }

    }

    public void addSnakesAndLadders(Cell[][] cells,int snakes, int ladders){
        while(snakes>0){
            int sHead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length+1);
            int sTail = ThreadLocalRandom.current().nextInt(1,sHead);

            Jump snakeObj = new Jump();
            snakeObj.start = sHead;
            snakeObj.end = sTail;
            Cell cell = getCell(sHead);
            cell.jump = snakeObj;
            snakes--;
        }

        while(ladders>0){
            int lHead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length+1);
            int lTail = ThreadLocalRandom.current().nextInt(lHead+1,cells.length* cells.length+1);


            Jump ladObj = new Jump();
            ladObj.start = lHead;
            ladObj.end = lTail;
            Cell cell = getCell(lHead);
            cell.jump = ladObj;
            ladders--;
        }

    }

    public Cell getCell(int playerPos){
        int row= playerPos/ cells.length;
        int col = playerPos%cells.length;
        return cells[row][col];
    }

}

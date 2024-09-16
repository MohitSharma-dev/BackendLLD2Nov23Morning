package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.CellState;
import TicTacToe.models.Player;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStategy{
    @Override
    public void makeMove(Board board , Player player) {
//      put the symbol in the first empty place
//        int dimension = board.getSize();
        for(List<Cell> row : board.getGrid()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    cell.setCellState(CellState.FILLED);
                    cell.setSymbol(player.getSymbol());
                }
            }
        }
    }
}

package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public interface BotPlayingStategy {
    void makeMove(Board board , Player player);
}

package pl.kwec.statistics;

import pl.kwec.players.Player;

public interface Statistics {
    void andTheWinnerIs(Player player);
    void print();
    void clear();
}

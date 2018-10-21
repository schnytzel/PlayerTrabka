import java.util.Comparator;

public class ScoreComperator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return p1.getScore().compareTo(p2.getScore());
    }
}

import java.util.Comparator;

public class SurnameComperator implements Comparator<Player> {


    @Override
    public int compare(Player p1, Player p2) {
        return p1.getSurname().compareTo(p2.getSurname());
    }
}

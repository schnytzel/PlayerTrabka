import com.sun.source.tree.Scope;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader("players.csv");
        List<Player> tmp = dataReader.read();
        for(Player p: tmp){
            System.out.println(p);
        }
        System.out.println();

        SurnameComperator surnameComperator = new SurnameComperator();
        Collections.sort(tmp, surnameComperator);
        for(Player p: tmp){
            System.out.println(p);
        }
        CSVwriter csVwriterSurname = new CSVwriter("table_surname.csv");
        csVwriterSurname.write(tmp);
        System.out.println();

        ScoreComperator scoreComperator = new ScoreComperator();
        Collections.sort(tmp, scoreComperator);
        for(Player p: tmp){
            System.out.println(p);
        }
        CSVwriter csVwriterScore = new CSVwriter("table_score.csv");
        csVwriterScore.write(tmp);

    }
}

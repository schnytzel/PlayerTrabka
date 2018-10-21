import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    private List<Player> playerList = new ArrayList<>();
    String fileName;

    public DataReader(String fileName) {
        this.fileName = fileName;

    }

    public List<Player> read() {
        try {
            File file = new File(fileName);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] tmp = line.split(" ");
                String name = tmp[1];
                String surname = tmp[0];
                Double score = Double.valueOf(tmp[2]);
                playerList.add(new Player(name, surname, score));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Plik nie istnieje");
        }
        return playerList;
    }

    @Override
    public String toString() {
        return "DataReader{" +
                "playerList=" + playerList.toString() +
                '}';
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
}

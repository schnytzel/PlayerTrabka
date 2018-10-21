import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVwriter {
    String filename;

    public CSVwriter(String filename) {
        this.filename = filename;
    }

    public void write(List<Player> lp)  {
        BufferedWriter writer = null;
        try {
            File csvFile = new File(filename);
            writer = new BufferedWriter(new FileWriter(csvFile));
            for(Player p: lp){
                writer.write(p.getSurname()+" "+p.getName()+" "+p.getScore()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

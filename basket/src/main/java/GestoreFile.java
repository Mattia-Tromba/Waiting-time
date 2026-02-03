import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class GestoreFile {
    public synchronized void salvaSuFile(Azione azione) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(azione);
        try (BufferedWriter writer = new BufferedWriter(new
                FileWriter("azione.json"))) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public synchronized Azione leggiDaFile() {
        try (BufferedReader reader = new BufferedReader(new
                FileReader("azione.json"))) {
            Gson gson = new Gson();
            return gson.fromJson(reader, Azione.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

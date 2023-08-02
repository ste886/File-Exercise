import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void newFile() {
        String path = "shape.txt";
        try {
            File file = new File(path);
            if (file.exists())
                System.out.println("Il file " + path + " esiste");
            else if (file.createNewFile())
                System.out.println("Il file " + path + " è stato creato");
            else
                System.out.println("Il file " + path + " non può essere creato");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeFile() {
        String path = "shape.txt";
        try {
            File file = new File(path);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("5");
            bw.write("\n");
            bw.write("4");
            bw.write("\n");
            bw.write("giallo");
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

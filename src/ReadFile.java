import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static Shape readFile() {
        String path = "shape.txt"; // Stringa che contiene percorso relativo del file shape.txt
        try {
            File file = new File(path); // Non crea un file, e' un oggetto con metodi per lavorare sui file
            Scanner scanner = new Scanner(file); // crea uno scanner che legge da file
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            String color = scanner.next();
            return new Shape(x, y, color); // creo istanza di Shape e la restituisco come risultato
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

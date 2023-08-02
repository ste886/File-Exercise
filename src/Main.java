/*Considerate un file di testo;
1) Per ogni riga ci sono le informazioni del mio shape (Riga 0, x, riga 1, y Riga 2 colore).
Nel main il programma dovrà avviarsi, caricare il file di testo.
Leggere dal file di testo la x e la y e istanziare la shape,la cui x e y.


2) Fare in modo che il colore letto dal file sia di quello colore.
Es. Rosso, la istanza di color sara’ rosso

Interface Color che ha getColor, ritorna una stringa
e ci sia un classe BaseColor (con un enum o stringa), e una classe RGB dove i valori sono r, g, b
*/

import java.io.*;

public class Main {
    public static void main(String[] args){
        NewFile.newFile();
        WriteFile.writeFile();
        Shape shape = ReadFile.readFile();
        System.out.println("Shape letta: " + shape);
    }
}
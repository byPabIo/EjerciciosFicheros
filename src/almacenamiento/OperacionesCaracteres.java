package almacenamiento;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class OperacionesCaracteres {
    public void leerFichero(File f) {
        //File --> Flujo --> Buffer --> Close
        try {
            FileReader fileReader = new FileReader(f);
        } catch (FileNotFoundException e) {
            System.out.printf("Fichero no encontrado");;
        }


    }

}

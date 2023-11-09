package almacenamiento;
import java.io.*;

public class Entrada {
    public static void main(String[] args) {
        //Prueba
        OperacionesCaracteres operacionesCaracteres = new OperacionesCaracteres();
        operacionesCaracteres.leerFichero(new File("src/almacenamiento/documentos/inicio.txt"));
    }
}

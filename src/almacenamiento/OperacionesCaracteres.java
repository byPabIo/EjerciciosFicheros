package almacenamiento;
import java.io.*;

public class OperacionesCaracteres {
    public void leerFichero(File f) {
        //File --> Flujo --> Buffer --> Close
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(f);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            /*while ((linea = bufferedReader.readLine())!=null){
                System.out.println(linea);
            }*/
            int caracter;
            while ((caracter = bufferedReader.read())>-1){
                System.out.println(caracter);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");;
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }
}

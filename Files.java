import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;

public class Files {
    public int[]fileToArray(String fileName){
        File file;//Apuntar a un archivo fisico del dd
        FileReader reader;//llave con permiso de solo lectura
        BufferedReader buffer;//Para recuperar informacion del archivo
        String line;//linea de texto
        int[] array = null;//arreglo de numeros resultante
        int i=0;//indice
        int t;//tamaño
        try{
            t=countFileLines(fileName);
            array = new int[t];
            fild =new file("C:\\archivos\\"+fileName);
            reader = new FileReader(file);
            buffer = new BufferedReader(reader);
        } catch(Exception e){
            System.out.println("Error al leer el archivo "+ e.toString());
    }
 }
}
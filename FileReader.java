import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    public FileReader() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> operaciones = new ArrayList<String>();

        System.out.println("Ingresa la dirección del archivo a leer.");
        String file = entrada.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
            String line;
            while((line = reader.readLine()) != null) {
                operaciones.add(line);
                
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo a leer.");
        }

        for(String a: operaciones) {

            String[] operacion = a.split("");
            ArrayList<String> calculo = new ArrayList<>();
            for(String b: operacion) {
                calculo.add(b);

            }

            
        }

        entrada.close();
       


    }

}

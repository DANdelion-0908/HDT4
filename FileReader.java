import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    static ArrayList<String> calculo = new ArrayList<>();

    public FileReader() {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> operaciones = new ArrayList<String>();

        boolean key = true;

        while(key) {

            System.out.println("Ingresa la dirección del archivo a leer.");
            String file = keyboard.nextLine();

            try {
                BufferedReader reader = new BufferedReader(new java.io.FileReader(file));

                String line;

                while((line = reader.readLine()) != null) {
                    operaciones.add(line);  
                }

                reader.close();
                key = false;

            } catch (IOException e) {
                System.out.println("No se ha encontrado el archivo a leer.");
            }
        }

        for(String a: operaciones) {

            String[] operacion = a.split("");
            for(String b: operacion) {
                calculo.add(b);
            }
        }

    }

    public static ArrayList<String> getCalculo() {
        return calculo;
    }

}

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * This class reads files.
 */
public class FileReader {

    static ArrayList<String> calculo = new ArrayList<>();

    // Reading the file and adding the content to an ArrayList.
    public FileReader() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> operaciones = new ArrayList<String>();

        boolean key = true;

        while(key) {

            System.out.println("Ingresa la dirección del archivo a leer.");
            String file = entrada.nextLine();

            try {
                BufferedReader reader = new BufferedReader(new java.io.FileReader(file));

                String line;

                while((line = reader.readLine()) != null) {

                    InfixReader traductor = new InfixReader();
                    String traducido = InfixReader.infixToPostfix(line);
                    
                    operaciones.add(traducido);  
                }

                reader.close();
                key = false;

            } catch (IOException e) {
                System.out.println("No se ha encontrado el archivo a leer.");
            }
        }

        for(String a : operaciones) {

            String[] operacion = a.split("");
            for(String b : operacion) {
                calculo.add(b);
            }
        }

    }

    /**
     * This function returns the ArrayList of Strings that contains the calculation
     * 
     * @return The ArrayList of Strings.
     */
    public ArrayList<String> getCalculo() {
        return calculo;
    }

}

import java.io.File;
import java.util.Scanner;

public class DriverProgram {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FileReader File = new FileReader();

        int opt;

        System.out.println("Convertor de expresiones. \n");
        System.out.println("Selecciona el tipo de estructura que desees utilizar. \n");
        System.out.println("1. Array List.");
        System.out.println("2. Lista.");
        System.out.println("3. Vector. \n");

        opt = Integer.parseInt(entrada.nextLine());

        switch(opt) {

            case 1: System.out.println(FileReader.getCalculo());

            break;

            case 2: 
        }


        entrada.close();
    }
}


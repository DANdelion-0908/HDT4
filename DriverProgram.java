import java.io.File;
import java.util.Scanner;

public class DriverProgram {

    public static void main(String[] args) throws Exception {
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

            case 1: 
            
            System.out.println("Has seleccionado Array List");
            Operator.Calculate(File.getCalculo());

            break;

            case 2: 

            System.out.println("Has seleccionado Lista");
            Operator.Calculate(File.getCalculo());
            
            break;

            case 3: 

            System.out.println("Has seleccionado Vector");
            CalculatorV micCalculatorV = new CalculatorV<>(File.getCalculo());

            micCalculatorV.Calculate(micCalculatorV.getData());

            break;
        }
        
        entrada.close();
    }
}


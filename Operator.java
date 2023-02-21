import java.util.ArrayList;

public class Operator {

    private static Operator operadorInterno;
    
    
    private static boolean instanceIsCreated = false;

    private Operator() throws Exception {
        
    }

    /**
     * If the instance is not created, create it and return it. If it is created, return it
     * 
     * @return The instance of the class.
     */
    public static Operator getInstance() {
        if (!instanceIsCreated){
            try {
                operadorInterno = new Operator();
                instanceIsCreated = true;
                return operadorInterno;
            } catch (Exception ex){
                return null;
            }
             
        } else {
            return operadorInterno;
        }
    }

    
    /**
     * // Java
     * public static int Calculate(ArrayList<String> postfix_expression) throws Exception {
     *         Calculator miCalculadoraPosfix = new Calculator(); 
     *         return miCalculadoraPosfix.Calculate(postfix_expression);
     *     }
     * 
     * @param postfix_expression ArrayList<String>
     * @return The result of the calculation.
     */
    public static int Calculate(ArrayList<String> postfix_expression) throws Exception {
        Calculator miCalculadoraPosfix = new Calculator(); 
        return miCalculadoraPosfix.Calculate(postfix_expression);
    }

    /**
     * It takes a string array as input, and returns an integer
     * 
     * @param postArrayList This is the array of strings that contains the postfix expression.
     * @return The result of the calculation.
     */
    public static int CalculateV(String[] postArrayList) throws Exception {
        CalculatorV miCalculatorV = new CalculatorV(null);
        return miCalculatorV.Calculate(postArrayList);
    }

    /**
     * This function takes an integer as an input and returns the same integer as an output
     * 
     * @param T The temperature of the current cell.
     * @return The value of T
     */
    public int operate(int T) {
        return T;
    }
    
}


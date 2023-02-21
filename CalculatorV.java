import java.lang.reflect.Array;
import java.util.ArrayList;

public class CalculatorV<T> {

    private String[] Data;
    private int res;
    
    // The constructor of the class.
    public CalculatorV(ArrayList<String> t) {
        Data = new String[t.size()];
        
        for(int i = 0 ; i < Data.length ; i++) {
            Data[i] = t.get(i); 
        }
    }

    /**
     * This function sets the data of the class to the data that is passed in
     * 
     * @param data The data to be displayed in the list.
     */
    private void setData(String[] data) {
        this.Data = data;
    }

   // The method that calculates the postfix expression.
    public int Calculate(String[] postfix_expression) throws Exception {

        ArrayList<Integer> operandos = new ArrayList<>();

        setData(postfix_expression);

       // Iterating through the ArrayList and checking if the element is a number or a symbol.
        for (int j = 0 ; j < Data.length ; j++) {
            try {
                int a = Integer.parseInt(Data[j]);
                //System.out.print("Este dígito es " + a + "\n");  //Esto es para testeo
                operandos.add(a);

            } catch (NumberFormatException e) {

                int top = operandos.size() - 1;
                int second = top - 1;

                switch(Data[j]) { 
                    
                    // Adding the top element of the stack by the second element of the stack.
                    case "+": {
                        int suma = Integer.parseInt(operandos.get(top).toString()) + Integer.parseInt(operandos.get(second).toString());
                        res = suma;
                        operandos.remove(top);
                        operandos.remove(second);
                        operandos.add(res);
                        System.out.println(suma);
                    } break;
        
                    // Subtracting the top element of the stack by the second element of the stack.
                    case "-": {
                        int resta = Integer.parseInt(operandos.get(top).toString()) - Integer.parseInt(operandos.get(second).toString());
                        res = resta;
                        operandos.remove(top);
                        operandos.remove(second);
                        operandos.add(res);
                        System.out.println(resta);
                    } break;
                    
                    // Multiplying the top element of the stack by the second element of the stack.
                    case "*": {
                        int mul = Integer.parseInt(operandos.get(top).toString()) * Integer.parseInt(operandos.get(second).toString());
                        res = mul;
                        operandos.remove(top);
                        operandos.remove(second);
                        operandos.add(res);
                        System.out.println(mul);
                    } break;
                    
                    // Dividing the top element of the stack by the second element of the stack.
                    case "/": {
                        int div = Integer.parseInt(operandos.get(top).toString()) / Integer.parseInt(operandos.get(second).toString());
                        res = div;
                        operandos.remove(top);
                        operandos.remove(second);
                        operandos.add(res);
                        System.out.println(div);
                    } break;
                }
            }
            
        }

        // Printing the data stored in the object.
        System.out.print(Data);
        return res;    
    }

        /**
         * This function returns the data stored in the object
         * 
         * @return An ArrayList of type T.
         */
        String[] getData(){
            return Data;
         }
}

import java.util.ArrayList;

public abstract class Calculator<T> {
    
    private ArrayList<T> Data = new ArrayList<>();
    private int res;

    public Calculator() throws Exception {

    }

    /**
     * This function sets the data of the class to the data that is passed in
     * 
     * @param data The data to be displayed in the list.
     */
    private void setData(ArrayList<T> data) {
        this.Data = data;
    }

   // The method that calculates the postfix expression.
    public int Calculate(ArrayList<T> postfix_expression) throws Exception {

        ArrayList<Integer> operandos = new ArrayList<>();

        setData(postfix_expression);

       // Iterating through the ArrayList and checking if the element is a number or a symbol.
        for (T t : Data) {

            try {
                int a = Integer.parseInt(t.toString());
                operandos.add(a);

            } catch (NumberFormatException e) {

                int top = operandos.size() - 1;
                int second = top - 1;
                switch(t.toString()) {  
        
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
        ArrayList<T> getData(){
            return Data;
         }

        

}





 

     
    

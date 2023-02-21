public class StackVector<T> extends Stack<T> {

    public StackVector(String[] s) {

    }

    private String[] s;
    
    /**
     * It returns the length of the string.
     * 
     * @return The length of the string.
     */
    @Override
        public int count() {
            return s.length;
        }

    /**
     * If the length of the array is 0, then the array is empty
     * 
     * @return The method isEmpty() is being returned.
     */
    @Override
    public boolean isEmpty() {
        if(s.length == 0) {
            return true;

        } else {
        return false;
        }
    }

    /**
     * It returns the first element of the array.
     * 
     * @return The first element in the array.
     */
    @Override
    public String peek() {
        return s[0];
    }

    /**
     * If the array is not empty, return the first element of the array and move the second element to
     * the first position. If the array is empty, return the string "VACIO"
     * 
     * @return The first element of the array.
     */
    @Override
    public String pull() {
        if(s.length != 0) {
            String i = s[0];
            s[0] = s[1];
            s[1] = null;

            return i;
            
        } else {
            String s = "VACIO";
            return s;
        } 
    }

    /**
     * *|MARCADOR_CURSOR|*
     * 
     * @param value The value to be pushed onto the stack.
     */
    @Override
    public void push(Object value) {
        
    }
    
}

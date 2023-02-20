import java.util.ArrayList;

public class Operator<T> extends Calculator<T>{

    public Operator() throws Exception {
        super();
    }

    @Override
    public int Calculate(ArrayList<T> postfix_expression) throws Exception {
        return super.Calculate(postfix_expression);
    }

    public int operate(int T) {
        return T;
    }
    
}


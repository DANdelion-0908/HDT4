import static org.junit.Assert.assertEquals;

public class Test {

    InfixReader testReader = new InfixReader();

    @org.junit.Test
    public void PruebaInfix() {
        String postfix = testReader.infixToPostfix("(2+2)*5");
        assertEquals("22+5*" , postfix);
    }

    @org.junit.Test
    public void PruebaInfix2() {
        String postfix = testReader.infixToPostfix("(5*5)*7");
        assertEquals("55*7*" , postfix);
    }


}
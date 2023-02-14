public class InfixReader extends Calculator {

    private static boolean calc_state = false;
    private static InfixReader OneInfixReader;


    private InfixReader() throws SingletonException {

        calc_state = true;
    }

    public static InfixReader getInfixReader() {
        if(calc_state) {
            return OneInfixReader;

        } else {
            OneInfixReader = new InfixReader();
            return OneInfixReader;
        }
    }
    
    public void end() {
        calc_state = false;
    }
    
}

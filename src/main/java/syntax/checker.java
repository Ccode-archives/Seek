package syntax;

public class checker {
    public static boolean check(String[] lines) {
        boolean correct = true;
        String iden;
        for (String line : lines) {
            if ( line.trim().equals("") ) {
                iden = "pass";
            } else {
                iden = line.split(" ")[0];
            }
            
            
            
            if ( iden.equals("print") ) {
                ;
            } else if ( iden.equals("pass") ) {
                ;
            } else {
                System.out.println("Error: " + line.trim());
                correct = false;
            }
            
        }
        return correct;
    }
}

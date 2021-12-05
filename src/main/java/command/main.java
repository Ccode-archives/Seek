package command;


import comp.compiler;
import runner.runner;
import fileread.filereader;


private static String[] lines = filereader.read("test.seek");

public class main {
    public static void main(String[] args) {
        if ( args.length == 0 ) {
            System.out.println()
        }
        if ( args[0].equals("comp") ) {
            if ( args.length > 3 || args.length < 3 ) {
                lines = filereader.read(args[1]);
                compiler.compile(lines, args[2]);
            }
        } else if ( args[0].equals("run") ) {
            if ( args.length > 2 || args.length < 2 ) {
                lines = filereader.read(args[1]);
                runner.run(lines);
            }
        }
    }
}

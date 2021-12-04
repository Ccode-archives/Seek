package command;


import comp.compiler;
import runner.runner;
import fileread.filereader;

public class main {
    public static void main(String[] args) {
        String[] lines = filereader.read("test.seek");
        compiler.compile(lines, "test.seekc");
        lines = filereader.read("test.seekc");
        runner.run(lines);
    }
}

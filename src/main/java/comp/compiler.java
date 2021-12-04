package comp;


import java.io.File;  // Import the File class
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class compiler {
	public static String out = convertStringToBinary("SEEK") + "\n";
	//compiler
	public static void compile(String[] lines, String filename) {
		create(filename);
		for (String line : lines) {
			out = out + convertStringToBinary(line) + "\n";
		}
		flush(filename);
	}
	//file writer
	public static void write(String line, String filename) {
		try {
			FileWriter file = new FileWriter(filename);
			file.write(line);
			file.close();
		} catch (Exception e) {
			System.out.println("An error occurred. Stacktrace: ");
			e.printStackTrace();
		}
	}
	public static void flush(String filename) {
		write(out, filename);
	}
	public static Integer create(String filename) {
		Path path = Paths.get(filename);
		try {
			Files.createFile(path);
			return 0;
		} catch (Exception ex) {
			return 1;
		}
	}
	
	
	
	
	
	
	
	public static String convertStringToBinary(String input) {
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))
							.replaceAll(" ", "0") + " "
            );
        }
        return result.toString().trim();
    }
    
    
    
}

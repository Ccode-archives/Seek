package fileread;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class filereader {
	public static String[] read(String filename) {
		Path filePath = Paths.get(filename);
		String content = "";
        try
        {
            content = Files.readString(filePath);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            System.exit(0);
        }
		String[] lines = content.split("\n");
		return lines;
	}
}

package runner;

import java.util.Arrays;
import java.util.stream.Collectors;

public class runner {
	public static String bin2str(String line) {
        String raw = Arrays.stream(line.split(" "))
                .map(binary -> Integer.parseInt(binary, 2))
                .map(Character::toString)
                .collect(Collectors.joining());
        return raw;
	}
	
	public static void run(String[] lines) {
		private String line = "";
		if ( bin2str(bline) == "SEEK" ) {
			for (String bline : lines) {
				line = bin2str(line);
				if ( line.split(" ")[0] == "print" ) {
					System.out.println(line.split(" ")[1]);
				} else {
					System.out.println("Invalid code");
					System.exit("50")
				}
			}
		}
	}
	
}

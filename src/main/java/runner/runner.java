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
		String line = "";
		String iden = bin2str(lines[0]);
		if ( iden.equals("SEEK") ) {
			lines = Arrays.copyOfRange(lines, 1, lines.length);
			for (String bline : lines) {
				line = bin2str(bline);
				if ( line.split(" ")[0].equals("print") ) {
					System.out.println(String.join(" ", Arrays.copyOfRange(line.split(" "), 1, line.split(" ").length)));
				} else {
					System.out.println("Invalid code");
					System.exit(50);
				}
			}
		}
	}
	
}

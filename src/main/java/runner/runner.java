package runner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
	
	public static boolean containsLetters(String text) {
		Pattern pattern = Pattern.compile(".*[a-zA-Z].*");
		Matcher matcher = pattern.matcher(text);
		Boolean matches = matcher.matches();
		return matches;
	}
	
	public static void run(String[] lines) {
		String line = "";
		if ( containsLetters(lines[0]) || lines[0].trim().equals("") ) {
			System.out.println("invalid code");
			System.exit(50);
		}
		String iden = bin2str(lines[0]);
		if ( iden.equals("SEEK") ) {
			lines = Arrays.copyOfRange(lines, 1, lines.length);
			for (String bline : lines) {
				if ( bline.equals("") ) {
					line = "";
				} else {
					line = bin2str(bline);
				}
				if ( line.split(" ")[0].equals("print") ) {
					System.out.println(String.join(" ", Arrays.copyOfRange(line.split(" "), 1, line.split(" ").length)));
				} else if ( line.split(" ")[0].equals("") ) {
					;
				} else {
					System.out.println("Invalid code");
					System.exit(50);
				}
			}
		}
	}
	
}

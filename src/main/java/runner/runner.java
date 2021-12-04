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
}

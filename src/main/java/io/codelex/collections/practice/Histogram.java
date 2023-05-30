package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        String[] scoresArray = scores.split(" ");

        Map<String, String> scoreRanges = new LinkedHashMap<>();

        for (double i = 0; i <= 100; i += 10) {
            if (i == 100) {
                scoreRanges.put("100", "");
            } else {
                String from = String.format("%2.0f", i).replace(" ", "0");
                String to = String.format("%2.0f", i + 9).replace(" ", "0");
                scoreRanges.put(from + "-" + to, "");
            }
        }

        for (int i = 0; i < scoresArray.length; i++) {
            for (Map.Entry range : scoreRanges.entrySet()) {
                String[] keyRange = range.getKey().toString().split("-");
                String value = range.getValue().toString();

                int score = Integer.parseInt(scoresArray[i]);
                int rangeStart = Integer.parseInt(keyRange[0]);
                int rangeEnd = 0;
                if (keyRange.length > 1) {
                    rangeEnd = Integer.parseInt(keyRange[1]);
                }

                if (score == 100 && rangeStart == 100) {
                    value += "*";
                    scoreRanges.put(range.getKey().toString(), value);
                }
                if (score >= rangeStart && score <= rangeEnd) {
                    value += "*";
                    scoreRanges.put(range.getKey().toString(), value);
                }

            }
        }

        for (Map.Entry range : scoreRanges.entrySet()) {
            if (!range.getKey().toString().contains("-")) {
                System.out.println(String.format("%5.0f: %s", Double.parseDouble(range.getKey().toString()), range.getValue().toString()));
            } else {
                System.out.println(range.getKey().toString() + ": " + range.getValue());
            }
        }
    }


    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}

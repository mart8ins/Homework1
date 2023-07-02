package io.codelex.collections.practice;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> file = Files.readAllLines(path, charset);

        int fileLineSize = file.size();
        int fileWordCount = 0;
        int characterCount = 0;

        for (String line : file) {
            String lineStringWOutMultipleSpaces = line.replaceAll("\s{2,}", " ");
            String lineStringWOutAnySeperator = lineStringWOutMultipleSpaces.replaceAll("[,.?!]", "");
            String[] lineWords = lineStringWOutAnySeperator.split(" ");
            fileWordCount += lineWords.length;
            for (int i = 0; i < line.length(); i++) {
                characterCount++;
            }
        }
        System.out.println("Lines " + fileLineSize);
        System.out.println("Words " + fileWordCount);
        System.out.println("Chars " + characterCount);

    }
}

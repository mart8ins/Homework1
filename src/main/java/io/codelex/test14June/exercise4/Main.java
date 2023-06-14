package io.codelex.test14June.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path filePath = Path.of("C:\\Users\\mart8\\Desktop\\original.txt");
        Path basePath = Path.of("C:\\Users\\mart8\\Desktop");
        try {
            String string = "";
            for (String line : Files.readAllLines(filePath)) {
                string += line;
            }
            String reversedFileContent = new StringBuilder(string).reverse().toString();

            String fileName = filePath.getFileName().toString();
            String[] fileNameSeperated = fileName.split("\\.");
            String reverseFileName = new StringBuilder(fileNameSeperated[0]).reverse() + ".txt";

            System.out.println(reverseFileName);

            Path createdFile = Files.createFile(basePath.resolve(reverseFileName));
            Files.write(createdFile, reversedFileContent.getBytes());
        } catch (NoSuchFileException e) {
            System.out.println("File doesnt exist.");
        } catch (IOException e) {
            System.out.println("Problems reading file.");
        }
    }
}

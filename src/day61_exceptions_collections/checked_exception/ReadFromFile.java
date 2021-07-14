package day61_exceptions_collections.checked_exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String filePath = "src/day61_exceptions_collections/checked_exception/data.txt";

            List<String> data = Files.readAllLines(Paths.get(filePath));
            System.out.println(data.get(0));
            for (String line : data) {
                System.out.println(line);
            }

            System.out.println("--the end---");

        }
    }


package sveri;

import java.io.*;
import java.nio.file.*;
import java.util.Base64;
import java.util.List;

public class FileLineProcessor {
    public static void main(String[] args) {
        Runnable task = () -> {
       
            class LocalLineHandler {
                void execute() {
                    try {
                        List<String> lines = Files.readAllLines(Paths.get("input.txt"));
                        if (lines.size() >= 2) {
                            String secondLine = lines.get(1);
                            System.out.println("Second line: " + secondLine); 

                            String encoded = Base64.getEncoder().encodeToString(secondLine.getBytes());
                            System.out.println("Encoded: " + encoded); // Show encoded string

                            Files.write(Paths.get("output.txt"), encoded.getBytes());
                            System.out.println("Encoded second line saved to output.txt.");
                        } else {
                            System.out.println("File has fewer than 2 lines.");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            new LocalLineHandler().execute();
        };

        new Thread(task).start();
    }
}

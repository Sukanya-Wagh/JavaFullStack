import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputLogger
{
    public static void main(String[] args) 
{
        String path = "C:\\Users\\Sukanya\\Documents\\user_input_log.txt";
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try (Scanner sc = new Scanner(System.in);
             PrintWriter pw = new PrintWriter(new FileWriter(path, true))) 
{
            System.out.println("Sukanya, type (exit to stop):");
            pw.println("---- Session started by Sukanya ----");

            for (String input; !(input = sc.nextLine().trim()).equalsIgnoreCase("exit"); ) 
{
                pw.printf("[%s] %s%n", LocalDateTime.now().format(formatter), input);
                pw.flush();
            }

            System.out.println("Log saved at:\n" + path);
        }
catch (IOException e) 
{
            System.err.println("Error: " + e.getMessage());
        }
    }
}

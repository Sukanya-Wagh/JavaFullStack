import java.util.*;
public class ConsoleChat
  {
    public static void main(String[] args) throws Exception 
    {
        Queue<String> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        new Thread(() -> 
                   {
            while (true) 
            {
                String in = sc.nextLine();
                if (in.equalsIgnoreCase("exit")) System.exit(0);
                synchronized (q) { q.add(in); q.notify(); }
            }
        }).start();

        new Thread(() -> 
                   {
            while (true) 
            {
                String msg;
                synchronized (q) 
                {
                    while (q.isEmpty()) try { q.wait(); } catch (Exception e) {}
                    msg = q.poll();
                }
                try {
                  Thread.sleep(1000); 
                }
                catch (Exception e)
                  {
                }
                if (msg.toLowerCase().contains("hello")) System.out.println("Siri: Hi there!");
                else if (msg.toLowerCase().contains("bye")) System.out.println("Siri: Goodbye!");
                else if (msg.toLowerCase().contains("how are you")) System.out.println("Siri: I'm just code, but thanks for asking!");
                else System.out.println("Siri: Interesting...");
            }
        }).start();
    }
}

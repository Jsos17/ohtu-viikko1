package ohtu.io;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("consoleIO")
public class ConsoleIO implements IO {

    private Scanner scanner = new Scanner(System.in);

    public void print(String toPrint) {
        System.out.println(toPrint);
    }

    public int readInt(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    public String readLine(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

}
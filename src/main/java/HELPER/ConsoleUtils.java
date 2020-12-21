package HELPER;

import java.util.Scanner;

public class ConsoleUtils {
    private static final Scanner in = new Scanner(System.in);

    public String getUsersInput(){
        System.out.println("Introduce una opción:");
        return in.nextLine();
    }
}

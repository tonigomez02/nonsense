package eu.fbmoll.daw.programming;

import HELPER.ConsoleUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

import java.util.Scanner;

public class NonsenseApp {
    private static final CharSequence EXIT_KEY = "9";

    public static void main(String[] args) {
       /* boolean aux = StringUtils.equals("a", "A");
        System.out.println("Hola mundo " + aux);*/

        ConsoleUtils consoleUtils = new ConsoleUtils();
        boolean isExit = false;
        while (!isExit){
            String s = consoleUtils.getUsersInput();
            System.out.println("You entered string " + s);
            isExit = StringUtils.equals(s, EXIT_KEY);
        }

        System.out.println("-END-");
    }
}

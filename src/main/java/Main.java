import checker.Checker;
import checker.CheckerAbstract;
import checker.LengthChecker;
import functionality.PasswordManagerPrinter;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordManagerPrinter printer = new PasswordManagerPrinter(sc, 12, 9);
        System.out.println(printer.processPassword());
    }
}
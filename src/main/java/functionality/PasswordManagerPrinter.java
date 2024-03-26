package functionality;

import checker.Checker;
import checker.CheckerAbstract;
import checker.LetterChecker;
import model.Password;

import java.util.Scanner;

public class PasswordManagerPrinter {
    Scanner scanner;
    CheckerAbstract checker;
    Scorer scorer;
    public PasswordManagerPrinter(Scanner scanner, int maxLength, int maxScore){
        this.scanner = scanner;
        this.checker = new LetterChecker(maxLength, maxScore);
        scorer = new Scorer(maxLength, maxScore);
    }

    public String processPassword(){
        String inputPassword = askForPassword();
        Password password =  this.createPassword(inputPassword);
        int score = scorer.getPasswordScore(password.getPassword());
        password.setScore(score);
        return password.getPasswordInfo();
    }

    private String askForPassword(){
        this.printPasswordAskMessage();
        String inputPassword = scanner.nextLine();
        while(checker.checkPasswordEmpty(inputPassword)){
            this.printPasswordEmptyMessage();
            this.printPasswordAskMessage();
            inputPassword =  scanner.nextLine();
        }
        return inputPassword;
    }
    private void printPasswordAskMessage(){
        System.out.printf("Introduzca su contraseña:");
    }
    private void printPasswordEmptyMessage(){
        System.out.printf("La contraseña solicitada esta vacia\n");
    }
    private Password createPassword(String password){
        return new Password(password);
    }
}

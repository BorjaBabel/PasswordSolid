package functionality;

import model.Password;

import java.util.Scanner;

public class PassworManagerPrinter {
    Scanner scanner;

    public PassworManagerPrinter(Scanner scanner){
        this.scanner = scanner;
    }

    public String processPassword(){
        Password password =  this.createPassword(askPassword());

        return password.getPasswordInfo();
    }

    private String askPassword(){
        System.out.printf("Introduzca su contraseña: ");
        return scanner.nextLine();
    }
    private Password createPassword(String password){
        return new Password(password);
    }
}

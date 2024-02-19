package com.teachmeskills.lesson13.password.service;

/**
 * This class contain main method "logIn", which contain all validations from "Validation"-class.
 */

import com.teachmeskills.lesson13.password.com_exception.ConfirmedPasswordValidationException;
import com.teachmeskills.lesson13.password.com_exception.LoginValidationException;
import com.teachmeskills.lesson13.password.com_exception.PasswordValidationException;
import com.teachmeskills.lesson13.password.validation.Validation;

import java.util.Scanner;

public class SignIn {
    public static void logIn() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your login: ");
            String login = scanner.nextLine();
            Validation.loginValidation(login);
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            Validation.passwordValidation(password);
            System.out.print("Confirm your password: ");
            String confirmedPassword = scanner.nextLine();
            Validation.confirmedPasswordValidation(password, confirmedPassword);
            System.out.println("Successful log in!");
        } catch (LoginValidationException | ConfirmedPasswordValidationException | PasswordValidationException e) {
            System.err.println(e.getMessage());
        }
    }
}

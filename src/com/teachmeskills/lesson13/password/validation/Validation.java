package com.teachmeskills.lesson13.password.validation;

/**
 * This class contain the logic structure for all validations in program.
 */

import com.teachmeskills.lesson13.password.com_exception.ConfirmedPasswordValidationException;
import com.teachmeskills.lesson13.password.com_exception.LoginValidationException;
import com.teachmeskills.lesson13.password.com_exception.PasswordValidationException;

public class Validation {
    public static boolean loginValidation(String login) throws LoginValidationException {
        char[] loginChars = login.toCharArray();
        boolean loginCheck = true;
        for (char loginChar : loginChars) {
            if (loginChar == ' ' || loginChars.length > 21 || loginChars.length < 5) {
                loginCheck = false;
                break;
            }
        }
        if (!loginCheck){
            throw new LoginValidationException("Your login must contain from 6 to 20 letters," +
                    " numbers or symbols, except spaces!", 101);
        } else {
            return true;
        }
    }

    public static boolean passwordValidation(String password) throws PasswordValidationException {
        if(password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?!.* ).{5,20}$")){
            return true;
        } else {
            throw new PasswordValidationException("Your password must contain from 5 to 20 letters, at least 1 number and " +
                    "any amount of symbols, except spaces!", 102);
        }
    }
    public static boolean confirmedPasswordValidation(String password, String confirmedPassword)
            throws ConfirmedPasswordValidationException {
        if(confirmedPassword.equals(password)){
            return true;
        } else {
            throw new ConfirmedPasswordValidationException("Your passwords don't matches!", 103);
        }
    }
}

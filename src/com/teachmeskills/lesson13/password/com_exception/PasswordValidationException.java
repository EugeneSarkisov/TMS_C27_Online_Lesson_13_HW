package com.teachmeskills.lesson13.password.com_exception;

/**
 * This class contain pattern for "passwordValidation" exception.
 */

public class PasswordValidationException extends Exception {
    private int passwordValidationExceptionCode;

    public PasswordValidationException() {
    }

    public PasswordValidationException(String message, int passwordValidationExceptionCode) {
        super(message);
        this.passwordValidationExceptionCode = passwordValidationExceptionCode;
    }

    public int getPasswordValidationExceptionCode() {
        return passwordValidationExceptionCode;
    }

    public void setPasswordValidationExceptionCode(int passwordValidationExceptionCode) {
        this.passwordValidationExceptionCode = passwordValidationExceptionCode;
    }
}

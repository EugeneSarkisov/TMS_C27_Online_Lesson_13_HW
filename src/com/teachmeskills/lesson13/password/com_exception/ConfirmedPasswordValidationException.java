package com.teachmeskills.lesson13.password.com_exception;

/**
 * This class contain pattern for "confirmedPasswordValidation" exception.
 */

public class ConfirmedPasswordValidationException extends Exception {
    private int confirmedPasswordValidationCode;

    public ConfirmedPasswordValidationException() {
    }

    public ConfirmedPasswordValidationException(String message, int confirmedPasswordValidationCode) {
        super(message);
        this.confirmedPasswordValidationCode = confirmedPasswordValidationCode;
    }

    public int getConfirmedPasswordValidationCode() {
        return confirmedPasswordValidationCode;
    }

    public void setConfirmedPasswordValidationCode(int confirmedPasswordValidationCode) {
        this.confirmedPasswordValidationCode = confirmedPasswordValidationCode;
    }
}

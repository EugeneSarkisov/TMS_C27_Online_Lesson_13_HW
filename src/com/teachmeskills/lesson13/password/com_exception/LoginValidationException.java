package com.teachmeskills.lesson13.password.com_exception;

/**
 * This class contain pattern for "loginValidationException" exception.
 */

public class LoginValidationException extends Exception {
    private int loginValidationExceptionCode;

    public LoginValidationException() {
    }

    public LoginValidationException(String message, int loginValidationExceptionCode) {
        super(message);
        this.loginValidationExceptionCode = loginValidationExceptionCode;
    }

    public int getLoginValidationExceptionCode() {
        return loginValidationExceptionCode;
    }

    public void setLoginValidationExceptionCode(int loginValidationExceptionCode) {
        this.loginValidationExceptionCode = loginValidationExceptionCode;
    }
}

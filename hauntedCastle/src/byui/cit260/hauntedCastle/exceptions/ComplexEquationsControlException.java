/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.exceptions;

/**
 *
 * @author Shaelyn
 */
public class ComplexEquationsControlException extends Exception {

    public ComplexEquationsControlException() {
    }

    public ComplexEquationsControlException(String message) {
        super(message);
    }

    public ComplexEquationsControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ComplexEquationsControlException(Throwable cause) {
        super(cause);
    }

    public ComplexEquationsControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

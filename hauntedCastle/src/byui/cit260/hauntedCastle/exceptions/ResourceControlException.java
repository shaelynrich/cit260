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
public class ResourceControlException extends Exception {

    public ResourceControlException() {
    }

    public ResourceControlException(String message) {
        super(message);
    }

    public ResourceControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceControlException(Throwable cause) {
        super(cause);
    }

    public ResourceControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

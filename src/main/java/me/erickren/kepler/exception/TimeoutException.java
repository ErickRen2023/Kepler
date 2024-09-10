package me.erickren.kepler.exception;

/**
 * DateTime: 2024/09/10 - 21:45
 * @author ErickRen
 */
public class TimeoutException extends RuntimeException {
    
    public TimeoutException() {
        super();
    }

    public TimeoutException(String message) {
        super(message);
    }
    
}

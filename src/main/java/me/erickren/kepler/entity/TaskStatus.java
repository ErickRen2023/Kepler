package me.erickren.kepler.entity;

/**
 * DateTime: 2024/09/10 - 22:13
 * Author: ErickRen
 */
public class TaskStatus {
    
    private String message;
    
    TaskStatus() {}
    
    TaskStatus(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
}

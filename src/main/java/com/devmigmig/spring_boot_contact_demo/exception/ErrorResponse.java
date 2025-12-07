package com.devmigmig.spring_boot_contact_demo.exception;

import java.time.LocalDateTime;
import java.util.List;


public class ErrorResponse {


    private LocalDateTime timestamp;
    private List<String> message;

    public ErrorResponse(List<String> message){
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }

    public LocalDateTime getTimestamp(){
        return this.timestamp;
    }
    
    public void setTimstamp(LocalDateTime timestamp){
        this.timestamp = timestamp;
    }

    public List<String> getMessage(){
        return this.message;
    }

    public void setMessage(List<String> message){
        this.message = message;
    }
}

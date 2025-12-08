package com.devmigmig.spring_boot_contact_demo;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.devmigmig.spring_boot_contact_demo.exception.ContactNotFoundException;
import com.devmigmig.spring_boot_contact_demo.exception.ErrorResponse;

public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(ContactNotFoundException.class)
    public ResponseEntity<Object> handleContactNotFoundException(ContactNotFoundException ex){
        ErrorResponse error = new ErrorResponse(Arrays.asList(ex.getLocalizedMessage()));
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}

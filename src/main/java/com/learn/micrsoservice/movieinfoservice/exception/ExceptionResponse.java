package com.learn.micrsoservice.movieinfoservice.exception;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ExceptionResponse {

    private Date timeStamp;
    private String message;
    private List<String> errors;

    public ExceptionResponse(Date timeStamp, String message, List<String> errors) {
        super();
        this.timeStamp = timeStamp;
        this.message = message;
        this.errors = errors;

    }

    public ExceptionResponse(Date timeStamp,String message,String error){
        super();
        this.timeStamp = timeStamp;
        this.message = message;
        this.errors = Arrays.asList(error);
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}

package com.user.exception;

import org.springframework.http.HttpStatus;

public class UserApiException extends RuntimeException{
    private HttpStatus status;
    private String message;

    public UserApiException(HttpStatus status, String message) {
        super(message);
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

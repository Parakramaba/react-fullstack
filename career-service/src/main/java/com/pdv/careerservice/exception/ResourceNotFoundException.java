package com.pdv.careerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long SerialVersionUID = 1L;

    /**
     *
     */
    public ResourceNotFoundException() { super();}

    /**
     *
     * @param message
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

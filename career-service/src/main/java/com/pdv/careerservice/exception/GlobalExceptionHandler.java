package com.pdv.careerservice.exception;

import com.pdv.careerservice.record.response.ErrorDetailsRecord;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

/**
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     *
     * @param ex
     * @param request
     * @return
     */
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(final ResourceNotFoundException ex,
                                                             final WebRequest request) {
        ErrorDetailsRecord errorDetails = new ErrorDetailsRecord(HttpStatus.NOT_FOUND.value(),
                request.getDescription(false),
                ex.getMessage(),
                LocalDateTime.now(),
                null);

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

}

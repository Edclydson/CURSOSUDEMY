package com.calcrest.calcrest.Exceptioncalc.handler;

import java.util.Date;

import com.calcrest.calcrest.Exceptioncalc.ResponseException;
import com.calcrest.calcrest.Exceptioncalc.opmatematicainvalida;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ResponseException> handleAllExceptions(Exception ex, WebRequest request)
    {
        ResponseException responseexception = new ResponseException(new Date(),ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(responseexception, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(opmatematicainvalida.class)
    public final ResponseEntity<ResponseException> handleBAD_REQUESTExceptions(Exception ex, WebRequest request)
    {
        ResponseException responseexception = new ResponseException(new Date(),ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(responseexception, HttpStatus.BAD_REQUEST);
    }
}

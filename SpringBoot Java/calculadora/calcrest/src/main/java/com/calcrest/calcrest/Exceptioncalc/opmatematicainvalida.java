package com.calcrest.calcrest.Exceptioncalc;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class opmatematicainvalida extends RuntimeException 
{
    public opmatematicainvalida(String exception)
    {
        super(exception);
    }
}

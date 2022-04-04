package com.calcrest.calcrest.Operations;
import org.springframework.stereotype.Service;

@Service
public class Raiz 
{
    public Double quadrada(Double num1)
    {
        return Math.sqrt(num1);
    }
}

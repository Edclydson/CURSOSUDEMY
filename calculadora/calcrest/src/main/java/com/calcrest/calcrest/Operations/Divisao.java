package com.calcrest.calcrest.Operations;
import org.springframework.stereotype.Service;

@Service
public class Divisao 
{
    public Double dividir(Double num1,Double num2)
    {
        return num1 / num2;
    }
}

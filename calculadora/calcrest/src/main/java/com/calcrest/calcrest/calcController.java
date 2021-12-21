package com.calcrest.calcrest;

import com.calcrest.calcrest.Exceptioncalc.opmatematicainvalida;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calcController 
{
    @RequestMapping(value="/sum/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double sum(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) throws Exception
    {
        if(!isNumeric(numero1) || !isNumeric(numero2))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        Double sum = ConvertToDouble(numero1) + ConvertToDouble(numero2);
        return sum;

    }
    //VERIFICACAO SE E UM NUMERO E CONVERSAO DE STRING P DOUBLE
    private Double ConvertToDouble(String strnumero) {
        if(strnumero == null)
        {
            return 0D;
        }
        String number = strnumero.replaceAll(",", ".");
        if(isNumeric(number))
        {
            return Double.parseDouble(number);
        }
        return 0D;
    }
    //VERIFICACAO SE E UM NUMERO VALIDO E SUBSTITUICAO DE , POR .
    private boolean isNumeric(String strnumero) {
        if(strnumero == null)
        {
            return false;
        }
        String number = strnumero.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
    
}

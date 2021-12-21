package com.calcrest.calcrest;

import com.calcrest.calcrest.Exceptioncalc.opmatematicainvalida;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calcController 
{
    //SOMANDO
    @RequestMapping(value="/soma/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double soma(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) throws Exception
    {
        if(!isNumeric(numero1) || !isNumeric(numero2))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        Double soma = ConvertToDouble(numero1) + ConvertToDouble(numero2);
        return soma;

    }

    //SUBTRAINDO
    @RequestMapping(value="/subtr/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double subtracao(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) throws Exception
    {
        if(!isNumeric(numero1) || !isNumeric(numero2))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        Double sub = ConvertToDouble(numero1) - ConvertToDouble(numero2);
        return sub;

    }

    //MULTIPLICANDO
    @RequestMapping(value="/mult/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double multiplicacao(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) throws Exception
    {
        if(!isNumeric(numero1) || !isNumeric(numero2))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        Double mult = ConvertToDouble(numero1) * ConvertToDouble(numero2);
        return mult;

    }

    //DIVISAO
    @RequestMapping(value="/divisao/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double divisao(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) throws Exception
    {
        if(!isNumeric(numero1) || !isNumeric(numero2))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        Double div = ConvertToDouble(numero1) / ConvertToDouble(numero2);
        return div;

    }

    //MEDIA
    @RequestMapping(value="/media/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double media(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) throws Exception
    {
        if(!isNumeric(numero1) || !isNumeric(numero2))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        Double media = (ConvertToDouble(numero1) + ConvertToDouble(numero2))/ 2;
        return media;
    }

    //RAIZ QUADRADA
    @RequestMapping(value="/raizquad/{numero1}", method = RequestMethod.GET)
    public Double soma(@PathVariable("numero1") String numero1) throws Exception
    {
        if(!isNumeric(numero1))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        Double raizquad = Math.sqrt(Double.parseDouble(numero1));
        return raizquad;

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

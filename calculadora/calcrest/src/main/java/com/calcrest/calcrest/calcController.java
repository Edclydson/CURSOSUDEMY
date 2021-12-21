package com.calcrest.calcrest;

import com.calcrest.calcrest.Exceptioncalc.opmatematicainvalida;
import com.calcrest.calcrest.Operations.Adicao;
import com.calcrest.calcrest.Operations.Divisao;
import com.calcrest.calcrest.Operations.Media;
import com.calcrest.calcrest.Operations.Multiplicacao;
import com.calcrest.calcrest.Operations.Raiz;
import com.calcrest.calcrest.Operations.Subtracao;
import com.calcrest.calcrest.Verification.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calcController 
{
    Adicao mais = new Adicao();
    Subtracao menos = new Subtracao();
    Multiplicacao vezes = new Multiplicacao();
    Divisao divisao = new Divisao();
    Media mdia = new Media();
    Raiz rquad = new Raiz();

    //SOMANDO
    @RequestMapping(value="/soma/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double soma(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) throws Exception
    {
        if(!IsNumeric.Numeric(numero1) || !IsNumeric.Numeric(numero2))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        else
        {
            return mais.mais(Convert.ToDouble(numero1),Convert.ToDouble(numero2));
        }       
    }

    //SUBTRAINDO
    @RequestMapping(value="/subtr/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double subtracao(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) throws Exception
    {
        if(!IsNumeric.Numeric(numero1) || !IsNumeric.Numeric(numero2))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        else
        {
            return menos.menos(Convert.ToDouble(numero1), Convert.ToDouble(numero2));
        }
    }

    //MULTIPLICANDO
    @RequestMapping(value="/mult/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double multiplicacao(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) throws Exception
    {
        if(!IsNumeric.Numeric(numero1) || !IsNumeric.Numeric(numero2))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        else
        {
            return vezes.vezes(Convert.ToDouble(numero1),Convert.ToDouble(numero2));
        }
    }

    //DIVISAO
    @RequestMapping(value="/divisao/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double divisao(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) throws Exception
    {
        if(!IsNumeric.Numeric(numero1) || !IsNumeric.Numeric(numero2))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        else
        {
            return divisao.dividir(Convert.ToDouble(numero1),Convert.ToDouble(numero2));
        }
    }

    //MEDIA
    @RequestMapping(value="/media/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double media(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) throws Exception
    {
        if(!IsNumeric.Numeric(numero1) || !IsNumeric.Numeric(numero2))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        else
        {
            return mdia.mdia(Convert.ToDouble(numero1), Convert.ToDouble(numero2));
        }
    }

    //RAIZ QUADRADA
    @RequestMapping(value="/raizquad/{numero1}", method = RequestMethod.GET)
    public Double soma(@PathVariable("numero1") String numero1) throws Exception
    {
        if(!IsNumeric.Numeric(numero1))
        {
            throw new opmatematicainvalida("Por favor, digite um valor numerico!");
        }
        else
        {
            return rquad.quadrada(Convert.ToDouble(numero1));
        }
    }    
}

package com.calcrest.calcrest.Verification;

public class Convert
{
    //VERIFICACAO SE E UM NUMERO E CONVERSAO DE STRING P DOUBLE
    public static Double ToDouble(String strnumero) 
    {
        if(strnumero == null)
        {
            return 0D;
        }
        String number = strnumero.replaceAll(",", ".");
        if(IsNumeric.Numeric(number))
        {
            return Double.parseDouble(number);
        }
        return 0D;
    }   
}

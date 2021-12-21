package com.calcrest.calcrest.Verification;

public class IsNumeric 
{
 //VERIFICACAO SE E UM NUMERO VALIDO E SUBSTITUICAO DE , POR .
 public static boolean Numeric(String strnumero) 
 {
     if(strnumero == null)
     {
         return false;
     }
     String number = strnumero.replaceAll(",", ".");
     return number.matches("[-+]?[0-9]*\\.?[0-9]+");
 }    

}

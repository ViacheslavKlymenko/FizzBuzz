/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Администратор
 */
public class Factorial4 {

    protected static ArrayList table = new ArrayList();

    static {
        table.add(BigInteger.valueOf(1));
    }
    
    public static synchronized BigInteger factorial (int x){
    if (x < 0) {
            throw new IllegalArgumentException(" х не должен быть отрецательным");
        }
    for(int size = table.size(); size <= x; size++){
    BigInteger lastfactorial = (BigInteger) table.get(size-1);
    BigInteger nextfactorial = lastfactorial.multiply (BigInteger.valueOf(size)) ;
    table.add(nextfactorial);
    }
    return (BigInteger) table.get(x);
   
    }
}

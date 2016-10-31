/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Администратор
 */
public class Factorial2 {

    public static long factorial(long x) {
        long fact = 1;
        if (x < 0) {
            throw new IllegalArgumentException("X must be more than 0");
        }
        if (x <= 1) {
         return 1;
        }
        else {
        return x * factorial(x-1);
        }
    }

}

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
public class Factorial {
    public static int factorial (int x){
    int fact = 1;
    if (x < 0) throw new IllegalArgumentException("X must be more than 0");
    for (int i = 2; i <= x; i++){
    fact *=i;
    }
    return fact;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;


import static fizzbuzz.Factorial4.factorial;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Администратор
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            if ((i % 5 == 0) && (i % 7 == 0)) {
//                System.out.println("FizzBuzz");
//            }
//            else
//                if ((i % 5 == 0)){
//                    System.out.println("Fizz");
//                }
//                else
//                    if ((i % 7 == 0 )){
//                        System.out.println("Buzz");
//                    }
//                    else{
//                        System.out.println("i = " + i);
//                    }
//        }
        BigInteger fact = factorial(5);
        System.out.println(fact);
        
    }

}

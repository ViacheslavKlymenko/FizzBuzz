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
public class FizzBuzz2 {

    public static void main(String[] arg) {
        for (int i = 0; i < 100; i++) {
            switch (i % 35) {
                case 0:
                    System.out.println("FizzBuzz");
                    break;
                case 5:
                case 10:
                case 15:
                case 20:
                case 25:
                case 30:
                    System.out.println("Fizz");
                    break;
                case 7:
                case 14:
                case 21:
                case 28:
                    System.out.println("Buzz");
                    break;
            }

        }
    }
}

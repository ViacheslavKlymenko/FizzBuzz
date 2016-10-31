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
public class Fibonache {

    public static void main(String[] args) {
        int n0 = 1, n1 = 1, n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 0; i < 100; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }

}

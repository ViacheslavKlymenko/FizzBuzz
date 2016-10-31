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
public class Echo {
    public static void main(String[] args ) {
        int i = 0;
        while( i <args.length){
            System.err.print(args[i] + " ");
            i++;
        }
        System.out.println();
    }
    
}

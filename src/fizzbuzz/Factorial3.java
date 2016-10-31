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
public class Factorial3 {

    static long[] table = new long[21];

    static {
        table[0] = 1;
    }
    static int last = 0;

    public static long factorial(int x) throws IllegalArgumentException {
        if (x >= table.length) {
            throw new IllegalArgumentException("Переполнение: х слишком велик");
        }
        if (x < 0) {
            throw new IllegalArgumentException(" х не должен быть отрецательным");
        }
        while (last < x) {
            table[last + 1] = table[last] * (last + 1);
            last++;
        }
        return table[x];
    }
}

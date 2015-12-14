package main;

/**
 * Created by master on 3.12.15.
 */
public class Massiiv {
    public static void main(String[] args) {
        // massiiv = int[] loendamist alustatakse 0,1,2,3...
        int [] ostukorv = {15, 28, 17, 5, 10};
        ostukorv[2] = 15; // loendame teise positsiooni e. 0,1,2 on 17

        System.out.println(ostukorv[2]);  // prindib välja ostukorvis toote pos 2.

    }
}

package main;

/**
 * Created by master on 3.12.15.
 */
public class While {
    public static void main(String[] args) {
        int [] kiirus = {87, 91, 95, 86, 89};
        int l = 0;
        while (l < 5){
           if (kiirus[l]> 90) {
               System.out.println("Trahv");

            }
            l = l +1;
        }
        System.out.println("Tsükkel läbi");
    }
}

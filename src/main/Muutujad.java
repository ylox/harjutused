package main;

/**
 * Created by master on 3.12.15.
 */
public class Muutujad {
    public static void main(String[] args) {
        int minuRaha = 150;
        int ostukorv = 100;

        minuRaha = minuRaha - ostukorv;
        String minuRahaEurodes = minuRaha + "eur";
        System.out.println(minuRahaEurodes);

    }
}

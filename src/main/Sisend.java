package main;

import java.util.Scanner;

/**
 * Created by master on 3.12.15.
 */
public class Sisend {
    public static void main(String[] args) {
        Scanner klaviatuur = new Scanner(System.in);

        System.out.println("mis on sinu nimi?");
        String nimi = klaviatuur.nextLine(); // salvestab nime, kui valida nextLine siis salvestab terve rea.

        System.out.println("mis on sinu vanus?");
        int vanus = klaviatuur.nextInt();

        System.out.println("Mis on sinu palga number?");
        double palk = klaviatuur.nextDouble();

        System.out.println("Tere, " + nimi + ". Sinu vanus on " + vanus + "ja palka saad " + palk);


    }
}

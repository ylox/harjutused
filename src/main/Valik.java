package main;

/**
 * Created by master on 3.12.15.
 */
public class Valik {
    public static void main(String[] args) {
        String sihtpunkt = "Viljandi";

        if (sihtpunkt.equals("Viljandi")) {
            System.out.println("keera paremale");
        }else if (sihtpunkt.equals("Tartu")){
            System.out.println("Keera vasakule");
        }else {
            System.out.println("otse edasi");
        }
    }
}

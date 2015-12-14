package LoginDB;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;

/**
 * Created by master on 14.12.15.
 */
public class Andmebaas {
    Connection conn;

    public Andmebaas(){
        seadistaAndmebaas ();


    }

    private void seadistaAndmebaas() {
        try {
            Class.forName("org.sqlite.JDBC"); //Alt+Ent vali Try/Catch - selleks et proge kinni ei jookseks
            conn = DriverManager.getConnection("jdbc:sqlite:login.db");
            System.out.println("Andmebaas Käivitus");

        } catch (ClassNotFoundException e) { //püüavad errori kinni ja ei jooksuta proge kinni.
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    /**public void sulgeYhendus() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("ühendus suletud");
    }**/

    public void seadistaTabel() {
        try {
            Statement stat = conn.createStatement(); // tabeli loomine
            String sql = "CREATE TABLE IF NOT EXISTS USERS (ID INT AUTO_INCREMENT, USERNAME TEXT, PASSWORD TEXT, ISIKUKOOD TEXT, PEREKONNANIMI TEXT, EESNIMI TEXT, TELEFON TEXT, AADRESS TEXT);";
            //Auto_increment - genereerib ise numbri.
            stat.executeUpdate(sql);
            stat.close();
            System.out.println("Tabel on loodud");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registreeriKasutaja(String kasutajaNimi, String parool) {
        try {
            Statement stat = conn.createStatement();
            String sql = "INSERT INTO USER (USERNAME, PASSWORD) VALUES ('" + kasutajaNimi + "', '" + parool +"')"; // ühe kordsed '' vajalikud
            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void kuvaRead(String kasutajanimi) {
        try {
            Statement stat = conn.createStatement();
            String sql = "SELECT * FROM USER WHERE USERNAME = '" + kasutajanimi + "'"; // * KUVAB KÕIK VÄLJAD

            ResultSet results = stat.executeQuery(sql);
            String abKasutaja = results.getString("USERNAME");
            System.out.println(abKasutaja);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public boolean login(String kasutajaNimi, String parool) {
        try {
            Statement stat = conn.createStatement();
            String sql = "SELECT * FROM USERS WHERE USERNAME = '" + kasutajaNimi + "' LIMIT 1;";
            ResultSet rs = stat.executeQuery(sql);
            String dbPassword = rs.getString("parool");
            rs.close();
            stat.close();
            return parool.equals(dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public void sulgeYhendus() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("ühendus suletud");
    }

}

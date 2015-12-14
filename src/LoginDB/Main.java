package LoginDB;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 1. create table
 * 2. insert
 * 3. update
 * 4. select
 *
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Andmebaas a = new Andmebaas();
        // a.seadistaTabel(); //kommenteerime välja kuna tegelikult peaks tabeli looma 1 x ja hiljem kontrolllima kas tühi v mitte.
        new LoginScreen();
    }
}

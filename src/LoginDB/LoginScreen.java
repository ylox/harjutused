package LoginDB;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by master on 14.12.15.
 */
public class LoginScreen {               // logimis akna tegemine
    public LoginScreen() {
        Stage stage =  new Stage();
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 300, 200);

        Label kasutajaLabel = new Label("Kasutajanimi");
        TextField kasutajaInput = new TextField();
        Label paroolLabel = new Label("Parool");
        TextField paroolInput = new TextField();
        Button loginButton = new Button("Logi sisse");
        Button registerButton = new Button("Register");

        vbox.getChildren().addAll(kasutajaLabel, kasutajaInput, paroolLabel, paroolInput, loginButton, registerButton);

        stage.setScene(scene);
        stage.show();

        registerButton.setOnAction(event -> {           // et infot saaks sisestada.
            String kasutajaNimi = kasutajaInput.getText();
            String parool = paroolInput.getText();
            Andmebaas a = new Andmebaas();
            a.registreeriKasutaja(kasutajaNimi, parool);
            a.kuvaRead(kasutajaNimi); // kuvab Andmebaasi classist
            a.sulgeYhendus();
            });
        /**loginButton.setOnAction(event -> {
            String kasutajaNimi = kasutajaInput.getText();
            String parool = paroolInput.getText();
            Andmebaas a = new Andmebaas();
            boolean result = a.login(kasutajaNimi,parool);
            a.sulgeYhendus();
            if (result){
            }

        });**/

    }
}

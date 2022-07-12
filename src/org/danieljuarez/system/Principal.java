/*
Nombre del programador: Daniel Alejandro Juárez García. 
Carné: 2020121.
Código técnico: IN5AV.
Fechas de modificaciones:
    15/04/2021.
    16/04/2021.
    17/04/2021.
    18/04/2021.
    19/04/2021.
    20/04/2021.
    21/04/2021.
    22/04/2021.
    23/04/2021.
*/
package org.danieljuarez.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        escenarioPrincipal.setTitle("Calculadora por: Daniel Juárez.");
        escenarioPrincipal.getIcons().add(new Image("/org/danieljuarez/images/cal1.png"));
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
        //-fx-Prompt-text-fill: derive(-fx-control-inner-background,-30%);
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}

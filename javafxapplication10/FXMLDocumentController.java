/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author TAREK
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button bouton1;

    @FXML
    private ImageView icon1;

    @FXML
    private Label label;
    @FXML
    private Button bouton2;
     

//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
//    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        File file = new File("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication10\\src\\image\\france.png");
        Image image = new Image(file.toURI().toString());
        icon1.setImage(image);
        bouton1.setText("france");
        
        
        
        
        //-----------------------------------------------------------------
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}


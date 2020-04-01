/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import com.jfoenix.controls.JFXButton;
import data.SemiFinal;
import data.Team;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.Timer;

/**
 * FXML Controller class
 *
 * @author TAREK
 */
public class SemiFinalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private Team winner1;
    private Team winner2;
    private Team loser1;
    private Team loser2;
    private Team t1 ;
    private Team t2 ; 
    private Team t3 ; 
    private Team t4;
    @FXML
    private HBox Match1;

    @FXML
    private Label TeamA1;

    @FXML
    private Label scoreA;

    @FXML
    private Label TeamA2;

    @FXML
    private HBox Match11;

    @FXML
    private Label TeamB1;

    @FXML
    private Label scoreB;

    @FXML
    private Label TeamB2;
    @FXML
    private ImageView imageA1;

    @FXML
    private ImageView imageA2;
     @FXML
    private ImageView imageB1;

    @FXML
    private ImageView imageB2;
        @FXML
    private AnchorPane container;
            @FXML
    private JFXButton gF;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    Match1.setVisible(false);
    Match11.setVisible(false);
    
        ArrayList<Timer> arry = new ArrayList<Timer> ();
        Timer timer1 = new Timer(2000 , e ->Match1.setVisible(true));
        Timer timer2 = new Timer(3000 , e ->Match11.setVisible(true));

        arry.add(timer1);
        arry.add(timer2); 
        for (int i = 0; i < arry.size(); i++) {
            arry.get(i).start();
            
        }
           
    
    }

    public void goSemiFinale(Team a ,Team b , Team c , Team d ){
        this.t1 = a ; 
        this.t2 = b ; 
        this.t3 = c ; 
        this.t4 = d ;
        
        SemiFinal sM =  new SemiFinal(this.t1, this.t2 , this.t3, this.t4);
	sM.play();
        TeamA1.setText(sM.getArry().get(0).getTeamA().getCountry());
        TeamA2.setText(sM.getArry().get(0).getTeamB().getCountry());
        
             File fileTa1 = new File(sM.getArry().get(0).getTeamA().getFlag());
             Image fileTeama1 = new Image(fileTa1.toURI().toString(),250,200,false , false);
             imageA1.setImage(fileTeama1);
             
             File fileTa2 = new File(sM.getArry().get(0).getTeamB().getFlag());
             Image fileTeama2 = new Image(fileTa2.toURI().toString(),250,200,false , false);
             imageA2.setImage(fileTeama2);
        
        
        scoreA.setText(sM.getArry().get(0).getScoreA() + " - " + sM.getArry().get(0).getScoreB()  );
        
        TeamB1.setText(sM.getArry().get(1).getTeamA().getCountry());
        TeamB2.setText(sM.getArry().get(1).getTeamB().getCountry());
        
         File fileTb1 = new File(sM.getArry().get(1).getTeamA().getFlag());
             Image fileTeamb1 = new Image(fileTb1.toURI().toString(),250,200,false , false);
             imageB1.setImage(fileTeamb1);
             
             File fileTb2 = new File(sM.getArry().get(1).getTeamB().getFlag());
             Image fileTeamb2 = new Image(fileTb2.toURI().toString(),250,200,false , false);
             imageB2.setImage(fileTeamb2);
        
        
        
        
        
        
        
        
        scoreB.setText(sM.getArry().get(1).getScoreA() + " - " + sM.getArry().get(1).getScoreB()  );
        
        
        this.winner1 = sM.getWinnerA();
        this.winner2 = sM.getWinnerB();
        this.loser1 = sM.getLooserA();
        this.loser2 = sM.getLooserB();

        
        
        
        
        
    
    }
      @FXML
    void goToFinal(ActionEvent event) throws IOException {
              
        FXMLLoader loader=new FXMLLoader(getClass().getResource("FINAL.fxml"));
        Parent root = (Parent) loader.load();  
        
        
         FINALController secController=loader.getController();            
        secController.goTofinale(this.winner1, this.winner2, this.loser1, this.loser2);
                                      
        Scene scene = gF.getScene();
        root.translateXProperty().set(scene.getWidth());

        StackPane parentContainer = (StackPane) gF.getScene().getRoot();

        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(2), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            parentContainer.getChildren().remove(container);
        });
        timeline.play();
        
        
        
        
        
        
        
        
        /*
        
         try {
                                FXMLLoader loader=new FXMLLoader(getClass().getResource("FINAL.fxml"));
                                Parent root = (Parent) loader.load();

                                FINALController secController=loader.getController();            
                                secController.goTofinale(this.winner1, this.winner2, this.loser1, this.loser2);
                    Node node = (Node ) event.getSource();
                     
                    Stage stage= (Stage ) node.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Quarter final ");
                    stage.show();
                    } catch (IOException ex) {
                       Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   */
            
    }
    
}

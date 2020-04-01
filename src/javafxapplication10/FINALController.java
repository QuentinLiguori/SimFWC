/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import com.jfoenix.controls.JFXButton;
import data.Final;
import data.Team;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author TAREK
 */
public class FINALController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private Team t1 ; 
    private Team t2; 
    private Team t3; 
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
    private Label TeamB1;

    @FXML
    private Label scoreB;

    @FXML
    private Label TeamB2;
   
      @FXML
    private Label firstPlace;
  

   
    @FXML
    private ImageView imageA1;

    @FXML
    private ImageView imageA2;
      @FXML
    private ImageView imageB1;

    @FXML
    private ImageView imageB2;
    @FXML
    private ImageView podium;
    @FXML
    private Circle rectangle;
   
      @FXML
    private ImageView secondWinner;
          @FXML
    private ImageView firstWinner;

    @FXML
    private ImageView thirdWinner;
      @FXML
    private JFXButton repeat;

    
    /*
    @FXML
    private Label firstPlace;

    @FXML
    private Label secondPlace;

    @FXML
    private Label thirdPlace;
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*
            File fileTd2 = new File(arr.get(3).getTeamB().getFlag());
             Image fileTeamd2 = new Image(fileTd2.toURI().toString(),250,200,false , false);
             imageD2.setImage(fileTeamd2);
        */
   

    }


    public void goTofinale(Team t1 , Team t2 , Team t3 , Team t4){
        this.t1 = t1 ; 
        this.t2 = t2 ; 
        this.t3 = t3 ; 
        this.t4 = t4 ; 
        Final fN =  new Final(this.t1, this.t2, this.t3, this.t4);
 
        fN.playFinal();
        TeamA1.setText(fN.getArry().get(0).getTeamA().getCountry());
        TeamA2.setText(fN.getArry().get(0).getTeamB().getCountry());
        
        
             File fileTa1 = new File(fN.getArry().get(0).getTeamA().getFlag());
             Image fileTeama1 = new Image(fileTa1.toURI().toString(),250,200,false , false);
             imageA1.setImage(fileTeama1);
             
              File fileTa2 = new File(fN.getArry().get(0).getTeamB().getFlag());
             Image fileTeama2 = new Image(fileTa2.toURI().toString(),250,200,false , false);
             imageA2.setImage(fileTeama2);
        
        
        scoreA.setText(fN.getArry().get(0).getScoreA() + " - " + fN.getArry().get(0).getScoreB()  );
        
        
        
        TeamB1.setText(fN.getArry().get(1).getTeamA().getCountry());
        TeamB2.setText(fN.getArry().get(1).getTeamB().getCountry());
        
        
        
             File fileTb1 = new File(fN.getArry().get(1).getTeamA().getFlag());
             Image fileTeamb1 = new Image(fileTb1.toURI().toString(),250,200,false , false);
             imageB1.setImage(fileTeamb1);
             
              File fileTb2 = new File(fN.getArry().get(1).getTeamB().getFlag());
             Image fileTeamb2 = new Image(fileTb2.toURI().toString(),250,200,false , false);
             imageB2.setImage(fileTeamb2);
        
        
        
        scoreB.setText(fN.getArry().get(1).getScoreA() + " - " + fN.getArry().get(1).getScoreB()  );
        
        System.out.println();
       // System.out.println(fN.getSecond().getCountry());
       String x = fN.getFirst().getCountry();
//
      //  first.setText("1er : "+fN.getFirst().getCountry());
      //  second.setText("2e : "+fN.getSecond().getCountry());
      //  third.setText("3e : "+ fN.getThird().getCountry());
        
        
        
         File podiumm = new File("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication10\\src\\image\\myPoidum-removebg-preview.png");
             Image podiumM = new Image(podiumm.toURI().toString());
             podium.setImage(podiumM);
             
            FadeTransition podiums = new FadeTransition(Duration.seconds(5), podium);
            podiums.setFromValue(0);
            podiums.setToValue(1);
            podiums.play();
            
             RotateTransition tt = new RotateTransition(Duration.seconds(4)  , podium );
             tt.setByAngle(360);
             tt.play();
            
             
             
             
             
         File secondImage = new File(fN.getSecond().getFlag());
             Image second = new Image(secondImage.toURI().toString(),250,200,false , false);
             secondWinner.setImage(second);
             
             
             
           File firstImage = new File(fN.getFirst().getFlag());
             Image first = new Image(firstImage.toURI().toString(),250,200,false , false);
             firstWinner.setImage(first);
             
             
             
              File thirdImage = new File(fN.getThird().getFlag());
             Image third = new Image(thirdImage.toURI().toString(),250,200,false , false);
             thirdWinner.setImage(third);
             
             //--------------------------------------------------
             
              FadeTransition thirdo = new FadeTransition(Duration.seconds(5), thirdWinner);
            thirdo.setFromValue(0);
            thirdo.setToValue(1);
            thirdo.play();
             
             RotateTransition t = new RotateTransition(Duration.seconds(4)  , thirdWinner );
             t.setByAngle(360);
             t.play();
             
             //------------------------------------------------------
             
             
             FadeTransition secendo = new FadeTransition(Duration.seconds(5), secondWinner);
            secendo.setFromValue(0);
            secendo.setToValue(1);
            secendo.play();
             
             
              RotateTransition s = new RotateTransition(Duration.seconds(4)  , secondWinner );
             s.setByAngle(360);
             s.play();
             
             //------------------------------------------------------------
             
             FadeTransition firsto = new FadeTransition(Duration.seconds(5), firstWinner);
            firsto.setFromValue(0);
            firsto.setToValue(1);
            firsto.play();
             
             
              RotateTransition f = new RotateTransition(Duration.seconds(4)  , firstWinner );
             f.setByAngle(360);
             f.play();
            

    }
    
      @FXML
    void repeat(ActionEvent event) {
        
         try {
                                FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                                Parent root = (Parent) loader.load();

                              
                    Node node = (Node ) event.getSource();
                     
                    Stage stage= (Stage ) node.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Quarter final ");
                    stage.show();
                    } catch (IOException ex) {
                       Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                   }
        
        
        
        
        
        
        
        

    }
    
    
    
    
}

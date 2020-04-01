/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import com.jfoenix.controls.JFXButton;
import core.Match;
import data.QuarterFinal;
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
import javafx.scene.input.MouseEvent;
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
public class QuarterFinalController implements Initializable {
    

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label TeamA1;

    @FXML
    private Label scoreA;

    @FXML
    private Label TeamA2;
     @FXML
    private HBox Match1;
    @FXML
    private HBox Match2;

    @FXML
    private Label TeamB1;

    @FXML
    private Label scoreB;

    @FXML
    private Label TeamB2;

    @FXML
    private HBox Match3;

    @FXML
    private Label TeamC1;

    @FXML
    private Label scoreC;

    @FXML
    private Label TeamC2;

    @FXML
    private HBox Match4;

    @FXML
    private Label TeamD1;

    @FXML
    private Label scoreD;

    @FXML
    private Label TeamD2;
    
    
     @FXML
    private ImageView imagea1;

    @FXML
    private ImageView imageA2;
    
     @FXML
    private ImageView imageB1;

    @FXML
    private ImageView imageB2;
    
    
     @FXML
    private ImageView imageC1;

    @FXML
    private ImageView imageC2;
     @FXML
    private ImageView imageD1;

    @FXML
    private ImageView imageD2;
        @FXML
    private AnchorPane container;
            @FXML
    private JFXButton goSF;
            
                @FXML
    private StackPane parentContainer;

    @FXML
    private AnchorPane anchorRoot;
     
     
     
    private ArrayList<Team> arry = new ArrayList<Team>();
    private Team a ;
    private Team b ;
    private Team c ;
    private Team d ;

 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    Match1.setVisible(false);
    Match2.setVisible(false);
    Match3.setVisible(false);
    Match4.setVisible(false);
        ArrayList<Timer> arry = new ArrayList<Timer> ();
        Timer timer1 = new Timer(2000 , e ->Match1.setVisible(true));
        Timer timer2 = new Timer(3000 , e ->Match2.setVisible(true));
        Timer timer3 = new Timer(4000 , e ->Match3.setVisible(true));
        Timer timer4 = new Timer(5000 , e ->Match4.setVisible(true));

        arry.add(timer1);
        arry.add(timer2);
        arry.add(timer3);
        arry.add(timer4);

        
        for (int i = 0; i < arry.size(); i++) {
            arry.get(i).start();
            
        }
        
    }
    public void GoQuarterFianal(ArrayList<Team> ar){
        this.arry = ar;
        
        QuarterFinal qF = new QuarterFinal(this.arry.get(0), this.arry.get(1), this.arry.get(2), this.arry.get(3), this.arry.get(4), this.arry.get(5), this.arry.get(6), this.arry.get(7));
        qF.qualificationToSemiFinal();
        ArrayList<Match> arr = new ArrayList<Match>(); 
        arr = qF.getArry();
        TeamA1.setText(arr.get(0).getTeamA().getCountry());
        
        
              File fileTa1 = new File(arr.get(0).getTeamA().getFlag());
             Image fileTeam1 = new Image(fileTa1.toURI().toString(),250,200,false , false);
             imagea1.setImage(fileTeam1);
             
              File fileTa2 = new File(arr.get(0).getTeamB().getFlag());
             Image fileTeam2 = new Image(fileTa2.toURI().toString(),250,200,false , false);
             imageA2.setImage(fileTeam2);

        TeamA2.setText(arr.get(0).getTeamB().getCountry());
        scoreA.setText(arr.get(0).getScoreA()+" - " + arr.get(0).getScoreB() );
        
        
        
        
        
        TeamB1.setText(arr.get(1).getTeamA().getCountry());
        TeamB2.setText(arr.get(1).getTeamB().getCountry());
        
         File fileTb1 = new File(arr.get(1).getTeamA().getFlag());
             Image fileTeamb1 = new Image(fileTb1.toURI().toString(),250,200,false , false);
             imageB1.setImage(fileTeamb1);
             
              File fileTb2 = new File(arr.get(1).getTeamB().getFlag());
             Image fileTeamb2 = new Image(fileTb2.toURI().toString(),250,200,false , false);
             imageB2.setImage(fileTeamb2);
        
        
        scoreB.setText(arr.get(1).getScoreA()+" - " + arr.get(1).getScoreB() );
        
                
        TeamC1.setText(arr.get(2).getTeamA().getCountry());
        TeamC2.setText(arr.get(2).getTeamB().getCountry());
        
            File fileTc1 = new File(arr.get(2).getTeamA().getFlag());
             Image fileTeamc1 = new Image(fileTc1.toURI().toString(),250,200,false , false);
             imageC1.setImage(fileTeamc1);
             
              File fileTc2 = new File(arr.get(2).getTeamB().getFlag());
             Image fileTeamc2 = new Image(fileTc2.toURI().toString(),250,200,false , false);
             imageC2.setImage(fileTeamc2);
        scoreC.setText(arr.get(2).getScoreA()+" - " + arr.get(2).getScoreB() );
        
                 
        
        
        
        
        
        TeamD1.setText(arr.get(3).getTeamA().getCountry());
        TeamD2.setText(arr.get(3).getTeamB().getCountry());
        
        
        
        
             File fileTd1 = new File(arr.get(3).getTeamA().getFlag());
             Image fileTeamd1 = new Image(fileTd1.toURI().toString(),250,200,false , false);
             imageD1.setImage(fileTeamd1);
             
              File fileTd2 = new File(arr.get(3).getTeamB().getFlag());
             Image fileTeamd2 = new Image(fileTd2.toURI().toString(),250,200,false , false);
             imageD2.setImage(fileTeamd2);
        
        
        
        
        scoreD.setText(arr.get(3).getScoreA()+" - " + arr.get(2).getScoreB() );
        
        this.a = qF.getFirstWinner();
        this.b = qF.getSecondWinner(); 
        this.c = qF.getThirdWinner();
        this.d = qF.getFourthWinner(); 
        
        
        

/*
		System.out.println("************************************************");
		System.out.println("*** Lancement des quarts de Finale ***");
		qF.qualificationToSemiFinal();

		System.out.println("Le gagnant du premier quart de finale est : " + qF.getFirstWinner().getCountry());
		System.out.println("Le gagnant du deuxième quart de finale est : " + qF.getSecondWinner().getCountry());
		System.out.println("Le gagnant du troisième quart de finale est : " + qF.getThirdWinner().getCountry());
		System.out.println("Le gagnant du quatrième quart de finale est : " + qF.getFourthWinner().getCountry());

*/	
    
    
    }
      @FXML
    void goToSemiFinal(ActionEvent event) throws IOException {

        
          
                        FXMLLoader loader=new FXMLLoader(getClass().getResource("SemiFinal.fxml"));
                    Parent root = (Parent) loader.load();
                        SemiFinalController secController=loader.getController();            
                     secController.goSemiFinale(this.a, this.b, this.c, this.d); 

                        Scene scene = goSF.getScene();
                        root.translateXProperty().set(scene.getWidth());

                        parentContainer.getChildren().add(root);

                        Timeline timeline = new Timeline();
                        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
                        KeyFrame kf = new KeyFrame(Duration.seconds(3), kv);
                        timeline.getKeyFrames().add(kf);
                        timeline.setOnFinished(t -> {
                            parentContainer.getChildren().remove(anchorRoot);
                        });
                        timeline.play();

        
        
        
        
        
        
        
        
        
        /*
         try {
                    FXMLLoader loader=new FXMLLoader(getClass().getResource("SemiFinal.fxml"));
                    Parent root = (Parent) loader.load();
            
                     SemiFinalController secController=loader.getController();            
                     secController.goSemiFinale(this.a, this.b, this.c, this.d);                  
                    
                    Node node = (Node ) event.getSource();                  
                    Stage stage= (Stage ) node.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    //stage.setTitle("SemiFinal");
                    stage.show();
                    } catch (IOException ex) {
                       Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                   }

                   */

    }
    
}

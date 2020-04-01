/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import com.jfoenix.controls.JFXButton;
import data.GroupStage;
import data.Hat;
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
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author TAREK
 */

public class HatsController implements Initializable{
    @FXML
    private AnchorPane couche;

    @FXML
    private Button Hats1Button1;

    @FXML
    private ImageView icon11;

    @FXML
    private Button Hats1button2;

    @FXML
    private ImageView icon111;

    @FXML
    private Button Hats1button3;

    @FXML
    private ImageView icon112;

    @FXML
    private Button Hats1button4;

    @FXML
    private ImageView icon113;

    @FXML
    private Button Hats3button1;

    @FXML
    private ImageView icon12;

    @FXML
    private Button Hats3button2;

    @FXML
    private ImageView icon114;

    @FXML
    private Button Hats3button3;

    @FXML
    private ImageView icon115;

    @FXML
    private Button Hats3button4;

    @FXML
    private ImageView icon116;

    @FXML
    private Button Hats2button1;

    @FXML
    private ImageView icon13;

    @FXML
    private Button Hats2button2;

    @FXML
    private ImageView icon117;

    @FXML
    private Button Hats2button3;

    @FXML
    private ImageView icon118;

    @FXML
    private Button Hats2button4;

    @FXML
    private ImageView icon119;

    @FXML
    private Button Hats4button1;

    @FXML
    private ImageView icon14;

    @FXML
    private Button Hats4button2;

    @FXML
    private ImageView icon1110;

    @FXML
    private Button Hats4button3;

    @FXML
    private ImageView icon1111;

    @FXML
    private Button Hats4button4;

    @FXML
    private ImageView icon1112;
    @FXML
    private JFXButton goBack;
        @FXML
    private AnchorPane container;
            @FXML
    private Button GrpStage;
    
    private Hat hat1 ;
    private Hat hat2 ;
    private Hat hat3 ;
    private Hat hat4 ;
    
    private ArrayList<Team> arry = new ArrayList<Team>();
    
    private GroupStage group1 ;
    private GroupStage group2 ;
    private GroupStage group3 ;
    private GroupStage group4 ;

    


    
    

    @Override
    public void initialize(URL location, ResourceBundle rb) {
    }
      public void hats(Hat hat1 ,Hat hat2 ,  Hat hat3 ,  Hat hat4 , ArrayList<Team> ar, GroupStage group1 , GroupStage group2 ,GroupStage group3 ,GroupStage group4){
          this.group1 = group1;
          this.group2 = group2;
          this.group3 = group3;
          this.group4 = group4;
         this.arry = ar;
         this.hat1 = hat1;
         this.hat2 = hat2;
         this.hat3 = hat3;
         this.hat4 = hat4;
         
         File file = new File(hat1.getTeam1().getFlag());
        Image image = new Image(file.toURI().toString());
        icon11.setImage(image);
        
        File file1 = new File(hat1.getTeam2().getFlag());
        Image image1 = new Image(file1.toURI().toString());
        icon111.setImage(image1);
        
        File file3 = new File(hat1.getTeam3().getFlag());
        Image image3 = new Image(file3.toURI().toString());
        icon112.setImage(image3);
        
        File file4 = new File(hat1.getTeam4().getFlag());
        Image image4 = new Image(file4.toURI().toString());
        icon113.setImage(image4);
        //------------------------------
              
         File file5 = new File(hat2.getTeam1().getFlag());
        Image image5 = new Image(file5.toURI().toString());
        icon13.setImage(image5);
        
        File file6 = new File(hat2.getTeam2().getFlag());
        Image image6 = new Image(file6.toURI().toString());
        icon117.setImage(image6);
        
        File file7 = new File(hat2.getTeam3().getFlag());
        Image image7 = new Image(file7.toURI().toString());
        icon118.setImage(image7);
        
        File file8 = new File(hat2.getTeam4().getFlag());
        Image image8 = new Image(file8.toURI().toString());
        icon119.setImage(image8);
        //66666666666666666666666666666666666
        
              
         File file9 = new File(hat3.getTeam1().getFlag());
        Image image9 = new Image(file9.toURI().toString());
        icon12.setImage(image9);
        
        File file10 = new File(hat3.getTeam2().getFlag());
        Image image10 = new Image(file10.toURI().toString());
        icon114.setImage(image10);
        
        File file11 = new File(hat3.getTeam3().getFlag());
        Image image11 = new Image(file11.toURI().toString());
        icon115.setImage(image11);
        
        File file12 = new File(hat3.getTeam4().getFlag());
        Image image12 = new Image(file12.toURI().toString());
        icon116.setImage(image12);
       
        //6666666666666666666666666666666666666666666666666
        
        File file13 = new File(hat4.getTeam1().getFlag());
        Image image13 = new Image(file13.toURI().toString());
        icon14.setImage(image13);
        
        File file14 = new File(hat4.getTeam2().getFlag());
        Image image14 = new Image(file14.toURI().toString());
        icon1110.setImage(image14);
        
        File file15 = new File(hat4.getTeam3().getFlag());
        Image image15 = new Image(file15.toURI().toString());
        icon1111.setImage(image15);
        
        File file16 = new File(hat4.getTeam4().getFlag());
        Image image16 = new Image(file16.toURI().toString());
        icon1112.setImage(image16);
        
        
        
        //bouton1.setText("france");
        
        Hats1Button1.setText(this.hat1.getTeam1().getCountry() );
        Hats1button2.setText(this.hat1.getTeam2().getCountry() );
        Hats1button3.setText(this.hat1.getTeam3().getCountry() );
        Hats1button4.setText(this.hat1.getTeam4().getCountry() );
        //----------
        Hats2button1.setText(this.hat2.getTeam1().getCountry() );
        Hats2button2.setText(this.hat2.getTeam2().getCountry());
        Hats2button3.setText(this.hat2.getTeam3().getCountry());
        Hats2button4.setText(this.hat2.getTeam4().getCountry());
        
        //-----
        Hats3button1.setText(this.hat3.getTeam1().getCountry());
        Hats3button2.setText(this.hat3.getTeam2().getCountry());
        Hats3button3.setText(this.hat3.getTeam3().getCountry());
        Hats3button4.setText(this.hat3.getTeam4().getCountry());
        
        //-------
        Hats4button1.setText(this.hat4.getTeam1().getCountry());
        Hats4button2.setText(this.hat4.getTeam2().getCountry());
        Hats4button3.setText(this.hat4.getTeam3().getCountry());
        Hats4button4.setText(this.hat4.getTeam4().getCountry());
         
        
    }
      @FXML
    void goGroupeStage(ActionEvent event) throws IOException {
        
            FXMLLoader loader=new FXMLLoader(getClass().getResource("groupStage.fxml"));
             Parent root = (Parent) loader.load();              


        GroupeStageController secController=loader.getController();            
        secController.GrouperStage(this.group1 , this.group2 , this.group3 , this.group4 , this.arry);                                
        Scene scene = GrpStage.getScene();
        root.translateXProperty().set(scene.getWidth());

        StackPane parentContainer = (StackPane) GrpStage.getScene().getRoot();

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
                                FXMLLoader loader=new FXMLLoader(getClass().getResource("groupStage.fxml"));
                                Parent root = (Parent) loader.load();

                                GroupeStageController secController=loader.getController();            
                                secController.GrouperStage(this.group1 , this.group2 , this.group3 , this.group4 , this.arry);
                    Node node = (Node ) event.getSource();
                     
                    Stage stage= (Stage ) node.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Groupe stage ");
                    stage.show();
                    } catch (IOException ex) {
                       Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                */
    
    }
    
    
    

    

     /* 
    public void myFunction(String text1_1, String text1_2 ,String text1_3, String text1_4,String text2_1, String text2_2,String text2_3, String text2_4,String text3_1, String text3_2 ,String text3_3, String text3_4,String text4_1, String text4_2,String text4_3, String text4_4 ){
        Hats1Button1.setText(text1_1);
        Hats1button2.setText(text1_2);
        Hats1button3.setText(text1_3);
        Hats1button4.setText(text1_4);
        //----------
        Hats2button1.setText(text2_1);
        Hats2button2.setText(text2_2);
        Hats2button3.setText(text2_3);
        Hats2button4.setText(text2_4);
        
        //-----
        Hats3button1.setText(text3_1);
        Hats3button2.setText(text3_2);
        Hats3button3.setText(text3_3);
        Hats3button4.setText(text3_4);
        
        //-------
        Hats4button1.setText(text4_1);
        Hats4button2.setText(text4_2);
        Hats4button3.setText(text4_3);
        Hats4button4.setText(text4_4);


        
        
    }
*/
   
    
    
               
		
                
    
}

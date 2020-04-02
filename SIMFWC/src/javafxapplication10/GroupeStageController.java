/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;
import com.jfoenix.controls.JFXButton;
import data.GroupStage;
import data.Team;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author TAREK
 */
public class GroupeStageController implements Initializable {
  @FXML
    private AnchorPane container;

    @FXML
    private AnchorPane pane1;

    @FXML
    private Label equipe1;

    @FXML
    private Label equipe2;

    @FXML
    private Label equip3;

    @FXML
    private Label equipe4;

    @FXML
    private AnchorPane pane11;

    @FXML
    private Label equipe2_1;

    @FXML
    private Label equipe2_2;

    @FXML
    private Label equip2_3;

    @FXML
    private Label equipe2_4;

    @FXML
    private AnchorPane pane12;

    @FXML
    private Label equipe3_1;

    @FXML
    private Label equipe3_2;

    @FXML
    private Label equip3_3;

    @FXML
    private Label equipe3_4;

    @FXML
    private AnchorPane pane13;

    @FXML
    private Label equipe4_1;

    @FXML
    private Label equipe4_2;

    @FXML
    private Label equipe4_3;

    @FXML
    private Label equipe4_4;

    @FXML
    private AnchorPane zabour;

    @FXML
    private Button hideFirst;

    @FXML
    private Label scoreA;

    @FXML
    private Label scoreB;

    @FXML
    private Label scoreD;

    @FXML
    private Label scoreC;

    @FXML
    private Label scoreE;

    @FXML
    private Label matchF2;

    @FXML
    private ImageView imageA1;

    @FXML
    private Label matchF21;

    @FXML
    private ImageView imageC1;

    @FXML
    private Label matchF211;

    @FXML
    private ImageView imageD2;

    @FXML
    private Label matchF212;

    @FXML
    private ImageView imageD1;

    @FXML
    private Label matchF22;

    @FXML
    private ImageView imageF1;

    @FXML
    private Label matchF23;

    @FXML
    private ImageView imageE1;

    @FXML
    private Label matchF24;

    @FXML
    private ImageView imageB1;

    @FXML
    private Label matchF26;

    @FXML
    private ImageView imageA2;

    @FXML
    private Label matchF27;

    @FXML
    private ImageView imageB2;

    @FXML
    private Label matchF28;

    @FXML
    private ImageView imageC2;

    @FXML
    private Label matchF29;

    @FXML
    private ImageView imageA;

    @FXML
    private Label matchF291;

    @FXML
    private ImageView imageE2;

    @FXML
    private Label matchF292;

    @FXML
    private ImageView imageF2;

    @FXML
    private Label scoreF;

    @FXML
    private Button key;

    @FXML
    private AnchorPane zabour1;

    @FXML
    private Button hideFirst1;

    @FXML
    private Label scoreA1;

    @FXML
    private Label scoreB1;

    @FXML
    private Label scoreD1;

    @FXML
    private Label scoreC1;

    @FXML
    private Label scoreE1;

    @FXML
    private ImageView imageA11;

    @FXML
    private ImageView imageG3C11;

    @FXML
    private Label matchF2111;

    @FXML
    private ImageView imageG3D21;

    @FXML
    private Label matchF2121;

    @FXML
    private ImageView imageG3D11;

    @FXML
    private Label matchF221;

    @FXML
    private ImageView imageG3F11;

    @FXML
    private Label matchF231;

    @FXML
    private ImageView imageG3E11;

    @FXML
    private Label matchF241;

    @FXML
    private ImageView imageG3B11;

    @FXML
    private Label matchF261;

    @FXML
    private ImageView imageG3A21;

    @FXML
    private Label matchF271;

    @FXML
    private ImageView imageG3B21;

    @FXML
    private Label matchF281;

    @FXML
    private ImageView imageG3C21;

    @FXML
    private ImageView imageG3A1;

    @FXML
    private Label matchF2911;

    @FXML
    private ImageView imageG3E21;

    @FXML
    private Label matchF2921;

    @FXML
    private ImageView imageG3F21;

    @FXML
    private Label scoreF1;

    @FXML
    private Button key1;

    @FXML
    private AnchorPane zabour2;

    @FXML
    private Button hideFirst2;

    @FXML
    private Label scoreA2;

    @FXML
    private Label scoreB2;

    @FXML
    private Label scoreD2;

    @FXML
    private Label scoreC2;

    @FXML
    private Label scoreE2;

    @FXML
    private ImageView imageA12;

    @FXML
    private ImageView imageG4C12;

    @FXML
    private Label matchF2112;

    @FXML
    private ImageView imageG4D22;

    @FXML
    private Label matchF2122;

    @FXML
    private ImageView imageG4D12;

    @FXML
    private Label matchF222;

    @FXML
    private ImageView imageG4F12;

    @FXML
    private Label matchF232;

    @FXML
    private ImageView imageG4E12;

    @FXML
    private Label matchF242;

    @FXML
    private ImageView imageG4B12;

    @FXML
    private Label matchF262;

    @FXML
    private ImageView imageG4A22;

    @FXML
    private Label matchF272;

    @FXML
    private ImageView imageG4B22;

    @FXML
    private Label matchF282;

    @FXML
    private ImageView imageG4C22;

    @FXML
    private ImageView imageG4AA4;

    @FXML
    private Label matchF2912;

    @FXML
    private ImageView imageG4E22;

    @FXML
    private Label matchF2922;

    @FXML
    private ImageView imageG4F22;

    @FXML
    private Label scoreF2;

    @FXML
    private AnchorPane zabour3;

    @FXML
    private Button hideFirst3;

    @FXML
    private Label scoreA3;

    @FXML
    private Label scoreB3;

    @FXML
    private Label scoreD3;

    @FXML
    private Label scoreC3;

    @FXML
    private Label scoreE3;

    @FXML
    private ImageView imageA13;

    @FXML
    private ImageView imageG2C13;

    @FXML
    private Label matchF2113;

    @FXML
    private ImageView imageG2D23;

    @FXML
    private Label matchF2123;

    @FXML
    private ImageView imageG2D13;

    @FXML
    private Label matchF223;

    @FXML
    private ImageView imageG2F13;

    @FXML
    private Label matchF233;

    @FXML
    private ImageView imageG2E13;

    @FXML
    private Label matchF243;

    @FXML
    private ImageView imageG2B13;

    @FXML
    private Label matchF263;

    @FXML
    private ImageView imageG2A23;

    @FXML
    private Label matchF273;

    @FXML
    private ImageView imageG2B23;

    @FXML
    private Label matchF283;

    @FXML
    private ImageView imageG2C23;

    @FXML
    private ImageView imageG2A1;

    @FXML
    private Label matchF2913;

    @FXML
    private ImageView imageG2E23;

    @FXML
    private Label matchF2923;

    @FXML
    private ImageView imageG2F23;

    @FXML
    private Label scoreF3;

    @FXML
    private Button key2;

    @FXML
    private Button key3;
    @FXML
    private ImageView flag1A;

    @FXML
    private ImageView flag2A;

    @FXML
    private ImageView flag3A;

    @FXML
    private ImageView flag4A;
    @FXML
    private ImageView flagB1;

    @FXML
    private ImageView flagB2;

    @FXML
    private ImageView flagB3;
    @FXML
    private ImageView flagB4;
    @FXML
    private ImageView flagC1;

    @FXML
    private ImageView flagC2;
    @FXML
    private ImageView flagC3;
    @FXML
    private ImageView flagC4;
        @FXML
    private ImageView flagD1;

    @FXML
    private ImageView flagD2;

    @FXML
    private ImageView flagD3;

    @FXML
    private ImageView flagD4;
    
    @FXML
    private ImageView imageTesto;
    @FXML
    private ImageView imageBackGroundB;
    @FXML
    private ImageView imageBackGroundC;
     @FXML
    private ImageView imageBackGroundD;
     @FXML
    private Line nina;
      @FXML
    private Line nina2;
     @FXML
    private Line nina3;
    @FXML
    private Line line4;
    @FXML
    private Line line5;
    @FXML
    private Line line6;
            
    @FXML
    private Line line7;
    @FXML
    private Line line8;
    @FXML
    private ImageView arrow1;
     @FXML
    private ImageView arrow2;
     @FXML
    private ImageView arrow4;
      @FXML
    private ImageView arrow3;
      @FXML
    private ImageView theCup;
      @FXML
    private ImageView a1Flag;
      
       @FXML
    private ImageView a1Flag1;
       @FXML
    private ImageView a1Flag2;  
       @FXML
    private ImageView a1Flag23;  
        @FXML
    private ImageView a1Flag22;
      @FXML
    private ImageView a1Flag21;
      @FXML
    private ImageView a1Flag231;
      @FXML
    private ImageView a1Flag2311;
    //  @FXML
  //  private AnchorPane affiche;
        @FXML
    private JFXButton goQF;
      
        
        
        
        
        
      
      
      
      
      

    private GroupStage group1;
    private GroupStage group2;
    private GroupStage group3;
    private GroupStage group4;
    private ArrayList<Team> arry = new ArrayList<Team>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      //  ButtonOpen.setVisible(true);
        //matchGroup1.setVisible(false);
        //zabour.setVisible(false);
        zabour.setTranslateX(-155);
        key.setVisible(true);
        
        zabour1.setTranslateX(-155);
        key1.setVisible(true);
        
        zabour3.setTranslateX(155);
        key3.setVisible(true);
        
        zabour2.setTranslateX(155);
        key2.setVisible(true);
        int [] holder = {0};
       
        
        Timeline animation = new Timeline(new KeyFrame(Duration.seconds(4), new KeyValue(nina.endYProperty(), 40)));
        animation.play();
        
        Timeline  animationA3 = new Timeline(new KeyFrame(Duration.seconds(4), new KeyValue(nina3.endYProperty(), -50)));
          animationA3.play();
          
           Timeline  animationB3 = new Timeline(new KeyFrame(Duration.seconds(4), new KeyValue(line5.endYProperty(), 37)));
          animationB3.play();
          
          
          
          
          Timeline  animationC3 = new Timeline(new KeyFrame(Duration.seconds(4), new KeyValue(line7.endYProperty(), -13)));
          animationC3.play();
          
  
        animation.setOnFinished(e -> { 
           
         Timeline  animationA2 = new Timeline(new KeyFrame(Duration.seconds(4), new KeyValue(nina2.endXProperty(), 300)));   
         animationA2.play();
         
         Timeline  animationC2 = new Timeline(new KeyFrame(Duration.seconds(4), new KeyValue(line4.endXProperty(), 300)));   
         animationC2.play();
         
         
         Timeline  animationB4 = new Timeline(new KeyFrame(Duration.seconds(4), new KeyValue(line6.endXProperty(), -370)));
          animationB4.play();
          
          Timeline  animationC4 = new Timeline(new KeyFrame(Duration.seconds(4), new KeyValue(line8.endXProperty(), -370)));
          animationC4.play();

             
    });
        
         File arrows1= new File("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication10\\src\\image\\arrow.png");
             Image arrws1 = new Image(arrows1.toURI().toString());
             arrow1.setImage(arrws1);
             
             
             FadeTransition ft = new FadeTransition(Duration.seconds(9.5), arrow1);
            ft.setFromValue(0);
            ft.setToValue(1);
            ft.play(); 
             
             
             
             
             
             
             
             
             File arrows2= new File("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication10\\src\\image\\arrow.png");
             Image arrws2 = new Image(arrows2.toURI().toString());
             arrow2.setImage(arrws2);
             
             
                  
             FadeTransition ft2 = new FadeTransition(Duration.seconds(9.5), arrow2);
            ft2.setFromValue(0);
            ft2.setToValue(1);
            ft2.play(); 
             
             
             
             
             
             
             
               File arrows3 = new File("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication10\\src\\image\\arrow.png");
             Image arrws3 = new Image(arrows3.toURI().toString());
             arrow3.setImage(arrws3);
             
             
                     
             FadeTransition ft3 = new FadeTransition(Duration.seconds(9.5), arrow3);
            ft3.setFromValue(0);
            ft3.setToValue(1);
            ft3.play(); 
             
             
               File arrows4 = new File("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication10\\src\\image\\arrow.png");
             Image arrws4 = new Image(arrows4.toURI().toString());
             arrow4.setImage(arrws4);
             
             
                       
             FadeTransition ft4 = new FadeTransition(Duration.seconds(9.5), arrow4);
            ft4.setFromValue(0);
            ft4.setToValue(1);
            ft4.play(); 
            
              File cup = new File("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication10\\src\\image\\worldCup.png");
             Image cupImage = new Image(cup.toURI().toString());
             theCup.setImage(cupImage);
             
             FadeTransition cupAnimation = new FadeTransition(Duration.seconds(9.5), theCup);
            cupAnimation.setFromValue(0);
            cupAnimation.setToValue(1);
            cupAnimation.play(); 
        
           
            
            
            
            
          
            
            
            
            
        //----------------------------------------------------
/*
        Duration duration = Duration.seconds(10);
        ScaleTransition scaleTransition = new ScaleTransition(duration, arc1);
        scaleTransition.setByX(0.8);
        scaleTransition.setByY(0.8);
        scaleTransition.play();
                arc1.setVisible(true);
                
                
                
                
        ScaleTransition scaleTransition1 = new ScaleTransition(duration, arc2);
        scaleTransition1.setByX(0.8);
        scaleTransition1.setByY(0.8);
        scaleTransition1.play();
                arc2.setVisible(true);
        
        */
        
        
        
        
        
        
        
        //-------------------------------------------------------
          
      
          
        
        
        
        
        
        
        
       
        
        
   
        
        
        
        /*
        TranslateTransition x = new TranslateTransition();
        x.setDuration(Duration.seconds(4));
        x.setNode(nina2);
        
       // x.setToY(200);
        //x.setByY(200);
        //x.setFromY(200);
        nina2.endYProperty();
        nina2.translateYProperty();
        
        
        x.play();
        */
        
        
     
        //ButtonOpen.setVisible(true);
    }
    public void GrouperStage(GroupStage group1 , GroupStage group2 ,GroupStage group3 ,GroupStage group4,  ArrayList<Team> arr){
        //bouton1.setText(arry.get(0).getCountry());
        //equipe1.setText(arry.get(0).get);
        this.group1 = group1;
        this.group2 = group2;
        this.group3 = group3;
        this.group4 = group4;
        this.arry = arr ; 
//
//        equipe1.setText(group1.getTeam1().getCountry());
//        equipe2.setText(group1.getTeam2().getCountry());
//        equip3.setText(group1.getTeam3().getCountry());
//        equipe4.setText(group1.getTeam4().getCountry());

             File fileBackGound = new File("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication10\\src\\image\\FIFAbACKGROUND.jpg");
             Image imageback = new Image(fileBackGound.toURI().toString());
             imageTesto.setImage(imageback);
           
             
             File fileBackGoundB = new File("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication10\\src\\image\\FIFAbACKGROUND.jpg");
             Image imagebackB = new Image(fileBackGoundB.toURI().toString());
             imageBackGroundB.setImage(imagebackB);
             
             
             File fileBackGoundC = new File("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication10\\src\\image\\FIFAbACKGROUND.jpg");
             Image imagebackC = new Image(fileBackGoundC.toURI().toString());
             imageBackGroundC.setImage(imagebackC);
             
             
             File fileBackGoundD = new File("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication10\\src\\image\\FIFAbACKGROUND.jpg");
             Image imagebackD = new Image(fileBackGoundD.toURI().toString());
             imageBackGroundD.setImage(imagebackD);
             
           
             
             














            File fileA1A1 = new File(group1.getTab().get(0).getFlag());
             Image imageA1A1 = new Image(fileA1A1.toURI().toString(),250,200,false , false);
             flag1A.setImage(imageA1A1);
             flag1A.setFitHeight(50);
             flag1A.setFitWidth(50);
             
//             imageView.setFitHeight(100);
//             imageView.setFitWidth(100);
             
             
             
              File fileA2A2 = new File(group1.getTab().get(1).getFlag());
             Image imageA2A2 = new Image(fileA2A2.toURI().toString(),250,200,false , false );
             flag2A.setImage(imageA2A2);            
              flag2A.setFitHeight(50);
             flag2A.setFitWidth(50);

             
             
             File fileA3A3 = new File(group1.getTab().get(2).getFlag());
             Image imageA3A3 = new Image(fileA3A3.toURI().toString(),250,200,false , false);
             flag3A.setImage(imageA3A3);
              flag3A.setFitHeight(50);
             flag3A.setFitWidth(50);
             
             
             
              File fileA4A4 = new File(group1.getTab().get(3).getFlag());
             Image imageA4A4 = new Image(fileA4A4.toURI().toString(),250,200,false , false);
             flag4A.setImage(imageA4A4);
              flag4A.setFitHeight(50);
             flag4A.setFitWidth(50);
             //----------------------------------------------------groupe B-------------------------------------------
             
             //-----------------------------------------------------------------------------------------------------
             
             File fileB1B1 = new File(group2.getTab().get(0).getFlag());
             Image imageB1B1 = new Image(fileB1B1.toURI().toString(),250,200,false , false);
             flagB1.setImage(imageB1B1);
             flagB1.setFitHeight(50);
             flagB1.setFitWidth(50);
             
//             imageView.setFitHeight(100);
//             imageView.setFitWidth(100);
             
             
             
              File fileB2B2 = new File(group2.getTab().get(1).getFlag());
             Image imageB2B2 = new Image(fileB2B2.toURI().toString(),250,200,false , false );
             flagB2.setImage(imageB2B2);            
              flagB2.setFitHeight(50);
             flagB2.setFitWidth(50);

             
             
             File fileB3B3 = new File(group2.getTab().get(2).getFlag());
             Image imageB3B3 = new Image(fileB3B3.toURI().toString(),250,200,false , false);
             flagB3.setImage(imageB3B3);
              flagB3.setFitHeight(50);
             flagB3.setFitWidth(50);
             
             
             
              File fileB4B4 = new File(group2.getTab().get(3).getFlag());
             Image imageB4B4 = new Image(fileB4B4.toURI().toString(),250,200,false , false);
             flagB4.setImage(imageB4B4);
              flagB4.setFitHeight(50);
             flagB4.setFitWidth(50);
             
              //----------------------------------------------------groupe C-------------------------------------------
             
             //-----------------------------------------------------------------------------------------------------
             
               File fileC1C1 = new File(group3.getTab().get(0).getFlag());
             Image imageC1C1 = new Image(fileC1C1.toURI().toString(),250,200,false , false);
             flagC1.setImage(imageC1C1);
             flagC1.setFitHeight(50);
             flagC1.setFitWidth(50);
      
              File fileC2C2 = new File(group3.getTab().get(1).getFlag());
             Image imageC2C2 = new Image(fileC2C2.toURI().toString(),250,200,false , false );
             flagC2.setImage(imageC2C2);            
             flagC2.setFitHeight(50);
             flagC2.setFitWidth(50);

             
             
             File fileC3C3 = new File(group3.getTab().get(2).getFlag());
             Image imageC3C3 = new Image(fileC3C3.toURI().toString(),250,200,false , false);
             flagC3.setImage(imageC3C3);
             flagC3.setFitHeight(50);
             flagC3.setFitWidth(50);
             
             
             
              File fileC4C4 = new File(group3.getTab().get(3).getFlag());
             Image imageC4C4 = new Image(fileC4C4.toURI().toString(),250,200,false , false);
             flagC4.setImage(imageC4C4);
             flagC4.setFitHeight(50);
             flagC4.setFitWidth(50);
             
             
              //----------------------------------------------------groupe D-------------------------------------------
             
             //-----------------------------------------------------------------------------------------------------
             
               File fileD1D1 = new File(group4.getTab().get(0).getFlag());
             Image imageD1D1 = new Image(fileD1D1.toURI().toString(),250,200,false , false);
             flagD1.setImage(imageD1D1);
             flagD1.setFitHeight(50);
             flagD1.setFitWidth(50);
      
              File fileD2D2 = new File(group4.getTab().get(1).getFlag());
             Image imageD2D2 = new Image(fileD2D2.toURI().toString(),250,200,false , false );
             flagD2.setImage(imageD2D2);            
             flagD2.setFitHeight(50);
             flagD2.setFitWidth(50);

             
             
             File fileD3D3 = new File(group4.getTab().get(2).getFlag());
             Image imageD3D3 = new Image(fileD3D3.toURI().toString(),250,200,false , false);
             flagD3.setImage(imageD3D3);
             flagD3.setFitHeight(50);
             flagD3.setFitWidth(50);
             
             
             
              File fileD4D4 = new File(group4.getTab().get(3).getFlag());
             Image imageD4D4 = new Image(fileD4D4.toURI().toString(),250,200,false , false);
             flagD4.setImage(imageD4D4);
             flagD4.setFitHeight(50);
             flagD4.setFitWidth(50);
             
             
             
             
             
             
             
             
             
             
             
             
             
             

             
             
             
             
        




        equipe1.setText( "   "+ group1.getTab().get(0).getGroupStageScore());
        equipe2.setText( "   "+ group1.getTab().get(1).getGroupStageScore());
        equip3.setText( "   "+ group1.getTab().get(2).getGroupStageScore());
        equipe4.setText("   "+ group1.getTab().get(3).getGroupStageScore());
        
        //-----------------------------------------
        
        File file = new File(group1.getContentMatch().get(0).getTeamA().getFlag() );
        Image imageA11 = new Image(file.toURI().toString() ,150,100,false , false );
        imageA.setImage(imageA11);
        
        File file1 = new File(group1.getContentMatch().get(0).getTeamB().getFlag());
        Image imageA22 = new Image(file1.toURI().toString() ,150,100,false , false  );
        imageA2.setImage(imageA22);
        
        scoreA.setText(group1.getContentMatch().get(0).getScoreA()+" - "+group1.getContentMatch().get(0).getScoreB());
        
        
        //------------------------------------------
        
         //-----------------------------------------
        
        File fileB1 = new File(group1.getContentMatch().get(1).getTeamA().getFlag());
        Image imageB_1 = new Image(fileB1.toURI().toString()  ,150,100,false , false);
        imageB1.setImage(imageB_1);
        
        File fileB2 = new File(group1.getContentMatch().get(1).getTeamB().getFlag());
        Image imageB22 = new Image(fileB2.toURI().toString() ,150,100,false , false );
        imageB2.setImage(imageB22);
        
        scoreB.setText(group1.getContentMatch().get(1).getScoreA()+" - "+group1.getContentMatch().get(1).getScoreB());
        
        
        //------------------------------------------
           //-----------------------------------------
        
        File fileC1 = new File(group1.getContentMatch().get(2).getTeamA().getFlag());
        Image imageC_1 = new Image(fileC1.toURI().toString(),150,100,false , false);
        imageC1.setImage(imageC_1);
        
        File fileC2 = new File(group1.getContentMatch().get(2).getTeamB().getFlag());
        Image imageC22 = new Image(fileC2.toURI().toString(),150,100,false , false);
        imageC2.setImage(imageC22);
        
        scoreC.setText(group1.getContentMatch().get(2).getScoreA()+" - "+group1.getContentMatch().get(2).getScoreB());
        
        
        //------------------------------------------
        //-----------------------------------------
        
        File fileD1 = new File(group1.getContentMatch().get(3).getTeamA().getFlag());
        Image imageD_1 = new Image(fileD1.toURI().toString(),150,100,false , false);
        imageD1.setImage(imageD_1);
        
        File fileD2 = new File(group1.getContentMatch().get(3).getTeamB().getFlag());
        Image imageD22 = new Image(fileD2.toURI().toString(),150,100,false , false);
        imageD2.setImage(imageD22);
        
        scoreD.setText(group1.getContentMatch().get(3).getScoreA()+" - "+group1.getContentMatch().get(3).getScoreB());
        
        
        //------------------------------------------
        //-----------------------------------------
        
        File fileE1 = new File(group1.getContentMatch().get(4).getTeamA().getFlag());
        Image imageE_1 = new Image(fileE1.toURI().toString(),150,100,false , false);
        imageE1.setImage(imageE_1);
        
        File fileE2 = new File(group1.getContentMatch().get(4).getTeamB().getFlag());
        Image imageE22 = new Image(fileE2.toURI().toString(),150,100,false , false);
        imageE2.setImage(imageE22);
        
        scoreE.setText(group1.getContentMatch().get(4).getScoreA()+" - "+group1.getContentMatch().get(4).getScoreB());
        
        
        //------------------------------------------
         //-----------------------------------------
        
        File fileF1 = new File(group1.getContentMatch().get(5).getTeamA().getFlag());
        Image imageF_1 = new Image(fileF1.toURI().toString(),150,100,false , false);
        imageF1.setImage(imageF_1);
        
        File fileF2 = new File(group1.getContentMatch().get(5).getTeamB().getFlag());
        Image imageF22 = new Image(fileF2.toURI().toString(),150,100,false , false);
        imageF2.setImage(imageF22);
        
        scoreF.setText(group1.getContentMatch().get(5).getScoreA()+" - "+group1.getContentMatch().get(5).getScoreB());
        
        
        //------------------------------------------
        
      //---------------------------------------------- groupe 2 --------------------------------------------------------------  
        
             //-----------------------------------------
        
        File fileA2 = new File(group2.getContentMatch().get(0).getTeamA().getFlag());
        Image imageA112 = new Image(fileA2.toURI().toString(),150,100,false , false);
        imageG2A1.setImage(imageA112);
        
        File file1A2 = new File(group2.getContentMatch().get(0).getTeamB().getFlag());
        Image imageA22G2 = new Image(file1A2.toURI().toString(),150,100,false , false);
        imageG2A23.setImage(imageA22G2);
        
        scoreA3.setText(group2.getContentMatch().get(0).getScoreA()+" - "+group2.getContentMatch().get(0).getScoreB());
        
        
        //------------------------------------------
        
         //-----------------------------------------
        
        File fileB1G2 = new File(group2.getContentMatch().get(1).getTeamA().getFlag());
        Image imageB_1G2 = new Image(fileB1G2.toURI().toString(),150,100,false , false);
        imageG2B13.setImage(imageB_1G2);
        
        File fileB2G2 = new File(group2.getContentMatch().get(1).getTeamB().getFlag());
        Image imageB22G2 = new Image(fileB2G2.toURI().toString(),150,100,false , false);
        imageG2B23.setImage(imageB22G2);
        
        scoreB3.setText(group2.getContentMatch().get(1).getScoreA()+" - "+group2.getContentMatch().get(1).getScoreB());
        
        
        //------------------------------------------
           //-----------------------------------------
        
        File fileC1G2 = new File(group2.getContentMatch().get(2).getTeamA().getFlag());
        Image imageC_1G2 = new Image(fileC1G2.toURI().toString(),150,100,false , false);
        imageG2C13.setImage(imageC_1G2);
        
        File fileC2G2 = new File(group2.getContentMatch().get(2).getTeamB().getFlag());
        Image imageC22G2 = new Image(fileC2G2.toURI().toString(),150,100,false , false);
        imageG2C23.setImage(imageC22G2);
        
        scoreC3.setText(group2.getContentMatch().get(2).getScoreA()+" - "+group2.getContentMatch().get(2).getScoreB());
        
        
        //------------------------------------------
        //-----------------------------------------
        
        File fileD1G2 = new File(group2.getContentMatch().get(3).getTeamA().getFlag());
        Image imageD_1G2 = new Image(fileD1G2.toURI().toString(),150,100,false , false);
        imageG2D13.setImage(imageD_1G2);
        
        File fileD2G2 = new File(group2.getContentMatch().get(3).getTeamB().getFlag());
        Image imageD22G2 = new Image(fileD2G2.toURI().toString(),150,100,false , false);
        imageG2D23.setImage(imageD22G2);
        
        scoreD3.setText(group2.getContentMatch().get(3).getScoreA()+" - "+group2.getContentMatch().get(3).getScoreB());
        
        
        //------------------------------------------
        //-----------------------------------------
        
        File fileE1G2 = new File(group2.getContentMatch().get(4).getTeamA().getFlag());
        Image imageE_1G2 = new Image(fileE1G2.toURI().toString(),150,100,false , false);
        imageG2E13.setImage(imageE_1G2);
        
        File fileE2G2 = new File(group2.getContentMatch().get(4).getTeamB().getFlag());
        Image imageE22G2 = new Image(fileE2G2.toURI().toString(),150,100,false , false);
        imageG2E23.setImage(imageE22G2);
        
        scoreE3.setText(group2.getContentMatch().get(4).getScoreA()+" - "+group2.getContentMatch().get(4).getScoreB());
        
        
        //------------------------------------------
         //-----------------------------------------
        
        File fileF1G2 = new File(group2.getContentMatch().get(5).getTeamA().getFlag());
        Image imageF_1G2 = new Image(fileF1G2.toURI().toString(),150,100,false , false);
        imageG2F13.setImage(imageF_1G2);
        
        File fileF2G2 = new File(group2.getContentMatch().get(5).getTeamB().getFlag());
        Image imageF22G2 = new Image(fileF2G2.toURI().toString(),150,100,false , false);
        imageG2F23.setImage(imageF22G2);
        
        scoreF3.setText(group2.getContentMatch().get(5).getScoreA()+" - "+group2.getContentMatch().get(5).getScoreB());
        
        
        //------------------------------------------
        //--------------------------------------------- group 3 -------------------------------------------------------
        
        
              //-----------------------------------------
        
        File fileA3 = new File(group3.getContentMatch().get(0).getTeamA().getFlag());
        Image imageA113 = new Image(fileA3.toURI().toString(),150,100,false , false);
        imageG3A1.setImage(imageA113);
        
        File file1A3 = new File(group3.getContentMatch().get(0).getTeamB().getFlag());
        Image imageA22G3 = new Image(file1A3.toURI().toString(),150,100,false , false);
        imageG3A21.setImage(imageA22G3);
        
        scoreA1.setText(group3.getContentMatch().get(0).getScoreA()+" - "+group3.getContentMatch().get(0).getScoreB());
        
        
        //------------------------------------------
        
         //-----------------------------------------
        
        File fileB1G3 = new File(group3.getContentMatch().get(1).getTeamA().getFlag());
        Image imageB_1G3 = new Image(fileB1G3.toURI().toString(),150,100,false , false);
        imageG3B11.setImage(imageB_1G3);
        
        File fileB2G3 = new File(group3.getContentMatch().get(1).getTeamB().getFlag());
        Image imageB22G3 = new Image(fileB2G3.toURI().toString(),150,100,false , false);
        imageG3B21.setImage(imageB22G3);
        
        scoreB1.setText(group3.getContentMatch().get(1).getScoreA()+" - "+group3.getContentMatch().get(1).getScoreB());
        
        
        //------------------------------------------
           //-----------------------------------------
        
        File fileC1G3 = new File(group3.getContentMatch().get(2).getTeamA().getFlag());
        Image imageC_1G3 = new Image(fileC1G3.toURI().toString(),150,100,false , false);
        imageG3C11.setImage(imageC_1G3);
        
        File fileC2G3 = new File(group3.getContentMatch().get(2).getTeamB().getFlag());
        Image imageC22G3 = new Image(fileC2G3.toURI().toString(),150,100,false , false);
        imageG3C21.setImage(imageC22G3);
        
        scoreC1.setText(group3.getContentMatch().get(2).getScoreA()+" - "+group3.getContentMatch().get(2).getScoreB());
        
        
        //------------------------------------------
        //-----------------------------------------
        
        File fileD1G3 = new File(group3.getContentMatch().get(3).getTeamA().getFlag());
        Image imageD_1G3 = new Image(fileD1G3.toURI().toString(),150,100,false , false);
        imageG3D11.setImage(imageD_1G3);
        
        File fileD2G3 = new File(group3.getContentMatch().get(3).getTeamB().getFlag());
        Image imageD22G3 = new Image(fileD2G3.toURI().toString(),150,100,false , false);
        imageG3D21.setImage(imageD22G3);
        
        scoreD1.setText(group3.getContentMatch().get(3).getScoreA()+" - "+group3.getContentMatch().get(3).getScoreB());
        
        
        //------------------------------------------
        //-----------------------------------------
        
        File fileE1G3 = new File(group3.getContentMatch().get(4).getTeamA().getFlag());
        Image imageE_1G3 = new Image(fileE1G3.toURI().toString(),150,100,false , false);
        imageG3E11.setImage(imageE_1G3);
        
        File fileE2G3 = new File(group3.getContentMatch().get(4).getTeamB().getFlag());
        Image imageE22G3 = new Image(fileE2G3.toURI().toString(),150,100,false , false);
        imageG3E21.setImage(imageE22G3);
        
        scoreE1.setText(group3.getContentMatch().get(4).getScoreA()+" - "+group3.getContentMatch().get(4).getScoreB());
        
        
        //------------------------------------------
         //-----------------------------------------
        
        File fileF1G3 = new File(group3.getContentMatch().get(5).getTeamA().getFlag());
        Image imageF_1G3 = new Image(fileF1G3.toURI().toString(),150,100,false , false);
        imageG3F11.setImage(imageF_1G3);
        
        File fileF2G3 = new File(group3.getContentMatch().get(5).getTeamB().getFlag());
        Image imageF22G3 = new Image(fileF2G3.toURI().toString(),150,100,false , false);
        imageG3F21.setImage(imageF22G3);
        
        scoreF1.setText(group3.getContentMatch().get(5).getScoreA()+" - "+group3.getContentMatch().get(5).getScoreB());
        
        
        //------------------------------------------
        //--------------------------------------------- group 4 -------------------------------------------------------
        
        
              //-----------------------------------------
        
        File fileA4 = new File(group4.getContentMatch().get(0).getTeamA().getFlag());
        Image imageA114 = new Image(fileA4.toURI().toString(),150,100,false , false);
        imageG4AA4.setImage(imageA114);
        
        File file1A4 = new File(group4.getContentMatch().get(0).getTeamB().getFlag());
        Image imageA22G4 = new Image(file1A4.toURI().toString(),150,100,false , false);
        imageG4A22.setImage(imageA22G4);
        
        scoreA2.setText(group4.getContentMatch().get(0).getScoreA()+" - "+group4.getContentMatch().get(0).getScoreB());
        
        
        //------------------------------------------
        
         //-----------------------------------------
        
        File fileB1G4 = new File(group4.getContentMatch().get(1).getTeamA().getFlag());
        Image imageB_1G4 = new Image(fileB1G4.toURI().toString(),150,100,false , false);
        imageG4B12.setImage(imageB_1G4);
        
        File fileB2G4 = new File(group4.getContentMatch().get(1).getTeamB().getFlag());
        Image imageB22G4 = new Image(fileB2G4.toURI().toString(),150,100,false , false);
        imageG4B22.setImage(imageB22G4);
        
        scoreB2.setText(group4.getContentMatch().get(1).getScoreA()+" - "+group4.getContentMatch().get(1).getScoreB());
        
        
        //------------------------------------------
           //-----------------------------------------
        
        File fileC1G4 = new File(group4.getContentMatch().get(2).getTeamA().getFlag());
        Image imageC_1G4 = new Image(fileC1G4.toURI().toString(),150,100,false , false);
        imageG4C12.setImage(imageC_1G4);
        
        File fileC2G4 = new File(group4.getContentMatch().get(2).getTeamB().getFlag());
        Image imageC22G4 = new Image(fileC2G4.toURI().toString(),150,100,false , false);
        imageG4C22.setImage(imageC22G4);
        
        scoreC2.setText(group4.getContentMatch().get(2).getScoreA()+" - "+group4.getContentMatch().get(2).getScoreB());
        
        
        //------------------------------------------
        //-----------------------------------------
        
        File fileD1G4 = new File(group4.getContentMatch().get(3).getTeamA().getFlag());
        Image imageD_1G4 = new Image(fileD1G4.toURI().toString(),150,100,false , false);
        imageG4D12.setImage(imageD_1G4);
        
        File fileD2G4 = new File(group4.getContentMatch().get(3).getTeamB().getFlag());
        Image imageD22G4 = new Image(fileD2G4.toURI().toString(),150,100,false , false);
        imageG4D22.setImage(imageD22G4);
        
        scoreD2.setText(group4.getContentMatch().get(3).getScoreA()+" - "+group4.getContentMatch().get(3).getScoreB());
        
        
        //------------------------------------------
        //-----------------------------------------
        
        File fileE1G4 = new File(group4.getContentMatch().get(4).getTeamA().getFlag());
        Image imageE_1G4 = new Image(fileE1G4.toURI().toString(),150,100,false , false);
        imageG4E12.setImage(imageE_1G4);
        
        File fileE2G4 = new File(group4.getContentMatch().get(4).getTeamB().getFlag());
        Image imageE22G4 = new Image(fileE2G4.toURI().toString(),150,100,false , false);
        imageG4E22.setImage(imageE22G4);
        
        scoreE2.setText(group4.getContentMatch().get(4).getScoreA()+" - "+group4.getContentMatch().get(4).getScoreB());
        
        
        //------------------------------------------
         //-----------------------------------------
        
        File fileF1G4 = new File(group4.getContentMatch().get(5).getTeamA().getFlag());
        Image imageF_1G4 = new Image(fileF1G4.toURI().toString(),150,100,false , false);
        imageG4F12.setImage(imageF_1G4);
        
        File fileF2G4 = new File(group4.getContentMatch().get(5).getTeamB().getFlag());
        Image imageF22G4 = new Image(fileF2G4.toURI().toString(),150,100,false , false);
        imageG4F22.setImage(imageF22G4);
        
        scoreF2.setText(group4.getContentMatch().get(5).getScoreA()+" - "+group4.getContentMatch().get(5).getScoreB());
        
        
        
        
        
        
        
        
        
        
        //-------------------------------------------------------------------------------------------------------------
        
        
        
        
        
        
        
//        System.out.println("zaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
//        for (int i = 0; i < group1.getTab().size(); i++) {
//            System.out.println(group1.getTab().get(i).getCountry()+ "   "+ group1.getTab().get(i).getGroupStageScore());
//            
//        }
//                System.out.println("zaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
//
//       
//        equipe2_1.setText(group2.getTeam1().getCountry());
//        equipe2_2.setText(group2.getTeam2().getCountry());
//        equip2_3.setText(group2.getTeam3().getCountry());
//        equipe2_4.setText(group2.getTeam4().getCountry());

  
        equipe2_1.setText("   "+ group2.getTab().get(0).getGroupStageScore());
        equipe2_2.setText( "   "+ group2.getTab().get(1).getGroupStageScore());
        equip2_3.setText( "   "+ group2.getTab().get(2).getGroupStageScore());
        equipe2_4.setText("   "+ group2.getTab().get(3).getGroupStageScore());
        
        
        
//        equipe3_1.setText(group3.getTeam1().getCountry());
//        equipe3_2.setText(group3.getTeam2().getCountry());
//        equip3_3.setText(group3.getTeam3().getCountry());
//        equipe3_4.setText(group3.getTeam4().getCountry());


        equipe3_1.setText( "   "+ group3.getTab().get(0).getGroupStageScore());
        equipe3_2.setText( "   "+ group3.getTab().get(1).getGroupStageScore());
        equip3_3.setText( "   "+ group3.getTab().get(2).getGroupStageScore());
        equipe3_4.setText( "   "+ group3.getTab().get(3).getGroupStageScore());
        
        
        
//        equipe4_1.setText(group4.getTeam1().getCountry());
//        equipe4_2.setText(group4.getTeam2().getCountry());
//        equipe4_3.setText(group4.getTeam3().getCountry());
//        equipe4_4.setText(group4.getTeam4().getCountry());


        equipe4_1.setText( "   "+ group4.getTab().get(0).getGroupStageScore());
        equipe4_2.setText( "   "+ group4.getTab().get(1).getGroupStageScore());
        equipe4_3.setText( "   "+ group3.getTab().get(2).getGroupStageScore());
        equipe4_4.setText("   "+ group4.getTab().get(3).getGroupStageScore());
        
        


        
//        	
//		System.out.println("Poule A : " + group1.getTeam1().getCountry() + " - " +  group1.getTeam2().getCountry() + " - " +  group1.getTeam3().getCountry() + " - " +  group1.getTeam4().getCountry()  );
//		System.out.println("Poule B : " + group2.getTeam1().getCountry() + " - " +  group2.getTeam2().getCountry() + " - " +  group2.getTeam3().getCountry() + " - " +  group2.getTeam4().getCountry()  );
//		System.out.println("Poule C : " + group3.getTeam1().getCountry() + " - " +  group3.getTeam2().getCountry() + " - " +  group3.getTeam3().getCountry() + " - " +  group3.getTeam4().getCountry()  );
//		System.out.println("Poule D : " + group4.getTeam1().getCountry() + " - " +  group4.getTeam2().getCountry() + " - " +  group4.getTeam3().getCountry() + " - " +  group4.getTeam4().getCountry()  );
//		
//		
           File filea1 = new File(group1.getTab().get(0).getFlag());
             Image imagea1 = new Image(filea1.toURI().toString(),250,200,false , false);
             a1Flag.setImage(imagea1);
             a1Flag.setFitHeight(25);
             a1Flag.setFitWidth(25);
             
              FadeTransition fa1 = new FadeTransition(Duration.seconds(11), a1Flag);
            fa1.setFromValue(0);
            fa1.setToValue(1);
            fa1.play(); 
             
             
             
             
             
             
             
             
          
             
             File filea2 = new File(group1.getTab().get(1).getFlag());
             Image imagea2 = new Image(filea2.toURI().toString(),250,200,false , false);
             a1Flag1.setImage(imagea2);
             a1Flag1.setFitHeight(25);
             a1Flag1.setFitWidth(25);
             
             
             
              FadeTransition fa2 = new FadeTransition(Duration.seconds(11), a1Flag1);
            fa2.setFromValue(0);
            fa2.setToValue(1);
            fa2.play(); 
             
             
             
             //---------------------- groupe 3-----------------------------
             
             
             
             File filea3 = new File(group3.getTab().get(1).getFlag());
             Image imagea3 = new Image(filea3.toURI().toString(),250,200,false , false);
             a1Flag2.setImage(imagea3);
             a1Flag2.setFitHeight(25);
             a1Flag2.setFitWidth(25);
             
             
             
              FadeTransition fb1 = new FadeTransition(Duration.seconds(11), a1Flag2);
            fb1.setFromValue(0);
            fb1.setToValue(1);
            fb1.play(); 
             
             
             
             
             //a1Flag23
                     
                     
             File filea44 = new File(group3.getTab().get(0).getFlag());
             Image imagea4 = new Image(filea44.toURI().toString(),250,200,false , false);
             a1Flag23.setImage(imagea4);
             a1Flag23.setFitHeight(25);
             a1Flag23.setFitWidth(25);
             
             
             
            FadeTransition fb2 = new FadeTransition(Duration.seconds(11), a1Flag23);
            fb2.setFromValue(0);
            fb2.setToValue(1);
            fb2.play(); 
             
             
             
             //-------------------------------groupe 4 --------------------------
             
             
             
              File filea444 = new File(group4.getTab().get(0).getFlag());
             Image imagea44 = new Image(filea444.toURI().toString(),250,200,false , false);
             a1Flag22.setImage(imagea44);
             a1Flag22.setFitHeight(25);
             a1Flag22.setFitWidth(25);
             
              FadeTransition fc2 = new FadeTransition(Duration.seconds(11), a1Flag22);
            fc2.setFromValue(0);
            fc2.setToValue(1);
            fc2.play();
             
             
             File filea4444 = new File(group4.getTab().get(1).getFlag());
             Image imagea444 = new Image(filea4444.toURI().toString(),250,200,false , false);
             a1Flag21.setImage(imagea444);
             a1Flag21.setFitHeight(25);
             a1Flag21.setFitWidth(25);
             
              FadeTransition fc1 = new FadeTransition(Duration.seconds(11), a1Flag21);
            fc1.setFromValue(0);
            fc1.setToValue(1);
            fc1.play();
             
             
             
             //--------------------------- groupe 2 -------------------------
             
             
              
              File filea55 = new File(group2.getTab().get(0).getFlag());
             Image imagea55 = new Image(filea55.toURI().toString(),250,200,false , false);
             a1Flag231.setImage(imagea55);
             a1Flag231.setFitHeight(25);
             a1Flag231.setFitWidth(25);
             
             
              
            FadeTransition fd1 = new FadeTransition(Duration.seconds(11), a1Flag231);
            fd1.setFromValue(0);
            fd1.setToValue(1);
            fd1.play();
             
             
             
             
             
             
             File filea555 = new File(group2.getTab().get(1).getFlag());
             Image imagea555 = new Image(filea555.toURI().toString(),250,200,false , false);
             a1Flag2311.setImage(imagea555);
             a1Flag2311.setFitHeight(25);
             a1Flag2311.setFitWidth(25);
             
                
            FadeTransition fd2 = new FadeTransition(Duration.seconds(11), a1Flag2311);
            fd2.setFromValue(0);
            fd2.setToValue(1);
            fd2.play();
             
             
             
             
             
             
             
             
            
    
    
    }
        @FXML
    void goToQuarterFinal(ActionEvent event) throws IOException {
                
         FXMLLoader loader=new FXMLLoader(getClass().getResource("QuarterFinal.fxml"));
          Parent root = (Parent) loader.load();   
                                
           QuarterFinalController secController=loader.getController();            
                                secController.GoQuarterFianal(this.arry);                      

                               
        Scene scene = goQF.getScene();
        root.translateXProperty().set(scene.getWidth());

        StackPane parentContainer = (StackPane) goQF.getScene().getRoot();

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
                                FXMLLoader loader=new FXMLLoader(getClass().getResource("QuarterFinal.fxml"));
                                Parent root = (Parent) loader.load();

                                QuarterFinalController secController=loader.getController();            
                                secController.GoQuarterFianal(this.arry);
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
    
    /*
     @FXML
    void run(MouseEvent event) {
          TranslateTransition slide = new TranslateTransition ();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(pane1);
        slide.setToY(0);
        matchGroup1.setTranslateX(155);
        slide.play();
        slide.setOnFinished((ActionEvent e ) -> {
        menu.setVisible(true);
        matchGroup1.setVisible(true);

        });

    }
*/
  
    @FXML
    void run(MouseEvent event) {
         TranslateTransition slide = new TranslateTransition();
			slide.setDuration(Duration.seconds(0.4));
			slide.setNode(zabour);
			slide.setToX(0);
			slide.play();
			zabour.setTranslateX(155);
                         zabour.setVisible(true);
			slide.setOnFinished((ActionEvent e)->{
				key.setVisible(true);
			});   

    }
    
    @FXML
    void hideme(MouseEvent event) {
        
         TranslateTransition slide = new TranslateTransition ();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(zabour);
        slide.setToX(-92);
        slide.play();
        zabour.setTranslateX(0);

        slide.setOnFinished((ActionEvent e ) -> {
                zabour.setVisible(false);

            key.setVisible(true);
        
       // zabour.setVisible(true);

        });
        
        
    }
    
    @FXML
    void runC(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
			slide.setDuration(Duration.seconds(0.4));
			slide.setNode(zabour1);
			slide.setToX(0);
			slide.play();
			zabour1.setTranslateX(155);
                         zabour1.setVisible(true);
			slide.setOnFinished((ActionEvent e)->{
				key1.setVisible(true);
			});   
        
        
        

    }
    @FXML
    void hidemeC(MouseEvent event) {
        
              TranslateTransition slide = new TranslateTransition ();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(zabour1);
        slide.setToX(-92);
        slide.play();
        zabour1.setTranslateX(0);

        slide.setOnFinished((ActionEvent e ) -> {
                zabour1.setVisible(false);

            key1.setVisible(true);
        
       // zabour.setVisible(true);

        });

    }
    
    @FXML
    void runB(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
			slide.setDuration(Duration.seconds(0.4));
			slide.setNode(zabour3);
			slide.setToX(0);
			slide.play();
			zabour3.setTranslateX(-150);
                         zabour3.setVisible(true);
			slide.setOnFinished((ActionEvent e)->{
				key3.setVisible(true);
			});  

    }
    @FXML
    void hidemeB(MouseEvent event) {
         TranslateTransition slide = new TranslateTransition ();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(zabour3);
        slide.setToX(100);
        slide.play();
        zabour3.setTranslateX(0);

        slide.setOnFinished((ActionEvent e ) -> {
                zabour3.setVisible(false);

            key3.setVisible(true);
        
       // zabour.setVisible(true);
               });

    }
    
    @FXML
    void runD(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
			slide.setDuration(Duration.seconds(0.4));
			slide.setNode(zabour2);
			slide.setToX(0);
			slide.play();
			zabour2.setTranslateX(-150);
                         zabour2.setVisible(true);
			slide.setOnFinished((ActionEvent e)->{
				key2.setVisible(true);
			});  
        
        

    }
    
    @FXML
    void hidemeD(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition ();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(zabour2);
        slide.setToX(100);
        slide.play();
        zabour2.setTranslateX(0);

        slide.setOnFinished((ActionEvent e ) -> {
                zabour2.setVisible(false);

            key2.setVisible(true);
        
       // zabour.setVisible(true);
               });
        
        

    }
   
    

    
    
    }
//    @FXML
//    void run(MouseEvent event) {
//        TranslateTransition slide = new TranslateTransition ();
//        slide.setDuration(Duration.seconds(0.4));
//        slide.setNode(pane1);
//        slide.setToY(0);
//        pane1.setTranslateY(155);
//        slide.play();
//         equipe1.setText(this.group1.getTeam1().getCountry());
//        equipe2.setText(this.group1.getTeam2().getCountry());
//        equip3.setText(this.group1.getTeam3().getCountry());
//        equipe4.setText(this.group1.getTeam4().getCountry());
//
//        slide.setOnFinished((ActionEvent e ) -> {
//        ButtonOpen.setVisible(true);
//        pane1.setVisible(true);
//
//        });
//    }
//  
//  @FXML
//    public void ButtonHide(MouseEvent event) {
//        TranslateTransition slide = new TranslateTransition ();
//        slide.setDuration(Duration.seconds(0.4));
//        slide.setNode(pane1);
//        slide.setToY(-155);
//        slide.play();
//        pane1.setTranslateY(0);
//
//
//        slide.setOnFinished((ActionEvent e ) -> {
//        slide.setRate(slide.getRate() * 1);
//       // slide.play();        
//        ButtonOpen.setVisible(true);
//        pane1.setVisible(false);
//        
//
//        });
//
//    }
//    
//     @FXML
//    void runBouton2(ActionEvent event) {
//
//    }
    
    


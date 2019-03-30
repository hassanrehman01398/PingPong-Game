/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingponggame;

import java.io.File;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author hp
 */
public class Pingponggame extends Application {
     double radius=15;
     double x=70;
     double y=30;
     double dx=1;
     double dy=3;
     int a=0,b=0;
    // int n=20;
      Pane root = new Pane();
       TextField tf1=new TextField();
        TextField tf=new TextField();
     Circle c=new Circle(x, y, radius);
      Rectangle r=new Rectangle(170, 5, 150, 20);
      
        Rectangle r1=new Rectangle(170, 475, 150, 20);
      Timeline tm;
      
      
    
    @Override
    public void start(Stage primaryStage) {
        c.setFill(Color.RED);
         tm=new Timeline(new KeyFrame(Duration.millis(20), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
          
            moveball();
            }
        }));
        tm.setCycleCount(Timeline.INDEFINITE);
        tm.play();
       
        r.setFill(Color.DARKBLUE);
        r.setStroke(Color.DARKBLUE);
        r.setArcHeight(10);
        r.setArcWidth(10);
        r.setStrokeWidth(2);
        r1.setFill(Color.DARKKHAKI);
        r1.setFill(Color.DARKKHAKI);
        r1.setStroke(Color.DARKKHAKI);
        r1.setStrokeWidth(2);
         r1.setArcHeight(10);
        r1.setArcWidth(10); 
       
       
//        
        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
           if(event.getCode()==KeyCode.A&&r1.getX()>0)
           {
               r1.setX(r1.getX()-5);
            r1.requestFocus();
             
           }
            if(event.getCode()==KeyCode.D&&r1.getX()<350)//width-scenewidth
           {
               r1.setX(r1.getX()+5);
            r1.requestFocus();
            
            }
                if(event.getCode()==KeyCode.RIGHT&&r.getX()<350)
           {
               r.setX(r.getX()+5);
            r.requestFocus();
             
           }
           if(event.getCode()==KeyCode.LEFT&&r.getX()>0)
           {
               r.setX(r.getX()-5);
           
            r.requestFocus();
            }
              
         
            
           //r.requestFocus();
         
            
           
            }
        });
     
      
        

//             r1.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent event) {
//           if(event.getCode()==KeyCode.A&&r1.getX()>0)
//           {
//               r1.setX(r1.getX()-5);
//              }
//            if(event.getCode()==KeyCode.D&&r1.getX()<350)//width-scenewidth
//           {
//               r1.setX(r1.getX()+5);
//              }
//             r1.requestFocus();
//             
//                }
//        });                                                                                                                                                           //        r.translateXProperty().bind(root.translateXProperty());
//              r.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent event) {
//                if(event.getCode()==KeyCode.RIGHT&&r.getX()<350)
//           {
//               r.setX(r.getX()+5);
//              }
//           if(event.getCode()==KeyCode.LEFT&&r.getX()>0)
//           {
//               r.setX(r.getX()-5);
//              }
//             r.requestFocus();
//            
//            
//            }
//        });                                                                                                                                                          //        r.translateYProperty().bind(root.translateYProperty());
//                                                                                                                                                                        //r.scaleXProperty().bind(root.scaleXProperty());
                                                                                                                                                                        //r.scaleYProperty().bind(root.scaleYProperty());


                                                                                                                                                                        //        r.layoutXProperty().bind(root.layoutXProperty());
                                                                                                                                                                        //    
                                                                                                                                                                        //        r.layoutYProperty().bind(root.layoutYProperty());
                                                                                                                                                                        //         r1.layoutXProperty().bind(root.layoutXProperty());
                                                                                                                                                                        //        r1.layoutYProperty().bind(root.layoutYProperty());

                                                                                                                                                                c.setFill(Color.RED);
        
           
        root.setStyle("-fx-background-color: BLACK");
        root.getChildren().addAll(r,r1,c);
        
        Scene scene = new Scene(root, 500, 500);
                                                                                                                                                            //        r.widthProperty().bind(root.widthProperty().divide(3));
                                                                                                                                                            //        r.heightProperty().bind(root.heightProperty().divide(6));
                                                                                                                                                            //        
                                                                                                                                                            //       r1.widthProperty().bind(root.widthProperty().divide(3));
                                                                                                                                                            //        r1.heightProperty().bind(root.heightProperty().divide(6));
 
 
        VBox h=new VBox();
        h.setSpacing(5);
        h.setStyle("-fx-background-color: YELLOW");
        Label l=new Label("Player 1");
        l.setFont(Font.font(15));
        l.setStyle("-fx-border-color: DARKBLUE");
        l.setStyle("-text-color: WHITE");
        
       // TextField tf=new TextField();
        tf.setAlignment(Pos.CENTER);
        tf.setEditable(false);
        tf.setMinSize(70, 20);
        tf.setMaxSize(70, 20);
        tf.setFont(Font.font(10));
        tf.setStyle("-fx-background-color: DARKKHAKI");
        tf.setStyle("-fx-border-color: RED ");
        Label l1=new Label("Player 2");
        l1.setFont(Font.font(15));
        l.setStyle("-text-color: WHITE");
        
        l1.setStyle("-fx-border-color: DARKKHAKI");
       
        tf1.setAlignment(Pos.CENTER);
        tf1.setMinSize(70, 20);
        tf1.setMaxSize(70, 20);
        tf1.setEditable(false);
        tf1.setFont(Font.font(10));
        tf1.setStyle("-fx-background-color: DARK");
        tf1.setStyle("-fx-border-color: RED ");
        h.getChildren().addAll(l,tf,l1,tf1);
        
        Scene s=new Scene(h, 200, 100);
       
        primaryStage.setScene(s);
        primaryStage.show();
         Stage e=new Stage();
         Image i1=new Image("images/score.jpg");
         e.getIcons().add(i1);
         e.setX(0);
         e.setY(0);
      // e.setAlwaysOnTop(true);
        e.setResizable(false);
        e.setTitle("Score");
              e.setScene(s);
       e.show();
        primaryStage.setResizable(false);
        primaryStage.setTitle("Ping Pong Game");
        Image i=new Image("images/game.png");
        //ImageView im=new ImageView(i);
        primaryStage.getIcons().add(i);
        primaryStage.setScene(scene);
        root.requestFocus();

//r1.requestFocus();
//r.requestFocus();
        primaryStage.show();
    }
     public void moveball()
    {
     
        if (x<radius||x>root.getWidth()-radius) {
            dx=dx*-1;
        }
          if (y<radius||y>root.getHeight()-radius) {
           // dy=dy*-1;
           tm.pause();
             String uri=new File("4.wav").toURI().toString();
                  new MediaPlayer(new Media(uri)).play();
            
              c.setFill(Color.BLACK);
              //Alert al=new Alert(Alert.AlertType.INFORMATION,"Game End",ButtonType.FINISH);
              //al.getGraphic();
              //al.show();
              Pane m=new Pane();
              m.setStyle("-fx-background-color: WHITE");
              Image o=new Image("images/gameover.png");
              ImageView om=new ImageView(o);
              om.setX(150);
              om.setY(0);
              Label win=new Label("Winner :");
              Label win1=new Label();
                            win1.setLayoutX(140);
              win1.setLayoutY(270);
              win1.setFont(Font.font(20));
              win1.setAlignment(Pos.CENTER);
              //win1.setStyle("-fx-border-color: BLUE");
              win1.setStyle("-fx-text-fill:BLUE");
              win1.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
         
              win.setLayoutX(150);
              win.setLayoutY(220);
              //win.setFont(Font.font(20));
              win.setAlignment(Pos.CENTER);
              win.setStyle("-fx-font-weight: BOLD");
              win.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
              win.setStyle("-fx-text-fill: RED");
              win.setStyle("-fx-border-color: RED");
              if(a>b)
              {
                win1.setText("Congrats Player 1 Wins\n Score = "+tf.getText());
                }
              else if(b>a)
              {
                win1.setText("Congrats Player 2 Wins\n Score = "+tf1.getText());
                }
              else if(a==b)
              {
                  
                win1.setText("Draws");
                }
              m.getChildren().addAll(om,win,win1);
        Scene p=new Scene(m, 500, 350);
        Stage k=new Stage();
        k.setScene(p);
        k.show();
          
          }
          
          if(c.intersects(r.getX(),r.getY(), r.getWidth(),r.getHeight())){
          //tm.pause();
          //dx=dx*-1;
          dy=dy*-1;
          a=a+10;
          tf.setText(a+"");
          
          
          
          }
          if(c.intersects(r1.getX(),r1.getY(), r1.getWidth(),r1.getHeight())){
          //tm.pause();
          dy=dy*-1;
           b=b+10;
          tf1.setText(b+"");
          //dx=dx*-1;
          
          
          }
          
//         
          
//          if(c.intersects(localBounds))
//          {
//             
//              dy=dy*-1;
//          
//          }
////           if (x<radius|| ){
//            dx=dx*-1;
//            dy=dy*-1;
//           }
//        
//        if(x<radius||(r.getLayoutX()==c.getLayoutX()&&r.getLayoutY()==c.getLayoutY()))
//        {dx=dx*-1;}
         
          if((tf.getText().equals("50")&&tf1.getText().equals("50"))||(tf.getText().equals("100")&&tf1.getText().equals("100")))
          {
              double z=r.getWidth();
          r.setWidth(z-0.1);
          r1.setWidth(z-0.1);
          //r1.setWidth(r1.getWidth()-5);
          
          dx=dx*1.004;
          dy=dy*1.004;
          
           }
//          if(h==500||e==500)
//          {
//          
//          dx=dx*4;
//          dy=dy*4;
//          
//           }
x=x+dx;
     
     y= y+dy;
     c.setCenterX(x);
     c.setCenterY(y);
     //r.requestFocus();
     root.requestFocus();
     
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

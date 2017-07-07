
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author super
 */
public class MyJavaFxDemo extends Application {
    Stage window;
    Button button;
    
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("the new boston");
        
        Personne bucky=new Personne();
        bucky.firstNameProperty().addListener((v,oldValue,newValue)->{
            System.out.println("Name changed from "+ oldValue);
            System.out.println("Name changed to "+ newValue);
            System.out.println("FirstNameProperty():"+ bucky.firstNameProperty());
            System.out.println("getFirstName():"+ bucky.getFirstName());
        });
        
        button=new Button("Submit");
        button.setOnAction(e->bucky.setFirstName("Porky"));
        
       Button button1=new Button("other");
        button1.setOnAction(e->bucky.setFirstName("Noly"));
        
        HBox layout=new HBox();
        layout.getChildren().addAll(button,button1);
        Scene scene = new Scene(layout,300,200);        
        window.setScene(scene);      
        window.show();
        
        
    }

   
}

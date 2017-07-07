
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
        //Input and labels
        TextField userInput=new TextField();
        userInput.setMaxWidth(200);
        Label firstLabel= new Label("Welcom to the site ");
        Label secondLabel=new Label();
        
        HBox bottomText=new HBox(firstLabel,secondLabel);
        bottomText.setAlignment(Pos.CENTER);
      
        VBox vbox=new VBox();
        vbox.setAlignment(Pos.CENTER);
        
        secondLabel.textProperty().bind(userInput.textProperty());
        vbox.getChildren().addAll(userInput,bottomText);
        Scene scene = new Scene(vbox,300,200);        
        window.setScene(scene);      
        window.show();
        
        
    }

   
}

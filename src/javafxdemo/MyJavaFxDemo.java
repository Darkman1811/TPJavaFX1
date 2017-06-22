
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;
import javafx.application.Application;
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
    Scene scene;
    Button button;
    
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("Form Data");
        
        //frm
        TextField nameImput= new TextField();
        button=new Button("Click Me");
        button.setOnAction(e->isInt(nameImput));
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameImput,button);
        
        scene = new Scene(layout,300,200);
        window.setScene(scene);      
        window.show();        
        
    }

    private boolean isInt(TextField input) {
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("User is:"+age);
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Error: "+input.getText()+" is not a number");            
             return false;
        }
       
    }

   
}

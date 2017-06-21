/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author super
 */
public class MyJavaFxDemo extends Application {
    Button button;
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the window");
        button=new Button();
        button.setText("Click Me");
        button.setOnAction(e->System.out.println("Using lambda Expression"));
         
        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        
        Scene scene= new Scene(layout,300,250);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

   
}

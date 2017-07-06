
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
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
    ListView<String> listView;
    
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("Checkbox example");
        
        listView= new ListView<>();
        //getItmes returns the observablelist object whick you can add items to
        listView.getItems().add("Apples");
        listView.getItems().add("Banana");
        listView.getItems().addAll("Bacon","Ham","MeatBalls");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        button=new Button("Order now");
        button.setOnAction(e->buttonClicked());
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView,button);
        
        scene = new Scene(layout,300,200);
        window.setScene(scene);      
        window.show();        
        
    }

   

    private void buttonClicked() {
     String message = "";
        ObservableList<String> movies=listView.getSelectionModel().getSelectedItems();
        for(String m: movies){
            message+=m + "\n";
        }
        
        System.out.println(message);
        
    }

  

  

    

   
}

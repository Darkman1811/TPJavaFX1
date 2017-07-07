
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
    
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("Connection");
        GridPane grid= new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);
        
        //Name label
        Label nameLabel = new Label("Username:");
        //nameLabel.setStyle("-fx-text-fill: #e8e8e8");
        nameLabel.setId("bold-label");
        GridPane.setConstraints(nameLabel, 0, 0);
       
        
        //Name input
        TextField nameInput= new TextField("Abdoulaye");
        GridPane.setConstraints(nameInput, 1, 0);
        
          //Pass label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);
        
        //Pass input
        TextField passInput= new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);
        
        //Login
        Button loginButton=new Button("Log in");
        GridPane.setConstraints(loginButton, 1, 2);
        
       /* loginButton.setOnAction(e->{
            setUserAgentStylesheet(STYLESHEET_CASPIAN);
        });*/
        
        //Signup 
         Button signupButton=new Button("Sign Up");
        GridPane.setConstraints(signupButton, 1, 3);
        signupButton.getStyleClass().add("button-blue");
        grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton,signupButton);
        
        Scene scene = new Scene(grid,300,200);
        scene.getStylesheets().add("javafxdemo/Viper.css");
        
        window.setScene(scene);
      
        window.show();
        
        
    }

   
}

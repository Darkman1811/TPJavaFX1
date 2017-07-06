
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    BorderPane layout;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Checkbox example");
        button= new Button("Click Me");
       
        //File menu
        Menu fileMenu=new Menu("_File");
        
        //Menu Items
        MenuItem newFile=new MenuItem("New...");
        newFile.setOnAction(e->System.out.println("Create a new File"));
        fileMenu.getItems().add(newFile);
        
        
        fileMenu.getItems().add(new MenuItem("Open..."));        
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));        
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit..."));
        
        //Edit Menu
        Menu editMenu=new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("Cut"));   
        editMenu.getItems().add(new MenuItem("Copy"));
        
        MenuItem paste=new MenuItem("Paste");
        paste.setOnAction(e->System.out.println("Paste some crap"));
        paste.setDisable(true);
        editMenu.getItems().add(paste);  
        
           //Edit Menu
        Menu helpMenu=new Menu("_help");
        CheckMenuItem showLines= new CheckMenuItem("Show Lines Numbers");
        showLines.setOnAction(e->{
            if(showLines.isSelected()){
                System.out.println("Program will now display line numbers");
            }
            else{
                System.out.println("Hidding the line numbers");
            }
        });
        helpMenu.getItems().addAll(showLines);
        
        CheckMenuItem autoSave=new CheckMenuItem("Enable Autosave");
        autoSave.setSelected(true);
        helpMenu.getItems().add(autoSave);
        
        
        //Main menu bar
        MenuBar menuBar= new MenuBar();
        menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu);
        
        layout = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout,600,300);
        window.setScene(scene);
        window.show();

    }



  
  

}

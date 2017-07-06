
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
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
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
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Checkbox example");

        TreeItem<String> root, bucky, megan;

        root = new TreeItem<>();
        root.setExpanded(true);

      /*  bucky = new TreeItem<>("bucky");
        TreeItem dodo = new TreeItem<>("dodo");
        TreeItem dada = new TreeItem<>("dada");
        TreeItem didi = new TreeItem<>("didi");

        bucky.getChildren().addAll(dodo, dada, didi);

        megan = new TreeItem<>("megan");
        TreeItem mago = new TreeItem<>("mago");
        TreeItem bagass = new TreeItem<>("bagass");
        megan.getChildren().addAll(mago, bagass);

        root.getChildren().add(bucky);

        bucky.getChildren().add(megan);
              */
        bucky=makeBranch("Bucky", root);
        makeBranch("dodo", bucky);
        makeBranch("dada", bucky);
        makeBranch("didi", bucky);
        
        megan=makeBranch("megan", root);
        makeBranch("mago", megan);
        makeBranch("bagass", megan);
        
        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        
        tree.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue)->{
            if(newValue!=null){
                System.out.println(newValue.getValue());
            }
        });

        button = new Button("Order now");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(tree, button);

        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();

    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }

}

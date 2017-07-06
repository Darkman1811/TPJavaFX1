
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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
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
    Scene scene;
    TableView<Product> table;
    TextField nameInput,priceInput,quantityInput;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Checkbox example");

        //Name Column
        TableColumn<Product,String> nameColumn=new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        //Price Column
        TableColumn<Product,Double> priceColumn=new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));       
        
          //Quantity Column
        TableColumn<Product,Integer> quantityColumn=new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity")); 

        table=new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);
        
        //Name Input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(200);
        
        //Prince Input
        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.setMinWidth(100);
        
        //Quantity Input
        quantityInput = new TextField();
        quantityInput.setPromptText("Quatity");
        quantityInput.setMinWidth(100);
        
        Button addButton = new Button("Add");
        addButton.setOnAction(e->addButtonClicked());
        
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e->deleteButtonClicked());
        
        HBox hBox=new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput,priceInput,quantityInput,addButton,deleteButton);

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(table,hBox );

        scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }

    //Get all of the product
  public ObservableList<Product> getProduct(){
      ObservableList<Product> products=FXCollections.observableArrayList();
      products.add(new Product("Laptop",859,20));
      products.add(new Product("Bouncy Ball",2.49,198));
      products.add(new Product("Toilet",99,74));
      products.add(new Product("The NoteBook DVD",19.99,12));
      products.add(new Product("Corn",1.49,856));
      return products;
  }

    private void addButtonClicked() {
    //Product product=new Product(nameInput.getText(),Double.parseDouble(priceInput.getText()),Integer.parseInt(quantityInput.getText()));
    Product product=new Product();
    product.setName(nameInput.getText());
    product.setPrice(Double.parseDouble(priceInput.getText()));
    product.setQuantity(Integer.parseInt(quantityInput.getText()));
    table.getItems().add(product);
    nameInput.clear();
    priceInput.clear();
    quantityInput.clear();
    }

    private void deleteButtonClicked() {
       ObservableList<Product> productSelected, allProducts;
       allProducts=table.getItems();
       productSelected=table.getSelectionModel().getSelectedItems();
       productSelected.forEach(allProducts::remove);
    }

}

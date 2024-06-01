/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group2.javafxdemofilechooser;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Luu Bao
 */
public class SampleController {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ImageView ImageView;
    
    @FXML
    private AnchorPane AP;
   
    
    public void ChooseImage(ActionEvent e) throws IOException{
        Stage stage = (Stage) AP.getScene().getWindow();
        FileChooser fc = new FileChooser();
        fc.setTitle("Choose a image");
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png");
        fc.getExtensionFilters().add(imageFilter);
        File  file = fc.showOpenDialog(stage);
        if(file != null){
           
            Image image = new Image(file.toURI().toString(), 200, 150, false, true);
            ImageView.setImage(image);
        }
    }
}

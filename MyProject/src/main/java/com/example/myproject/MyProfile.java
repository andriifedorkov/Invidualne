package com.example.myproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;

public class MyProfile implements Initializable {


    @FXML
    private Button createbtn;

    @FXML
    private Button frbtn;

    @FXML
    private Button mpmusicbtn;

    @FXML
    private ImageView imgView;

    @FXML
    private AnchorPane scenePane;



    @FXML
    void crpBtn(ActionEvent event) {
        FileChooser crpBtn = new FileChooser();
        crpBtn.setTitle("Get image");
        Stage stage = (Stage) scenePane.getScene().getWindow();
        crpBtn.getExtensionFilters().add(new FileChooser.ExtensionFilter("image","*.png"));
        File file = crpBtn.showOpenDialog(stage);

        if(file != null){
            URI uri = file.toURI();
            Image image = new Image(uri.toString());

            imgView.setImage(image);
        }

    }

    @FXML
    void friendsBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("friends.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);
        stage.setTitle("MySite");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(frbtn.getScene().getWindow());
        stage.show();

    }

    @FXML
    void mpmBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("music.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);
        stage.setTitle("MySite");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(mpmusicbtn.getScene().getWindow());
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

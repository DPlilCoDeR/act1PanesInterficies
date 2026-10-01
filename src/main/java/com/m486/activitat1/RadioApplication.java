package com.m486.activitat1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class RadioApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Borderpane
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15,15,15,15));

        HBox top = new HBox(20);
        Label title = new Label("Radio Application");
        TextField textField = new TextField();
        HBox.setHgrow(textField, Priority.ALWAYS);
        top.getChildren().addAll(title,textField);


        //VBox
        VBox left = new VBox(5);
        left.setSpacing(20);
        Button btn = new Button("Inici");
        btn.setMaxWidth(Double.MAX_VALUE);
        Button btn2 = new Button("Cerca/Explorar");
        btn2.setMaxWidth(Double.MAX_VALUE);
        Button btn3 = new Button("Favorits");
        btn3.setMaxWidth(Double.MAX_VALUE);
        left.getChildren().addAll(btn,btn2,btn3);

        //GridPane
        GridPane center = new GridPane();
        center.setPadding(new Insets(20));
        center.setHgap(10);
        center.setVgap(10);
        center.setAlignment(Pos.CENTER);

        Label titol = new Label("Titol Podcast:");
        center.add(titol,0,0);

        Label autor = new Label("Autor:");
        center.add(autor,0,1);

        Label durada = new Label("durada:");
        center.add(durada,0,2);

        Button reproduir = new Button("Reproduir ▶️");
        reproduir.setStyle(
                "-fx-background-color: #009a2f;" +
                        "-fx-border-width: 10px;" +
                        "-fx-background-radius: 2px;"+
                        "-fx-padding: 10px 20px;"+
                        "-fx-text-fill: white;"
        );
        center.add(reproduir,0,3);


        root.setTop(top);
        root.setLeft(left);
        root.setCenter(center);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Podcast Espantoso");
        stage.setScene(scene);
        stage.show();
    }
}

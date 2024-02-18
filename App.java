package com.imagegridpanel;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Image Grid Pane");

        // Create a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        // Load images using getResource() with relative paths
        Image image1 = new Image(getClass().getResource("/flag1.gif").toExternalForm());
        Image image2 = new Image(getClass().getResource("/flag2.gif").toExternalForm());
        Image image3 = new Image(getClass().getResource("/flag6.gif").toExternalForm());
        Image image4 = new Image(getClass().getResource("/flag7.gif").toExternalForm());

        // Check for null images
        if (image1 != null && image2 != null && image3 != null && image4 != null) {
            // Create ImageViews for each image
            ImageView imageView1 = new ImageView(image1);
            ImageView imageView2 = new ImageView(image2);
            ImageView imageView3 = new ImageView(image3);
            ImageView imageView4 = new ImageView(image4);

            // Add ImageViews to the GridPane
            gridPane.add(imageView1, 0, 0);
            gridPane.add(imageView2, 1, 0);
            gridPane.add(imageView3, 0, 1);
            gridPane.add(imageView4, 1, 1);

            // Create a scene and set it in the stage
            Scene scene = new Scene(gridPane, 400, 300);
            primaryStage.setScene(scene);

            // Show the stage
            primaryStage.show();
        } else {
            System.out.println("One or more images failed to load.");
        }
    }
}


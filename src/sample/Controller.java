package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    int num1, num2, num3;
    String q1 = "", q2 = "", q3 = "";



    @FXML
    public GridPane gridPane;

    @FXML
    TextField textField;
    @FXML
    TextField textField1;
    @FXML
    TextField textField2;
    @FXML
    Button qButton;
    @FXML
    ImageView imageId;
    @FXML
    Button resetButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Image img = new Image(getClass().getResourceAsStream("images/318201.jpg"));
        imageId.setImage(img);
    }


    public void generateEntered(MouseEvent mouseEvent) {

        qButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Mouse is pressed");

                num1 = 1 + (int) (Math.random() * 48);
                q1 = String.valueOf(num1);
                textField.setText(q1);

                num2 = 1 + (int) (Math.random() * 48);
                q2 = String.valueOf(num2);
                textField1.setText(q2);

                num3 = 1 + (int) (Math.random() * 48);
                q3 = String.valueOf(num3);
                textField2.setText(q3);


            }
        });


    }

    public void takeAction(MouseEvent mouseEvent) {
        qButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                textField.setText(q1 = "");
                textField1.setText(q2 = "");
                textField2.setText(q3 = "");

            }
        });


    }


    public void showImage(MouseEvent mouseEvent) {

        imageId.setImage(new Image("318201.jpg"));
    }
   




    public void resetB(MouseEvent mouseEvent) {
        resetButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Reset button pressed");
                
                textField.setText("");
                textField1.setText("");
                textField2.setText("");
                
            }
        });
    }

}

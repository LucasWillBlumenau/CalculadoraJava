package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Calculadora;

import java.io.IOException;



public class telaBhaskaraController {
    @FXML private TextField tfCalculos;
    @FXML private Button buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, 
    buttonSix, buttonSeven, buttonEight, buttonNine, buttonPoint, buttonMinus;
    private double valueOfA, valueOfB, valueOfC, getValueController='a';
    private Stage stage;

    public void setNumero(ActionEvent e){
        String number = tfCalculos.getText();
        if(e.getSource() == buttonZero) { tfCalculos.setText(number + "0"); }
        else if(e.getSource() == buttonOne) { tfCalculos.setText(number + "1"); }
        else if(e.getSource() == buttonTwo) { tfCalculos.setText(number + "2"); }
        else if(e.getSource() == buttonThree) { tfCalculos.setText(number + "3"); }
        else if(e.getSource() == buttonFour) { tfCalculos.setText(number + "4"); }
        else if(e.getSource() == buttonFive) { tfCalculos.setText(number + "5"); }
        else if(e.getSource() == buttonSix) { tfCalculos.setText(number + "6"); }
        else if(e.getSource() == buttonSeven) { tfCalculos.setText(number + "7"); }
        else if(e.getSource() == buttonEight) { tfCalculos.setText(number + "8"); }
        else if(e.getSource() == buttonNine) { tfCalculos.setText(number + "9"); }
        else if(e.getSource() == buttonMinus) { tfCalculos.setText(number + "-"); }
        else if(e.getSource() == buttonPoint) { tfCalculos.setText(number + "."); }
    }
    
    public void nextValue(ActionEvent e) {
        if (getValueController == 'a') {
            String value = tfCalculos.getText().replace("a=", "");
            valueOfA = Double.parseDouble(value);
            tfCalculos.setText("b=");
            getValueController = 'b';
        }else if(getValueController == 'b'){
            String value = tfCalculos.getText().replace("b=", "");
            valueOfB = Double.parseDouble(value);
            tfCalculos.setText("c=");
            getValueController = 'c';
        }else if(getValueController == 'c'){
            String value = tfCalculos.getText().replace("c=", "");
            valueOfC = Double.parseDouble(value);
            tfCalculos.setText(Calculadora.calculaBhaskara(valueOfA, valueOfB, valueOfC));
        }
        else{
            getValueController = 'a';
            tfCalculos.setText("a=");
        }
    }

    public void switchBasic(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/TelaCalculadora.fxml"));
        Parent root = fxmlLoader.load();
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/view/styles.css").toExternalForm());
        stage.setResizable(false);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
    }

}

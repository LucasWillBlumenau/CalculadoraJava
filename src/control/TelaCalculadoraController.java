package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Calculadora;

public class TelaCalculadoraController {

    @FXML
    private TextField tfCalculos;
    @FXML
    private Button buttonZero;
    @FXML
    private Button buttonOne;
    @FXML
    private Button buttonTwo;
    @FXML
    private Button buttonThree;
    @FXML
    private Button buttonFour;
    @FXML
    private Button buttonFive;
    @FXML
    private Button buttonSix;
    @FXML
    private Button buttonSeven;
    @FXML
    private Button buttonEight;
    @FXML
    private Button buttonNine;
    private double valueOne;
    private double valueTwo;
    private char operation;
    public void setNumero(ActionEvent e){
        String button = String.valueOf(e.getSource());
        String text = tfCalculos.getText();
        switch (button) {
            case "Button[id=buttonZero, styleClass=button]'0'" -> tfCalculos.setText(text + buttonZero.getText());
            case "Button[id=buttonOne, styleClass=button]'1'" -> tfCalculos.setText(text + buttonOne.getText());
            case "Button[id=buttonTwo, styleClass=button]'2'" -> tfCalculos.setText(text + buttonTwo.getText());
            case "Button[id=buttonThree, styleClass=button]'3'" -> tfCalculos.setText(text + buttonThree.getText());
            case "Button[id=buttonFour, styleClass=button]'4'" -> tfCalculos.setText(text + buttonFour.getText());
            case "Button[id=buttonFive, styleClass=button]'5'" -> tfCalculos.setText(text + buttonFive.getText());
            case "Button[id=buttonSix, styleClass=button]'6'" -> tfCalculos.setText(text + buttonSix.getText());
            case "Button[id=buttonSeven, styleClass=button]'7'" -> tfCalculos.setText(text + buttonSeven.getText());
            case "Button[id=buttonEight, styleClass=button]'8'" -> tfCalculos.setText(text + buttonEight.getText());
            case "Button[id=buttonNine, styleClass=button]'9'" -> tfCalculos.setText(text + buttonNine.getText());
        }
    }

    public void somar(ActionEvent e){
        valueOne = Double.parseDouble(tfCalculos.getText());
        operation = '+';
        tfCalculos.setText("");
    }

    public void subtrair(ActionEvent e){
        valueOne = Double.parseDouble(tfCalculos.getText());
        operation = '-';
        tfCalculos.setText("");
    }

    public void dividir(ActionEvent e){
        valueOne = Double.parseDouble(tfCalculos.getText());
        operation = '/';
        tfCalculos.setText("");
    }

    public void multiplicar(ActionEvent e){
        valueOne = Double.parseDouble(tfCalculos.getText());
        operation = '*';
        tfCalculos.setText("");
    }
    
    public void calcular(ActionEvent e){
        valueTwo = Double.parseDouble(tfCalculos.getText());
        String resultado = null;
        switch (operation){
            case '+' -> resultado = String.valueOf(valueOne + valueTwo);
            case '-' -> resultado = String.valueOf(valueOne - valueTwo);
            case '/' -> resultado = String.valueOf(valueOne / valueTwo);
            case '*' -> resultado = String.valueOf(valueOne * valueTwo);
        }
        tfCalculos.setText(resultado);
    }
}

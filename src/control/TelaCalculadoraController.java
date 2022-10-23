package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaCalculadoraController {

    @FXML private TextField tfCalculos;
    @FXML private Button buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive,
    buttonSix, buttonSeven, buttonEight, buttonNine;
    private double valueOne, valueTwo;
    private char operation;

    public void setNumero(ActionEvent e){
        String button = String.valueOf(e.getSource());
        String text = tfCalculos.getText();
        switch (button) {
            case "Button[id=buttonZero, styleClass=button]'0'" -> text += buttonZero.getText();
            case "Button[id=buttonOne, styleClass=button]'1'" -> text += buttonOne.getText();
            case "Button[id=buttonTwo, styleClass=button]'2'" -> text += buttonTwo.getText();
            case "Button[id=buttonThree, styleClass=button]'3'" -> text += buttonThree.getText();
            case "Button[id=buttonFour, styleClass=button]'4'" -> text += buttonFour.getText();
            case "Button[id=buttonFive, styleClass=button]'5'" -> text += buttonFive.getText();
            case "Button[id=buttonSix, styleClass=button]'6'" -> text += buttonSix.getText();
            case "Button[id=buttonSeven, styleClass=button]'7'" -> text += buttonSeven.getText();
            case "Button[id=buttonEight, styleClass=button]'8'" -> text += buttonEight.getText();
            case "Button[id=buttonNine, styleClass=button]'9'" -> text += buttonNine.getText();
        }
        tfCalculos.setText(text);
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
        String resultado;
        switch (operation){
            case '+' -> resultado = String.valueOf(valueOne + valueTwo);
            case '-' -> resultado = String.valueOf(valueOne - valueTwo);
            case '/' -> resultado = String.valueOf(valueOne / valueTwo);
            case '*' -> resultado = String.valueOf(valueOne * valueTwo);
            default -> resultado = null;
        }
        tfCalculos.setText(resultado);
        valueOne = 0;
        valueTwo = 0;
    }

    public void limpar(ActionEvent e){
        tfCalculos.setText("");
    }
}

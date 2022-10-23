package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaCalculadoraController {

    @FXML private TextField tfCalculos;
    @FXML private Button buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive,
    buttonSix, buttonSeven, buttonEight, buttonNine;
    private double valueOne;
    private char operation;

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
        double valueTwo = Double.parseDouble(tfCalculos.getText());
        switch (operation){
            case '+' -> tfCalculos.setText(String.valueOf(valueOne + valueTwo));
            case '-' -> tfCalculos.setText(String.valueOf(valueOne - valueTwo));
            case '/' -> tfCalculos.setText(String.valueOf(valueOne / valueTwo));
            case '*' -> tfCalculos.setText(String.valueOf(valueOne * valueTwo));
            default -> tfCalculos.setText("");
        }
        valueOne = 0;
    }

    public void limpar(ActionEvent e){
        tfCalculos.setText("");
        operation = '@';
        valueOne = 0;
    }

}

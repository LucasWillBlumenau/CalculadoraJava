package model;

public class Calculadora {

    public static String calculaBhaskara(double a, double b, double c){
        double delta = b*b - 4*a*c;
        if(delta < 0){
            return "Não há resultado nos reais";
        }
        if(delta == 0){
            return String.valueOf(-b/(2*a));
        }
        else{
            double sqrtDelta = Math.sqrt(delta);
            double xI = (-b + sqrtDelta)/(2*a);
            double xII = (-b - sqrtDelta)/(2*a);
            return "[" + xI + "," + xII + "]";
        }
    }

    public static double somaValores(double num1, double num2){
        return num1 + num2;
    }

    public static double subtraiValores(double num1, double num2){
        return num1 - num2;
    }

    public static double divideValores(double num1, double num2){
        return num1 / num2;
    }

    public static double multiplicaValores(double num1, double num2){
        return num1 * num2;
    }
}

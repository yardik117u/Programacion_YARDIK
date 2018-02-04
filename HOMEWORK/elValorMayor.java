/************************************
*elValorMayor.java
*yardik ulises mancera mendez
*este programa muestra el valor mayor de dos valores
**************************************/
import javax.swing.JOptionPane;
public class elValorMayor{
    public static void main(String[]args){
        float primerValor, segundoValor;
        primerValor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su primer numero: "));
        segundoValor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su segundo numero : "));
      if (primerValor< segundoValor){
        JOptionPane.showMessageDialog(null, segundoValor+"es el numero mayor");
      }else if(segundoValor < primerValor){
        JOptionPane.showMessageDialog(null, primerValor+"es el numero mayor");
      }else {
        JOptionPane.showMessageDialog(null, "usted no ingreso nigun numero entero");
      }
    }
}

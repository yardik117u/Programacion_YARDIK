/************************************
*numeroMayorDeTresNumeros.java
*yardik ulises mancera mendez
*este programa muestra el valor mayor de dos valores
**************************************/
import javax.swing.JOptionPane;
public class numeroMayorDeTresNumeros{
    public static void main(String[]args){
        float primerValor, segundoValor,tercerValor;
        primerValor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su primer numero: "));
        segundoValor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su segundo numero : "));
        tercerValor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su tercer numero : "));
      if (primerValor< segundoValor && segundoValor > tercerValor ){
        JOptionPane.showMessageDialog(null, segundoValor+"es el numero mayor");
      }else if(segundoValor < primerValor && primerValor> tercerValor){
        JOptionPane.showMessageDialog(null, primerValor+"es el numero mayor");
      }else if(segundoValor < tercerValor && primerValor < tercerValor){
        JOptionPane.showMessageDialog(null, tercerValor+"es el numero mayor");
      }else {
        JOptionPane.showMessageDialog(null, "usted no ingreso nigun numero entero");
      }
    }
}

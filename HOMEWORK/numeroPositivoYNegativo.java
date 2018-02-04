/*****************************
*numeroPositivoYNegativo.java
*yardik ulises mancera mendez
*este programa indica si un numero es positivo o negativo
**************************/
import javax.swing.JOptionPane;
public class numeroPositivoYNegativo{
    public static void main(String[]args){
        float primerValor;
        primerValor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero: "));
      if (0< primerValor){
        JOptionPane.showMessageDialog(null, primerValor+"es un numero positivo");
      }else if(primerValor < 0){
        JOptionPane.showMessageDialog(null, primerValor+"es un numero negativo");
      }else {
        JOptionPane.showMessageDialog(null, "usted ingreso un cero");
      }
    }
}

/******************************************
*langostaAumada.java
*yardik ulises mancera mendez
*este programa ayuda a decidir el precio de un platillo dependiendo de la catidad de personas
************************/
import javax.swing.JOptionPane;
public class langostaAumada{
    public static void main(String[]args){
        float cantidadDePersonas;
        cantidadDePersonas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero de personasque asistiran: "));
      if (cantidadDePersonas< 200 && cantidadDePersonas > 0){
        double totalAPagar=cantidadDePersonas*95;
        JOptionPane.showMessageDialog(null, "la cantidad a pagra es de :$"+ totalAPagar);
      }else if(cantidadDePersonas < 300 && cantidadDePersonas > 199){
        double totalAPagar=cantidadDePersonas*85;
        JOptionPane.showMessageDialog(null,  "la cantidad a pagra es de :$"+ totalAPagar);
      }else if(cantidadDePersonas>299){
        double totalAPagar=cantidadDePersonas*75;
        JOptionPane.showMessageDialog(null,  "la cantidad a pagra es de :$"+ totalAPagar);
      }else {
        JOptionPane.showMessageDialog(null, "usted no ingreso nigun numero entero");
      }
    }
}

/**************************************
*productorDeLeche.java
*yardik Ulises Mancera Mendez
*este programa calgula la ganacia por galon
**************************/
import javax.swing.JOptionPane;
public class productorDeLeche{
  public static void main(String[]args){
    final double GALON=3.785;
    double litrosDeLeche;
    double precioPorGalon;
    litrosDeLeche= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de leche que se ha producido: "));
    precioPorGalon= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de ungalon:$"));
    double galones = (litrosDeLeche / GALON);
    double gananciaPorLaLecheEntregada = (galones * precioPorGalon);
    JOptionPane.showMessageDialog(null, "La ganancia por leche entregada es: " + gananciaPorLaLecheEntregada);
  }
}

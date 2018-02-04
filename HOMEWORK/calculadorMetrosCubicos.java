/************************************
*calculadorMetrosCubicos.java
*yardik ulises mancera mendez
*este programa calcula los metros cubicos de una cisterna/alberca  e indica la cantidad a cobrar por su uso
**************************************/
import javax.swing.JOptionPane;
public class calculadorMetrosCubicos{
    public static void main(String[]args){
        float alturaDeLaAlberca , largoDeLaAlberca , acnchoDeLaAlberca, costoPorMetroCubico;

        alturaDeLaAlberca = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura de la alberca: "));
        largoDeLaAlberca = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el largo de la alberca : "));
        acnchoDeLaAlberca = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el ancho de la alberca : "));
        costoPorMetroCubico = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el costo por metro cubico: "));
      double volumen= (acnchoDeLaAlberca*alturaDeLaAlberca*largoDeLaAlberca);
      double pagoARealizarPorElConsumo= volumen*costoPorMetroCubico;
      JOptionPane.showMessageDialog(null, "La cantidad a cobrar por el uso es de:$" +pagoARealizarPorElConsumo);
    }
}

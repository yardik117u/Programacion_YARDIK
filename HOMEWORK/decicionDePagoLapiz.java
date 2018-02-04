/********************************
*decicionDePagoLapiz.java
*yardik ulises mancera mendez
*este programa toma la decicion de dar una oferta o no en una venta de lapices
***************************/
import javax.swing.JOptionPane;
public class decicionDePagoLapiz{
    public static void main(String[]args){
        double cantidadDelLapices;
        cantidadDelLapices = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero de lapices que comprara: "));
      if (1000< cantidadDelLapices){
        final double catidadAPagar=(cantidadDelLapices*0.85);
        JOptionPane.showMessageDialog(null, "la catidad a pagar es de:$"+catidadAPagar);
      }else if(cantidadDelLapices < 1000){
        final double catidadAPagar=(cantidadDelLapices*0.90);
        JOptionPane.showMessageDialog(null, "la catidad a pagar es de:$"+catidadAPagar);
      }else {
        JOptionPane.showMessageDialog(null, "usted ingreso un cero");
      }
    }
}

/********************************
*decicionDePagoDeUnTraje.java
*yardik ulises mancera mendez
*este programa toma la decicion de dar una oferta o no en una venta de lapices
***************************/
import javax.swing.JOptionPane;
public class decicionDePagoDeUnTraje{
    public static void main(String[]args){
        double costoDelTraje;
        costoDelTraje = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del trajeque comprara:$"));
      if (2500< costoDelTraje){
        final double catidadAPagar=(costoDelTraje-(costoDelTraje*0.15));
        JOptionPane.showMessageDialog(null, "la catidad a pagar es de:$"+catidadAPagar);
      }else if(costoDelTraje < 2500){
        final double catidadAPagar=(costoDelTraje-(costoDelTraje*0.08));
        JOptionPane.showMessageDialog(null, "la catidad a pagar es de:$"+catidadAPagar);
      }else {
        JOptionPane.showMessageDialog(null, "usted ingreso un cero");
      }
    }
}

/*****************************************
*AreaDeUnaCricunferenciaGui.java
*yardik Ulises Mancera Mendez
*este programa calcula el area de un circulo de forma grafica
******************************************/
import javax.swing.JOptionPane;
public class AreaDeUnaCricunferenciaGui{
    public static void main(String[]args){
        float radioDeLaCircunferencia ;
        final double PI = 3.1416;
        radioDeLaCircunferencia = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el radio de la circunferencia: "));
        double area = (PI*(radioDeLaCircunferencia*radioDeLaCircunferencia));
        JOptionPane.showMessageDialog(null, "El area circulo es: " + area);
    }
}

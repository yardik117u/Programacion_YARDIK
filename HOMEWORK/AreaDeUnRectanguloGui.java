/*************************
*AreaDeUnRectanguloGui.java
*
*Yardik Ulises Mancera Mendez
*este programa calcula el area de un rectangulo de forma grafica
**********************/
import javax.swing.JOptionPane;
public class AreaDeUnRectanguloGui{
    public static void main(String[]args){
        float alturaDelRectangulo , baseDelRectangulo;
        alturaDelRectangulo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del rectangulo: "));
        baseDelRectangulo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base del rectangulo: "));
        double area = alturaDelRectangulo*baseDelRectangulo;
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + area);
    }
}

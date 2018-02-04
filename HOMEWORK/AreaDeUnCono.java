/*****************************************
*AreaDeUnCono.java
*yardik Ulises Mancera Mendez
*este programa calcula el area de un cono  de forma grafica
******************************************/
import javax.swing.JOptionPane;
public class AreaDeUnCono{
  public static void main(String[]args){
    float radioDeLaCircunferenciaYBase  ;
    final double PI = 3.1416;
    final double catetoFaltante;
    radioDeLaCircunferenciaYBase = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el radio de la circunferencia: "));
    catetoFaltante = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tltura de el triangulo rectangulo: "));
    double areaDeElTriangulo = (catetoFaltante*(radioDeLaCircunferenciaYBase*2))/2;
    double areaCircular  = ((PI*(radioDeLaCircunferenciaYBase*radioDeLaCircunferenciaYBase))/2);
    double area =(areaDeElTriangulo+areaCircular);
    JOptionPane.showMessageDialog(null, "El area de el cono es: " + area);

  }
}

/**************************************
*CalculadorDeAreaDelTerrenoDeUnaEmpresa.java
*Yardik Ulises Mancera Mendez
este programa calcula el terreno irregular
************************************/
import javax.swing.JOptionPane;
public class CalculadorDeAreaDelTerrenoDeUnaEmpresa{
  public static void main(String[]args){
    float baseDelTrianguloYDelREctangulo;
    float alturaDelRectanguloYDelTrianguloUnidos;
    float alturaDelRectangulo;
    alturaDelRectangulo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del rectangulo: "));
    alturaDelRectanguloYDelTrianguloUnidos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del rectangulo y del triangulo juntos: "));
    baseDelTrianguloYDelREctangulo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base del rectangulo y del triangulo: "));
    double areaTriangulo = (baseDelTrianguloYDelREctangulo*(alturaDelRectanguloYDelTrianguloUnidos-alturaDelRectangulo))/2;
    double area = (alturaDelRectangulo*baseDelTrianguloYDelREctangulo)+areaTriangulo;
    JOptionPane.showMessageDialog(null, "El area del terreno irregular es: " + area);
  }
}

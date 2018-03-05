
/************************************
*ImplementGeometricObjects.java
*yardikulises mancera mendes
*este programa calcula el area de un rectangul
******************************************************/
import javax.swing.*;
public class ImplementGeometricObjects {
  public static void main (String []args) {
    Circle circulito = new Circle(3.5, "Blue", true);
      JOptionPane.showMessageDialog(null, "The area is: " + circulito.getArea());
      JOptionPane.showMessageDialog(null, "The circle was created: " + circulito.getDateCreated());
    Rectangle rectangulito = new Rectangle(10, 20, "Red", true);
      JOptionPane.showMessageDialog(null, "The area is: " + rectangulito.getArea());
      JOptionPane.showMessageDialog(null, "The perimeter is: " + rectangulito.getPerimeter());
      JOptionPane.showMessageDialog(null, "The rectangulito was created on: " + rectangulito.getDateCreated());
    //polimorfismo
    JOptionPane.showMessageDialog(null, circulito.toString());
  }
}

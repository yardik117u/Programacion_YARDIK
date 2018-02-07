/*******************************
*FloorSpacesDoWhile.java
*yardik ulises mancera mendez
*this program calculates total floor space in a hause
********************************/
import javax.swing.JOptionPane;
public class FloorSpacesDoWhile{
    public static void main(String[]args){
      double length, width;//room dimensions
      double floorSpace=0;//house"s total floor
      char response;//user"s response
      do {
        length = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the room's length","My input",JOptionPane.QUESTION_MESSAGE));
        width = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the room's width",JOptionPane.QUESTION_MESSAGE));
        floorSpace += (length*width);
        response = JOptionPane.showInputDialog("Any more room?? y/n").charAt(0);
      }while(response=='y'|| response=='Y');
      JOptionPane.showMessageDialog(null, "the total floor space is: "+floorSpace,"hello",JOptionPane.WARNING_MESSAGE);
    }
}

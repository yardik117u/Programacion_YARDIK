
/*****************************************
 *MenuPass.java                          *
 *yardik ulises mancera mendez           *
 *este es un menu para que use pass      *
 *****************************************/
import javax.swing.*;
public class MenuPass extends Pass{
  public static void main(String[] args){
    Pass ingresoPass = new Pass();
    ingresoPass.setPass(JOptionPane.showInputDialog("Ingrese la contrasena"));
    JOptionPane.showMessageDialog(null, ingresoPass.getFuerte());
  }
}

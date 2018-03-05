/***********************************************************************
*UsoGeneralDePerson.javax
*yardik ulises mancera mendez
*este programa usa de forma general la clase person y sus heredados
*************************************************************************/
import javax.swing.*;
public class UsoGeneralDePerson{
  public static void main(String[]args){
    int selec = Integer.parseInt(JOptionPane.showInputDialog(null, "please, define who you are selec \n1: Staff \n2: Student"));
    if (selec==2){
      Students students1=new Students("Yardik ", "Tehuacan", "TICs",1, 0.0);
      JOptionPane.showMessageDialog(null, students1.toString(), "student");
    }else if (selec==1){
      Staff staff1=new Staff("Cordoba", "Tehuacan", "UTT", 15000);
      JOptionPane.showMessageDialog(null, staff1.toString(), "staff");
    }else
    JOptionPane.showMessageDialog(null, "Error",JOptionPane.WARNING_MESSAGE);
  }
}

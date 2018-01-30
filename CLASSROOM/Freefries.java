/**********************
*Freefries.java
*yardik ulises mancera mendez
*this program reads pints socred by home team ands
tehe oppsoing team and the opposing team and determines IF the fans win
FreeFries
*************************/
import javax.swing.JOptionPane;//para utilizar grafico GUI
public class Freefries {
  public static void main(String[] args) {
     int homePoints;//points scored by home team
     int opponentPoints;//points scored by opposind team

     homePoints =Integer.parseInt(JOptionPane.showInputDialog("enter home points"));

     opponentPoints = Integer.parseInt( JOptionPane.showInputDialog("enter opponent Points"));

     if (homePoints > opponentPoints && homePoints >=100){
       JOptionPane.showMessageDialog(null, "A free order of french fries Tigers Fans");
     }//end if

  }//end main
}//end class FreeFries

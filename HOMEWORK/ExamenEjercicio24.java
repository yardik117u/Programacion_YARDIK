/*****************************************************************
 *ExamenEjercicio24.java                                         *
 *yardik ulises mancera mendez                                   *
 *Dado un numero X determinar si es múltiplo de otro numero Y.   *
 *****************************************************************/
 import javax.swing.JOptionPane;
 public class ExamenEjercicio24{
   public static void main(String[]args){
     int  primerValor,segundoValor;
     double resultado;
     primerValor= Integer.parseInt(JOptionPane.showInputDialog("Enter the frist number"));
     segundoValor= Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
     resultado = (primerValor % segundoValor);
     if (resultado==0){
       JOptionPane.showMessageDialog(null,"The first number:"+primerValor+"it is a multiple of:"+segundoValor);
     }else
      JOptionPane.showMessageDialog(null,"The first number:"+primerValor+"it is not a multiple of:"+segundoValor);
   }
 }

/**************************************
*AverageWhile.java
*yardik ulises mancera mendez
*this program calculates the average of ten grades
***********************/
import javax.swing.JOptionPane;
public class AverageWhile{
    public static void main(String[]args){
      int counter=1, totalStudents;
      double score,totalScore,averageScore;
      totalStudents=Integer.parseInt(JOptionPane.showInputDialog("Eneter number of students"));
      while (counter<= totalStudents){
        score = double.parseDouble(JOptionPane.showInputDialog("enter the score " +counter));
        totalScore += score;
        counter ++;
      }
      averageScore=totalScore/totalStudents;
    JOptionPane.showInputDialog(null,"the average is "+averageScore);

    }
}

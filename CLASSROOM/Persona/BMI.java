/*************************
BMI.java

Yardik Ulises Mancera Mendez
This program calculates the Body Mass Index
**********************/
import javax.swing.JOptionPane;
public class BMI{
  public static void main(String[]args){
    float weight, height;
    weight = Float.parseFloat(JOptionPane.showInputDialog("Enter your WEIGHT in kliograms"));
    height = Float.parseFloat(JOptionPane.showInputDialog("Enter your HEIGHT in meters"));
    double bmi = weight/(Math.pow(height,2));
    if (bmi < 16){
      JOptionPane.showMessageDialog(null, "Your are serious underweight");
    }else if (bmi < 18){
      JOptionPane.showMessageDialog(null, "You are underweight");
    }else if (bmi < 24){
      JOptionPane.showMessageDialog(null, "Your are normal weight");
    }else if (bmi < 29){
      JOptionPane.showMessageDialog(null, "Your are overweight");
    }else if (bmi < 35){
      JOptionPane.showMessageDialog(null, "your are seriously overweight");
    }else{
      JOptionPane.showMessageDialog(null, "Your are gravely overweight");
    }
  }
}

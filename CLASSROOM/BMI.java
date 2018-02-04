/*************************
BMI.java

Yardik Ulises Mancera Mendez
This program calculates the Body Mass Index
**********************/
import javax.swing.JOptionPane;
public class BMI{
  public static void main(String[]args){
    float weight, height;
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;

    weight = Float.parseFloat(JOptionPane.showInputDialog("Enter your WEIGHT in pounds "));
    height = Float.parseFloat(JOptionPane.showInputDialog("Enter your HEIGHT in inches "));

    double weightInKilograms = weight*KILOGRAMS_PER_POUND;
    double heightInMeters = height*METERS_PER_INCH;

    double BMI = weightInKilograms / (Math.pow(heightInMeters,2));
    if (BMI < 16){
      JOptionPane.showMessageDialog(null, "Your are serious underweight");
    }else if (BMI < 18){
      JOptionPane.showMessageDialog(null, "You are underweight");
    }else if (BMI < 24){
      JOptionPane.showMessageDialog(null, "Your are normal weight");
    }else if (BMI < 29){
      JOptionPane.showMessageDialog(null, "Your are overweight");
    }else if (BMI < 35){
      JOptionPane.showMessageDialog(null, "your are seriously overweight");
    }else{
      JOptionPane.showMessageDialog(null, "Your are gravely overweight");
    }
  }
}

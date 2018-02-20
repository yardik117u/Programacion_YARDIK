/*********************************************
 *BMIOOP.java                                 *
 *yardik ulises mancera mendez                *
 *This class calculates the Body Mass Index   *
 **********************************************/
import javax.swing.*;
public class BMIOOP{
  //properties-attributes
  private String name;
  private int age;
  private double weigth;//IN PUNDS
  private double heigth;//IN INCHES
  private final double KILOGRAMS_PERPOUND=0.45359237;
  private final double METERS_PER_INCH=0.0254;
    //methods-actions
    public void setName(String name){
      this.name=name;
    }
    public String getName(){
      return this.name;
    }
    public void setAge(int age){
      this.age=age;
    }
    public int getAge(){
      return this.age;
    }
    public void setWeigth(double weigth){
      this.weigth=weigth;
    }
    public double getWeigth(){
      return this.weigth;
    }
    public void setHeigth(double heigth){
      this.heigth=heigth;
    }
    public double getHeigth(){
      return this.heigth;
    }
    public double getBMI(){
      double bmi=(this.weigth*KILOGRAMS_PERPOUND)/(this.heigth*METERS_PER_INCH)*(this.heigth*METERS_PER_INCH);
      return Math.round(bmi*100)/100;
      if(bmi < 16){
        JOptionPane.showMessageDialog(null, "Your are serious underweight");
      }else if (bmi < 18){
        JOptionPane.showMessageDialog(null, "You are underweight");
      }else if (bmi< 24){
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

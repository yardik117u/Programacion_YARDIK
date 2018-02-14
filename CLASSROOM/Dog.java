/***************************************************
*yardik ulises mancera mendez                      *
*Dog.java                                          *
*this class sets the dog´s properties and methods  *
****************************************************/
import javax.swing.*;
public class Dog {
  //Dog's properties - Variables
  private String color;
  private String eyeColor;
  private double height;
  private double length;
  private double weight;


	/*metodo tipo de dato GET= obtener
	  metodo void SET=establecer*/
  public void setColor(String dogColor){
      color =dogColor;
    }
  public String getColo(){
      return color;
    }

  public void setEyeColor(String dogEyeColor){
      eyecolor =dogEyeColor;
    }
  public String getEyeColor(){
      return eyeColor;
    }
  public void setheigth(String dogheigth){
      heigth =dogheigth;
    }
  public String getheigth(){
      return heigth;
    }
  public void setlength(String doglength){
      length =doglength;
    }
  public String getlength(){
      return length;
    }
  public void setweight(String dogweight){
      weight =dogweight;
    }
  public String getweight(){
      return weight;
    }

  //Dog's Methods - actions
  //Sit Method
  public void sit(){
      JOptionPane.showMessageDialog(null, "The dog is sat");
    }
    //barking
  public void barking(){
      JOptionPane.showMessageDialog(null, "The dog is barking");
    }
  public void layDown(){
      JOptionPane.showMessageDialog(null, "The dog is lay down");
    }
  public void eat(){
      JOptionPane.showMessageDialog(null, "The dog is eating");
    }
  public void sleep(){
      JOptionPane.showMessageDialog(null, "The dog is sleeping");
    }
}

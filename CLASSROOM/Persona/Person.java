/********************************
 *Person.java                   *
 *yardik ulises mancera mendez  *
 *esta clase crea personas      *
 ********************************/
public class Person{
  private String name;
  private int age;
  private double weigth;
  private double heigth;
  private boolean gender;
  private char DNI;
  private double bmi;
  public Person(){
  }
  public Person(String name,int age, double weigth,double heigth, double bmi){
    this.name=name;
    this.address=address;
  }
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
  public void setWeigth(Double weigth){
    this.weigth=weigth;
  }
  public Double getWeigth(){
    return this.weigth;
  }
  public void setHeigth(Double heigth){
    this.heigth=heigth;
  }
  public Double getHeigth(){
    return this.heigth;
  }
  public double getBmi(){
    double bmi=this.weigth/(this.heigth*this.heigth);
    return Math.round(bmi*100)/100;
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

  @Override
  public String toString(){
    return "Person name " + getName() 
  }
}

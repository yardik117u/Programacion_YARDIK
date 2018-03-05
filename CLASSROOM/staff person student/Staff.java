/*********************************************************
*Staff.java
*yardik ulises mnacera mendez
*esta clase hererada usa porpiedades de person para crear profesores
************************/
public class Staff extends Person{
  private String school;
  private double pay;
  public Staff(String name, String address, String school, double pay){
  super(name,address);
  this.school=school;
  this.pay=pay;
  }
  public String getSchool(){
    return this.school;
  }
  public void setSchool(String school){
    this.school=school;
  }
  public double getPay(){
    return this.pay;
  }
  public void setPay(int pay){
    this.pay=pay;
  }
  @Override
  public String toString(){
    return "Staff person: " + super.getName() + "\nStaff address: " + super.getAddress() + "\nStaff school: " + getSchool() + "\nStaff pay: $"+getPay();
  }
}

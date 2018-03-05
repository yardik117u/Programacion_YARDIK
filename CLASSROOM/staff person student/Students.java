/**************************************************
*Students.java
*yardik ulises mancera mendez
*este prograga vuelve a usar propiedades de person para crear estuduantes
*******************************************/
public class Students extends Person{
  private String program;
  private int year;
  private double fee;
  public Students (String name, String address, String program, int year, double fee){
    super(name,address);
    this.year=year;
    this.fee=fee;
    this.program=program;
  }
  public String getProgram(){
    return this.program;
  }
  public void setProgram(String program){
    this.program=program;
  }
  public int getYear(){
    return this.year;
  }
  public void setYear(int year){
    this.year=year;
  }
  public Double getFee(){
      return this.fee;
  }
  public void setFee(int fee){
    this.fee=fee;
  }
  @Override
  public String toString(){
    return "Student name: " + super.getName() + "\nStudent address: " + super.getAddress() + "\nStudent program: " + getProgram() + "\nStudent year: " + getYear() + "\nStudent fee: $" + getFee();
  }
}

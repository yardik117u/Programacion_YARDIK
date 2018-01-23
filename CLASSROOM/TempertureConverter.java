/************************************************
*Yardik UlisesMancera Mendea
*TempertureConverter.java
*This program covert"s from Fahrenheit to Celcius
*************************************************/
public class TempertureConverter{
  public static void main(String[]arg){
    final double FREEZING_POINT=32.0;
    final double CONVERSION_FACTOR=5.0/9.0;
    double fahrenheit=50;
    double celcius=0;
    celcius= CONVERSION_FACTOR*(fahrenheit - FREEZING_POINT);
    System.out.println(fahrenheit+ " degrees Fahrenheit= "+ celcius +" degrees celcius");
  }//end maid
}//end TempertureConverter

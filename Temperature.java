import java.util.Scanner;
public class Temperature{
public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  System.out.print("Please enter temperature in Celcius : ");
  float tempC = in.nextFloat();
  float tempF = in.nextFloat();
  System.out.println(tempF);
}
}

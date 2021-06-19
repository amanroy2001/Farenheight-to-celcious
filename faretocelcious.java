/*Write a java program that reads a Celsius degree in a double value from the console, then  converts it to Fahrenheit and displays the result. The formula for the conversion is as  follows: 
fahrenheit = (9 / 5) * celsius + 32 
Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8. 

*/

package codewithaman;
import java.util.Scanner;
public class faretocelcious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner (System.in);
      System.out.println("enter the celsius value");
      double a=sc.nextDouble();
      double f=((9.0/5)*a)+32;
      System.out.println("enterred celciouus value in faranhite is ="+f)
;	}

}

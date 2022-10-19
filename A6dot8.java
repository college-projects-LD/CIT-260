/* Write a class that contains the two methods celsiusToFahrenheit and fahrenheitToCelsius
 * that convert temperatures between Celsius and Fahrenheit. The formula for the conversion 
 * is as follows:
 * celsius = (5.0 / 9) * (fahrenheit - 32)
 * fahrenheit = (9.0 / 5) * celsius + 32
 * Write a test program that invokes these methods to display a couple of tables
 * 
  */

public class A6dot8 {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
        for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10) {
            System.out.printf("%-8.1f", celsius);
            System.out.printf("%-12.1f", celsiusToFahrenheit(celsius));
            System.out.print("|\t");
            System.out.printf("%-12.1f", fahrenheit);
            System.out.printf("%-8.2f", fahrenheitToCelsius(fahrenheit));
            System.out.println();
        }
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
    
}

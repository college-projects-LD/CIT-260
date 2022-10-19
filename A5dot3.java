/* make a program that creates a kilogram to pound table and displays that in the terminal 
 first create a variable for the kilogram and pound and then create a for loop that will
    display the table in the terminal */
public class A5dot3 {
    public static void main(String[] args) {
        System.out.println("Kilograms\tPounds");
        for (int i = 1; i <= 199; i += 2) {
            System.out.println(i + "\t\t" + (i * 2.2));
        }
    }
}




/* find all numbers from 100 to 100 that are divisible by 5 or 6 and display them 10 per line
first create a variable for the numbers and then create a for loop that will display the numbers
    in the terminal */


public class A5dot10 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
    
}

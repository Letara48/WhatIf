import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2;
        int average = 0;
        int sum = 0;
        int product = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = (num1 + num2);

        product = (num1 * num2);

        average = (num1 + num2) / 2;

        if (sum > 200)
            System.out.println("The sum of the numbers is : " + "*" + sum);
        else if (sum < 1000)
            System.out.println("The sum of the numbers is below 1000: " + "~" + sum);
        else
            System.out.println("The sum of the numbers is : " + sum);

        System.out.println("The average of the numbers is : " + average);
        System.out.println("The product of the numbers is : " + product);

    }



}
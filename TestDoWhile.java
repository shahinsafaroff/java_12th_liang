import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter an integer the input ends if it is inputted zero: ");
            data = input.nextInt();
            sum +=data;
        }while (data != 0);
        System.out.println("The sum is " + sum);
    }
}

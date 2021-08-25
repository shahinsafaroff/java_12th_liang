import java.util.Scanner;
public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(0-Single, 1-Widower, 2-Married, 3-Head_Of_Family) Enter the Filing Status: ");
        int status = input.nextInt();
        System.out.println("Enter the taxable income");
        double income = input.nextDouble();
        double tax =0;
        if (status == 0){
            if (income <= 8350)
                tax = income * 0.1;
            else if (income <= 33950)
                tax = 8350 * 0.1 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.1 + (82250 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.1 + (82250 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.1 + (82250 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            else
                tax = 8350 * 0.1 + (82250 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33 + (income - 372950) * 0.35;
        }

        else if (status == 1){
            //left as an exercise
        }
        else if (status == 2){
            //left as an exercise
        }
        else if (status == 3){
            //left as an exercise
        }
        else {
            System.out.println("Error: invalid status!");
            System.exit(1);
        }
        System.out.println("Tax is " + (int)(tax * 100)/100);
    }
}

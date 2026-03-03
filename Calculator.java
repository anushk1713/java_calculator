import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//while loop to choose the Operation
        while(true) {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            //choice for choosing the operation in switch
            int choice = sc.nextInt();

            //checks condition if choice=5 then prints exiting
            if(choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            //printing first and second number
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            //switch case for choosing operation by choice value
            switch(choice) {
                case 1:
                    //addition
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case 2:
                    //subtraction
                    System.out.println("Result: " + (num1 - num2));
                    break;

                case 3:
                    //multiplication
                    System.out.println("Result: " + (num1 * num2));
                    break;

                case 4:
                    //division and checs number is divisible by 0 or not if no division operation will 
                    //executed
                    if(num2 == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}

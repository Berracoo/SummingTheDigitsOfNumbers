import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scanner.nextInt();
        System.out.println("***************");

        while(number < 0){
            System.out.print("Please enter a positive number : ");
            number = scanner.nextInt();
            System.out.println("****************");
        }

        int tempNumber = number;
        int digitValue, result = 0;

        tempNumber = number;
        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            result += digitValue;
            tempNumber /= 10;

        }
        System.out.println("Result of the summation is : " + result);
    }
}
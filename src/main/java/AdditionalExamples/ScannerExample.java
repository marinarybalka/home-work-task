package AdditionalExamples;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.println("Enter firts num: ");
        first = num.nextInt();
        System.out.println("Enter second num: ");
        second = num.nextInt();
        result = first + second;
        result /=2;
        System.out.println("Result is: " + result);

        float first1, second1, result1;
        System.out.println("Enter firts1 num: ");
        first1 = num.nextFloat(); // should be ',' but not '.'
        System.out.println("Enter second1 num: ");
        second1 = num.nextFloat(); // should be ',' but not '.'
        result1 = first1 % second1;
        result1 += 2;
        System.out.println("Result1 is: " + result1);
    }
}

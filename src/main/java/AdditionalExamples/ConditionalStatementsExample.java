package AdditionalExamples;
import java.util.Scanner;

public class ConditionalStatementsExample {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second = 30;
        boolean isTrue = true;
        System.out.println("Enter firts num: ");
        first = num.nextInt();

        isTrue = first == 31;

        if (first >= second || isTrue) {
            System.out.println("Num is first");
            System.out.println("\n");
        } else if (first == 25) {
            System.out.println("Num is equal 25");
        } else {
            System.out.println("Num is lower than " + second);
        }
        switch (first) {
            case 31:
                System.out.println("Num is equal 31");
                break;
            case 35:
                System.out.println("Num is equal 35");
                break;
            default:
                System.out.println("Num is equal something");
        }
    }
}

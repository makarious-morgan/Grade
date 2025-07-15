import java.util.Scanner;

public class Grade {
    public static void main (String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your grade");
        char G =scanner.next().charAt(0);
        switch (G)
        {
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
                System.out.println("Very good");
                break;
            case 'C' :
                System.out.println("Good");
                break;
            case 'D' :
                System.out.println("Pass");
                break;
            case 'F' :
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }

    }
}

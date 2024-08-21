import java.util.Scanner;
public class IT24100065Lab4Q3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number:");
            int num = scan.nextInt();
	    System.out.println(num > 0 ? "The number is: Positive" :
                   	       num < 0 ? "The number is: Negative" :
                                         "The number is: Zero");

	}
}

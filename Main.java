import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.print("Enter First Number: ");
        num1 = scan.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = scan.nextInt();

        scan.close();
    }
}
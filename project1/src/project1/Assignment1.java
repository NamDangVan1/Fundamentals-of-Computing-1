package project1;
import java.util.Scanner;

public class Assignment1 {
    public static void main ( String[] args )
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. Name: ");
        String name = input.next();
        
        System.out.print("2. Class: ");
        String Class = input.next();
        
        System.out.print("3. Student Code: ");
        int studentCode = input.nextInt();
        
        System.out.print("1. Name: " + name + "\t2. Class: " + Class + "\n3. Student Code: " + studentCode);
    }
    
}

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
         
         System.out.println("Enter Your Grade ");
         
         Scanner sc= new Scanner(System.in);
         
         char grade = sc.next().charAt(0);
         
         char encryptedGrade=(char)(grade+8);
         
         System.out.println("Encrypted Grade is "+ encryptedGrade);
         
        char decryptedGrade =(char)(encryptedGrade-8);
        
        System.out.println("Decrypted Grade is "+ decryptedGrade);
         
         
         
	}
}

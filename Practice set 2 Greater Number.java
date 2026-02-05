import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
    System.out.println("Enter a first number ");
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    
    System.out.println("Enter a second number ");
    
    int b = sc.nextInt();
    
    if (a>b){
        System.out.println("First number is greater ");
    } 
    else{
        System.out.println("second number is greater");
    }
         
         
	}
}

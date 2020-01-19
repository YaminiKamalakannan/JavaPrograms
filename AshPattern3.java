import java.util.Scanner;
public class AshPattern3{    
public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Number: ");
	int term=scan.nextInt();
	for(int i=1;i<=term;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		
    System.out.println();
          
    }  
}    
}  

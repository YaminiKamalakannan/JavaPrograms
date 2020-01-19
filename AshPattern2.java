import java.util.Scanner;
public class AshPattern2{    
public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Number: ");
	int term=scan.nextInt();
	for(int i=1;i<=term;i++) {
		for(int spc=term;spc>=i;spc--) {
			System.out.print("*");
		}
		
    System.out.println();
          
    }  
}    
}  

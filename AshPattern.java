import java.util.Scanner;
public class AshPattern {    
public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Number: ");
	int term=scan.nextInt();
	for(int i=1;i<=term;i++) {
		for(int spc=term-1;spc>=i;spc--) {
			System.out.print(" ");
		}
		for(int ash=1;ash<=i;ash++) {
			System.out.print("*");
		}
    System.out.println();
          
    }  
}    
}  

import java.util.Scanner;
public class Factorial{
  public static void printFact(int num){
     int fact=1;
     int temp=num;
     while(temp>0){
       fact=fact*temp;
       temp--;
     }
     System.out.print("The factorial of "+num+" is "+fact);
   }
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number=scan.nextInt();
    printFact(number);
  }
}
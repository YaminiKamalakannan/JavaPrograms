import java.util.Scanner;
public class PrimeOrNot{
 public static void checkPrime(int num){
   int flag=0,rem=0;
  if(num==0||num==1){
    System.out.print(num+" is not a prime number");
  }else{
    for(int i=2;i<=num/2;i++){
      rem=num%i;
      if(rem==0){
         System.out.print(num+" is not a prime number");
         flag=1;
         break;
      }
    }
    if(flag==0){
      System.out.print(num+" is a prime number");
    }
   }
 }
 public static void main(String[] args){
   Scanner scan=new Scanner(System.in);
   System.out.print("Enter a Number: ");
   int number=scan.nextInt();
   checkPrime(number);
 }
}
   
   

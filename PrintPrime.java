import java.util.Scanner;
public class PrintPrime{
 public static void Prime(int num){  //-->To print n prime numbers
   int temp=2;
   int count=0;
   while(count!=num){
      int flag=0;
      for(int j=2;j<=temp/2;j++){
         if((temp%j)==0){
           flag=1;
           break;
         }
      }
       if(flag==0){
          System.out.println(temp);
          count+=1;
       }
     temp+=1;
    }
 }
 public static void main(String[] args){
   Scanner scan=new Scanner(System.in);
   System.out.print("Enter a number: ");
   int number=scan.nextInt();
   Prime(number);
 }
} 
import java.util.Scanner;
public class DecimalToBinary{
 public static void toBinary(int num){
   int[] Binary=new int[20];
   int j=0;
   while(num>0){
   Binary[j++]=num%2;
   num=num/2;
   }
   for(int i=j-1;i>=0;i--){
     System.out.print(Binary[i]);
   }
 }
 public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  System.out.print("Enter a number: ");
  int number=scan.nextInt();
  toBinary(number);
 }
}
 

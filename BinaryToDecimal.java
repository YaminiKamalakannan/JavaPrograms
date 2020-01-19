import java.util.Scanner;
import java.lang.Math;
public class BinaryToDecimal{
 public static void toDecimal(int num){
    int sum=0,n=0;
    while(num>0){
    sum+=(num%10)*Math.pow(2,n++);
    num=num/10;
    }
    System.out.print("The Decimal Number is "+sum);
 }
 public static void main(String[] args){
 Scanner scan=new Scanner(System.in);
 System.out.print("Enter a Binary Number: ");
 int number=scan.nextInt();
 toDecimal(number);
 }
}
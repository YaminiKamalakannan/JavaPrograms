import java.util.Scanner;
public class CheckPalindrome{
  public static void IsPalindrome(int num){
    int temp=num,res=0;
    while(temp>0){
      int rem=temp%10;
      res=(res*10)+rem;
      temp=temp/10;
    }
    if(num==res){
      System.out.println("The given number is a palindrome");
    }else{
      System.out.println("The given number is not a palindrome");
    }
  }
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int number= scan.nextInt();
    IsPalindrome(number);
  }
}
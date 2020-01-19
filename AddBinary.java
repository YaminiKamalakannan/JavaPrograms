import java.util.Scanner;
public class AddBinary{
 public static void main(String[] args)
 {
  long binary1, binary2;
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  Scanner in = new Scanner(System.in);

  System.out.print("Input first binary number: ");
  binary1 = in.nextLong();
  System.out.print("Input second binary number: ");
  binary2 = in.nextLong();

  while (binary1 != 0 || binary2 != 0) 
  {//System.out.println("i value BFR"+ i);  --> for debugging
   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
    //System.out.println("i value AFT"+ i);
    //System.out.println(sum[i-1]);
   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
/*
  for(int j=0;j<sum.length;j++){
      System.out.print(sum[j]);
  }*/
 //System.out.println("");
  if (remainder != 0) {
   sum[i++] = remainder;
  }
/*
  for(int j=0;j<sum.length;j++){
      System.out.print(sum[j]);
  }
  System.out.println("");
   System.out.println(i);
  */
  --i;
 // System.out.println(i);
  System.out.print("Sum of two binary numbers: ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}
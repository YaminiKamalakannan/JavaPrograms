import java.util.Scanner;
public class Factor{// to display the count on number of comman factors
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
System.out.println("Comman Factors "+factorCount(a,b));
}
public static int factorCount(int a,int b){
int max=0,count=0;
if(a>b){
max=a;
}
else{
max=b;
}
for(int i=1;i<=max;i++){
if(((a%i)==0)&&((b%i)==0)){
count=count+1;
}
}
return (count);
}
}

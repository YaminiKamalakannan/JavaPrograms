import java.util.Scanner;
public class ArrayCheck{
	public static void main(String[] args){
		int[] a={1,4,6,2,1,2,3,2};
		int[] b={1,1,5};
		int temp=0,flag=0;
		for(int i=0;i<b.length;i++){
			//System.out.println("I "+i);
			for(int j=temp;j<a.length;j++){
				//System.out.println("J "+j);
				if(b[i]!=a[j]){
					temp=temp;
					flag=0;
					continue;
				}
				else{
					temp=j+1;
					flag=1;
					//System.out.println("True"+a[j]+" ==> "+j+" temp "+temp);
					break;
				}
			}
			//System.out.println("temp==> "+temp);	
			if(flag==0){
				System.out.println("False");
				break;
			}						
			}
		if(flag==1){
				System.out.println("True");
			}			
		}			
	}

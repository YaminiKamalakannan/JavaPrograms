import java.util.Scanner;
public class ArrayReplace{    //Asked in CGI hackathon recruitment
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] A=new int[n];
		int sum=0,temp=0;
		for(int i=0;i<n;i++){
			A[i]=scan.nextInt(); //To scan the array elements
			sum=sum+A[i];
		}
		/*
		for(int i=0;i<n;i++){
			System.out.print(A[i]+" "); //to print the array elements (for debugging)
			}
			*/
		System.out.println("old sum "+sum); // for debugging
		for (int i = 0; i < n; i++)    // To arrange the array elements in ascending order
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (A[i] > A[j]) 
                {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
		/*
		for(int i=0;i<n;i++){
			System.out.print(A[i]+" "); //to print the array elements (for debugging)
			}
			*/
		Array(n,sum,A);
    }
	public static void Array(int n,int oldsum,int A[]){
		int[] B=new int[n];  //initialising new array
		int output=0;
		for(int x=0;x<n;x++){
			int element=A[x];
			int newsum=0;
			for(int j=0;j<n;j++){
				B[j]=element;
				newsum=newsum+B[j];
				}
				/*
			for(int j=0;j<n;j++){
				System.out.print( B[j]+" ");//to print the array elements (for debugging)
			}
				*/
			
			
			if(newsum>oldsum){
				System.out.println("NewSum "+newsum);
				output=element;
				break;
				}
		}
		System.out.println("output "+output);
	}
}
	

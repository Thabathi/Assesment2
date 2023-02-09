import java.util.Scanner;
public class Question_10 {
	 	  public static void main(String[] args) {
	 		  
		         Scanner s=new Scanner(System.in);
		         System.out.println("Enter the number");
		          int i,n,j,k=0;
		         n=s.nextInt();
		         int d=s.nextInt();
		         int a[]=new int[n];
		         for( i=0;i<n;i++)
		         {
		        	 a[i]=s.nextInt();
		        	 
		         }
		        for( i=0;i<n;i++)
		        {
		        	for( j=0;j<n;j++) 
		        	{
		        		if(i<j)
		        		{
		        		if((a[i]+a[j])%d==0)
		        		{
		        			k++;
		        	}
		        	}
		        		}
		        	}
		        System.out.println(k);
	 	  }
		        	

		       
		        }


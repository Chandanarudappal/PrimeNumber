
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTree {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int i,j,n;
		BufferedReader keyboard= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter Number");
		int as=Integer.parseInt(keyboard.readLine());
		//System.out.println("Enter n:");
		//int n= Integer.parseInt(keyboard.readLine());
		int Counter=1;
		for(i=1;i<=as;i++)
		{
			int counter=0;
			for(n=i;n>=1;n--)
			{
            if(i%n==0)
            {
             	counter=counter+1;
            }
		   }
		   //for(j=1;j<=7;j++)
		    //{
		    if(counter==2)
		    for(j=1;j<=i;j++)
			{
           //if(i!=n)
            {
            	System.out.print(i+" "); 
          
            
            	
            
            }
		    }
		    //else
		    	//break;
		    
	    System.out.println();
		 }
		}
		
}


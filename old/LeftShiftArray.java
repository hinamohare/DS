import java.util.Scanner;

public class LeftShiftArray {

	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
	        int N,totalCount=0,count, i, j;
	        N = reader.nextInt();
	        int[] array = new int[N];
	        
	        for( i=0; i<N; i++)
	            array[i] = reader.nextInt();
	        for( i=0; i<N; i++)
	        	System.out.print(array[i]+" ");
	      
	        for( i=0; i<N-1; i++)
	        {   
	            if(array[i]<=array[i+1])
	            {   count=1;
	            	j=i;
	                while(j<N-1 && array[j]<=array[j+1])
	                  { 
	                    count=count+1;      
	                    j++;
	                  }
	                totalCount = totalCount + count; 
	            }
	            else
	            	totalCount = totalCount + 1;
	        }
	       totalCount++;
	        System.out.println(totalCount);
        }
	}



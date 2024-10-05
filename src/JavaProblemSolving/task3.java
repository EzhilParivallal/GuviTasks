package JavaProblemSolving;
public class task3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,2,3,4,4,5,6,2,7};
        int unique[] = new int[7];
        int k=0;
        Boolean unique1=true;
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if (arr[i]==arr[j])
        				{
        			   unique1 = false;
        			   break;
        		       }
        	}
        	if (unique1==true)
        	{
        		unique[k] = arr[i];
			     k++;
        	}
        	unique1=true;
        }
        System.out.print("Array after duplicate removal : [ ");
        for (int i=0;i<unique.length;i++)
        {
 
        	System.out.print(unique[i]+" ");
        	
        }
        System.out.println("]");
	}

}

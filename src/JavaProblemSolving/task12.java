package JavaProblemSolving;
public class task12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,4,3,2,10,9};
		int arr2[]= {8,5,7,6};
		int new_length = arr1.length+arr2.length;
		int arr3[]= new int[new_length];
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{
			arr3[k]= arr1[i];
			k++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[k]=arr2[i];
			k++;
		}
		int temp=0;
		
        for(int i=0;i<arr3.length;i++)
        {
        	for (int j=i+1;j<arr3.length;j++)
        	{
        		if(arr3[i]>arr3[j])
        		{
        			temp = arr3[i];
        			arr3[i] = arr3[j];
        			arr3[j] = temp;
        		}
        	}
        }
        System.out.print("Merged Sorted Array : [ ");
        for(int i=0;i<arr3.length;i++)
        {
        	System.out.print(arr3[i]+" ");
        }
        System.out.print("]");
	}

}

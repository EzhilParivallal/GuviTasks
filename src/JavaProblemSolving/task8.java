package JavaProblemSolving;

public class task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,2,5,11,6,3,17};
		int temp,n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.println("The second largest element in the array : "+arr[n-2]);
		

	}

}

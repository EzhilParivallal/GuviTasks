package day15_JATTask_7;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = new int[3];
      arr[0]=0;
      arr[1]=10;
      arr[2]=20;
      try {
    	 int arrLen = arr.length;
    	  System.out.println(arr[arrLen+1]);
      }
      catch(ArrayIndexOutOfBoundsException e) {
    	  System.out.println("Index entered is not valid for the array. Please check");
      }
      String str ="Hello World";
      try {
    	  System.out.println(str.charAt(11));
      }
      catch(StringIndexOutOfBoundsException e) {
    	  System.out.println("Index entered is not valid for the string array. Please check");
      }
	}

}

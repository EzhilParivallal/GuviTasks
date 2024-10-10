package day15_JATTask_7;

import java.util.ArrayList;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> arr1=new ArrayList<String>();
     arr1.add("Vikrant");
     arr1.add("Ezhil");
     arr1.add("Sumant");
     arr1.add("Naveen");
     Object[] arr2 = arr1.toArray();
     for (Object obj : arr2) {
         System.out.println(obj + " ");
     }
	}
	

}

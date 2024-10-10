package day15_JATTask_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeMap<Integer,String> Emp = new TreeMap<Integer,String>();
     Emp.put(1,"Naveen");
     Emp.put(2,"Vikrant");
     Emp.put(3,"Ezhil");
     ArrayList<Integer> keyList = new ArrayList<>(Emp.keySet());
     ArrayList<String> valueList = new ArrayList<>(Emp.values());
     System.out.println("Employees names before sorting : "+valueList);
     Collections.sort(valueList);
     System.out.println("Employees names after sorting  : "+valueList);
     
	}

}

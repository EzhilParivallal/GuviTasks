package day15_JATTask_7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			FileReader filereader=new FileReader("test.txt");
			BufferedReader bufferreader = new BufferedReader(filereader);
			String fileData=null;
			while((fileData=bufferreader.readLine())!=null) {
				System.out.println(fileData);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File is not found");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}

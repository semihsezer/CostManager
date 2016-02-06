package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TXTReader {
	
	public TXTReader(){}

	public String readTXT(String fileName) {
		String result = "";
		
		try {
			final InputStream in = getClass().getResourceAsStream(fileName);		
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			StringBuilder out = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				out.append(line);
			}
			System.out.println(out.toString());   //Prints the string content read from input stream
			result = out.toString();
			reader.close();
			
		} catch(FileNotFoundException e){
			System.out.println("File not found in resources.");
		} catch(Exception e){
			System.out.println("Some error occured, read unsuccessful.");
		}
		return result;
	}

}

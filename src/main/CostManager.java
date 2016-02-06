package main;
import main.TXTReader;


public class CostManager {
	static String fileName = "/jan16.txt";
	
	
	
	public static void main(String[] args) {
		
		new CostExtractor().extractCosts(new TXTReader().readTXT(fileName));
	}
	
	
}

package main;

import java.util.HashMap;
import java.util.Map;

public class CostExtractor {
	
	public CostExtractor(){
		
	}
	
	public void extractCosts(String rawCostInput) {
		Map<String, Double> costByCategoryMap = new HashMap<String, Double>();
		int i = 0;
		char c = rawCostInput.charAt(i);
		
		boolean categoryComplete = false;
		while (i < rawCostInput.length()){
			i++;
			c = rawCostInput.charAt(i);
			categoryComplete = false;
			
			StringBuilder category = new StringBuilder();
			StringBuilder cost = new StringBuilder();
			String categoryString = "";
			double newCost = 0.0;
			System.out.println(c);
			
			while (c!=';'){
				while (c!=':' && categoryComplete==false){
					category.append(c);
					i++;
					c = rawCostInput.charAt(i);
					System.out.println(category.toString());
				}
				
				if (c==':'){
					i++;
					c = rawCostInput.charAt(i);
					categoryComplete = true;
				}
				cost.append(c);
				System.out.println(cost.toString());
				i++;
				c = rawCostInput.charAt(i);
			}
			
			categoryString = category.toString().toLowerCase();
			newCost = Double.parseDouble(cost.toString());
			category = new StringBuilder();
			cost = new StringBuilder();
			
			
			if (costByCategoryMap.containsKey(categoryString)){
				newCost += costByCategoryMap.get(categoryString); 
			}
			
			costByCategoryMap.put(categoryString, newCost);

		}
		
		System.out.println(costByCategoryMap.toString());	
	}

}

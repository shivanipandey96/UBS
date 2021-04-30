package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
	Map <Furniture,Integer> furnitureMap;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
    	furnitureMap= new HashMap<Furniture,Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
    	furnitureMap.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return (HashMap<Furniture, Integer>) furnitureMap;
    }

    public float getTotalOrderCost() {
       float sum=0;
       for(Furniture furniture:furnitureMap.keySet()) {
    	   sum=sum+furniture.cost()*furnitureMap.get(furniture);
       }
       return sum;
    }

    public int getTypeCount(Furniture type) {
    	for(Furniture f:furnitureMap.keySet()) {
     	  if(f.label().equals(type.label())) {
     		  return furnitureMap.get(f);
     	  }
    	}
	return 0;
    }

    public float getTypeCost(Furniture type) {
    	float  cost=0;
        for(Furniture furniture:furnitureMap.keySet()) {
     	  if(furniture.label().equals(type.label())) {
     		  return furniture.cost()*furnitureMap.get(furniture);
     	  }
     	  else {
     		  return 0;
     	  }
        }
        return cost;
    }

    public int getTotalOrderQuantity() {
    	 int count=0;
         for(Furniture furniture:furnitureMap.keySet()) {
      	   count=count+furnitureMap.get(furniture);
      	   }
        return count;
    }
}

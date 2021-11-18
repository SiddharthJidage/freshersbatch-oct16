package Assignment5;


	import java.util.HashMap;
	import java.util.Map;
	public class gen2 {

	    public static void main(String[] args)
	        {
	            
	            HashMap<Integer, Double> map = new HashMap<>();

	            // Adding elements 
	            map.put(5,56.0 );
	            map.put(24, 56.9);
	            map.put(34, 33.03); 
	            map.put(46, 40.08);
	            map.put(52, 50.0);
	            map.put(66, 60.30);
	            map.put(7, 71.0);
	            map.put(84, 20.50);
	            map.put(94, 90.0);
	            map.put(13, 100.0);

	            // using for-each loop Iterating the map using
	            for (Map.Entry<Integer, Double> e : map.entrySet())
	                System.out.println("Key: as ID " + e.getKey()
	                        + " Value: as Marks " + e.getValue());
	        }
	    }



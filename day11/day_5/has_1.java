package day_5;

	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Set;

	public class has_1 {
	    public static void main(String[] args) {

	        Set<String> set = new HashSet<>();

	        
	        set.add("A");
	        set.add("B");
	        set.add("C");
	        set.add("D");
	        set.add("E");
	        set.add("A");     
	        set.add("B");     
	        set.add(null);    
	        set.add("F");
	        set.add(null);    

	        System.out.println("HashSet values: " + set);
	        System.out.println("HashSet size: " + set.size());

	        System.out.println("\nIterating using enhanced for loop:");

	        for (String value : set) {
	            System.out.println(value);
	        }

	        System.out.println("\nIterating using Iterator:");

	        Iterator<String> iterator = set.iterator();

	        while (iterator.hasNext()) {
	            String value = iterator.next();
	            System.out.println(value);
	        }
	    }
	}
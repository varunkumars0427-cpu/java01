package day06;
import java.util.*;
public class union {

	    public static void main(String[] args) {

	        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
	        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

	        Set<Integer> union = new HashSet<>(set1);
	        union.addAll(set2);
	        
	        Set<Integer> intersection = new HashSet<>(set1);
	        intersection.retainAll(set2);
	        
	        Set<Integer> join = new HashSet<>(set1);
	        join.addAll(set2);
	        
	        Set<Integer> difference = new HashSet<>(set2);
	        difference.removeAll(set1);

	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);
	        System.out.println("Union: " + union);
	        System.out.println("Intersection: " + intersection);
	        System.out.println("Join: " + join);
	        System.out.println("Difference : "+difference);
	    }
	}


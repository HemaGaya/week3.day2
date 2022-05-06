package week3.day2;
	import java.util.ArrayList;
	import java.util.List;

public class FindIntersection {
	
		public static void main(String[] args)
		{
			List<Integer> firstlist= new ArrayList<Integer>();
			firstlist.add(3);
			firstlist.add(2);
			firstlist.add(11);
			firstlist.add(4);
			firstlist.add(6);
			firstlist.add(7);
	        System.out.println("firstlist is: "+firstlist);
		    List<Integer> secondlist=new ArrayList<Integer>();
		    secondlist.add(1);
		    secondlist.add(2);
		    secondlist.add(8);
		    secondlist.add(4);
		    secondlist.add(9);
		    secondlist.add(7);
		    System.out.println("secondlist is: "+secondlist);
		    firstlist.retainAll(secondlist);
			System.out.println("common number : " + firstlist);
		    		}
		    	}
	
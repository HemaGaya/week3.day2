package week3.day2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class SecondLargest
{
	public static void main(String[] args) 
	{
		List<Integer> list= new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		Collections.sort(list);
		//Print the sorted list
		System.out.println("The sorted list: " + list );
		//Pick the 2nd element from the last and print it
		Integer secondElementFromLast =list.get(list.size()-2);
		System.out.println("The second element from the last is  : " + secondElementFromLast);
	}

}

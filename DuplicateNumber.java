package week3.day2;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;
	public class DuplicateNumber
	{

		public static void main(String[] args) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(14);
			list.add(12);
			list.add(13);
			list.add(11);
			list.add(15);
			list.add(14);
			list.add(18);
			list.add(16);
			list.add(17);
			list.add(19);
			list.add(18);
			list.add(17);
			list.add(20);
			Set<Integer> set=new HashSet<Integer>();
			for(Integer values:list)
			{
				if(set.add(values)==false)
				System.out.println(values);
				
			}
			
		}
		
}

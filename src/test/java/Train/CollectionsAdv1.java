package Train;
import java.util.*;
public class CollectionsAdv1 {
/* To add the number of string details*/
	public static void main(String args[])
	{
		
		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("Java");
		list.add("DevOps");
		System.out.println(list);
		Collections.addAll(list, "azure");
		System.out.println(list);
		String[] strArr = {"C#", "AWS"};
		Collections.addAll(list, strArr);
		System.out.println(list);
		
		
	}
	
	
}

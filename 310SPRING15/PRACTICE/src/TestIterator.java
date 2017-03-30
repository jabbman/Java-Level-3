
import java.util.Iterator;

public class TestIterator
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		PRACTICEDLList<String> myList = new PRACTICEDLList<String>();
		myList.add("one");
		myList.add("two");
		myList.add("three");
		myList.add("four");
		
	Iterator iter = myList.iterator();
	System.out.println("\n List with iterator. ");
while( iter.hasNext() )
{
	
String str = (String) iter.next();
System.out.println(str);;

}
}
	
	
	
}

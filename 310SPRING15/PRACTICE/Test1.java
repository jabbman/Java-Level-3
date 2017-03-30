
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SlList<String> names = new SlList<String>();
		names.add("one");
		names.add("two");
		names.add("three");
		
		names.append("four");
		names.append("five");
		names.append("six");
		
		for (int i = 0; i < names.size(); i++){
			
			System.out.println( names.get(i) );
		}
	}

}

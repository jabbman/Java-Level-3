
public class SLList<E extends Comparable>

//single linked class
{
	private Node <E> head = null; // declares head
	//private Node<E> tail = null;
	private int size = 0; //declares size

	public void add ( E item ) //ADD METHOD
	{

		head = new Node <E>(item, head);
		size++;
	}

	public E get( int index )// GET METHOD
	{
		Node<E> p = head;
		int position = 0;
		while(position < index - 1 )
		{
			p = p.next;
			position++;

		}
		return p.data;
	}

	public int size()

	{
		return size;
	}

	
	 public int find ( E target)// FIND METHOD
	 {
		Node <E> p = head;
		int index = 0;
		while (p != null) 
		{
			if ( target.compareTo( p.data ) == - 1 ) {
				
				return index;
			}
			p = p.next;
			index++;
			
		}
		return - 1;
	}
	 
	 public boolean find(String EmpId){// FIND EMP ID
		 
		 return false;
	 }
	
		public void remove (int index) { // REMOVE METHOD
			
			int position = 0;
			Node <E> p = head ;
			while (position < index - 1)
			{
				p = p.next;
				position++;
					
			}
			
			p.next = p.next.next;
			
		}
	 
		/**
		 * node inner class
		 */
	 
	public static class Node<E> // INNER CLASS
	{

		public Node<E> prev;
		private E data;
		private Node<E> next;

		public Node(E data, Node<E> next )
		{
			this.data = data;
			this.next = next;

		}
	}

}

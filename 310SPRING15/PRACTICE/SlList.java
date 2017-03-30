
public class SlList<E>
{

	private Node head;
	private int size = 0;
	
	public void add( E item)
	{
		head = new Node(item, head );
	}
	
	public E get( int index )
	{
		Node p = head;
		int position = 0;
		while(position < index )
		{
			p = p.next;
			position++;
		}
		return p.data;
	}
	public void append (E item)
	{
		Node p = head;
		while(p.next != null )
		{
			p = p.next;
		}
		p.next = new Node(item, null);
		size++;
	}
	public int size()
	{
		return size;
	}
	/**
	 * Node inner class
	 */
	
	private class Node
	{
		private E  data;
		private Node next;
		
	
	public Node ( E data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	}
}

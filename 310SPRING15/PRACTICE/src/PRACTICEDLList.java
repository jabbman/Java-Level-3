
import java.util.Iterator;
import java.util.NoSuchElementException;


public class PRACTICEDLList<E>
{
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	/**
	 * 
	 * add node to tail of the list
	 */
	
	public void add( E item )
	{
		if (head == null )
		{
			
			head = new Node<E> (item, null, null);
			tail = head;
			size++;
		}
		else
		{
			
			tail.next = new Node<E> (item, null, tail );
			tail = tail.next;
			size++;
		}
		
	}

	
	// other method implementations go here- get, find ,size
	
	/*
	 * iterator()method instantiates and return a ListIter object
	 * 
	 */
	
	public Iterator<E> iterator()
	{
		
		return new ListIter();
		
	}
	
	/**
	 * node inner class
	 */
	private static class Node<E>
	{
		
		private E data;
		private Node<E> next;
		private Node<E> prev;
		
		public Node(E data, Node<E>  next, Node<E> prev)
		{
			
			super();
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	
	/**
	 * list iter inner class
	 */
	
	private class ListIter implements Iterator<E>
	{
		
		private Node<E> nextItem = head;
		private Node<E> lastItemReturned = null;
		
		public boolean hasNext()
		{
			return nextItem !=null;
		}
		
		public E next()
		{
			if (!hasNext() ) //if no items left in list
			{
				throw new NoSuchElementException();
			}
		
		lastItemReturned = nextItem;
		nextItem = nextItem.next;
		
		return lastItemReturned.data;
	}
		@Override
		public void remove()
		{
			
		}
		}
	
	
}


import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * COSC 310		Assignment 3
 * DLList.java
 * 
 * 
 * Double linked list DATA STRUCTURE that contains methods to store and retrieves:
 * student id,  first name, last name && major.
 */
public class DLList <E> {

	// double linked list class

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;


	/**
	 * Add STUDENT to tail of list
	 * @param item
	 */

	public void add ( E item ) // ADD METHOD implementation (3rd method)
	{
		if (head == null)  //empty list
		{

			head = new Node<E>(item, null, null);
			tail = head;
			size++;

		} else {

			tail.next = new Node<E> (item, null, tail);
			tail = tail.next;
			size++;
		}

	}

	/**i
	 * iterator()method instantiates and returns a ListIter object
	 */

	public Iterator<E> Iterator()
	{
		return new ListIter();
	}

	public Iterator<E> ReverseIterator()
	{
		return new ListIter2();
	}

	/**
	 * 
	 * INNER NODE CLASS
	 * @author BARI
	 *
	 * @param <E>
	 */

	public static class Node<E> // inner class
	{
		private E data;
		public Node<E> next;
		private Node<E> prev; 

		public Node (E data, Node <E> next , Node<E> prev)
		{
			super();
			this.data = data;
			this.next = next;
			this .prev = prev;
		}
	}

	/**
	 * ListIter inner class
	 */

	private class ListIter implements Iterator<E>
	// list students in order method (1st)
	{
		
		private Node<E> nextItem = head; // most recent value
		private Node<E> lastItemReturned = null;

		public boolean hasNext()
		{

			return nextItem != null;
		}
		

		public E next()
		{
			if ( !hasNext() ) // IF NO STUDENTS LEFT IN LIST
			{
				//System.out.println("You have reached the end of the list. ");
				throw new NoSuchElementException();
			}
			lastItemReturned = nextItem;
			nextItem = nextItem.next;

			return lastItemReturned.data;
		}

		@Override
		public void remove()
		{
			// TODO Auto-generated method stub
			
		}


		//----end of inner Node class
	}
	private class ListIter2 implements Iterator<E>
	{
		private Node<E> nextItem = tail; // most recent value
		//private Node<E> nextItem = head; // most recent value
		private Node<E> lastItemReturned = null;

		public boolean hasNext()
		{

			return nextItem != null;
		}
		public E next()
		{
			if ( !hasNext() ) // IF NO STUDENTS LEFT IN LIST
			{
				throw new NoSuchElementException();
			}

			lastItemReturned = nextItem;
			nextItem = nextItem.prev;

			return lastItemReturned.data;
			
		}

		@Override
		public void remove()
		{
			// TODO Auto-generated method stub

		}

		//----end of inner Node class

	}
}
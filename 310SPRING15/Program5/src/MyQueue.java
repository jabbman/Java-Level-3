
import java.util.*;

// NEW PROGRAM MY QUEUE

public class MyQueue<E> {
	
	private E[] queue;
	private int size ;
	private int rear;
	private int front;
	private int capacity;
	
	private Node <E> head = null;// declares head
	private Node<E> tail = null;

	public MyQueue (int capacity){
		
		this.front = 0;
		this.rear = capacity - 1;
		this.capacity = capacity;
		queue = (E[]) new Object[capacity];
	}
	
	public void enqueue (E item)
	{
		if (size == queue.length) {
			return ;
		}
		rear = ( rear + 1 ) % capacity;

		queue[rear] = item;
		size++;
	}
	
	public E peek()
	{
		
		return queue[front];
	}
	
	
	public E dequeue()
	{
		if (isEmpty()){
			throw new EmptyStackException();
		}
		E value = queue[front];
		front = (front + 1) % capacity;
		size--;
		return value;
		
	}
	
	public int size() // DONE
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}


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
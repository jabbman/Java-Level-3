
public class ListArray<E> { // add element; O(1)
							//get element; O(1)
		private E[] list;	//remove element O(n)
		private int size;
		
		@SuppressWarnings("unchecked")
		public ListArray()// 1 of 4  DONE
		{
			
			list = (E[]) new Object[10];
			size = 0;
			
		}
		
		public ListArray (int capacity) // 2 of 4 DONE
		{ 
			list = (E[]) new Object[capacity];
			size = 0;
			
		}
		
		public void add( E item ) // 3 of 4 DONE
		{
			list[size] = item;
			size++;
		}
		
		public E get( int index ) // 4 of 4 DONE
		{
			return list[index];
		}
		
		public int size(){ // returns size
			
			return size;
		}
	
}

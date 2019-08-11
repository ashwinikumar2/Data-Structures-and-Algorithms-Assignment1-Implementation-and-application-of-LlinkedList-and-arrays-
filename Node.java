
	public class Node<T> implements Position_<T>
	{
		public T d;
		public Node<T> n;
		Node(T data1,Node<T> next1)
		{
			d=data1;
			n=next1;
		}
		public T value()
		{
			return d;	
		}
		public Position_<T> after()
		{
			return n;
		}
	}
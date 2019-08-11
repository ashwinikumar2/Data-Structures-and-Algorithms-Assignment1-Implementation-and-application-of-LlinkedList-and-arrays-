import java.util.Iterator;

public class LinkedList<T> implements LinkedList_<T>
	{
		Node<T> head;
		public int countelements=0;
		
		public Position_<T> add(T e)
		{
			Node<T> node=new Node<T>(e,null);
			countelements++;
			if(head==null)
			{
				head=node;
				return node;
			}
			else
			{
				Node<T> n1=head;
				while(n1.n!=null)
				{
					n1=n1.n;
				}
				
				n1.n=node;	
				return n1;
			}
			
			//return null;
		}
		
		public Iterator<Position_<T>> positions()
        {
            LinkedListIterator<T> it=new LinkedListIterator<T>(head);
            return it;
        }
		
		public int count()
		{
		    return countelements;
		}
		
		public void show()
        {
            Node<T> node2=head;
            while(node2.n!=null)
            {
                System.out.println(node2.d);
                node2=node2.n;
            }
            System.out.println(node2.d);
        }
	}
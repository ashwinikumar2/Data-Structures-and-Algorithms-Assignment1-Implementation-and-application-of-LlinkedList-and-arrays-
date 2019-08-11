import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<Position_<T>>
    {
        public Position_<T> current;
        public LinkedListIterator(Node<T> head)
        {
            current=head;
        }
        public Position_<T> next()
        {
            current=current.after();
            return current;
            
        }
        public boolean hasNext()
        {
            if(current.after()!=null)
                return true;
            else 
                return false;
        }
        
        public void remove(){
		}
    }
    

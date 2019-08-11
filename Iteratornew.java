import java.util.Iterator;

public class Iteratornew<T> implements Iterator<T> {
	
	public Position_<T> current;
    public Iteratornew(Node<T> head)
    {
        current=head;
    }
    public T next()
    {
        current=current.after();
        return current.value();
        
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

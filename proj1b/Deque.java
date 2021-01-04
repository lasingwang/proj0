import java.util.LinkedList;
import java.util.NoSuchElementException;

public interface Deque<thing> {
    public void printDeque();
    public thing getRecursive(int i);
    public thing removeFirst();
    public thing removeLast();
    public void addFirst(thing i);
    public void addLast(thing i);
    public  boolean isEmpty();
    public int size();
}

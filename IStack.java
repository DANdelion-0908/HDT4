public interface IStack<T> {
    
    int count();
    
    public void push(T value);

    T pull();

    T peek();

    boolean isEmpty();
}

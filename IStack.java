public interface IStack<T> {
    
    int count();
    
    public void push(T value);

    String pull();

    String peek();

    boolean isEmpty();
}

package Stack;

public interface Stackable <T> {
    public void push(T data);
    public T pop();
    public boolean isEmpty();
    public void print();
}

package Stack;

public class Stack<T> implements Stackable<T> {
    private Node head;

    @Override
    public void push( T data ) {
        Node temp = head;
        head = new Node();
        head.data = data;
        head.next = temp;
    }

    @Override
    public T pop() {
        T data = head.data;
        head = head.next;
        return data;
    }

    @Override
    public boolean isEmpty() {
       return (head == null);
    }

    @Override
    public void print() {
        if (!isEmpty()){
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data + ", ");
                temp = temp.next;
            }
        }
    }

    public int printSize(){
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
        }
        return count;
    }

    public void delElement(int index){
        Stack tempStack = null;

        for (int i = 0; i < index-1; i++){
            tempStack.push(this.pop());
        }
        this.pop();

        while (!tempStack.isEmpty()){
            this.push((T) tempStack.pop());
        }
    }

    public void addAtIndex(T data, int index){
        Stack tempStack = null;

        for (int i = 0; i < index; i++){
            tempStack.push(this.pop());
        }

        this.push(data);

        while (!tempStack.isEmpty()){
            this.push((T) tempStack.pop());
        }
    }

    private class Node{
        T data;
        Node next;
    }
}

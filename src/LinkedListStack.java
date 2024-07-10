public class LinkedListStack<T>{
    class Node{
        T data;
        Node next;
        Node(T val){
            data = val;
            next = null;
        }
    }
    Node top;
    LinkedListStack(){
        top = null;
    }
    public void push(T val){
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }
    public T pop(){
        if(top==null) throw new IndexOutOfBoundsException("Stack is underflow");
        T temp = top.data;
        top = top.next;
        return temp;
    }
    public T peek(){
        return top.data;
    }
    public boolean isEmpty(){
        return top==null;
    }
}
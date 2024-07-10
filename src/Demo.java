public class Demo {
    public static void main(String[] args) {
        LinkedListStack <Integer> st = new LinkedListStack<Integer>();
        st.push(7);
        st.push(6);
        st.push(5);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}

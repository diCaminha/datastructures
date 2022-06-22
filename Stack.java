public class Stack <T> extends LinkedList<T> {

    public void pop() {
        if (this.size == 0) {
            System.out.println("stack empty!");
        } else {
            Node<T> toPop = this.head;
            this.head = this.head.next;
            toPop.next = null;
        }
    }

    public void push(T element) {
        this.addFirst(element);
    }
}
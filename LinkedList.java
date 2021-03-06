public class LinkedList<T> implements Iterable<T> {
    protected int size = 0;
    protected Node<T> head = null;
    protected Node<T> tail = null;

    // Empty the linked list
    public void clear() {
        Node<T> curr = head;
        while (curr != null) {
            Node<T> next = curr.next;
            curr.prev = null;
            curr.next = null;
            curr.data = null;
            curr = next;
        }
        head = tail = curr = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void addLast(T element) {
        if (size == 0) {
            head = new Node<T>(element, null, null);
        } else {
            Node<T> newElement = new Node<T>(element, this.tail, null);
            tail.next = newElement;
            tail = tail.next;
        }
        size++;
    }

    // Add element to the head of the list - O(1)
    public void addFirst(T element) {
        if (size == 0) {
            head = new Node<T>(element, null, null);
            tail = head;
        } else {
            Node<T> newElement = new Node<T>(element, null, this.head);
            head.prev = newElement;
            head = head.prev;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        Node<T> curr = head;

        while (curr != null) {
            sb.append(curr.data + ", ");
            curr = curr.next;
        }

        sb.append(" ]");
        return sb.toString();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private Node<T> curr = head;

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public T next() {
                T data = curr.data;
                curr = curr.next;
                return data;
            }
        };
    }
}
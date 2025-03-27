

package strproject;


public class LLQueue<E> {

    static class Node<E> {

        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

        public void setelement(E element) {
            this.element = element;
        }
    }
    protected Node<E> front;
    protected Node<E> rear;
    protected long size;

    public LLQueue() { // constructor
        front = null;
        rear = null;
        size = 0;
    }

    public long getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return front.getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return rear.getElement();
    }

    public void Enqueue(E elem) {
        Node<E> newest = new Node<E>(elem, null);
        if (isEmpty()) {
            front = newest;
        } else {
            rear.setNext(newest);
        }
        rear = newest;
        size++;
    }

    public E Dequeue() {
        if (isEmpty()) {
            return null;
        }
        E answer = front.getElement();
        front = front.getNext();
        size--;
        if (size == 0) {
            rear = null;
        }
        return answer;
    }

    //---------
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        long s = getSize();
        for (int i = 0; i < s; i++) {
            E element = Dequeue();
            System.out.println(element);
            Enqueue(element);
        }

    }

    public void processBookReturns(LLQueue<Book> bookReturns) {
        while (!bookReturns.isEmpty()) {
            Book returnedBook = bookReturns.Dequeue();

            System.out.println("Processing returned book: " + returnedBook.getTitle());

        }
    }

    public String requestStatus(int requestId) {

        String status = "";
        boolean found = false;
        long s1 = getSize();
        for (int i = 0; i < s1; i++) {
            Request ele = (Request) Dequeue();

            if (ele.getRequestId() == requestId) {
                found = true;

            }

            Enqueue((E) ele);
        }
        if (found) {
            status = "In progress";
        } else {
            System.out.println("Completed");
        }

        return status; 
    }

    public void removeRequest(int requestId) {

        boolean found = false;

        long s1 = getSize();
        for (int i = 0; i < s1; i++) {
            Request ele = (Request) Dequeue();

            if (ele.getRequestId() == requestId) {
                found = true;

            } else {
                Enqueue((E) ele);
            }

        }

        if (!found) {
            System.out.println("request not found");
        }
    }

    public int countCustomerRequests(String name) {

        int count = 0;

        long s1 = getSize();
        for (int i = 0; i < s1; i++) {
            Request ele = (Request) Dequeue();

            if (ele.getCustomerName().equals(name)) {
                count++;

            } else {
                Enqueue((E) ele);
            }

        }
        return count;
    }

}
